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
public class Cine {
    private String direccion;
    private String fechaInauguracion;
    private String nombre;
    private float precioEntrada;
    
    public Cine (String direccion, String fechaInauguracion, String nombre, float precioEntrada){
        this.direccion = direccion;
        this.fechaInauguracion = fechaInauguracion;
        this.nombre = nombre;
        this.precioEntrada = precioEntrada;
    }    
    
      public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public String getDireccion(){
        return this.direccion;
    }
      public void setFechaInauguracion(String fechaInauguracion){
        this.fechaInauguracion = fechaInauguracion;
    }
    public String getFechaInauguracion(){
        return this.fechaInauguracion;
    }
      public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
      public void setPrecioEntrada(float precioEntrada){
        this.precioEntrada = precioEntrada;
    }
    public float getPrecioEntrada(){
        return this.precioEntrada;
    }
}
