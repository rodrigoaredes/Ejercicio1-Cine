/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class Entrada {
    private Date fechaHoraFuncion;
    private Date horaVenta;
    private float precioCobrado;
    private int ticketNro;
    private Funcion funcion;
    
    public Entrada (){
        
    }
    
    public Entrada(Date fechaHoraFuncion, Date horaVenta, float precioCobrado, int ticketNro, Funcion funcion){
        this.fechaHoraFuncion = fechaHoraFuncion;
        this.horaVenta = horaVenta;
        this.precioCobrado = precioCobrado;
        this.ticketNro = ticketNro;
        this.funcion = funcion;
    }
    public void setFechaHoraFuncion(Date fechaHoraFuncion){
        this.fechaHoraFuncion = fechaHoraFuncion;
    }
    public Date getFechaHoraFuncion(){
        return this.fechaHoraFuncion;
    }
      public void setHoraVenta(Date horaVenta){
        this.horaVenta = horaVenta;
    }
    public Date getHoraVenta(){
        return this.horaVenta;
    }
    public void setPrecioCobrado(float precioCobrado){
        this.precioCobrado = precioCobrado;
    }
    public float getPrecioCobrado(){
        return this.precioCobrado;
    }
    public void setTicketNro(int ticketNro){
        this.ticketNro = ticketNro;
    }
    public int getTicketNro(){
        return this.ticketNro;
    }
     public void setFuncion(Funcion funcion){
        this.funcion = funcion;
    }
    public Funcion getFuncion(){
        return this.funcion;
    }
}
