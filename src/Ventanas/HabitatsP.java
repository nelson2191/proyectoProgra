/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.programacion.Animales;

import proyecto.programacion.Habitats;


public class HabitatsP extends javax.swing.JDialog {
        DefaultTableModel modeloHabitats=new DefaultTableModel();
        Habitats[] ArrayHabitats=new Habitats[7];
        Animales[] ArrayAnimales = new Animales[10];
    /**
     * Creates new form HabitatsP
     */
    public HabitatsP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Registro de Hábitats");
        this.setSize(570,400);
        modeloHabitats.addColumn("Habitat");
        modeloHabitats.addColumn("Capacidad"); 
        modeloHabitats.addColumn("Animal");
        HabitatsTb.setModel(modeloHabitats);
    }

    @SuppressWarnings("unchecked")
   
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        HabitatsTb = new javax.swing.JTable();
        HabitatsHabitats = new javax.swing.JLabel();
        CapacidadHabitats = new javax.swing.JLabel();
        AnimalHabitats = new javax.swing.JLabel();
        HabitatHabitatField = new javax.swing.JComboBox<>();
        CapacidadHabitatField = new javax.swing.JTextField();
        AgregarHabitatsBt = new javax.swing.JButton();
        EliminarHabitatsBt = new javax.swing.JButton();
        EditarHabitatsBt = new javax.swing.JButton();
        animalhabitats = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        HabitatsTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        HabitatsTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HabitatsTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HabitatsTb);

        HabitatsHabitats.setText("Habitat");

        CapacidadHabitats.setText("Capacidad");

        AnimalHabitats.setText("Animal");

        HabitatHabitatField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Granja", "Bosque", "Desierto", "Sabana", "Región Polar", "Río", "Oceáno", " " }));
        HabitatHabitatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HabitatHabitatFieldActionPerformed(evt);
            }
        });

        AgregarHabitatsBt.setText("Agregar");
        AgregarHabitatsBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarHabitatsBtActionPerformed(evt);
            }
        });

        EliminarHabitatsBt.setText("Eliminar");
        EliminarHabitatsBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarHabitatsBtActionPerformed(evt);
            }
        });

        EditarHabitatsBt.setText("Editar");
        EditarHabitatsBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarHabitatsBtActionPerformed(evt);
            }
        });

        animalhabitats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalhabitatsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(CapacidadHabitats)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HabitatsHabitats)
                            .addGap(18, 18, 18)))
                    .addComponent(AnimalHabitats))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CapacidadHabitatField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HabitatHabitatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(animalhabitats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarHabitatsBt)
                    .addComponent(EliminarHabitatsBt)
                    .addComponent(EditarHabitatsBt))
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AnimalHabitats)
                            .addComponent(AgregarHabitatsBt)
                            .addComponent(animalhabitats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HabitatsHabitats)
                            .addComponent(HabitatHabitatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EliminarHabitatsBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CapacidadHabitats)
                            .addComponent(CapacidadHabitatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(EditarHabitatsBt)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HabitatHabitatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HabitatHabitatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HabitatHabitatFieldActionPerformed

    private void AgregarHabitatsBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarHabitatsBtActionPerformed
        
        
        Habitats habitats=new Habitats(HabitatHabitatField.getSelectedItem().toString(),Integer.parseInt(CapacidadHabitatField.getText()));
  
        for (int x = 0; x < ArrayHabitats.length; x++) {
            if (ArrayHabitats[x] == null) {
                ArrayHabitats[x] = habitats;
                break;
            }

        }
        
        for (int i=0; i<ArrayAnimales.length;i++ ){
            if (ArrayAnimales[i]!=null){
                if (ArrayAnimales[i].getNombre().equals(animalhabitats.getSelectedItem())){
                    habitats.addAnimal(ArrayAnimales[i]);
                }
            }
        }
        
        Object objeto[] = new Object[3];
        objeto[0] = habitats.getHabitat();
        objeto[1] = habitats.getCapacidad();
        objeto[2] = habitats.getAnimal()[0].getEspecie();
        
        modeloHabitats.addRow(objeto);

        HabitatsTb.repaint();
        CapacidadHabitatField.setText("");
        
        

    }//GEN-LAST:event_AgregarHabitatsBtActionPerformed

    private void EliminarHabitatsBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarHabitatsBtActionPerformed
        int SelectedRowIndex=HabitatsTb.getSelectedRow();
        modeloHabitats.removeRow(SelectedRowIndex);
    }//GEN-LAST:event_EliminarHabitatsBtActionPerformed

    private void EditarHabitatsBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarHabitatsBtActionPerformed
        int i=HabitatsTb.getSelectedRow();
        if (i >= 0){
            modeloHabitats.setValueAt(HabitatHabitatField.getSelectedItem().toString(),i,0);
            modeloHabitats.setValueAt(CapacidadHabitatField.getText(), i, 1);
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_EditarHabitatsBtActionPerformed

    private void HabitatsTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HabitatsTbMouseClicked
        int SelectedRow=HabitatsTb.getSelectedRow();
        CapacidadHabitatField.setText(modeloHabitats.getValueAt(SelectedRow, 1).toString());
    }//GEN-LAST:event_HabitatsTbMouseClicked

    private void animalhabitatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalhabitatsActionPerformed
       
    }//GEN-LAST:event_animalhabitatsActionPerformed
    
    public void leerAnimales(Animales[] registro){
        this.ArrayAnimales=registro;
        for(int i=0;i< ArrayAnimales.length;i++ ){
            if (ArrayAnimales[i]!=null){
                animalhabitats.addItem(ArrayAnimales[i].getNombre());
            }
            
        }
        
    }
    
    
            
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
            java.util.logging.Logger.getLogger(HabitatsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HabitatsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HabitatsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HabitatsP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HabitatsP dialog = new HabitatsP(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarHabitatsBt;
    private javax.swing.JLabel AnimalHabitats;
    private javax.swing.JTextField CapacidadHabitatField;
    private javax.swing.JLabel CapacidadHabitats;
    private javax.swing.JButton EditarHabitatsBt;
    private javax.swing.JButton EliminarHabitatsBt;
    private javax.swing.JComboBox<String> HabitatHabitatField;
    private javax.swing.JLabel HabitatsHabitats;
    private javax.swing.JTable HabitatsTb;
    private javax.swing.JComboBox<String> animalhabitats;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public Habitats[] getHabitats() {
       return this.ArrayHabitats;
    }

    
}
