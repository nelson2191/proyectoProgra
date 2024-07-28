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
      
       Animales Ani= new Animales();
       
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
               Ani.solicitarDatosVector();
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
        
    
}
