/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desempeno;

/**
 *
 * @author Jose Felipe
 */
public class Desempeno {
    
    public String cumplioObjetivos;
    public String resultadoObjetivos;
    public String calidadTrabajo;
    public String potencialCrecimiento;
    
    public Desempeno(String cumplimiento, String resultado, String calidad, String crecimiento){
        
        this.cumplioObjetivos = cumplimiento;
        this.resultadoObjetivos = resultado;
        this.calidadTrabajo = calidad;
        this.potencialCrecimiento = crecimiento;
    }
    
}
