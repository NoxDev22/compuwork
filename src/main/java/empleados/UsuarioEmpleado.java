/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;


import java.util.Scanner;
import empleados.GestionEmpleados;


/**
 *
 * @author Jose Felipe
 */
public class UsuarioEmpleado {
    
    private Scanner in = new Scanner(System.in);
    GestionEmpleados gstEmp;
    
    public UsuarioEmpleado(GestionEmpleados gestion){
        this.gstEmp = gestion;
    }
    
    public void operacionesUEmpleado(String usuario){
        boolean continuar = true;
        boolean noCerrar = true;
        
        System.out.println("\nBienvenido "+usuario);
        
        while(continuar){
            System.out.println("\n¿Desea consultar su informacion? ");
            System.out.println("1: Si");
            System.out.println("2: Cerrar Sesión");
            int opcion = in.nextInt();
            in.nextLine();
            
            switch(opcion){
            
                case 1:
                    gstEmp.consultarEmpCedula();
                    break;
                case 2:
                    noCerrar = false;
                    break;
                    
                default:
                    System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea realizar la consulta nuevamente?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
            
                if(op2 == 2){
                    continuar = false;
                    System.out.println("\nCerrando sesión...");
                }else{
                    System.out.println("\nReiniciando...");
                    }
            }else {
                System.out.println("\nCerrando sesión...");
                continuar = false;
            }

        }

    }
    
}
