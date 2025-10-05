/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package performance;
import employees.Employee;
/**
 *
 * @author Jose Felipe
 */
public class ControllerPerformance {
    
    private ViewPerformance viewPerf;
    private ModelPerformance modelPerf;
    private AddPerformanceEmployee addPerformance;
    private DeletePerformanceEmployee deletPerformance;
    
    private String document = "";
    
    public ControllerPerformance(ViewPerformance vPerf,ModelPerformance model,
            AddPerformanceEmployee addPerf, DeletePerformanceEmployee deletPerf){
        this.viewPerf = vPerf;
        this.modelPerf = model;
        this.addPerformance = addPerf;
        this.deletPerformance = deletPerf;
    }
    
    public String getDocument(){
        return this.document;
    }
    
    public void searchEmployee(){
        String document = this.viewPerf.getDocument();
        
        if(!document.trim().isEmpty()){
                Employee emp = modelPerf.searchEmployee(document);
            
            if(emp == null){
                this.viewPerf.showMessage("¡Error usuario NO encontrado!");
            }else {
                this.viewPerf.setEmployeeToCard(emp);
                this.document = emp.getDocument();
                this.viewPerf.showMessage("Consulta exitosa :)");
            }
        }else{
            this.viewPerf.showMessage("¡Error NO se ingreso ningun numero de documento!");
        }
              
    }
     
    public void addPerformanceEmployee(String fullfilled, String result, String quality, String growth,
                    String skills, String knoPosition,String relatioships, String comunication,String date){
        String res = this.modelPerf.addPerformanceEmp(this.document, fullfilled, result, quality, growth, skills, knoPosition, relatioships, comunication, date);
        
        this.addPerformance.resetData();
        this.addPerformance.showMessage(res);
    }
    
    public void deletePerformanceEmployee(int index){
       String res = this.modelPerf.deletPerformanceEmployee(this.document, index);
       this.deletPerformance.resetField();
       this.deletPerformance.showMessage(res);
    }
    
    public Employee viewPerformance(){  
        return modelPerf.searchEmployee(this.document);
    }
    
    
    
}
