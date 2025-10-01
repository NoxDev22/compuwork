/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrador;

import sesion.User;

/**
 *
 * @author Jose Felipe
 */
public class ControllerAdmin {
    
    private Administrator view;
    private ModelAdmin model;
    private ViewAddUser addUser;
    private ViewUpdateUser updateUser;
    
    //name del usuario a eliminar o actualizar
    private String UserName = null;
    
    public ControllerAdmin(Administrator admin, ModelAdmin model,
            ViewAddUser add,ViewUpdateUser update ){       
        this.view = admin;
        this.model = model;
        this.addUser = add;
        this.updateUser = update;

    }
   
    public void searchUser(){
        String userName = view.getUserName();
        
        if(!userName.trim().isEmpty()){
            User user = model.searchUser(userName);
            
            if(user == null){
                view.showError("¡Error usuario NO encontrado!");
            }else {
                view.setUserFound(user);
                this.UserName = user.getUsuario();
                view.showError("Consulta exitosa :)");
            }
        }else{
            view.showError("¡Error NO se ingreso ningun nombre de usuario!");
        }
              
    }
    
    public void addUser(String userName,String pass, String role){

        String res = model.createUser(userName, pass, role);
        view.showUsersToTable();
        this.addUser.resetFields();
        addUser.showMessage(res);
    }
    
    public void removeUser(){
       
        String confirm = this.view.confirmRemove(this.UserName);
        
        if(confirm == "Si"){
           String response =  model.removeUser(UserName);
           this.view.showUsersToTable();
           this.view.resetFielSerach();
           this.view.setUserEmpty();
           this.view.showError(response);
        }
      
    }
    
    public void updateUser(String oldName,String newName,String pass, String role){
        
        try{
            if(this.UserName == null){
                this.view.showError("¡Error no hay usuario consultado.");
                return;
            }
              
            String res = this.model.updateUser(oldName,newName, pass, role);
        
            this.view.showUsersToTable();
            this.view.setUserEmpty();
            this.view.resetFielSerach();
            this.updateUser.resetFields();
            this.updateUser.showError(res);
            
        }catch(Exception e){
            
            System.out.println("Hubo un error en la actualizacion del usuario");
        }

        
      
    }
}
