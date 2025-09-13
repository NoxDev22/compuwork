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
    
     public void iniciarSesion() {
        boolean salir = false;
        boolean sesionCerrada = false;
        int opcion = 0;
        
        while (!salir) {
            System.out.println("\nIngrese su Usuario:");
            String usu = in.nextLine();
            
            // Buscar usuario
            Usuario usuarioEncontrado = null;
            for (Usuario u : usuarios) {
                if (u.getUsuario().equals(usu)) {
                    usuarioEncontrado = u;
                    break;
                }
            }
            
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
                        System.out.println("\nSesíon iniciada con rol: " + usuarioEncontrado.getRol());
                        sesionCerrada = dirigirSesion(usuarioEncontrado.getRol());
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
    
    private boolean dirigirSesion(String rol) {
        System.out.println("Dirigiendo al menú del rol: " + rol);
        // Aquí podrías implementar lo que hace cada rol
        
        
        return true;
    }
    
}
