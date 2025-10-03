/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departaments;
//Paquetes de clases
import performance.PerfDepartament;

import employees.Employee;

import java.util.ArrayList;
/**
 *
 * @author Jose Felipe
 */
public class GestDepartament {
    private String idDepartamento;
    private String nombre;
    private String funcion;
    private ArrayList<PerfDepartament> desempenos;
    private ArrayList<Employee> empleados;
    
    
    public GestDepartament(String id, String nombre, String funcion){
        this.idDepartamento = "DP-"+id;
        this.nombre = nombre;
        this.funcion = funcion;
        
        this.desempenos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
  
    
    //Metodo CRUD desempeno
    public void asignarDesempeno(PerfDepartament dep){
        this.desempenos.add(dep);
        System.out.println("\nEvaluacion registrada con exito :)");
    }
    
    public void reporteDesempeno(){
        for(PerfDepartament des: desempenos){

            if(desempenos.isEmpty()){
                System.out.println("No hay informacion para mostrar");
                return;
            }

        }
    }
    
    //Metodos CRUD empleados
    public void asignarEmpleado(Employee emp){
        this.empleados.add(emp);
        System.out.println("\nEmpleado agregado con exito :)");
    }
    
    public void consultarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("El departamento "+this.nombre+" No tiene empleados");
            return;
        }
        System.out.println("\n Lista de empleados departamento "+this.nombre);

    }
   
    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }
}
