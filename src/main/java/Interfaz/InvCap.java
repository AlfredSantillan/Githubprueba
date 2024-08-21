package Interfaz;

import Logica.Capacitores;
import Logica.Controladora;
import Meto2.Meto2;
import java.util.List;

import javax.swing.table.DefaultTableModel;

public class InvCap extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Meto2 m2 = new Meto2();

    public InvCap() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCap = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnCargar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BoxBuscar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        EditarRes3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        TablaCap.setBackground(new java.awt.Color(255, 255, 255));
        TablaCap.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        TablaCap.setForeground(new java.awt.Color(0, 0, 0));
        TablaCap.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCap);

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Capacitores");

        BtnEditar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEditar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Editar.png"))); // NOI18N
        BtnEditar.setText("Editar fila");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Eliminar.png"))); // NOI18N
        BtnEliminar.setText("Eliminar fila");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnCargar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCargar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnCargar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cargar.png"))); // NOI18N
        BtnCargar.setText("Cargar componente");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar por:");

        BoxBuscar.setBackground(new java.awt.Color(153, 0, 0));
        BoxBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BoxBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATRICULA", "ID", "CARACTERISTICAS", "VOLTAJE" }));
        BoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBuscarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));

        BtnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        BtnBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Buscar.png"))); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        EditarRes3.setBackground(new java.awt.Color(153, 0, 0));
        EditarRes3.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        EditarRes3.setForeground(new java.awt.Color(255, 255, 255));
        EditarRes3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha regreso.png"))); // NOI18N
        EditarRes3.setText("Regresar");
        EditarRes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarRes3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditarRes3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BoxBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(BtnEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminar)
                .addGap(18, 18, 18)
                .addComponent(BtnCargar)
                .addGap(93, 93, 93)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(EditarRes3)
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        if (TablaCap.getRowCount() > 0) {
            if (TablaCap.getSelectedRow() != -1) {
                int id = (int) TablaCap.getValueAt(TablaCap.getSelectedRow(), 0);
                control.borrarCap(id);
                m2.mostrarMensaje("Capacitor borrado correctamente", "Borrado exitoso", "Info");
                cargarCap();

            } else {
                m2.mostrarMensaje("No se seleccionó capacitor para borrar", "Borrado fallido", "Falla");
                cargarCap();
            }

        } else {
            m2.mostrarMensaje("No hay nada que eliminar en la tabla", "Borrado fallido", "Nada");
            cargarCap();
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TablaCap.getRowCount() > 0) {
            if (TablaCap.getSelectedRow() != -1) {
                int id = (int) TablaCap.getValueAt(TablaCap.getSelectedRow(), 0);
                ModificacionesCap mcap = new ModificacionesCap(id);
                mcap.setVisible(true);
                mcap.setLocationRelativeTo(null);
                dispose();
    }//GEN-LAST:event_BtnEditarActionPerformed
            else {
                m2.mostrarMensaje("No se selecciono capacitor para editar", "Editado Fallido", "Falla");
            }
        } else {
            m2.mostrarMensaje("No hay nada que editar en la tabla", "Editado Fallido", "Nada");
        }
    }
    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        DefaultTableModel tablaCapModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"ID", "GABETA", "CAJA", "MATRICULA", "CARACTERISTICAS", "CANTIDAD", "VOLTAJE"};
        tablaCapModel.setColumnIdentifiers(titulos);

        List<Capacitores> listacap = control.traerCap();

        if (listacap != null) {
            for (Capacitores cap : listacap) {
                if (BoxBuscar.getSelectedIndex() == 0) {
                    String xd = txtBuscar.getText();
                    String id = cap.getMatricula_Cap();
                    boolean resul = id.contains(xd);

                    if (resul == true) {
                        Object[] objeto = {cap.getId(), cap.getGabeta_Cap(), cap.getCaja_Cap(), cap.getMatricula_Cap(), cap.getCaracteristica_Cap(), cap.getCantidad_Cap(),
                            cap.getVoltaje_Cap()};

                        tablaCapModel.addRow(objeto);
                    }

                }
                if (BoxBuscar.getSelectedIndex() == 1) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(cap.getId());
                    boolean resul = id.contains(xd);

                    if (resul == true) {
                        Object[] objeto = {cap.getId(), cap.getGabeta_Cap(), cap.getCaja_Cap(), cap.getMatricula_Cap(), cap.getCaracteristica_Cap(), cap.getCantidad_Cap(),
                            cap.getVoltaje_Cap()};

                        tablaCapModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 2) {
                    String xd = txtBuscar.getText();
                    String id = cap.getCaracteristica_Cap();
                    boolean resul = id.contains(xd);

                    if (resul == true) {
                        Object[] objeto = {cap.getId(), cap.getGabeta_Cap(), cap.getCaja_Cap(), cap.getMatricula_Cap(), cap.getCaracteristica_Cap(), cap.getCantidad_Cap(),
                            cap.getVoltaje_Cap()};

                        tablaCapModel.addRow(objeto);

                    }
                }
                if (BoxBuscar.getSelectedIndex() == 3) {
                    String xd = txtBuscar.getText();
                    String id = cap.getVoltaje_Cap();
                    boolean resul = id.contains(xd);

                    if (resul == true) {
                        Object[] objeto = {cap.getId(), cap.getGabeta_Cap(), cap.getCaja_Cap(), cap.getMatricula_Cap(), cap.getCaracteristica_Cap(), cap.getCantidad_Cap(),
                            cap.getVoltaje_Cap()};

                        tablaCapModel.addRow(objeto);

                    }
                }
            }

        }
                                TablaCap.setModel(tablaCapModel);
                                tamañoColu();


    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void EditarRes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarRes3ActionPerformed
        Inventarios inv = new Inventarios();
        inv.setVisible(true);
        inv.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_EditarRes3ActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        Capacitor cap = new Capacitor();
        cap.setVisible(true);
        cap.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargarCap();
    }//GEN-LAST:event_formWindowOpened

    private void BoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBuscar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton EditarRes3;
    private javax.swing.JTable TablaCap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarCap() {

        DefaultTableModel tablaCapModelo = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulo[] = {"ID", "GABETA", "CAJA", "MATRICULA", "CARACTERISTICAS", "CANTIDAD", "VOLTAJE"};
        tablaCapModelo.setColumnIdentifiers(titulo);

        List<Capacitores> listaCap = control.traerCap();

        if (listaCap != null) {
            for (Capacitores cap : listaCap) {
                Object[] objeto = {cap.getId(), cap.getGabeta_Cap(), cap.getCaja_Cap(), cap.getMatricula_Cap(), cap.getCaracteristica_Cap(), cap.getCantidad_Cap(),
                    cap.getVoltaje_Cap()};
                tablaCapModelo.addRow(objeto);

            }

        }

        TablaCap.setModel(tablaCapModelo);
        tamañoColu();

    }


    private void tamañoColu() {
        TablaCap.getColumnModel().getColumn(0).setPreferredWidth(20);
        TablaCap.getColumnModel().getColumn(1).setPreferredWidth(20);
        TablaCap.getColumnModel().getColumn(2).setPreferredWidth(20);
        TablaCap.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaCap.getColumnModel().getColumn(4).setPreferredWidth(150);
        TablaCap.getColumnModel().getColumn(5).setPreferredWidth(20);
        TablaCap.getColumnModel().getColumn(6).setPreferredWidth(20);
    }
}
