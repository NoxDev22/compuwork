/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuarios;

import java.util.Scanner;
import departamentos.GestionDepartamento;
import empleados.GestionEmpleados;
import desempeno.GestionDesempeno;
/**
 *
 * @author Jose Felipe
 */
public class Gerente {
    

    
    Scanner in = new Scanner(System.in);
    
    public void operacionesGerente(GestionDepartamento gstDep,GestionEmpleados gstEmp,
            GestionDesempeno gstDes ,String usuario){

        boolean continuar = true;
        boolean noCerrar = true;
        
        System.out.println("\nBienvenido "+usuario);
        while(continuar){
            System.out.println("\n ¿Que area desea gestionar?");
            System.out.println("1: Empleados");
            System.out.println("2: Departamentos");
            System.out.println("3: Desempeño");
            System.out.println("4: Cerrar sesión");
            int op1 = in.nextInt();
            in.nextLine();
            
            switch(op1){
                case 1:
                    gstEmp.operacionesEmpleado();
                    break;
                case 2:
                    gstDep.operacionesDepartamento();
                    break;
                case 3: 
                    gstDes.operacionesDesempeno();
                    break;
                case 4: 
                    noCerrar = false;
                    break;
                default:
                    System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea realizar otra gestion?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
                
                if(op2 == 1){
                    System.out.println("\nReiniciando...");
                    
                }else{
                    System.out.println("\nCerrando sesión...");
                    continuar = false;
                }
            }else {
               System.out.println("\nCerrando sesión...");
               continuar = false;
            }
        }
        
    }
}
