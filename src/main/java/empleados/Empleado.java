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
