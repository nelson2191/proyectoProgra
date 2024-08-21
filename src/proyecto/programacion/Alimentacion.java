/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.programacion;

/**
 *
 * @author WChavarria
 */
public class Alimentacion {
    public int horario;
    public String tipoAlimentacion;
    public int frecuenciaAlimentacion;
    public Animales animal;
    
    public Alimentacion(){
        this.horario=0;
        this.tipoAlimentacion="";
        this.frecuenciaAlimentacion=0;
    } 
    public Alimentacion(int horario, String tipoAlimentacion, int frecuenciaAlimentacion, String animal ) {
        
        this.horario = horario;
        this.tipoAlimentacion = tipoAlimentacion;
        this.frecuenciaAlimentacion = frecuenciaAlimentacion;
        this.animal = new Animales();
    }
   
    public void setAnimal(Animales animal) {
        this.animal = animal;
    }
    
    public Animales getAnimal() {
        return animal;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public String getTipoAlimentacion() {
        return tipoAlimentacion;
    }

    public void setTipoAlimentacion(String tipoAlimentacion) {
        this.tipoAlimentacion = tipoAlimentacion;
    }

    public int getFrecuenciaAlimentacion() {
        return frecuenciaAlimentacion;
    }

    public void setFrecuenciaAlimentacion(int frecuenciaAlimentacion) {
        this.frecuenciaAlimentacion = frecuenciaAlimentacion;
    }

    
    
}
