/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Ventanas;


import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto.programacion.Eventos;


public class EventosP extends javax.swing.JDialog {
        
        DefaultTableModel modeloEventos=new DefaultTableModel();
        Eventos[] ArrayEventos=new Eventos[10];
    
    
    public EventosP(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Registro de Eventos");
        this.setSize(570,400);
        modeloEventos.addColumn("Nombre");
        modeloEventos.addColumn("Fecha");
        modeloEventos.addColumn("ID");
        modeloEventos.addColumn("Descripción");
        EventosTb.setModel(modeloEventos);
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        EventosTb = new javax.swing.JTable();
        NombreEvento = new javax.swing.JLabel();
        FechaEvento = new javax.swing.JLabel();
        IdEvento = new javax.swing.JLabel();
        DescripcionEvento = new javax.swing.JLabel();
        AgregarEventoBt = new javax.swing.JButton();
        EliminarEventoBt = new javax.swing.JButton();
        NombreEventoField = new javax.swing.JTextField();
        DescripcionEventoField = new javax.swing.JTextField();
        FechaEventoField = new javax.swing.JTextField();
        IdEventoField = new javax.swing.JTextField();
        EditarEventoBt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EventosTb.setModel(new javax.swing.table.DefaultTableModel(
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
        EventosTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EventosTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EventosTb);

        NombreEvento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        NombreEvento.setText("Nombre");

        FechaEvento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        FechaEvento.setText("Fecha");

        IdEvento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IdEvento.setText("Id");

        DescripcionEvento.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DescripcionEvento.setText("Descripcion");

        AgregarEventoBt.setText("Agregar");
        AgregarEventoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEventoBtActionPerformed(evt);
            }
        });

        EliminarEventoBt.setText("Eliminar");
        EliminarEventoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarEventoBtActionPerformed(evt);
            }
        });

        NombreEventoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreEventoFieldActionPerformed(evt);
            }
        });

        FechaEventoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FechaEventoFieldActionPerformed(evt);
            }
        });

        EditarEventoBt.setText("Editar");
        EditarEventoBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEventoBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DescripcionEvento)
                    .addComponent(IdEvento)
                    .addComponent(FechaEvento)
                    .addComponent(NombreEvento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NombreEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FechaEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DescripcionEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarEventoBt)
                    .addComponent(EliminarEventoBt)
                    .addComponent(EditarEventoBt))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NombreEvento)
                            .addComponent(NombreEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FechaEvento)
                            .addComponent(FechaEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IdEvento)
                            .addComponent(IdEventoField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescripcionEventoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DescripcionEvento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AgregarEventoBt)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarEventoBt)
                        .addGap(18, 18, 18)
                        .addComponent(EditarEventoBt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarEventoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEventoBtActionPerformed
        
        Eventos eventos=new Eventos();
        eventos.setNombre(NombreEventoField.getText());
        eventos.setFecha(FechaEventoField.getText());
        eventos.setId(IdEventoField.getText());
        eventos.setDescripcion(DescripcionEventoField.getText());
        for (int x = 0; x < ArrayEventos.length; x++) {
            if (ArrayEventos[x] == null) {
                ArrayEventos[x] = eventos;
                break;
            }

        }
        
        Object objeto[] = new Object[4];
        objeto[0] = eventos.getNombre();
        objeto[1] = eventos.getFecha();
        objeto[2] = eventos.getId();
        objeto[3] = eventos.getDescripcion();
        modeloEventos.addRow(objeto);

        EventosTb.repaint();
        NombreEventoField.setText("");
        FechaEventoField.setText("");
        IdEventoField.setText("");
        DescripcionEventoField.setText("");
    }//GEN-LAST:event_AgregarEventoBtActionPerformed

    private void NombreEventoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreEventoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreEventoFieldActionPerformed

    private void FechaEventoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FechaEventoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FechaEventoFieldActionPerformed

    private void EditarEventoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEventoBtActionPerformed
        int i=EventosTb.getSelectedRow();
        if (i >= 0){
            modeloEventos.setValueAt(NombreEventoField.getText(), i, 0);
            modeloEventos.setValueAt(FechaEventoField.getText(), i, 1);
            modeloEventos.setValueAt(IdEventoField.getText(), i, 2);
            modeloEventos.setValueAt(DescripcionEventoField.getText(), i, 3);
            
        }else{
            JOptionPane.showMessageDialog(null,"Error");
        }
      
    }//GEN-LAST:event_EditarEventoBtActionPerformed

    private void EliminarEventoBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarEventoBtActionPerformed
        int SelectedRowIndex=EventosTb.getSelectedRow();
        modeloEventos.removeRow(SelectedRowIndex);
    }//GEN-LAST:event_EliminarEventoBtActionPerformed

    private void EventosTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EventosTbMouseClicked
        int SelectedRow=EventosTb.getSelectedRow();
        NombreEventoField.setText(modeloEventos.getValueAt(SelectedRow, 0).toString());
        FechaEventoField.setText(modeloEventos.getValueAt(SelectedRow, 1).toString());
        IdEventoField.setText(modeloEventos.getValueAt(SelectedRow, 2).toString());
        DescripcionEventoField.setText(modeloEventos.getValueAt(SelectedRow, 3).toString());
    }//GEN-LAST:event_EventosTbMouseClicked

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
            java.util.logging.Logger.getLogger(EventosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventosP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EventosP dialog = new EventosP(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton AgregarEventoBt;
    private javax.swing.JLabel DescripcionEvento;
    private javax.swing.JTextField DescripcionEventoField;
    private javax.swing.JButton EditarEventoBt;
    private javax.swing.JButton EliminarEventoBt;
    private javax.swing.JTable EventosTb;
    private javax.swing.JLabel FechaEvento;
    private javax.swing.JTextField FechaEventoField;
    private javax.swing.JLabel IdEvento;
    private javax.swing.JTextField IdEventoField;
    private javax.swing.JLabel NombreEvento;
    private javax.swing.JTextField NombreEventoField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
