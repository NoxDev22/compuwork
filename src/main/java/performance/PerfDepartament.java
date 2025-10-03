/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package performance;

/**
 *
 * @author Jose Felipe
 */
public class PerfDepartament extends Performance{
    public String cantidadTrabajo;
    public String usoRecursos;
    public String objetivosClaros;
    
      public PerfDepartament(String cumplimiento, String resultado, String calidad, String crecimiento,
                       String trabajo, String recursos,String objetivos,String date) {
        super(cumplimiento, resultado, calidad, crecimiento,date); 
        this.cantidadTrabajo = trabajo;
        this.usoRecursos = recursos;
        this.objetivosClaros = objetivos;
    }
      
}
