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
public class Pelicula {
    private String nombrePelicula;
    private int anioEstreno;
    private boolean disponible;
    private int duracion;
    private Date FechaIngreso;
    private String TituloOriginal;
    
    private Genero genero;
    private PaisDeOrigen paisDeOrigen;
    private Calificacion calificacion;
    private Funcion funcion;
    private Personaje personaje;
    private String tituloOriginal;
    private Date fechaIngreso;
    
    public Pelicula (){
        
    }
   
    public Pelicula (int anioEstreno, boolean disponible, int duracion, Date fechaIngreso, String nombrePelicula, String tituloOriginal, Genero genero, PaisDeOrigen paisDeOrigen, Calificacion calificacion, Funcion funcion, Personaje personaje){
        this.anioEstreno = anioEstreno;
        this.disponible = disponible;
        this.duracion = duracion;
        this.FechaIngreso = fechaIngreso;
        this.nombrePelicula = nombrePelicula;
        this.TituloOriginal = tituloOriginal;
        this.genero = genero;
        this.paisDeOrigen = paisDeOrigen;
        this.calificacion = calificacion;
        this.funcion = funcion;
        this.personaje = personaje;
    }
    
    public void setNombrePelicula(String nombrePelicula){
        this.nombrePelicula = nombrePelicula;
    }
    public String getNombrePelicula(){
        return this.nombrePelicula;
    }
    public void setAnioEstreno(int anioEstreno){
        this.anioEstreno = anioEstreno;
    }
    public int getAnioEstreno(){
        return this.anioEstreno;
    }
     public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }
    public boolean getDisponible(){
        return this.disponible;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public int getDuracion(){
        return this.duracion;
    }
    public void setFechaIngreso(Date fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    public Date getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    public void setTituloOriginal(String tituloOriginal){
        this.tituloOriginal = tituloOriginal;
    }
    public String getTituloOriginal(){
        return this.tituloOriginal;
       
    }
     public void setGenero(Genero genero){
        this.genero = genero;
    }
     public Genero getGenero(){
        return this.genero;
    }
   
    public void setPaisDeOrigen (PaisDeOrigen paisDeOrigen){
        this.paisDeOrigen = paisDeOrigen;
    }
    public PaisDeOrigen getPaisDeOrigen (){
        return this.paisDeOrigen;
    }
     public void setCalificacion(Calificacion calificacion){
        this.calificacion = calificacion;
    }
    
    public Calificacion getCalificacion(){
        return this.calificacion;
    }
     public void setFuncion(Funcion funcion){
        this.funcion = funcion;
    }
    
    public Funcion getFuncion(){
        return this.funcion;
    }
   
      public void setPersonaje(Personaje personaje){
        this.personaje = personaje;
    }
    public Personaje getPersonaje(){
        return this.personaje;
    }
}