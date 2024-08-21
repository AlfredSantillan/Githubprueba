package Interfaz;

import Logica.CIn;
import Logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class InvCI extends javax.swing.JFrame {

    Controladora control = null;
    CIn circuito;

    public InvCI() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCI = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnCargar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        BoxBuscar = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventario Circuitos Integrados");

        TablaCI.setBackground(new java.awt.Color(255, 255, 255));
        TablaCI.setForeground(new java.awt.Color(0, 0, 0));
        TablaCI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaCI);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BtnEliminar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEliminar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Eliminar.png")); // NOI18N
        BtnEliminar.setText("Eliminar Fila");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        BtnBuscar.setBackground(new java.awt.Color(153, 0, 0));
        BtnBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Buscar.png")); // NOI18N
        BtnBuscar.setText("Buscar ");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        BtnEditar.setBackground(new java.awt.Color(153, 0, 0));
        BtnEditar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\Editar.png")); // NOI18N
        BtnEditar.setText("Editar fila");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnRegresar.setBackground(new java.awt.Color(153, 0, 0));
        BtnRegresar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Desktop\\Programacion\\Iconos Java\\flecha regreso.png")); // NOI18N
        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnCargar.setBackground(new java.awt.Color(153, 0, 0));
        BtnCargar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BtnCargar.setForeground(new java.awt.Color(255, 255, 255));
        BtnCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Cargar.png"))); // NOI18N
        BtnCargar.setText("Cargar Componente");
        BtnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarActionPerformed(evt);
            }
        });

        txtBuscar.setBackground(new java.awt.Color(0, 0, 0));
        txtBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        txtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        BoxBuscar.setBackground(new java.awt.Color(153, 0, 0));
        BoxBuscar.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        BoxBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MATRICULA", "ID", "DESCRIPCION" }));
        BoxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BoxBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Buscar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BoxBuscar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnRegresar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCargar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCargar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BoxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Evento al abrir la ventana
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargardatos();
        
    }//GEN-LAST:event_formWindowOpened

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        //Se controla que la tabla no este vacia
        if (TablaCI.getRowCount() > 0) { //Contar la cantidad de filas que tiene la tabla

            //Se controla que se haya seleccionado una fila
            if (TablaCI.getSelectedRow() != -1) { //Seleccionar una fila diferente de -1
                int id = (int) TablaCI.getValueAt(TablaCI.getSelectedRow(), 0);
                //Traer y asignar el id, convertir el valor de int a String en la tablaCI, que esta ubicado en la columna 0 de la fila seleccionada
                control.borrarCI(id);
                //Se llama al metodo borrar 

                mostrarMensaje("Circuito integrado borrado correctamente", "Borrado exitoso", "Info");
                // Mensaje cuando se borra adecuadamente
                cargardatos();
            } else {

                mostrarMensaje("No selecciono ningun circuito integrado para borrar", "Borrado fallido", "Falla");
                //Mensaje cuando no se selecciona ninguna fila para borrar
                cargardatos();
            }
        } else {
            mostrarMensaje("No hay nada que eliminar en la tabla", "Borrado fallido", "Nada");
            //Mensaje cuando no hay filas por borrar
            cargardatos();
        }

    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        //Se controla que la tabla no este vacia
        if (TablaCI.getRowCount() > 0) { //Contar la cantidad de filas que hay y que sean mayor que 0
            //Se controla que se haya seleccionado una fila
            if (TablaCI.getSelectedRow() != -1) { //Selecionar una fila diferente de -1
                //Traer y asignar el valor de id en el valor en la TablaCI, que esta ubicado en la columna 0 en la fila seleccionada
                int id = Integer.parseInt(String.valueOf(TablaCI.getValueAt(TablaCI.getSelectedRow(), 0)));
                //Se llama el metodo editar

                ModificacionCI modi = new ModificacionCI(id);
                modi.setVisible(true);
                modi.setLocationRelativeTo(null);

                dispose();

            } else {
                mostrarMensaje("No se selecciono ningun circuito integrado para editar", "Editado fallido", "Falla");
            }
        } else {
            mostrarMensaje("No hay nada que editar en la tabla", "Editado fallido", "Nada");
        }

    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed

        Inventarios reg = new Inventarios();
        reg.setVisible(true);
        reg.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarActionPerformed

        CircuitosIntegrados ci = new CircuitosIntegrados();
        ci.setVisible(true);
        ci.setLocationRelativeTo(null);
        dispose();

    }//GEN-LAST:event_BtnCargarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        DefaultTableModel tablaCImodel = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        TablaCI.getTableHeader().setReorderingAllowed(false);

        String titulos[] = {"ID", "GABETA", "CAJA", "MATRICULA", "DESCRIPCION", "CANTIDAD", "MONTAJE"};
        tablaCImodel.setColumnIdentifiers(titulos);

        List<CIn> listaCI2 = control.traerCI();

        if (listaCI2 != null) {
            for (CIn circuito : listaCI2) {
                if (BoxBuscar.getSelectedIndex() == 0) {
                    String xd = txtBuscar.getText();
                    String id = circuito.getMatricula_CI();
                    boolean resul = id.contains(xd);

                    if (resul == true) {

                        Object[] objeto = {circuito.getId(), circuito.getGabeta_CI(), circuito.getCaja_CI(), circuito.getMatricula_CI(), circuito.getDescripcion_CI(),
                            circuito.getCantidad_CI(), circuito.getMontaje()};

                        tablaCImodel.addRow(objeto);

                    }
                } if (BoxBuscar.getSelectedIndex() == 2) {
                    String xd = txtBuscar.getText();
                    String id = circuito.getDescripcion_CI();
                    boolean resul = id.contains(xd);

                    if (resul == true) {

                        Object[] objeto = {circuito.getId(), circuito.getGabeta_CI(), circuito.getCaja_CI(), circuito.getMatricula_CI(), circuito.getDescripcion_CI(),
                            circuito.getCantidad_CI(), circuito.getMontaje()};

                        tablaCImodel.addRow(objeto);

                    }
                } if (BoxBuscar.getSelectedIndex() == 1) {
                    String xd = txtBuscar.getText();
                    String id = String.valueOf(circuito.getId());
                    boolean resul = id.contains(xd);

                    if (resul == true) {

                        Object[] objeto = {circuito.getId(), circuito.getGabeta_CI(), circuito.getCaja_CI(), circuito.getMatricula_CI(), circuito.getDescripcion_CI(),
                            circuito.getCantidad_CI(), circuito.getMontaje()};

                        tablaCImodel.addRow(objeto);

                    }
                }
            }
        }

        TablaCI.setModel(tablaCImodel);
        tamañoColu();
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void BoxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BoxBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BoxBuscarActionPerformed

    public void mostrarMensaje(String mensaje, String titulo, String tipo) {  //Metodo para mandar mensaje dependiendo la situacion que ocurra 
        if (tipo.equals("Info")) {
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);
        }
        if (tipo.equals("Falla")) {                                //Solo los que traen MESSAGE en el JOptionPane funcionan para mandar el mensaje
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }
        if (tipo.equals("Nada")) {
            JOptionPane op = new JOptionPane(mensaje);
            op.setMessageType(JOptionPane.ERROR_MESSAGE);
            JDialog dialog = op.createDialog(titulo);
            dialog.setAlwaysOnTop(true);
            dialog.setVisible(true);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BoxBuscar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCargar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TablaCI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public void cargardatos() {

        //Definir el modelo que va a tener la tabla
        DefaultTableModel tablaCImodelo = new DefaultTableModel() {

            //Que filas y columnaas no son editables
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
        TablaCI.getTableHeader().setReorderingAllowed(false);

        //establecer los nombres de las columnas
        String titulos[] = {"ID", "GABETA", "CAJA", "MATRICULA", "DESCRIPCION", "CANTIDAD", "MONTAJE"};
        tablaCImodelo.setColumnIdentifiers(titulos);

        //Cargar datos desde la base de datos
        List<CIn> listaCI = control.traerCI();

        //Recorrer la lista y traer a cada uno de los datos de la tabla
        if (listaCI != null) {
            for (CIn circuito : listaCI) {
                Object[] objeto = {circuito.getId(), circuito.getGabeta_CI(), circuito.getCaja_CI(), circuito.getMatricula_CI(), circuito.getDescripcion_CI(), circuito.getCantidad_CI(),
                    circuito.getMontaje()};

                tablaCImodelo.addRow(objeto);
            }
        }

        TablaCI.setModel(tablaCImodelo);

        tamañoColu();
        
    }

    private void tamañoColu() {
        TablaCI.getColumnModel().getColumn(0).setPreferredWidth(20);
        TablaCI.getColumnModel().getColumn(1).setPreferredWidth(20);
        TablaCI.getColumnModel().getColumn(2).setPreferredWidth(20);
        TablaCI.getColumnModel().getColumn(3).setPreferredWidth(40);
        TablaCI.getColumnModel().getColumn(4).setPreferredWidth(150);
        TablaCI.getColumnModel().getColumn(5).setPreferredWidth(20);
        TablaCI.getColumnModel().getColumn(6).setPreferredWidth(20);
    }
    
    

}
