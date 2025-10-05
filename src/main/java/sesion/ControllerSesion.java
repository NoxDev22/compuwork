/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion;

/**
 *
 * @author Jose Felipe
 */
public class ControllerSesion {
    

    private Login view;
    private ModelSesion model;
    
    public ControllerSesion(Login login, ModelSesion model){       
        this.view = login;
        this.model = model;
    }
    
    public void login(){
        String userName = view.getUserName();
        String password = view.getPassword();
        
        String rol = model.verifyData(userName, password);    
        
        switch(rol){
            
            case "Administrador":
                view.sesionToAdmin(userName); 
                view.resetField();
                break;
            case "Gerente":
                view.sesionToManager(userName);
                view.resetField();
                break;
            case "Empleado":
                break;
            default:
                view.showError(rol);
        }
        
        
    }
    
    
}
