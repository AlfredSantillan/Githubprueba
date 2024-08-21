package Interfaz;

import Logica.Controladora;
import Logica.Transistores;
import Meto2.Meto2;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InvTransistores extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Meto2 m2 = new Meto2();
    

    public InvTransistores() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTrans = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnCargar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        BoxBuscar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TablaTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaTrans);

        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar fila");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editar.png"))); // NOI18N
        BtnEditar.setText("Editar fila");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha regreso.png"))); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cargar.png"))); // NOI18N
        BtnCargar.setText("Cargar componente");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        BoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATRICULA", "ID", "CARACTERISTICAS" }));
        BoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtBuscar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(BoxBuscar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(BtnEditar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(BtnCargar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscar)
                .addGap(87, 87, 87)
                .addComponent(BtnRegresar)
                .addGap(52, 52, 52))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Transistores");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 623, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        if (TablaTrans.getRowCount() > 0) {
            if (TablaTrans.getSelectedRow() != -1) {
                int id = (int) TablaTrans.getValueAt(TablaTrans.getSelectedRow(), 0);
                control.borrarTrans(id);
                m2.mostrarMensaje("Transistor borrado correctamente", "Borrado exitoso", "Info");
                cargarTrans();
            } else {
                m2.mostrarMensaje("No seleccionó un transitor para borrar", "Borrado faliido", "Falla");
            }
        } else {
            m2.mostrarMensaje("No hay nada que eliminar en la tabla", "Borrado faliido", "Nada");
            cargarTrans();
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        if (TablaTrans.getRowCount() > 0) {
            if (TablaTrans.getSelectedRow() != -1) {
                int id = (int) TablaTrans.getValueAt(TablaTrans.getSelectedRow(), 0);

                ModificacionTra mtra = new ModificacionTra(id);
                mtra.setVisible(true);
                mtra.setLocationRelativeTo(null);
                dispose();
            } else {
                m2.mostrarMensaje("No se selecciono un transistor que editar", "Editado Fallido", "Falla");
            }

        } else {
            m2.mostrarMensaje("No hay nada que editar en la tabla", "Editado fallido", "Nada");
        }

    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        DefaultTableModel tablaTrans = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "GABETA", "CAJA", "MATRICULA", "CARACTERISTICAS", "CANTIDAD"};
        tablaTrans.setColumnIdentifiers(titulos);

        List<Transistores> listaTrans = control.traerTrans();

        if (listaTrans != null) {
            for (Transistores trans : listaTrans) {
                if (BoxBuscar.getSelectedIndex() == 0) {
                    String xd = txtBuscar.getText();
                    String id = trans.getMatricula_tra();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {trans.getId(), trans.getGabtea_tra(), trans.getCaja_tra(), trans.getMatricula_tra(), trans.getCaracteristicas_tra(), trans.getCantidad_tra()};
                        tablaTrans.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 2) {
                    String xd = txtBuscar.getText();
                    String id = trans.getCaracteristicas_tra();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {trans.getId(), trans.getGabtea_tra(), trans.getCaja_tra(), trans.getMatricula_tra(), trans.getCaracteristicas_tra(), trans.getCantidad_tra()};
                        tablaTrans.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 1) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(trans.getId());
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {trans.getId(), trans.getGabtea_tra(), trans.getCaja_tra(), trans.getMatricula_tra(), trans.getCaracteristicas_tra(), trans.getCantidad_tra()};
                        tablaTrans.addRow(objeto);
                    }
                }

            }

        }

        TablaTrans.setModel(tablaTrans);
        tamañoColu();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inventarios reg = new Inventarios();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed

        Transistor tra = new Transistor();
        tra.setVisible(true);
        tra.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarTrans();

    }//GEN-LAST:event_formWindowOpened

    private void BoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBuscarActionPerformed

    }//GEN-LAST:event_BoxBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBuscar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TablaTrans;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarTrans() {

        DefaultTableModel tablaTrans = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "GABETA", "CAJA", "MATRICULA", "CARACTERISTICAS", "CANTIDAD"};
        tablaTrans.setColumnIdentifiers(titulos);

        List<Transistores> listaTrans = control.traerTrans();

        if (listaTrans != null) {
            for (Transistores trans : listaTrans) {
                Object[] objeto = {trans.getId(), trans.getGabtea_tra(), trans.getCaja_tra(), trans.getMatricula_tra(), trans.getCaracteristicas_tra(), trans.getCantidad_tra()};
                tablaTrans.addRow(objeto);

            }

        }

        TablaTrans.setModel(tablaTrans);
        tamañoColu();

    }

    private void tamañoColu() {

        TablaTrans.getColumnModel().getColumn(0).setPreferredWidth(20);
        TablaTrans.getColumnModel().getColumn(1).setPreferredWidth(20);
        TablaTrans.getColumnModel().getColumn(2).setPreferredWidth(20);
        TablaTrans.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaTrans.getColumnModel().getColumn(4).setPreferredWidth(150);
        TablaTrans.getColumnModel().getColumn(5).setPreferredWidth(20);
        
    }
}
