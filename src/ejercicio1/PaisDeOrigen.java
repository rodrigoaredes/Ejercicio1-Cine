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
class PaisDeOrigen {
    private String idioma;
    private String nombre;
    
    public PaisDeOrigen (){
        
    }
    
    public PaisDeOrigen (String idioma, String nombre){
        this.idioma = idioma;
        this.nombre = nombre;
    }
    
    public void setIdioma (String idioma){
        this.idioma = idioma;
    }
    public String getIdioma (){
        return this.idioma;
    }
     public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
}
