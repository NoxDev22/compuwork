/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrador;

import java.util.ArrayList;
import sesion.User;
/**
 *
 * @author Jose Felipe
 */
public class ModelAdmin {
    
    private ArrayList<User> users;  
    
    public ModelAdmin(Administrator admin) {
        this.users = admin.getUsers();
    }
     

    
    public int getIndexUser(String usu){
        
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUsuario().equals(usu)) {
                return i;   
            }
        }
         return -1;
    }
    
    public void mostrar(){
        for (User u : users) {
            
            System.out.println(u.getUsuario());
           
         } 
    }
    //Metodos para realizar el CRUD de usuarios
    public User searchUser(String user){
        // Buscar usuario
        for (User u : users) {
            if (u.getUsuario().equals(user)) {
                return u;            
            }
          
         }    
        return null;
    }
    
    public String createUser(String name, String pass, String role){
        
        this.users.add(new User(name,pass,role));
        
        return "Usuario agregado correctamente :)";  
    }
    
    public String actualizarUsuario(String name, String pass, String role){
        
        User user = searchUser(name);
        
        if(!name.trim().isEmpty()){
            user.setUsuario(name);
        }
        if(!pass.trim().isEmpty()){
            user.setContrasena(pass);
        }
        if(!role.trim().isEmpty()){
            user.setRol(role);
        }
        
        if(name.trim().isEmpty() && pass.trim().isEmpty() && role.trim().isEmpty()){
            return "¡Error al actualizar, NO se ingresaron datos en ninguna de las casillas.";
        }
        
        return "Datos actualizados correctamente :)";

    }
    
    public String eliminarUsuario(String userName){
        
        User user = searchUser(userName);      
        
        int index = getIndexUser(user.getUsuario());
        this.users.remove(index);
        
        return "Usuario eliminado correctamente :)";
    }
}
