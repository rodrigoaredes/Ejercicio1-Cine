/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Rodrigo
 */
public class Programacion {
    private String fechaFin;
    private String horaCreada;
    private String fechaInicio;
    
    public Programacion (String fechaFin, String horaCreada, String fechaInicio){
        this.fechaFin = fechaFin;
        this.horaCreada = horaCreada;
        this.fechaInicio = fechaInicio;
    }
    
      public void setFechaFin(String fechaFin){
        this.fechaFin = fechaFin;
    }
    public String getFechaFin(){
        return fechaFin;
    }
      public void setHoraCreada(String horaCreada){
        this.horaCreada = horaCreada;
    }
    public String getHoraCreada(){
        return horaCreada;
    }
     public void setFechaInicio(String fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public String getFechaInicio(){
        return fechaInicio;
    }    
}