/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion;

import empleados.UsuarioEmpleado;
import gerente.Gerente;
import administrador.ModelAdmin;
import java.util.ArrayList;
import java.util.Scanner;
import empleados.GestionEmpleados;
import departamentos.GestionDepartamento;
import desempeno.GestionDesempeno;

/**
 *
 * @author Jose Felipe
 */
public class GestionUsuarios {
    
    private ArrayList<User> usuarios;
    Scanner in = new Scanner(System.in);
        
    public GestionUsuarios(){
        usuarios = new ArrayList<>();
        inicializarUsuarios();
    }
    
    Gerente gerente = new Gerente();
    GestionEmpleados gstEmp = new GestionEmpleados();
    UsuarioEmpleado usuEmp = new UsuarioEmpleado(gstEmp);
    GestionDepartamento gstDep = new GestionDepartamento(gstEmp);
    GestionDesempeno gstDes = new GestionDesempeno(gstDep,gstEmp);
    
    public void inicializarUsuarios(){
       this.usuarios.add( new User("pedro12","pedro1234","Empleado"));
       this.usuarios.add(new User("maria09","maria0936","Gerente"));
       this.usuarios.add(new User("xdev","xdev25","Administrador"));
       this.usuarios.add(new User("daniel20","daniel2025","Empleado"));
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
      
    //Metodo para el inicio de sesión
    public void iniciarSesion(GestionUsuarios gest) {      
        System.out.println("\nBienvenid@ al sistema de CompuWork");
        boolean noCerrarSesion = true;
        boolean noSesion = true;
        int opcion = 0;
        
        while (noCerrarSesion) {
            System.out.println("\nPor favor ingrese su Usuario:");
            String usu = in.nextLine();            
           
            User usuarioEncontrado = buscarUsuario(usu);
            
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
            //ModelAdmin admin = new ModelAdmin(gestion);
          //  admin.operacionesAdministrador(usuario);
        }else if(rol.equals("Gerente")){            
            gerente.operacionesGerente(gstDep,gstEmp,gstDes,usuario);
        }else if(rol.equals("Empleado")){
            usuEmp.operacionesUEmpleado(usuario);
            
        }else{
            System.out.println("Rol no existe");
        }
            
        try{
            System.out.println("\n¿Desea ingresar con un nuevo usuario?");
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
    
    public ArrayList<User> getUsuarios() {
        return usuarios;
    }
}
