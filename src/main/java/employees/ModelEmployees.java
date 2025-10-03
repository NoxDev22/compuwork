/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

import java.util.ArrayList;
import performance.PerfEmployee;
/**
 *
 * @author Jose Felipe
 */
public class ModelEmployees {
    private ArrayList<Employee> employees;
       
       
    public ModelEmployees(Employees employee){
        this.employees = employee.getEmployees();
        addEmployeeToList();
        addPerformanceToEmployee();
    }
    
    public void addEmployeeToList(){
        this.employees.add(new Employee("32457588","Juan Carlos","Alonso","Secretario","324456789","24/08/2024","2.640.000","No"));
        this.employees.add(new Employee("32456757","Neymar","Junior","Secretario","3221347589","24/09/2024","3.640.000","No"));
        this.employees.add(new Employee("31247537","Yeison","Moreno","Contador","3232457587","24/03/2024","4.640.000","Si"));
        this.employees.add(new Employee("12309756","Leison","Moreno","Servicios Generales","3209886754","12/04/2024","3.640.000","No"));
        this.employees.add(new Employee("32124648","Alejandro","Cardona","Servicios Generales","3122335767","27/09/2025","2.640.000","Si"));
        this.employees.add(new Employee("39867535","Maria","Martinez","Secretaria","3212345678","22/08/2025","3.640.000","Si"));
        this.employees.add(new Employee("30967453","Cristiano","Ronaldo","Gerente","322084576","22/03/2025","27.990.000","No"));
        this.employees.add(new Employee("31245324","Leonel Andres","Mesi","Gerente","3209764346","22/03/2025","24.940.000","No"));
        this.employees.add(new Employee("39867431","Julian","Alvarez","Jefe de zona","315758790","22/03/2025","22.940.000","No"));
        this.employees.add(new Employee("53234534","Erling","Haland","Contador","314357687","22/03/2025","7.440.000","No"));
        this.employees.add(new Employee("10974523","Eren","Jeager","Secretario","319987564","15/06/2025","2.740.000","No"));
        this.employees.add(new Employee("12643865","Niky","Lauda","Gerente","3187845680","24/04/2025","4.640.000","No"));
              
    }
    
    public void addPerformanceToEmployee(){
        this.employees.get(3).addPerformance(new PerfEmployee("Si","Excelente","Excelente","Alto","Altas","Alto","Altas","Excelente","21/06/2025"));
        this.employees.get(5).addPerformance(new PerfEmployee("Si","Excelente","Excelente","Alto","Altas","Alto","Altas","Excelente","13/07/2025"));
        this.employees.get(0).addPerformance(new PerfEmployee("Si","Excelente","Excelente","Alto","Altas","Alto","Altas","Excelente","18/09/2025"));
        this.employees.get(9).addPerformance(new PerfEmployee("Si","Excelente","Excelente","Alto","Altas","Alto","Altas","Excelente","21/06/2025"));
    }
    
    //Metodos de busqueda
    public Employee searchEmployee( String document){
        
        for(Employee emp: employees){
            if(emp.getDocument().equals(document)){
                return emp;
            }
        }
        return null;
    }
    
    public int getIndexEmployee(String document){
        
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDocument().equals(document)) {
                return i;   
            }
        }
         return -1;
    }
    
    public String createEmployee(String document,String name,String lastName, 
            String post,String phone,String date,String salary,String temporary){
       
        try{
            employees.add(new Employee(document,name,
            lastName,post,phone,date,salary,temporary));
        }catch(Exception e){
            System.out.println("Erro al agregar empleado");
            return null;
        }
        return "Empleado agregado correctamente :)";
 
    }
    
    public String updateEmployee(String oldDocument,String document,String name,String lastName, 
        String post,String phone,String date,String salary,String temporary){
        
        Employee emp = searchEmployee(oldDocument);
        
        if(!document.trim().isEmpty()){
            emp.setDocument(document);
        }
        if(!name.trim().isEmpty()){
            emp.setName(name);
        }
        if(!lastName.trim().isEmpty()){
            emp.setLastName(lastName);
        }
        if(!post.trim().isEmpty()){
            emp.setPost(post);
        }
        if(!phone.trim().isEmpty()){
            emp.setPhone(phone);
        }
        if(!date.trim().isEmpty()){
            emp.setEntryDate(date);
        }
        if(!salary.trim().isEmpty()){
            emp.setSalary(salary);
        }
        if(temporary != "Elegir opcion"){
            emp.setTemporary(temporary);
        }

        
        if(document.trim().isEmpty() && name.trim().isEmpty() && lastName.trim().isEmpty()
                && post.trim().isEmpty() && phone.trim().isEmpty() && date.trim().isEmpty()
                && salary.trim().isEmpty() && temporary == "Elegir opcion"){
            
            return "¡Error al actualizar, NO se ingresaron datos en ninguna de las casillas.";
        }
        
        return "Datos actualizados correctamente :)";

    }
    
    public String removeEmployee(String document){
        
        Employee emp = searchEmployee(document);  
        
        if(emp == null){
            return "Empleado no encontrado";
        }
        
        int index = getIndexEmployee(emp.getDocument());
        this.employees.remove(index);
        
        return "Empleado eliminado correctamente :)";
    }
    

}
