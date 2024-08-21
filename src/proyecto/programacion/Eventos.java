/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.programacion;

import java.util.Date;

/**
 *
 * @author WChavarria
 */
public class Eventos {
    public String nombre;
    public String fecha;
    public String id;
    public String descripcion;

    public Eventos() {
    }
    
    

    public Eventos(String nombre, String fecha, String id, String descripcion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.id = id;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
