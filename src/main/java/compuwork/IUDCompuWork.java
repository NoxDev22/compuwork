/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package compuwork;

import usuarios.GestionUsuarios;
import usuarios.Administrador;
/**
 *
 * @author Jose Felipe
 */

public class IUDCompuWork {

    public static void main(String[] args) {
        
        GestionUsuarios gestion = new GestionUsuarios();
        gestion.iniciarSesion(gestion);
        
    }
}
