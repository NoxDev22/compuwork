/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Jose Felipe
 */
public class GestionEmpleados {
    
    private ArrayList<Empleado> empleados;
    private boolean continuar = true;
    private boolean noCerrar = true;
    
    Scanner in = new Scanner(System.in);
    
    public GestionEmpleados(){   
        this.empleados = new ArrayList<>();
        iniciarEmpleados();
    }
    
    public void iniciarEmpleados(){
        empleados.add(new Empleado("123","321906754","Juan Carlos",
"Perez","Contador","3116785634","2025-08-1","1540000","No"));
        empleados.add(new Empleado("987","230987865","Carlos Mario",
 "Martinez","Servicios generales","3139715654","2025-08-3","1440000","Si"));
        empleados.add(new Empleado("025","098076545","Luisa Fernanda",
 "Torreglosa","Programadora","3129867564","2024-010-24","2840000","No"));
    }
    
    public void operacionesEmpleado(){
        continuar = true;
        
        while(continuar){
            System.out.println("\n ¿Que operacion desea realizar?");
            System.out.println("1: Agregar empleado");
            System.out.println("2: Consultar lista empleados");
            System.out.println("3: Consultar empleado");
            System.out.println("4: Modificar empleado");
            System.out.println("5: Eliminar empleado");
            System.out.println("6: Regresar");
            int op1 = in.nextInt();
            in.nextLine();
            
            switch(op1){
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    consultarEmpleados();
                    break;
                case 3: 
                    consultarEmpleado();
                    break;
                case 4: 
                    modificarEmpleado();
                    break;
                case 5: 
                    eliminarEmpleado();
                    break;
                case 6: 
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
    
    //Metodos de busqueda
    public Empleado buscarEmpleado(String id){
        
        for(Empleado emp: empleados){
            if(emp.getIdEmpleado().equals(id)){
                return emp;
            }
        }
        return null;
    }
    
    public int obtenerIndiceEmpleado(String id){
        
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getIdEmpleado().equals(id)) {
                return i;   
            }
        }
         return -1;
    }
    
    //Metodos CRUD
    public void agregarEmpleado(){
        System.out.println("\nA continuacion ingrese los datos del empleado");
        System.out.println("Ingrese el ID");
        String id = in.nextLine();
        System.out.println("Ingrese la cedula");
        String cedula = in.nextLine();
        System.out.println("Ingrese los nombres");
        String nombre = in.nextLine();
        System.out.println("Ingrese los apellidos");
        String apellido = in.nextLine();
        System.out.println("Ingrese el cargo");
        String cargo = in.nextLine();
        System.out.println("Ingrese el telefono");
        String telefono = in.nextLine();
        System.out.println("Ingrese la fecha de contratacion YY-MM-DD");
        String fecha = in.nextLine();
        System.out.println("Ingrese el salario sin comas ni puntos");
        String salario = in.nextLine();
        System.out.println("¿El empleado es temporal?");
        System.out.println("Ingrese Si o No");
        String temporal = in.nextLine();
        
        empleados.add(new Empleado(id,cedula,nombre,
                apellido,cargo,telefono,fecha,salario,temporal));
        System.out.println("\nEmpleado agregado con exito :)");
    }
    
    public void consultarEmpleados(){
        System.out.println("\n Lista de empleados agregados");
        
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
    
    public void consultarEmpleado(){
       
        System.out.println("\n Ingrese el id del empleado a consultar");
        String id = in.nextLine();
        Empleado emp = buscarEmpleado(id);
        if(emp == null){
            System.out.println("\nEmpleado no encontrado");
            return;
        }
            System.out.println("\n Empleado consultado");
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
    
    public void modificarEmpleado(){
        System.out.println("\n Ingrese el id del empleado a consultar");
        String id = in.nextLine();
        Empleado emp = buscarEmpleado(id);
        if(emp == null){
            System.out.println("\nEmpleado no encontrado");
            return;
        }
        
        System.out.println("\nActualizar empleado: " + emp.nombre);
        System.out.println("Seleccione el campo a actualizar:");
        System.out.println("1. Id");
        System.out.println("2. Cedula");
        System.out.println("3. Nombre");
        System.out.println("4. Apellido");
        System.out.println("5. Cargo");
        System.out.println("6. Telefono");
        System.out.println("7. Fecha ingreso");
        System.out.println("8. Salario");
        System.out.println("9. Temporalidad");
        System.out.println("10. Cancelar");
        int opcion = in.nextInt();
        in.nextLine();
        
        switch(opcion) {
           
            case 1:
                System.out.println("\nNuevo id de departamento:");
                emp.setIdEmpleado(in.nextLine());
                break;
            case 2:
                System.out.println("Nuevo numero de cedula:");
                emp.setCedula(in.nextLine());
                break;
            case 3:
                System.out.println("Nuevo nombre:");
                emp.nombre = in.nextLine();
                break;
            case 4:
                System.out.println("Nuevo apellido:");
                emp.apellido = in.nextLine();
                break;
            case 5:
                System.out.println("\nNuevo cargo:");
                emp.cargo = in.nextLine();;
                break;
            case 6:
                System.out.println("Nuevo telefono:");
                emp.telefono = in.nextLine();
                break;
            case 7:
                System.out.println("Nueva fecha ingreso:");
                emp.fechaIngreso = in.nextLine();
                break;
            case 8:
                System.out.println("Nuevo salario:");
                emp.salario = in.nextLine();
                break;
            case 9:
                System.out.println("Empleado temporal ingrese Si o No:");
                emp.temporal = in.nextLine();
                break;
            case 10:
                System.out.println("Operación cancelada.");
                return;
            default:
                System.out.println("Opción inválida.");
                return;
        }
  
        System.out.println("\nEmpleado actualizado con éxito.");
    }
    
    public void eliminarEmpleado(){
        System.out.println("\nIngrese el id del empleado a eliminar");
        String id = in.nextLine();
        Empleado emp = buscarEmpleado(id);
        if(emp == null){
            System.out.println("\nEmpleado no encontrado");
            return;
        } 
        
        System.out.println("\nSeguro que desea eliminar el empleado "+emp.nombre);
        System.out.println("1: Si");
        System.out.println("2: No");
        int op = in.nextInt();
        in.nextLine();
        
        if(op == 1){
            int indice = obtenerIndiceEmpleado(emp.getIdEmpleado());
            empleados.remove(indice);
            System.out.println("\nEmpleado eliminado correctamente");
            return;
        }
        
        System.out.println("\nOperaion cancelada");
    }
    
    public void gestionarDesempeno(){
        
    }
    
    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
}
