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
    private ArrayList<DesDepartamento> desempenos;
    private ArrayList<Empleado> empleados;
    
    
    public Departamento(String id, String nombre, String funcion){
        this.idDepartamento = "DP-"+id;
        this.nombre = nombre;
        this.funcion = funcion;
        
        this.desempenos = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
  
    
    //Metodo CRUD desempeno
    public void asignarDesempeno(DesDepartamento dep){
        this.desempenos.add(dep);
        System.out.println("\nEvaluacion registrada con exito :)");
    }
    
    public void reporteDesempeno(){
        for(DesDepartamento des: desempenos){

            if(desempenos.isEmpty()){
                System.out.println("No hay informacion para mostrar");
                return;
            }
            System.out.println("\nEl departamento ha cumplido sus objetivos");
            System.out.println(des.cumplioObjetivos);
            System.out.println("\nEl departamento ha tenido buenos resultados");
            System.out.println(des.resultadoObjetivos);
            System.out.println("\nComo ha sido la calida del trabajo en el departamento");
            System.out.println(des.calidadTrabajo);
            System.out.println("\nEl departamento tiene potencial de crecimiento");
            System.out.println(des.potencialCrecimiento);
            System.out.println("\nComo maneja el departamento su carga de trabajo");
            System.out.println(des.cantidadTrabajo);
            System.out.println("\nComo es el consumo de recursos en el departamento");
            System.out.println(des.usoRecursos);
            System.out.println("\nEl departamento presenta objetivos claros");
            System.out.println(des.objetivosClaros);
            System.out.println(" ****************************");
        }
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
