/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.programacion.Alimentacion;
import proyecto.programacion.Animales;



/**
 *
 * @author Daniel
 */
public class AlimentacionP extends javax.swing.JDialog {
        
        DefaultTableModel modeloAlimentacion=new DefaultTableModel();
        Alimentacion[] ArrayAlimentacion=new Alimentacion[10];
        Animales[] ArrayAnimales=new Animales[10];
    
    
    /**
     * Creates new form AlimentacionP
     */
    public AlimentacionP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Registro de Alimentación");
        this.setSize(570,400);
        
        modeloAlimentacion.addColumn("Horario");
        modeloAlimentacion.addColumn("Tipo Alimentación");
        modeloAlimentacion.addColumn("Frecuencia Alimentación"); 
        modeloAlimentacion.addColumn("Animal");
        AlimentacionTb.setModel(modeloAlimentacion);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        AlimentacionTb = new javax.swing.JTable();
        HorarioAlimentacion = new javax.swing.JLabel();
        TipoAlimentacion = new javax.swing.JLabel();
        FrecuenciaAlimentacion = new javax.swing.JLabel();
        FrecuenciaAlimentacionField = new javax.swing.JTextField();
        AgregarAlimentacionBt = new javax.swing.JButton();
        EliminarAlimentacionBt = new javax.swing.JButton();
        HorarioAlimentacionField = new javax.swing.JTextField();
        TipoAlimentacionCb = new javax.swing.JComboBox<>();
        EditarAlimentacionBt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        AnimalAlimentacion = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        AlimentacionTb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(AlimentacionTb);

        HorarioAlimentacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        HorarioAlimentacion.setText("Horario");

        TipoAlimentacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        TipoAlimentacion.setText("Tipo de Alimentación");

        FrecuenciaAlimentacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FrecuenciaAlimentacion.setText("Frecuencia de Alimentación");

        AgregarAlimentacionBt.setText("Agregar");
        AgregarAlimentacionBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAlimentacionBtActionPerformed(evt);
            }
        });

        EliminarAlimentacionBt.setText("Eliminar");
        EliminarAlimentacionBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAlimentacionBtActionPerformed(evt);
            }
        });

        HorarioAlimentacionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorarioAlimentacionFieldActionPerformed(evt);
            }
        });

        TipoAlimentacionCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Herbívoros", "Carnívoros", "Omnívoros", " " }));
        TipoAlimentacionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoAlimentacionCbActionPerformed(evt);
            }
        });

        EditarAlimentacionBt.setText("Editar");
        EditarAlimentacionBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarAlimentacionBtActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Animal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(AgregarAlimentacionBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(EliminarAlimentacionBt)
                .addGap(66, 66, 66)
                .addComponent(EditarAlimentacionBt)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FrecuenciaAlimentacion)
                    .addComponent(TipoAlimentacion)
                    .addComponent(HorarioAlimentacion)
                    .addComponent(jLabel1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AnimalAlimentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorarioAlimentacionField, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FrecuenciaAlimentacionField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TipoAlimentacionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AnimalAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HorarioAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HorarioAlimentacionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TipoAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TipoAlimentacionCb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FrecuenciaAlimentacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FrecuenciaAlimentacionField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EditarAlimentacionBt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AgregarAlimentacionBt, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EliminarAlimentacionBt, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorarioAlimentacionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorarioAlimentacionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorarioAlimentacionFieldActionPerformed

    private void AgregarAlimentacionBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAlimentacionBtActionPerformed
        
        Alimentacion alimentacion=new Alimentacion();
        alimentacion.setHorario(Integer.parseInt(HorarioAlimentacionField.getText()));
        alimentacion.setTipoAlimentacion(TipoAlimentacionCb.getSelectedItem().toString()); 
        alimentacion.setFrecuenciaAlimentacion(Integer.parseInt(FrecuenciaAlimentacionField.getText()));
        
        for (int x = 0; x < ArrayAlimentacion.length; x++) {
            if (ArrayAlimentacion[x] == null) {
                ArrayAlimentacion[x] = alimentacion;
                break;
            }
        }
        
        for (int i = 0; i < ArrayAnimales.length; i++) {
            if (ArrayAnimales[i] != null) {
                if(ArrayAnimales[i].getNombre().equals(AnimalAlimentacion.getSelectedItem())){
                    alimentacion.setAnimal(ArrayAnimales[i]);
                }
            }
        }
        
        Object objeto[] = new Object[4];
        objeto[0] = alimentacion.getHorario();
        objeto[1] = alimentacion.getTipoAlimentacion();
        objeto[2] = alimentacion.getFrecuenciaAlimentacion();
        objeto[3] = alimentacion.getAnimal().getNombre();
        modeloAlimentacion.addRow(objeto);

        AlimentacionTb.repaint();
        HorarioAlimentacionField.setText("");
        FrecuenciaAlimentacion.setText("");
       
    }//GEN-LAST:event_AgregarAlimentacionBtActionPerformed

    private void TipoAlimentacionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoAlimentacionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoAlimentacionCbActionPerformed

    private void EliminarAlimentacionBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAlimentacionBtActionPerformed
        int SelectedRowIndex=AlimentacionTb.getSelectedRow();
        modeloAlimentacion.removeRow(SelectedRowIndex);
    }//GEN-LAST:event_EliminarAlimentacionBtActionPerformed

    private void EditarAlimentacionBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarAlimentacionBtActionPerformed
        int i=AlimentacionTb.getSelectedRow();
        if (i >= 0){
            modeloAlimentacion.setValueAt(HorarioAlimentacionField.getText(), i, 0);
            modeloAlimentacion.setValueAt(TipoAlimentacionCb.getSelectedItem().toString(), i, 1);
            modeloAlimentacion.setValueAt(FrecuenciaAlimentacionField.getText(), i, 2);
           
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_EditarAlimentacionBtActionPerformed

    public void leerAnimales(Animales[] registro){
        this.ArrayAnimales=registro;
        for(int i=0; i < ArrayAnimales.length; i++ ){
            if (ArrayAnimales[i]!=null){
                AnimalAlimentacion.addItem(ArrayAnimales[i].getNombre());
                
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
            java.util.logging.Logger.getLogger(AlimentacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlimentacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlimentacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlimentacionP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AlimentacionP dialog = new AlimentacionP(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton AgregarAlimentacionBt;
    private javax.swing.JTable AlimentacionTb;
    private javax.swing.JComboBox<String> AnimalAlimentacion;
    private javax.swing.JButton EditarAlimentacionBt;
    private javax.swing.JButton EliminarAlimentacionBt;
    private javax.swing.JLabel FrecuenciaAlimentacion;
    private javax.swing.JTextField FrecuenciaAlimentacionField;
    private javax.swing.JLabel HorarioAlimentacion;
    private javax.swing.JTextField HorarioAlimentacionField;
    private javax.swing.JLabel TipoAlimentacion;
    private javax.swing.JComboBox<String> TipoAlimentacionCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
