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
public class Personaje {
    private String nombreEnPelicula;
    
    public Personaje (){
        
    }
    
    public Personaje (String nombreEnPelicula){
        this.nombreEnPelicula = nombreEnPelicula;
    }
    
    public void setNombreEnPelicula(String nombreEnPelicula){
        this.nombreEnPelicula = nombreEnPelicula;
    }
    public String getNombreEnPelicula(){
        return this.nombreEnPelicula;
    }   
}
