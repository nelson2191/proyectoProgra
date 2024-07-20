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

    public Alimentacion(int horario, String tipoAlimentacion, int frecuenciaAlimentacion) {
        this.horario = horario;
        this.tipoAlimentacion = tipoAlimentacion;
        this.frecuenciaAlimentacion = frecuenciaAlimentacion;
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
