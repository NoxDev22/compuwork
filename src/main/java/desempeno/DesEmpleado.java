/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desempeno;

/**
 *
 * @author Jose Felipe
 */
public class DesEmpleado extends Desempeno{

    public String habilidades;
    public String conocimientoPuesto;
    public String relacionesPersonales;
    public String comunicacion;
    
      public DesEmpleado(String cumplimiento, String resultado, String calidad, String crecimiento,
                       String habilidades, String conoPuesto,String relaciones, String comunicacion) {
        super(cumplimiento, resultado, calidad, crecimiento); 
        this.habilidades = habilidades;
        this.conocimientoPuesto = conoPuesto;
        this.relacionesPersonales = relaciones;
        this.comunicacion = comunicacion;
    }
}
