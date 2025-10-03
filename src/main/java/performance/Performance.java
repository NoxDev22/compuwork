/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package performance;

/**
 *
 * @author Jose Felipe
 */
public class Performance {
    
    public String fulfilledObjetive;
    public String resultsObjetive;
    public String qualityWork;
    public String potentialGrowth;
    private String performanceDate;
    
    public Performance(String fullFilled, String results, String quality, String growth,String date){
        
        this.fulfilledObjetive = fullFilled;
        this.resultsObjetive = results;
        this.qualityWork = quality;
        this.potentialGrowth = growth;
        this.performanceDate = date;
    }

    public String getPerformanceDate() {
        return performanceDate;
    }

    public void setPerformanceDate(String performanceDate) {
        this.performanceDate = performanceDate;
    }
    
    public String getFulfilledObjetive() {
        return fulfilledObjetive;
    }

    public void setFulfilledObjetive(String fulfilledObjetive) {
        this.fulfilledObjetive = fulfilledObjetive;
    }

    public String getResultsObjetive() {
        return resultsObjetive;
    }

    public void setResultsObjetive(String resultsObjetive) {
        this.resultsObjetive = resultsObjetive;
    }

    public String getQualityWork() {
        return qualityWork;
    }

    public void setQualityWork(String qualityWork) {
        this.qualityWork = qualityWork;
    }

    public String getPotentialGrowth() {
        return potentialGrowth;
    }

    public void setPotentialGrowth(String potentialGrowth) {
        this.potentialGrowth = potentialGrowth;
    }

    


    
}
