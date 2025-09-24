/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;
import desempeno.DesEmpleado;
import java.util.ArrayList;
/**
 *
 * @author Jose Felipe
 */
public class Empleado {
    private String idEmpleado;
    private String cedula;
    public String nombre;
    public String apellido;
    public String cargo;
    public String telefono;
    public String fechaIngreso;
    public String salario;
    public String temporal;
    public boolean sinDepartamento = true;
    ArrayList<DesEmpleado> desempenos;
    
    public Empleado(String id, String cedula,String nombres, String apellidos, 
            String cargo, String telefono, String fecha, String salario,
            String temporal){
        
        this.desempenos = new ArrayList<>();
        this.idEmpleado = "EP"+id;
        this.cedula = cedula;
        this.nombre = nombres;
        this.apellido = apellidos;
        this.cargo = cargo;
        this.telefono = telefono;
        this.fechaIngreso = fecha;
        this.salario = salario;
        this.temporal = temporal;  
    }
    
     //Metodo CRUD desempeno
    public void asignarDesempeno(DesEmpleado emp){
        this.desempenos.add(emp);
        System.out.println("\nEvaluacion registrada con exito :)");
    }
    
    public void reporteDesempeno(){
        for(DesEmpleado des: desempenos){

            if(desempenos.isEmpty()){
                System.out.println("No hay informacion para mostrar");
                return;
            }
            System.out.println("\nEl empleado ha cumplido sus objetivos");
            System.out.println(des.cumplioObjetivos);
            System.out.println("\nEl empleado ha tenido buenos resultados con sus objetivos");
            System.out.println(des.resultadoObjetivos);
            System.out.println("\nComo ha sido la calida del trabajo del empleado");
            System.out.println(des.calidadTrabajo);
            System.out.println("\nEl empleado tiene potencial de crecimiento");
            System.out.println(des.potencialCrecimiento);
            System.out.println("\nComo son las habilidades tecnicas del empleado");
            System.out.println(des.habilidades);
            System.out.println("\nComo se desenvuelve el empleado en su puesto");
            System.out.println(des.conocimientoPuesto);
            System.out.println("\nEl empleado tiene buena relacion con sus compañeros");
            System.out.println(des.relacionesPersonales);
            System.out.println("\nEl empleado tiene una buena comunicacion");
            System.out.println(des.comunicacion);
            System.out.println(" ****************************");
        }
    }
    
    
    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
}
