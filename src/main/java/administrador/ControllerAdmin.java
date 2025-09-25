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
    
    public ControllerAdmin(Administrator admin, ModelAdmin model){       
        this.view = admin;
        this.model = model;
    }
    
    
    public void searchUser(){
        String userName = view.getUserName();
        
        if(!userName.trim().isEmpty()){
            User user = model.searchUser(userName);
            
            if(user == null){
                view.showError("¡Error usuario NO encontrado!");
            }else {
                view.setUserFound(user);
            }
        }else{
            view.showError("¡Error NO se ingreso ningun nombre de usuario!");
        }
              
    }
}
