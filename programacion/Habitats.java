/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.programacion;

/**
 *
 * @author WChavarria
 */
public class Habitats {
    public String animal;
    public String tipoAmbiente;
    public String capacidad;

    public Habitats(String animal, String tipoAmbiente, String capacidad) {
        this.animal = animal;
        this.tipoAmbiente = tipoAmbiente;
        this.capacidad = capacidad;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
   
}
