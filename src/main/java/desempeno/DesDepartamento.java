/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desempeno;

/**
 *
 * @author Jose Felipe
 */
public class DesDepartamento extends Desempeno{
    public String cantidadTrabajo;
    public String usoRecursos;
    public String objetivosClaros;
    
      public DesDepartamento(String cumplimiento, String resultado, String calidad, String crecimiento,
                       String trabajo, String recursos,String objetivos) {
        super(cumplimiento, resultado, calidad, crecimiento); 
        this.cantidadTrabajo = trabajo;
        this.usoRecursos = recursos;
        this.objetivosClaros = objetivos;
    }
      
}
