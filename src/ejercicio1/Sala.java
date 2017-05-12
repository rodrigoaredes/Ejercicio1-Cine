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
public class Sala {
    private int capacidad;
    private int numero;
    
    public Sala () {
    
}
    public Sala (int capacidad, int numero){
        this.capacidad = capacidad;
        this.numero = numero;
    }
      public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    public int getCapacidad(){
        return this.capacidad;
    }
      public void setnumero(int numero){
        this.numero = numero;
    }
    public int getNumero(){
        return this.numero;
    }
}
