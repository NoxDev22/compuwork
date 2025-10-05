/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package performance;

import employees.Employee;
import employees.Employees;
import java.util.ArrayList;

/**
 *
 * @author Jose Felipe
 */
public class ModelPerformance {
    
    private ArrayList<Employee> employees;

    
    public ModelPerformance(Employees emp){
        this.employees = emp.getEmployees();
    }
    
    //Metodos CRUD de empleados 
    public Employee searchEmployee( String document){
        
        for(Employee emp: employees){
            if(emp.getDocument().equals(document)){
                return emp;
            }
        }
        return null;
    }
    
    public PerfEmployee getPerformanceEmp(String document,int index){
        Employee emp = searchEmployee(document);
        return emp.getPerformance().get(index);
    }
    
    public String addPerformanceEmp(String document,String fullfilled, String result, String quality, String growth,
                       String skills, String knoPosition,String relatioships, String comunication,String date){
       
        try{
            Employee emp = searchEmployee(document);
            emp.getPerformance().add(new PerfEmployee(fullfilled,result,quality,growth,
            skills,knoPosition,relatioships,comunication,date));
            
        }catch(Exception e){
            System.out.println("Error al agregar la evaluacion de desempeño");
            return "Hubo un error al agregar la evaluacion de desempeño por favor intentelo de nuevo :(";
        }
        return "Evaluacion de desempeño agregada correctamente :)";
 
    }
    
    
    public int getIndexEmployee(String document){
        
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getDocument().equals(document)) {
                return i;   
            }
        }
         return -1;
    }
    
    public String updatePerformanceEmployee(String document,int index,String fullfilled, String result, String quality, String growth,
                    String skills, String knoPosition,String relatioships, String comunication,String date){
        Employee emp = searchEmployee(document);
        PerfEmployee performance = emp.getPerformance().get(index);
        
        if(fullfilled != "Seleccionar"){
            performance.setFulfilledObjetive(fullfilled);
        }
        if(result != "Seleccionar"){
            performance.setResultsObjetive(result);
        }
        if(quality != "Seleccionar"){
            performance.setQualityWork(quality);
        }
        if(growth != "Seleccionar"){
            performance.setPotentialGrowth(growth);
        }
        if(skills != "Seleccionar"){
            performance.setSkills(skills);
        }
        if(knoPosition != "Seleccionar"){
            performance.setKnowingPosition(knoPosition);
        }
        if(relatioships != "Seleccionar"){
            performance.setPersonalRelationships(relatioships);
        }
        if(comunication != "Seleccionar"){
            performance.setComunication(comunication);
        }
        if(date != "Seleccionar"){
            performance.setPerformanceDate(date);
        }

        
        if(date == "Seleccionar"&& comunication == "Seleccionar"&&relatioships == "Seleccionar"&&knoPosition == "Seleccionar"
                && skills == "Seleccionar"&&growth == "Seleccionar"&&quality == "Seleccionar"&&result == "Seleccionar"&&fullfilled == "Seleccionar"){
            
            return "¡Error al actualizar, NO se ingresaron datos en ninguna de las casillas.";
        }
        
        return "Datos actualizados correctamente :)";
    }
    
    public String deletPerformanceEmployee(String document,int index){
        Employee emp = searchEmployee(document);
        
        try{
            emp.getPerformance().remove(index);  
        }catch(Exception e){
            System.out.println("ERROR "+e);
            return "Hubo un error al eliminar la evaluacion :(";
        }
        return "Evaluacion eliminada correctamente :)";
               
    }
    
}
