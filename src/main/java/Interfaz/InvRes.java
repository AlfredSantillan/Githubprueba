package Interfaz;

import Logica.Controladora;
import Logica.Resistencias;
import Meto2.Meto2;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InvRes extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Meto2 m2 = new Meto2();

    public InvRes() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaRes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnCargar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        BoxBuscar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Resistencias");

        TablaRes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaRes);

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

        BoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATRICULA", "ID", "DESCRIPCION" }));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BoxBuscar, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtnCargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscar)
                .addGap(107, 107, 107)
                .addComponent(BtnRegresar)
                .addGap(52, 52, 52))
        );

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
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        if (TablaRes.getRowCount() > 0) {
            if (TablaRes.getSelectedRow() != -1) {
                int id = (int) TablaRes.getValueAt(TablaRes.getSelectedRow(), 0);
                control.borrarRes(id);

                m2.mostrarMensaje("La resistencia se borro correctamente", "Borrado exitoso", "Info");
                cargardatos();
            } else {
                m2.mostrarMensaje("No se selecciono una resistencia para borrar", "Borrado fallido", "Falla");
                cargardatos();
            }

        } else {
            m2.mostrarMensaje("No hay resistencias para eliminar", "Borrado fallido", "Nada");
            cargardatos();
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TablaRes.getRowCount() > 0) {
            if (TablaRes.getSelectedRow() != -1) {
                int id = (int) TablaRes.getValueAt(TablaRes.getSelectedRow(), 0);

                ModificacionRes mres = new ModificacionRes(id);
                mres.setVisible(true);
                mres.setLocationRelativeTo(null);

                dispose();
            } else {
                m2.mostrarMensaje("No se selecciono una resistencia para editar", "Editado Fallido", "Falla");
            }
        } else {
            m2.mostrarMensaje("No hay nada que editar en la tabla", "Editado fallido", "Nada");
        }

    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        DefaultTableModel tablaM = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        String titulo[] = {"ID", "GABETA", "CAJA", "MATRICULA", "DESCRIPCION", "CANTIDAD", "SECCION"};
        tablaM.setColumnIdentifiers(titulo);

        List<Resistencias> listaRes = control.traerRes();

        if (listaRes != null) {
            for (Resistencias res : listaRes) {
                if (BoxBuscar.getSelectedIndex() == 0) {
                    String xd = txtBuscar.getText();
                    String id = res.getMatricula();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objetoR = {res.getId(), res.getGabeta_Res(), res.getCaja_Res(), res.getMatricula(), res.getDescripcion_Res(),
                            res.getCantidad_Res(), res.getSeccion_Res()};
                        tablaM.addRow(objetoR);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 2) {
                    String xd = txtBuscar.getText();
                    String id = res.getDescripcion_Res();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objetoR = {res.getId(), res.getGabeta_Res(), res.getCaja_Res(), res.getMatricula(), res.getDescripcion_Res(),
                            res.getCantidad_Res(), res.getSeccion_Res()};
                        tablaM.addRow(objetoR);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 1) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(res.getId());
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objetoR = {res.getId(), res.getGabeta_Res(), res.getCaja_Res(), res.getMatricula(), res.getDescripcion_Res(),
                            res.getCantidad_Res(), res.getSeccion_Res()};
                        tablaM.addRow(objetoR);
                    }
                }

            }

        }
        TablaRes.setModel(tablaM);
        tamañoColu();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        Inventarios inv = new Inventarios();
        inv.setVisible(true);
        inv.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed
        Resistencia res = new Resistencia();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BtnCargarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        cargardatos();

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
    private javax.swing.JTable TablaRes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargardatos() {
        // Definir modelo de tabla
        DefaultTableModel tablaM = new DefaultTableModel() {

            //Definir que las filas y las columnas no sean editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        //Establecer nombre de las columnas
        String titulo[] = {"ID", "GABETA", "CAJA", "MATRICULA", "DESCRIPCION", "CANTIDAD", "SECCION"};
        tablaM.setColumnIdentifiers(titulo);

        //Cargar datos desde la base de datos
        List<Resistencias> listaRes = control.traerRes();

        //Recorrer la lista y traer cada uno de los datos
        if (listaRes != null) {
            for (Resistencias res : listaRes) {
                Object[] objetoR = {res.getId(), res.getGabeta_Res(), res.getCaja_Res(), res.getMatricula(), res.getDescripcion_Res(),
                    res.getCantidad_Res(), res.getSeccion_Res()};
                tablaM.addRow(objetoR);

            }

        }
        TablaRes.setModel(tablaM);
        tamañoColu();

    }

    private void tamañoColu() {

        TablaRes.getColumnModel().getColumn(0).setPreferredWidth(20);
        TablaRes.getColumnModel().getColumn(1).setPreferredWidth(20);
        TablaRes.getColumnModel().getColumn(2).setPreferredWidth(20);
        TablaRes.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaRes.getColumnModel().getColumn(4).setPreferredWidth(150);
        TablaRes.getColumnModel().getColumn(5).setPreferredWidth(20);
        TablaRes.getColumnModel().getColumn(6).setPreferredWidth(20);
    }
}
