package InventariosMyA;

import Interfaz.Principal;
import Logica.Controladora;
import Logica.Manuales;
import Meto2.Meto2;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class InvManuales extends javax.swing.JFrame {

    Controladora control = new Controladora();
    Manuales manu;
    Meto2 m2 = new Meto2();

    public InvManuales() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnCargar = new javax.swing.JButton();
        Regresar2 = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        BoxBuscar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel1.setText("Inventario Manuales");

        TablaMan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaMan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cargar.png"))); // NOI18N
        BtnCargar.setText("Cargar Manual");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        Regresar2.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\flecha regreso.png")); // NOI18N
        Regresar2.setText("Regresar");
        Regresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regresar2ActionPerformed(evt);
            }
        });

        BtnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Editar.png")); // NOI18N
        BtnEditar.setText("Editar fila");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Eliminar.png")); // NOI18N
        BtnEliminar.setText("Eliminar Fila");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Buscar.png")); // NOI18N
        BtnBuscar.setText("Buscar ");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        BoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "NUMERO DE MANUAL", "MODELO", "NUMERO DE PARTE", "NUMERO DE SERIE", "DESCRIPCION", "MARCA", " " }));
        BoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Regresar2)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnCargar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BoxBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101)
                .addComponent(Regresar2)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(223, 223, 223))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 13, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarManuales();
    }//GEN-LAST:event_formWindowOpened

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed

        Manual ma = new Manual();
        ma.setVisible(true);
        ma.setLocationRelativeTo(null);
        dispose();


    }//GEN-LAST:event_BtnCargarActionPerformed

    private void Regresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regresar2ActionPerformed

        Principal im = new Principal();
        im.setVisible(true);
        im.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_Regresar2ActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        if (TablaMan.getRowCount() > 0) {
            if (TablaMan.getSelectedRow() != -1) {

                int id = (int) TablaMan.getValueAt(TablaMan.getSelectedRow(), 0);
                ModificacionMan mm = new ModificacionMan(id);
                mm.setVisible(true);
                mm.setLocationRelativeTo(null);
                dispose();

            } else {
                m2.mostrarMensaje("No se selecciono ninguna fila", "Editar", "Falla");
            }
        } else {
            m2.mostrarMensaje("No hay filas que editar", "Editar", "Falla");
        }


    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        if (TablaMan.getRowCount() > 0) {
            if (TablaMan.getSelectedRow() > -1) {
                int id = (int) TablaMan.getValueAt(TablaMan.getSelectedRow(), 0);
                control.borrarMan(id);
                m2.mostrarMensaje("Se elimino correctamente", "Eliminar", "Info");
                cargarManuales();
            } else {
                m2.mostrarMensaje("No se selecciono una fila para eliminar", "Eliminar", "Falla");
                cargarManuales();
            }
        } else {
            m2.mostrarMensaje("No hay filas para eliminar", "Eliminar", "Nada");
            cargarManuales();
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed

        DefaultTableModel TablaManModel = new DefaultTableModel() {

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] titulos = {"ID", "NUM. MANUAL", "MODELO", "NUM. PARTE", "NUM. SERIE", "DESCRIPCION", "MARCA"};
        TablaManModel.setColumnIdentifiers(titulos);

        List<Manuales> listmanu = control.traerManu();
        if (listmanu != null) {
            for (Manuales man : listmanu) {
                if (BoxBuscar.getSelectedIndex() == 0) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(man.getId());
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }

                if (BoxBuscar.getSelectedIndex() == 1) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(man.getNumManual());
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 2) {
                    String xd = txtBuscar.getText();
                    String id = man.getModelo();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 3) {
                    String xd = txtBuscar.getText();
                    String id = man.getNumParte();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 4) {
                    String xd = txtBuscar.getText();
                    String id = man.getNumSerie();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 5) {
                    String xd = txtBuscar.getText();
                    String id = man.getDescripcion();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
                if (BoxBuscar.getSelectedIndex() == 6) {
                    String xd = txtBuscar.getText();
                    String id = man.getMarca();
                    boolean resul = id.contains(xd);
                    if (resul == true) {
                        Object[] objeto = {man.getId(), man.getNumManual(), man.getModelo(), man.getNumParte(), man.getNumSerie(),
                            man.getDescripcion(), man.getMarca()};
                        TablaManModel.addRow(objeto);
                    }
                }
            }
        }

        TablaMan.setModel(TablaManModel);
        tamañoColu();

    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void BoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBuscar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton Regresar2;
    private javax.swing.JTable TablaMan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    private void cargarManuales() {
        DefaultTableModel TablaManualModel = new DefaultTableModel() {
            public boolean isCellTable(int row, int column) {
                return false;
            }
        };
        String[] nomColum = {"ID", "NUM. MANUAL", "MODELO", "NUM. PARTE", "NUM. SERIE", "DESCRIPCION", "MARCA"};
        TablaManualModel.setColumnIdentifiers(nomColum);

        List<Manuales> listmanu = control.traerManu();

        if (listmanu != null) {
            for (Manuales manu : listmanu) {
                Object[] objeto = {manu.getId(), manu.getNumManual(), manu.getModelo(), manu.getNumParte(), manu.getNumSerie(),
                    manu.getDescripcion(), manu.getMarca()};

                TablaManualModel.addRow(objeto);
            }
        }

        TablaMan.setModel(TablaManualModel);
        tamañoColu();

    }

    private void tamañoColu() {

        TablaMan.getColumnModel().getColumn(0).setPreferredWidth(15);
        TablaMan.getColumnModel().getColumn(1).setPreferredWidth(35);
        TablaMan.getColumnModel().getColumn(2).setPreferredWidth(75);
        TablaMan.getColumnModel().getColumn(3).setPreferredWidth(75);
        TablaMan.getColumnModel().getColumn(4).setPreferredWidth(75);
        TablaMan.getColumnModel().getColumn(5).setPreferredWidth(225);
        TablaMan.getColumnModel().getColumn(6).setPreferredWidth(80);

    }
}
