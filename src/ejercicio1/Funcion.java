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
public class Funcion {
    private String diaSemana;
    private int duracion;
    private Date horaInicio;
    private int numero;
    
    private Pelicula pelicula;
    private Sala sala;
    private Entrada entrada;
    
    public Funcion(){
        
    }
    
    public Funcion(String diaSemana, int duracion, Date horaInicio, int numero, Pelicula pelicula, Sala sala, Entrada entrada){
       this.diaSemana = diaSemana;
       this.duracion = duracion;
       this.horaInicio = horaInicio;
       this.numero = numero;
       this.pelicula = pelicula;
       this.sala = sala;
       this.entrada = entrada;
    }
    
    public void setDiaSemana(String diaSemana){
        this.diaSemana = diaSemana;
    }
    public String getDiaSemana(){
        return this.diaSemana;
    }
    public void setDuracion(int duracion){
        this.duracion = duracion;
    }
    public int getDuracion(){
        return this.duracion;
    }
     public void setHoraInicio(Date horaInicio){
        this.horaInicio = horaInicio;
    }
    public Date getHoraInicio(){
        return this.horaInicio;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setPelicula(Pelicula pelicula){
        this.pelicula = pelicula;
    }
    public Pelicula getPelicula(){
        return this.pelicula;
    }
     public void setSala(Sala sala){
        this.sala = sala;
    }
    public Sala getSala(){
        return this.sala;
    }
     public void setEntrada(Entrada entrada){
        this.entrada = entrada;
    }
}
