/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administrador;

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
}
