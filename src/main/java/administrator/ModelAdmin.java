/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrator;

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
        
        try{
        this.users.add(new User(name,pass,role));
        }catch(Exception e){
            System.out.println("Algo salio mal en agrear al usuario");
            return null;
        }
        
        return "Usuario agregado correctamente :)";  
    }
    
    public String updateUser(String oldName,String newName ,String pass, String role){
        
        User user = searchUser(oldName);
        
        if(!newName.trim().isEmpty()){
            user.setUsuario(newName);
        }
        if(!pass.trim().isEmpty()){
            user.setContrasena(pass);
        }
        if(role != "No"){
            user.setRol(role);
        }
        
        if(newName.trim().isEmpty() && pass.trim().isEmpty() && role == "No"){
            return "¡Error al actualizar, NO se ingresaron datos en ninguna de las casillas.";
        }
        
        return "Datos actualizados correctamente :)";

    }
    
    public String removeUser(String userName){
        
        User user = searchUser(userName);      
        if(user == null){
            return "Usuario no encontrado";
        }
        
        int index = getIndexUser(user.getUsuario());
        this.users.remove(index);
        
        return "Usuario eliminado correctamente :)";
    }
    
}
