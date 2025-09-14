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
       usuarios.add( new Usuario("pedro12","pedro1234","Empleado"));
       usuarios.add(new Usuario("maria09","maria0936","Gerente"));
       usuarios.add(new Usuario("xdev","xdev25","Administrador"));   
    }
    
    public Usuario buscarUsuario(String usuario){
         // Buscar usuario
         
         for (Usuario u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                return u;            
            }
         }    
         return null;
    }
      
    //Metodo para el inicio de sesión
    public void iniciarSesion() {
        boolean salir = false;
        boolean sesionCerrada = false;
        int opcion = 0;
        
        while (!salir) {
            System.out.println("\nIngrese su Usuario:");
            String usu = in.nextLine();
            
           
            Usuario usuarioEncontrado = buscarUsuario(usu);
            
            if (usuarioEncontrado == null) {
                System.out.println("\nUsuario no encontrado.");
            } else {
                // Si existe el usuario -> validamos contraseña
                int intentos = 3;
                boolean acceso = false;
                
                while (intentos > 0 && !acceso) {
                    System.out.println("\nIngrese su Contraseña:");
                    String contra = in.nextLine();
                    
                    if (usuarioEncontrado.getContrasena().equals(contra)) {
                        sesionCerrada = dirigirSesion(usuarioEncontrado.getRol(), usuarioEncontrado.getUsuario());
                        acceso = true;
                    } else {
                        intentos--;
                        System.out.println("\nContraseña incorrecta. Intentos restantes: " + intentos);
                    }
                }
                
                if (!acceso) {
                    System.out.println("\n️Ha superado el número máximo de intentos. Acceso bloqueado.");
                }
            }
            
            if(!sesionCerrada){
                // Preguntar si desea volver a intentar
                System.out.println("\n ¿Desea volver a intentarlo?");
                System.out.println("1: Sí");
                System.out.println("2: No");
                opcion = in.nextInt();
                in.nextLine(); 
            
            }
                if (opcion == 2 || sesionCerrada) {
                salir = true;
                System.out.println("\n Sesión finalizada.");
            }
            
        }
    }
    
    //Metodo para dirigir la sesión segun el rol
    private boolean dirigirSesion(String rol,String usuario) {
        GestionUsuarios gestion = new GestionUsuarios();
        
        if(rol.equals("Administrador")){
            Administrador admin = new Administrador(gestion);
            admin.operacionesAdministrador(usuario);
        }
        if(rol.equals("Gerente")){
           Gerente gerente = new Gerente();
           gerente.operacionesGerente(usuario);
        }
        if(rol.equals("Empleado")){
            
        }
            
        return true;
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
