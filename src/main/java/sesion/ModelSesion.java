/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion;

import java.util.ArrayList;

/**
 *
 * @author Jose Felipe
 */
public class ModelSesion {
    private ArrayList<User> users;
    
    public ModelSesion(Login login){
        this.users = login.getUsers();
        initializeUsers();
    }
    
    public void initializeUsers(){
       this.users.add( new User("pedro12","pedro1234","Empleado"));
       this.users.add(new User("maria09","maria0936","Gerente"));
       this.users.add(new User("xdev","xdev25","Administrador"));
       this.users.add(new User("daniel20","daniel2025","Empleado"));
    }
    
   
    // Metodo para buscar un usuario 
    public User searchUser(String user){   
        for (User u : users) {
            if (u.getUsuario().equals(user)) {
                return u;            
            }   
        }    
    return null;
    }
      
    //Metodo para el inicio de sesión
    public String verifyData( String user, String password) {      
         
        User userFound = searchUser(user);
        
        if (userFound == null) {
            return "¡Error usuario NO encontrado.";
        } else {
            // Si existe el usuario -> validamos contraseña
            if (!userFound.getContrasena().equals(password)) {
                return "¡Error contraseña incorrecta.";        
            }     
        }
        
        return userFound.getRol();   
    }
}
