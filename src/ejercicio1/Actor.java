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
public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;
    
    public Actor (boolean animado, String apellido, String nombre){
        this.animado = animado;
        this.apellido = apellido;
        this.nombre = nombre;
    }
    
    public void setAnimado(boolean animado){
        this.animado = animado;
    }
    public boolean getAnimado(){
        return animado;
    }
     public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getApellido(){
        return apellido;
    }
     public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
}
