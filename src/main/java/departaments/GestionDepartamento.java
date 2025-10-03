/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package departaments;

import java.util.Scanner;
import java.util.ArrayList;


import employees.Employee;

import performance.PerfDepartament;
/**
 *
 * @author Jose Felipe
 */
public class GestionDepartamento {
    
    private ArrayList<GestDepartament> departamentos;
    private ArrayList<Employee> empleados;
    
    
    Scanner in = new Scanner(System.in);
    GestDepartament dep1 = new GestDepartament("103","Operaciones","Supervisa la producción de bienes.");
    
    public GestionDepartamento(){
       
        this.departamentos = new ArrayList<>();
        iniciarDepartamentos();
    }
    
    public void iniciarDepartamentos(){   
        departamentos.add(new GestDepartament("234","Marketing","Promocionar los productos o servicios."));
        departamentos.add(new GestDepartament("465","Finanzas y Contabilidad","Gestiona los aspectos financieros."));
        departamentos.add(new GestDepartament("786","I+D","Creación de nuevos productos y mejora de los existentes."));
    }
    
    public void operacionesDepartamento(){
        boolean continuar = true;
        boolean noCerrar = true;
        
        while(continuar){
            System.out.println("\n ¿Que operacion desea realizar?");
            System.out.println("1: Crear departamento");
            System.out.println("2: Consultar lista departamentos");
            System.out.println("3: Consultar departamento");
            System.out.println("4: Modificar departamento");
            System.out.println("5: Eliminar departamento");
            System.out.println("6: Asignar empleado a departamento");
            System.out.println("7: Consultar empleados de un departamento");
            System.out.println("8: Regresar");
            int op1 = in.nextInt();
            in.nextLine();
            
            switch(op1){
                case 1:
                    crearDepartamento();
                    break;
                case 2:
                    consultarDepartamentos();
                    break;
                case 3: 
                    consultarDepartamento();
                    break;
                case 4: 
                    modificarDepartamento();
                    break;
                case 5: 
                    eliminarDepartamento();
                    break;
                case 6: 
                    asignarEmpleados();
                    break;
                case 7: 
                    consultarEmpleados();
                    break;
                case 8: 
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
    public GestDepartament buscarDepartamento(String id){
        
        for(GestDepartament dep: departamentos){
            if(dep.getIdDepartamento().equals(id)){
                return dep;
            }
        }
        return null;
    }
    
    public Employee buscarEmpleado(String id){
        
        for(Employee emp: empleados){
        
        }
        return null;
    }
    
    public int obtenerIndiceDepartamento(String id){
        
        for (int i = 0; i < departamentos.size(); i++) {
            if (departamentos.get(i).getIdDepartamento().equals(id)) {
                return i;   
            }
        }
         return -1;
    }
    
    //Metodos CRUD
    public void crearDepartamento(){
        System.out.println("\nA continuacion ingrese los datos del departamento");
        System.out.println("Ingrese el ID");
        String id = in.nextLine();
        System.out.println("Ingrese el nombre");
        String nombre = in.nextLine();
        System.out.println("Ingrese la funcion");
        String funcion = in.nextLine();
        
        departamentos.add(new GestDepartament(id,nombre,funcion));
        System.out.println("Departamento agregado con exito :)");
    }
    
    public void consultarDepartamentos(){
        System.out.println("\nLista de departamentos agregados");
        
        for(GestDepartament dep: departamentos){
            System.out.println("\nId: "+dep.getIdDepartamento()
                             + "\nNombre: "+dep.getNombre()
                             + "\nFuncion: "+dep.getFuncion());
            System.out.println("****************************");
        }
    }
    
    public void consultarDepartamento(){
       
        System.out.println("\n Ingrese el id del departamento a consultar");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        }
          System.out.println("\n Departamento consultado");
          System.out.println("\n Id: "+dep.getIdDepartamento()
                           + "\n Nombre: "+dep.getNombre()
                           + "\n Funcion: "+dep.getFuncion());
          System.out.println(" ****************************");
    }
    
    public void modificarDepartamento(){
        System.out.println("\n Ingrese el id del departamento a consultar");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        }
        
        System.out.println("\nActualizar departamento: " + dep.getNombre());
        System.out.println("Seleccione el campo a actualizar:");
        System.out.println("1. Id");
        System.out.println("2. Nombre");
        System.out.println("3. Funcion");
        System.out.println("4. Cancelar");
        int opcion = in.nextInt();
        in.nextLine();
        
        switch(opcion) {
           
            case 1:
                System.out.println("\nNuevo id de departamento:");
                dep.setIdDepartamento(in.nextLine());
                break;
            case 2:
                System.out.println("Nuevo nombre:");
                dep.setNombre(in.nextLine());
                break;
            case 3:
                System.out.println("Nueva funcion:");
                dep.setFuncion(in.nextLine());
                break;
            case 4:
                System.out.println("Operación cancelada.");
                return;
            default:
                System.out.println("Opción inválida.");
                return;
        }
  
        System.out.println("\nDepartamento actualizado con éxito.");
    }
    
    public void eliminarDepartamento(){
        System.out.println("\nIngrese el id del departamento a eliminar");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        } 
        
        System.out.println("\nSeguro que desea eliminar el departamento "+dep.getNombre());
        System.out.println("1: Si");
        System.out.println("2: No");
        int op = in.nextInt();
        in.nextLine();
        
        if(op == 1){
            int indice = obtenerIndiceDepartamento(dep.getIdDepartamento());
            departamentos.remove(indice);
            System.out.println("\nDepartamento eliminado correctamente");
            return;
        }
        
        System.out.println("\nOperaion cancelada");
    }
    
    //Metodos empleados
    public void asignarEmpleados(){
        boolean continuar = true;
        
        System.out.println("\nLista de empleados sin departamento");
      
        consultarDepartamentos();
        
        System.out.println("\nIngrese el id del departamento al"
                         + "\nque quiere asignar empleados");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        } 
        
        try{
            while(continuar){
                System.out.println("\nDepartamento "+dep.getNombre());
                System.out.println("\nIngrese el id del empleado a agregar");
                String id2 = in.nextLine();
                
                Employee emp = buscarEmpleado(id2);
                if(emp == null){
                System.out.println("\nEmpleado no encontrado");
                
                }else{
                    System.out.println("\nAsignando empleado "+" al departamento "+dep.getNombre());
                  
                    dep.asignarEmpleado(emp);
                }
                
                System.out.println("\nDesea ingresar otro empleado");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op3 = in.nextInt();
                in.nextLine();
                if(op3 == 2){
                    System.out.println("\nCerrando..");
                    continuar = false;
                }
            }
            
        }catch(Exception e){
          System.out.println("\nError algo salio mal "+e); 
        }
    }
    
    public void consultarEmpleados(){
        System.out.println("\nIngrese el id del departamento");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        }
        dep.consultarEmpleados();
    }
    
    //Metodos desempeño
    public void evaluarDesepeno(){
        boolean continuar = true;
        
        consultarDepartamentos();
        
        System.out.println("\nIngrese el id del departamento al"
                         + "\nque quiere evaluar");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        } 
        
        try{
            while(continuar){
                System.out.println("\nEvaluacion de desempeño");
                System.out.println("\nDepartamento "+dep.getNombre());
                System.out.println("\nEl departamento ha cumplido sus objetivos");
                String cumpli = in.nextLine();
                System.out.println("\nEl departamento ha tenido buenos resultados");
                String result = in.nextLine();
                System.out.println("\nComo ha sido la calida del trabajo en el departamento");
                String calidad = in.nextLine();
                System.out.println("\nEl departamento tiene potencial de crecimiento");
                String crecimi = in.nextLine();
                System.out.println("\nComo maneja el departamento su carga de trabajo");
                String trabajo = in.nextLine();
                System.out.println("\nComo es el consumo de recursos en el departamento");
                String recurso = in.nextLine();
                System.out.println("\nEl departamento presenta objetivos claros");
                String objet = in.nextLine();
                
             
              
                System.out.println("******************************************");               
                
                System.out.println("\nDesea realizar otra evaluacion de desempeño");
                System.out.println("1: Si");
                System.out.println("2: No");
                int op3 = in.nextInt();
                in.nextLine();
                
                if(op3 == 2){
                    System.out.println("\nCerrando..");
                    continuar = false;
                }
            }
            
        }catch(Exception e){
          System.out.println("\nError algo salio mal "+e); 
        }
    }
    
    public void generarReporte(){
        consultarDepartamentos();
        
        System.out.println("\nIngrese el id del departamento ");
        String id = in.nextLine();
        GestDepartament dep = buscarDepartamento(id);
        if(dep == null){
            System.out.println("\nDepartamento no encontrado");
            return;
        }
        System.out.println("\nReporte de desempeño departamento "+dep.getNombre());
        dep.reporteDesempeno();
    }
}
