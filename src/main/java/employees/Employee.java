/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employees;
import performance.PerfEmployee;
import java.util.ArrayList;
/**
 *
 * @author Jose Felipe
 */
public class Employee {
    private String document;
    private String name;
    private String lastName;
    private String post;
    private String phone;
    private String entryDate;
    private String salary;
    private String temporary;
    private boolean noDepartament = true;
    private ArrayList<PerfEmployee> performance;
    
    public Employee( String document,String name, String lastName, 
        String post, String phone, String date, String salary,
        String temporary){
        
        this.performance = new ArrayList<>();
        this.document = document;
        this.name = name;
        this.lastName = lastName;
        this.post = post;
        this.phone = phone;
        this.entryDate = date;
        this.salary = salary;
        this.temporary = temporary;  
    }
    
    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public boolean isNoDepartament() {
        return noDepartament;
    }

    public void setNoDepartament(boolean noDepartament) {
        this.noDepartament = noDepartament;
    }

    public ArrayList<PerfEmployee> getPerformance() {
        return this.performance;
    }
    
    //Metodo CRUD desempeño
    public void addPerformance(PerfEmployee emp){
        this.performance.add(emp);
    }

}
