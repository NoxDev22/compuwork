/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jose Felipe
 */
public class GestionUsuarios {
    
    private ArrayList<Usuario> usuarios;
    Scanner in = new Scanner(System.in);
    
    public GestionUsuarios(){
        usuarios = new ArrayList<>();
        inicializarUsuarios();    
    }
    
    public void inicializarUsuarios(){
       usuarios.add( new Usuario("1234","pedro12","pedro1234","Empleado"));
       usuarios.add(new Usuario("4536","maria09","maria0936","Gerente"));
       usuarios.add(new Usuario("9076","xdev","xdev25","Administrador"));   
    }
    
    public void iniciarCesion(){
        String usu = "";
        String contra = "";
        String rol = "";
        int intentos = 2;
        int reintentar = 1;
        boolean iniciarSecion = false;
    
        do {
            System.out.println("Por favor Ingrese su Usuario");
            usu = in.nextLine();
            
            for(Usuario usuario: usuarios){ 
                if(usu.equals(usuario.getUsuario())){
                    for(int i = 0; i < 2; i++){
                       System.out.println("");
                       System.out.println("Por favor Ingrese su Contraseña");
                       contra = in.nextLine(); 
                       
                       if(contra.equals(usuario.getContrasena())){
                           iniciarSecion = true;
                           rol = usuario.getRol();
                           return;
                       }else{
                           System.out.println("");
                           System.out.println("!Error contraseña incorrecta");
                           System.out.println("Tiene "+(intentos - i)+" intentos");
                       }
                    }
                    if(iniciarSecion || intentos == 0){
                        return;
                    }
                }
            }
             
            if(iniciarSecion){
               dirigirSecion(rol);  
               
               reintentar = 2;
            }else{
                System.out.println("");
                System.out.println("!Error el usuario no se encuentra registrado");
            }
            
            if(reintentar == 2){
                System.out.println("");
                System.out.println("Cesion cerrada");
                System.out.println("");
            }else{
                System.out.println("");
                System.out.println("Desea volver a intentarlo");
                System.out.println("1: SI");
                System.out.println("2: NO");
                reintentar = in.nextInt();
                in.nextLine();
                if(reintentar == 1){
                    iniciarSecion = false;
                }else if(reintentar == 2){
                    iniciarSecion = true;
                }else {
                    iniciarSecion = true;
                }         
            }
         
        }while(iniciarSecion == false);      
    }
    
    public void dirigirSecion(String rol){
        
        System.out.println("Funciona la secion rol: "+rol);
    }
    
}
