/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.programacion;

import Ventanas.AlimentacionP;
import Ventanas.AnimalP;
import Ventanas.EventosP;
import Ventanas.HabitatsP;
import Ventanas.MapaP;
import Ventanas.VisitantesP;
import java.awt.Color;

/**
 *
 * @author Daniel
 */
public class Menu extends javax.swing.JFrame {
    int xMouse, yMouse;
    AnimalP a;
    EventosP e;
    HabitatsP h;
    AlimentacionP al;
    VisitantesP v;
    MapaP m;
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        a=new AnimalP(this,true);
        e=new EventosP(this,true);
        h=new HabitatsP(this,true);
        al=new AlimentacionP(this,true);
        v=new VisitantesP(this,true);
        m=new MapaP(this,true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Salir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        Animales = new javax.swing.JButton();
        Eventos = new javax.swing.JButton();
        Habitats = new javax.swing.JButton();
        Alimentacion = new javax.swing.JButton();
        Visitantes = new javax.swing.JButton();
        Mapa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(155, 190, 170));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/blanco.png"))); // NOI18N
        Logo.setPreferredSize(new java.awt.Dimension(200, 300));
        Background.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 30, 460, 220));

        Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SalirMouseExited(evt);
            }
        });

        jLabel7.setText("Salir");

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SalirLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        Background.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 80, 30));

        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 20));

        Animales.setText("Animales");
        Animales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalesActionPerformed(evt);
            }
        });
        Background.add(Animales, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        Eventos.setText("Eventos");
        Eventos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EventosActionPerformed(evt);
            }
        });
        Background.add(Eventos, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        Habitats.setText("Habitats");
        Habitats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitatsActionPerformed(evt);
            }
        });
        Background.add(Habitats, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, -1));

        Alimentacion.setText("Alimentacion");
        Alimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlimentacionActionPerformed(evt);
            }
        });
        Background.add(Alimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        Visitantes.setText("Visitantes");
        Visitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisitantesActionPerformed(evt);
            }
        });
        Background.add(Visitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        Mapa.setText("Mapa");
        Mapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaActionPerformed(evt);
            }
        });
        Background.add(Mapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SalirMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x= evt.getXOnScreen();
        int y= evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
        
    }//GEN-LAST:event_headerMouseDragged

    private void SalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseEntered
        Salir.setBackground(Color.red);
    }//GEN-LAST:event_SalirMouseEntered

    private void SalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirMouseExited
        Salir.setBackground(Color.white);
    }//GEN-LAST:event_SalirMouseExited

    private void AnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalesActionPerformed
       
       a.setVisible(true);
    }//GEN-LAST:event_AnimalesActionPerformed

    private void EventosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EventosActionPerformed
        
        e.setVisible(true);
    }//GEN-LAST:event_EventosActionPerformed

    private void HabitatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitatsActionPerformed
        h.leerAnimales(a.getAnimales());
        h.setVisible(true);
    }//GEN-LAST:event_HabitatsActionPerformed

    private void AlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlimentacionActionPerformed
        al.leerAnimales(a.getAnimales());
        al.setVisible(true);
    }//GEN-LAST:event_AlimentacionActionPerformed

    private void VisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisitantesActionPerformed
             
        v.setVisible(true);
    }//GEN-LAST:event_VisitantesActionPerformed

    private void MapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapaActionPerformed
        m.leerHabitats(h.getHabitats());
        m.imprimirMapa();
      
    }//GEN-LAST:event_MapaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alimentacion;
    private javax.swing.JButton Animales;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Eventos;
    private javax.swing.JButton Habitats;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton Mapa;
    private javax.swing.JPanel Salir;
    private javax.swing.JButton Visitantes;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
