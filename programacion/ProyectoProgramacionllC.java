/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto.programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author WChavarria
 */
public class ProyectoProgramacionllC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       
        
       int opcion;
       do
       {
           opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"¿Que desea realizar? "
               + "\n 1.Registrar"
               + "\n 2.Eliminar"
               + "\n 3.Consultar"
               + "\n 4.Modificar"
               + "\n 0.Salir"));
           
           switch(opcion)
       {
           case 1:
               JOptionPane.showInputDialog(null,"Ingrese el registro:");
               solicitarDatosVector();
               break;  
           case 2:
               JOptionPane.showInputDialog(null,"Seleccione el registro que desea eliminar:");
               break;
           case 3:
               JOptionPane.showInputDialog(null,"Seleccione la opcion que desea consultar:");
               break;
            case 4:
                JOptionPane.showInputDialog(null,"Ingrese el registro que desea modificar:");
               break;
           case 0:
               JOptionPane.showMessageDialog(null, "Gracias por usar el programa.");

       }
       }while(opcion!=0);
       
    }
        
    public static void solicitarDatosVector(){
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
