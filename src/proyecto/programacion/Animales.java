/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class Animales {
    public String nombre;
    public String especie;
    public int edad;
    public String sexo;
    public Alimentacion dieta;

    public Animales(String nombre, String especie, int edad, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sexo = sexo;
        this.dieta=new Alimentacion();
    }

    public Animales() {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }  
    
}
