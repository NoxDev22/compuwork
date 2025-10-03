/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;

/**
 *
 * @author Jose Felipe
 */
public class ControllerEmployees {
    
    private Employees emp;
    private ModelEmployees modelEmp;
    private ViewAddEmployee addEmp;
    private ViewUpdateEmployee updateEmp;
    
    private String document = "";
  
    public ControllerEmployees(Employees emp, ModelEmployees modelEmp,
            ViewAddEmployee addEmp, ViewUpdateEmployee updateEmp){
        this.emp = emp;
        this.modelEmp = modelEmp;
        this.addEmp = addEmp;
        this.updateEmp = updateEmp;
    }
    
    public String getDocument(){
        return this.document;
    }
    
    public void searchEmployee(){
        String document = this.emp.getDocument();
        
        if(!document.trim().isEmpty()){
                Employee emp = modelEmp.searchEmployee(document);
            
            if(emp == null){
                this.emp.showMessage("¡Error usuario NO encontrado!");
            }else {
                this.emp.setEmployeeToCard(emp);
                this.document = emp.getDocument();
                this.emp.showMessage("Consulta exitosa :)");
            }
        }else{
            this.emp.showMessage("¡Error NO se ingreso ningun numero de cedula!");
        }
              
    }
    
    public void createEmployee(String document,String name,String lastName, 
            String post,String phone,String date,String salary,String temporary){
        
        String res = this.modelEmp.createEmployee(document, name, lastName, post, phone, date, salary, temporary);
        this.emp.showEmployeesToTable();
        this.addEmp.resetFields();
        this.addEmp.showMessage(res);
    }
    
     public void updateEmployee(String newDocument,String name,String lastName, 
            String post,String phone,String date,String salary,String temporary){
        
        try{
      
            String res = this.modelEmp.updateEmployee(this.document,newDocument,name,lastName,post,
                    phone,date,salary,temporary);
        
            this.emp.showEmployeesToTable();
            this.emp.resetToCard();
            this.emp.resetFieldSearch();
            this.updateEmp.resetFields();
            this.updateEmp.showMessage(res);
            
        }catch(Exception e){
            
            System.out.println("Hubo un error en la actualizacion del usuario");
        }

        
      
    }
     
    public void removeEmployee(){
        
        if(this.document != ""){
            Employee emp = modelEmp.searchEmployee(this.document);
        
            String confirm = this.emp.confirmRemove(emp.getName());
        
            if(confirm == "Si"){
                String response =  modelEmp.removeEmployee(this.document);
                this.emp.showEmployeesToTable();
                this.emp.resetFieldSearch();
                this.emp.resetToCard();
                this.emp.showMessage(response);
            } 
            
        }else{
            this.emp.showMessage("¡Error no se ha realizado ninguna busqueda!");
        }
        
      
    }
    
    public Employee viewPerformance(){  
        return modelEmp.searchEmployee(this.document);
    }
}
