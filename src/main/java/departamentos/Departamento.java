/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departamentos;
//Paquetes de clases
import desempeno.DesDepartamento;
import empleados.GestionEmpleados;
import empleados.Empleado;

import java.util.ArrayList;
/**
 *
 * @author Jose Felipe
 */
public class Departamento {
    private String idDepartamento;
    private String nombre;
    private String funcion;
    private ArrayList<DesDepartamento> desempeno;
    private ArrayList<Empleado> empleados;
    
    
    public Departamento(String id, String nombre, String funcion){
        this.idDepartamento = "DP-"+id;
        this.nombre = nombre;
        this.funcion = funcion;
        
        this.desempeno = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
  
    //Metodo de busqueda
    public int obtenerIndiceDesempeno(String id){
        
        for (int i = 0; i < desempeno.size(); i++) {
            if (desempeno.get(i).equals(id)) {
                return i;   
            }
        }
         return -1;
    }
    
    //Metodos CRUD empleados
    public void asignarEmpleado(Empleado emp){
        this.empleados.add(emp);
        System.out.println("\nEmpleado agregado con exito :)");
    }
    
    public void consultarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("El departamento "+this.nombre+" No tiene empleados");
            return;
        }
        System.out.println("\n Lista de empleados departamento "+this.nombre);
        for(Empleado emp: empleados){
            System.out.println("\n Id: "+emp.getIdEmpleado()
                             + "\n Cedula: "+emp.getCedula()
                             + "\n Nombre: "+emp.nombre
                             + "\n Apellido: "+emp.apellido
                             + "\n Cargo: "+emp.cargo
                             + "\n Telefono: "+emp.telefono
                             + "\n Fecha ingreso: "+emp.fechaIngreso
                             + "\n Salario: "+emp.salario
                             + "\n Temporal: "+emp.temporal);
            System.out.println(" ****************************");
        }
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
