/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrador;

import java.util.ArrayList;
import java.util.Scanner;
import sesion.GestionUsuarios;
import sesion.User;
/**
 *
 * @author Jose Felipe
 */
public class ModelAdmin {
    
    private ArrayList<User> usuarios; 
    private Scanner in = new Scanner(System.in);
    
    
    //Constructor recibe la lista desde GestionUsuarios
    public ModelAdmin(GestionUsuarios gestion) {
        this.usuarios = gestion.getUsuarios();
    }
    
    public void operacionesAdministrador(String usuario){
        
        boolean continuar = true;
        boolean noCerrar = true;
        
        System.out.println("Bienvenido "+usuario);
        
        while(continuar){
            System.out.println("\n¿Que operacion desea realizar? ");
            System.out.println("1. Crear Usuario");
            System.out.println("2. Consultar lista de Usuarios");
            System.out.println("3. Consultar Usuario");
            System.out.println("4. Actualizar Usuario");
            System.out.println("5. Eliminar Usuario");
            System.out.println("6: Cerrar Sesión");
            int opcion = in.nextInt();
            in.nextLine();
            
            switch(opcion){
            
                case 1:
                    crearUsuario();
                    break;
                case 2:
                    consultarUsuarios();
                    break;
                case 3:
                    consultarUsuario();
                    break;
                case 4:
                    actualizarUsuario();
                    break;    
                case 5:
                    eliminarUsuario();
                    break;
                case 6: 
                    noCerrar = false;
                    break;  
                default:
                    System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea realizar otra operación?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
            
                if(op2 == 2){
                    continuar = false;
                    System.out.println("Cerrando sesión...");
                }else{
                    System.out.println("\nReiniciando...");
                    }
                
            }else {
                System.out.println("\nCerrando sesión...");
                continuar = false;
            }

        }

    }
    
    public User buscarUsuario(String usuario){
    
         // Buscar usuario
         for (User u : usuarios) {
            if (u.getUsuario().equals(usuario)) {
                return u;            
            }
          
         }    
         return null;
    }
    
    public int obtenerIndiceUsuario(String usu){
        
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getUsuario().equals(usu)) {
                return i;   
            }
        }
         return -1;
    }
    
    //Metodos para realizar el CRUD de usuarios
    public void crearUsuario(){
        System.out.println("\nIngrese el nombre de usuario");
        String usua = in.nextLine();
        System.out.println("Ingrese la contraseña del usuario");
        String contra = in.nextLine();
        System.out.println("Ingrese el rol del usuario");
        String rol = in.nextLine();
        
        this.usuarios.add(new User(usua,contra,rol));
        
        System.out.println("\nUsuario creado con exito :)");
    }
    
    public void consultarUsuarios(){
        System.out.println("\nLista de Usuarios registrados");
        for (User u : usuarios) {
            System.out.println(
                            "\n Usuario: " + u.getUsuario() +
                            "\n Rol: " + u.getRol());
        }
    }
    
    public void consultarUsuario(){
        System.out.println("\nIngrese el nombre del usuario a consultar");
        String usu = in.nextLine();
        
        User usuario = buscarUsuario(usu);
        
        if(usuario == null){
            System.out.println("\nUsuario no encontrado");
            return;
        }
        System.out.println("\nUsuario consultado");
        System.out.println(
                            "\n Usuario: " + usuario.getUsuario() +
                            "\n Rol: " + usuario.getRol());
        
    }
    
    public void actualizarUsuario(){
        System.out.println("\nIngrese el nombre del usuario a actualizar");
        String usu = in.nextLine();
        
        User usuario = buscarUsuario(usu);
        
        if(usuario == null){
            System.out.println("\nUsuario no encontrado");
            return;
        }
        
        System.out.println("\nActualizar usuario: " + usuario.getUsuario());
        System.out.println("Seleccione el campo a actualizar:");
        System.out.println("1. Usuario");
        System.out.println("2. Contraseña");
        System.out.println("3. Rol");
        System.out.println("4. Cancelar");
        int opcion = in.nextInt();
        in.nextLine();
        
        switch(opcion) {
           
            case 1:
                System.out.println("\nNuevo nombre de usuario:");
                usuario.setUsuario(in.nextLine());
                break;
            case 2:
                System.out.println("Nueva contraseña:");
                usuario.setContrasena(in.nextLine());
                break;
            case 3:
                System.out.println("Nuevo rol:");
                usuario.setRol(in.nextLine());
                break;
            case 4:
                System.out.println("Operación cancelada.");
                return;
            default:
                System.out.println("Opción inválida.");
                return;
        }
  
        System.out.println("\nUsuario actualizado con éxito.");

    }
    
    public void eliminarUsuario(){
        System.out.println("\nIngrese el nombre del usuario a eliminar");
        String usu = in.nextLine();
        
        User usuario = buscarUsuario(usu);
        if(usuario == null){
            System.out.println("\nUsuario no encontrado");
            return;
        } 
        
        System.out.println("\nSeguro que desea eliminar el usuario "+usuario.getUsuario());
        System.out.println("1: Si");
        System.out.println("2: No");
        int op = in.nextInt();
        in.nextLine();
        
        if(op == 1){
            int indice = obtenerIndiceUsuario(usuario.getUsuario());
            usuarios.remove(indice);
            System.out.println("\nUsuario eliminado correctamente");
            return;
        }
        
        System.out.println("\nOperaion cancelada");
    }
}
