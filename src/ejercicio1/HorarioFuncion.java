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
public class HorarioFuncion {
    private String diaDeSemana;
    private int duracionIntervalo;
    private int duracionPublicidad;
    private boolean esTrasnoche;
    private String horaPrimeraFuncion;
    private String horaUltimaFuncion;
    
    public HorarioFuncion(String diaDeSemana, int duracionIntervalo, int duracionPublicidad, boolean esTrasnoche, String horaPrimeraFuncion, String horaUltimaFuncion){
        this.diaDeSemana = diaDeSemana;
        this.duracionIntervalo = duracionIntervalo;
        this.duracionPublicidad = duracionPublicidad;
        this.esTrasnoche = esTrasnoche;
        this.horaPrimeraFuncion = horaPrimeraFuncion;
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    
     public void setDiaDeSemana(String diaDeSemana){
        this.diaDeSemana = diaDeSemana;
    }
    public String getDiaDeSemana(){
        return this.diaDeSemana;
    }
       public void setDuracionIntervalo(int duracionIntervalo){
        this.duracionIntervalo = duracionIntervalo;
    }
    public int getDuracionIntervalo(){
        return this.duracionIntervalo;
    }
       public void setDuracionPublicidad(int duracionPublicidad){
        this.duracionPublicidad = duracionPublicidad;
    }
    public int getDuracionPublicidad(){
        return this.duracionPublicidad;
    }
       public void setEsTrasnoche(boolean esTrasnoche){
        this.esTrasnoche = esTrasnoche;
    }
    public boolean getEsTrasnoche(){
        return this.esTrasnoche;
    }
      public void setHoraPrimeraFuncion(String horaPrimeraFuncion){
        this.horaPrimeraFuncion = horaPrimeraFuncion;
    }
    public String getHoraPrimeraFuncion(){
        return this.horaPrimeraFuncion;
    }
      public void setHoraUltimaFuncion(String horaUltimaFuncion){
        this.horaUltimaFuncion = horaUltimaFuncion;
    }
    public String getHoraUltimaFuncion(){
        return this.horaUltimaFuncion;
    }
}
