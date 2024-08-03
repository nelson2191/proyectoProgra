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
    public String habitat;
    public String sexo;

    public Animales(String nombre, String especie, int edad, String habitat, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.habitat = habitat;
        this.sexo = sexo;
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void solicitarDatosVector(){
        Animales arrAnimales[] = new Animales[3];
        for (int x = 0; x < arrAnimales.length; x++) {
            JOptionPane.showMessageDialog(null, "Ingrese la informacion de los animales: ");
            String nombre = JOptionPane.showInputDialog("Escriba el nombre del animal");
            String especie = JOptionPane.showInputDialog("Escriba el nombre de la especie");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba la edad del animal"));
            String habitat = JOptionPane.showInputDialog("Escriba el nombre del habitat del animal");
            String sexo = JOptionPane.showInputDialog("Escriba el sexo del animal");  
            arrAnimales[x]=new Animales(nombre, especie, edad,habitat, sexo);
        
        for (int i=0; i<4;i++ ){
            JOptionPane.showMessageDialog(null, arrAnimales[i].getNombre()+" "+arrAnimales[i].getEspecie()+" "+arrAnimales[i].getEdad());
            }
        }
    
     }
    
    
}
