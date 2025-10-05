/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package performance;

/**
 *
 * @author Jose Felipe
 */
public class PerfEmployee extends Performance{

    public String skills;
    public String knowingPosition;
    public String personalRelationships;
    public String comunication;
    
    public PerfEmployee(String fullfilled, String result, String quality, String growth,
                       String skills, String knoPosition,String relatioships, String comunication,String date) {
        super(fullfilled, result, quality, growth,date); 
        this.skills = skills;
        this.knowingPosition = knoPosition;
        this.personalRelationships = relatioships;
        this.comunication = comunication;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getKnowingPosition() {
        return knowingPosition;
    }

    public void setKnowingPosition(String knowingPosition) {
        this.knowingPosition = knowingPosition;
    }

    public String getPersonalRelationships() {
        return personalRelationships;
    }

    public void setPersonalRelationships(String personalRelationships) {
        this.personalRelationships = personalRelationships;
    }

    public String getComunication() {
        return comunication;
    }

    public void setComunication(String comunication) {
        this.comunication = comunication;
    }

    
      
}
