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
    public Animales[] animal;
    public String habitat;
    public int capacidad;

    public Habitats(String habitat, int capacidad) {
        this.animal=new Animales[capacidad];
        this.habitat = habitat;
        this.capacidad = capacidad;
    }

    public Habitats() {
    }
    
    public String getHabitat() {
        return habitat;
    }
    
     public Animales[] getAnimal() {
        return animal;
    }
    
    public void setAnimal(Animales[] animal) {
        this.animal = animal;
    }
    
    public int getCapacidad() {
        return capacidad;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }


    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void addAnimal(Animales agregarAnimal) {
        for (int i=0; i<this.animal.length;i++){
            if (this.animal[i]==null){
                this.animal[i]=agregarAnimal;
            }
        }
    }
   
}
