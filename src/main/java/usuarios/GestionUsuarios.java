/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.ArrayList;
import java.util.Scanner;
import empleados.GestionEmpleados;
import departamentos.GestionDepartamento;

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
    
    Gerente gerente = new Gerente();
    GestionEmpleados gstEmp = new GestionEmpleados();
    UsuarioEmpleado usuEmp = new UsuarioEmpleado(gstEmp);
    GestionDepartamento gstDep = new GestionDepartamento(gstEmp);
   
    
    public void inicializarUsuarios(){
       this.usuarios.add( new Usuario("pedro12","pedro1234","Empleado"));
       this.usuarios.add(new Usuario("maria09","maria0936","Gerente"));
       this.usuarios.add(new Usuario("xdev","xdev25","Administrador"));
       this.usuarios.add(new Usuario("daniel20","daniel2025","Empleado"));
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
    public void iniciarSesion(GestionUsuarios gest) {      
        
        boolean noCerrarSesion = true;
        boolean noSesion = true;
        int opcion = 0;
        
        while (noCerrarSesion) {
            System.out.println("\nIngrese su Usuario:");
            String usu = in.nextLine();            
           
            Usuario usuarioEncontrado = buscarUsuario(usu);
            
            if (usuarioEncontrado == null) {
                System.out.println("\nUsuario no encontrado.");
            } else {
                // Si existe el usuario -> validamos contraseña
                int intentos = 3;
                boolean noAcceso = true;
                
                while (intentos > 0 && noAcceso) {
                    System.out.println("\nIngrese su Contraseña:");
                    String contra = in.nextLine();
                    
                    if (usuarioEncontrado.getContrasena().equals(contra)) {
                        noCerrarSesion = dirigirSesion(usuarioEncontrado.getRol(), 
                                usuarioEncontrado.getUsuario(),gest);
                        noSesion = false;
                        noAcceso = false;
                        
                    } else {
                        intentos--;
                        System.out.println("\nContraseña incorrecta. Intentos restantes: " + intentos);
                    }
                }
                
                if (intentos <= 0) {
                    System.out.println("\n️Ha superado el número máximo de intentos. Acceso bloqueado.");
                }
            }
            
            if(noSesion){
                // Preguntar si desea volver a intentar
                System.out.println("\n¿Desea volver a intentarlo?");
                System.out.println("1: Sí");
                System.out.println("2: No");
                opcion = in.nextInt();
                in.nextLine(); 
             
            }
            if (opcion == 2 || !noCerrarSesion) {
                System.out.println("\nEjecución finalizada.");
            }
            
        }
    }
    
    //Metodo para dirigir la sesión segun el rol
    private boolean dirigirSesion(String rol,String usuario,GestionUsuarios gestion) {
        
        if(rol.equals("Administrador")){
            Administrador admin = new Administrador(gestion);
            admin.operacionesAdministrador(usuario);
        }else if(rol.equals("Gerente")){            
            gerente.operacionesGerente(gstDep,gstEmp ,usuario);
        }else if(rol.equals("Empleado")){
            usuEmp.operacionesUEmpleado(usuario);
            
        }else{
            System.out.println("Rol no existe");
        }
            
        try{
            System.out.println("\n¿Desea ingresar un nuevo usuario?");
            System.out.println("1: Si");
            System.out.println("2: No");
            int op = in.nextInt();
            in.nextLine();
                    
            if(op == 1){
                return true;
            }   
            return false;
            
        }catch(Exception e){
            return false;
        }
    }
    
    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }
}
