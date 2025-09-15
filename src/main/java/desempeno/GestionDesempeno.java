/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desempeno;

import java.util.Scanner;
import empleados.GestionEmpleados;
import departamentos.GestionDepartamento;

/**
 *
 * @author Jose Felipe
 */
public class GestionDesempeno {
    
    Scanner in = new Scanner(System.in);
    GestionDepartamento gstDep;
    GestionEmpleados gstEmp;
    
    public GestionDesempeno(GestionDepartamento gstDep, GestionEmpleados gstEmp){
        this.gstDep = gstDep;
        this.gstEmp = gstEmp;
    }
    
     public void operacionesDesempeno(){
        boolean continuar = true;
        boolean noCerrar = true;
        
        while(continuar){
            System.out.println("\n ¿Que area desea evaluar?");
            System.out.println("1: Departamentos");
            System.out.println("2: Empleados");
            System.out.println("3: Regresar");
            int op1 = in.nextInt();
            in.nextLine();
            
            switch(op1){
                
                case 1:
                   desempenoDepartamento();
                    break;
                case 2:
                   desempenoEmpleado();
                    break;
                case 3: 
                    noCerrar = false;
                    break;    
                default:
                    System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea evaluar otra area?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
                
                if(op2 == 1){
                    System.out.println("\nReiniciando...");
                    
                }else{
                    System.out.println("Regresando...");
                    continuar = false;
                }
            }else {
               System.out.println("Regresando...");
               continuar = false;
            }
            
        }
    }
    
     
    public void desempenoDepartamento(){
        boolean continuar = true;
        boolean noCerrar = true;
        
        while(continuar){
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1: Evaluar desempeño");
            System.out.println("2: Generar reporte desempeño de un departamento");
            System.out.println("3: Cancelar");
            int op = in.nextInt();
            in.nextLine();  
            
            switch(op){
                
            case 1:
                gstDep.evaluarDesepeno();
                break;
            case 2:
                gstDep.generarReporte();
                break;
            case 3: 
                noCerrar = false;
                break;    
            default:
                System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea realizar otra operacion?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
                
                if(op2 == 1){
                    System.out.println("\nReiniciando...");
                }else{
                    System.out.println("Regresando...");
                    continuar = false;
                }
            }else {
               System.out.println("Regresando...");
               continuar = false;
            }
        }
    
    }
    
    public void desempenoEmpleado(){
        boolean continuar = true;
        boolean noCerrar = true;
        
        while(continuar){
            System.out.println("¿Que operacion desea realizar?");
            System.out.println("1: Evaluar desempeño");
            System.out.println("2: Generar reporte desempeño de un empleado");
            System.out.println("3: Cancelar");
            int op = in.nextInt();
            in.nextLine();  
            
            switch(op){
                
            case 1:
                gstEmp.evaluarDesepeno();
                break;
            case 2:
                gstEmp.generarReporte();
                break;
            case 3: 
                noCerrar = false;
                break;    
            default:
                System.out.println("\n!Error opcion invalida");
            }
            
            if(noCerrar){
                System.out.println("\n¿Desea realizar otra operacion?");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op2 = in.nextInt();
                in.nextLine();
                
                if(op2 == 1){
                    System.out.println("\nReiniciando...");
                }else{
                    System.out.println("Regresando...");
                    continuar = false;
                }
            }else {
               System.out.println("Regresando...");
               continuar = false;
            }
        }
    
    }
}
