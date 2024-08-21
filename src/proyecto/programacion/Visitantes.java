/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.programacion;


/**
 *
 * @author WChavarria
 */
public class Visitantes {
    public String nombre;
    public int edad;
    public String fechaIngreso;

    public Visitantes() {
    }
    
    public Visitantes(String nombre, int edad, String fechaIngreso) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
  
   
}
