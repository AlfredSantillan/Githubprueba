
package Interfaz;

public class Inventarios extends javax.swing.JFrame {

    public Inventarios() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Capacitores = new javax.swing.JButton();
        BotonCIA1A2 = new javax.swing.JButton();
        Varios = new javax.swing.JButton();
        Transistores = new javax.swing.JButton();
        Pasivos = new javax.swing.JButton();
        Diodos = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Resistencias = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setForeground(new java.awt.Color(204, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Capacitores.setBackground(new java.awt.Color(255, 204, 204));
        Capacitores.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Capacitores.setForeground(new java.awt.Color(0, 0, 0));
        Capacitores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Capacitor.png"))); // NOI18N
        Capacitores.setText("Capacitores \"C1\"");
        Capacitores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CapacitoresActionPerformed(evt);
            }
        });

        BotonCIA1A2.setBackground(new java.awt.Color(255, 204, 204));
        BotonCIA1A2.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        BotonCIA1A2.setForeground(new java.awt.Color(0, 0, 0));
        BotonCIA1A2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CI.png"))); // NOI18N
        BotonCIA1A2.setText("Circuitos Integrados \"A1, A2\"");
        BotonCIA1A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCIA1A2ActionPerformed(evt);
            }
        });

        Varios.setBackground(new java.awt.Color(255, 204, 204));
        Varios.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Varios.setForeground(new java.awt.Color(0, 0, 0));
        Varios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Varios.png"))); // NOI18N
        Varios.setText("Varios \"F1\"");
        Varios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VariosActionPerformed(evt);
            }
        });

        Transistores.setBackground(new java.awt.Color(255, 204, 204));
        Transistores.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Transistores.setForeground(new java.awt.Color(0, 0, 0));
        Transistores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Transistor.png"))); // NOI18N
        Transistores.setText("Transistores \"T1, T2\"");
        Transistores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransistoresActionPerformed(evt);
            }
        });

        Pasivos.setBackground(new java.awt.Color(255, 204, 204));
        Pasivos.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Pasivos.setForeground(new java.awt.Color(0, 0, 0));
        Pasivos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pasivos.png"))); // NOI18N
        Pasivos.setText("Pasivos \"G1\"");
        Pasivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasivosActionPerformed(evt);
            }
        });

        Diodos.setBackground(new java.awt.Color(255, 204, 204));
        Diodos.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Diodos.setForeground(new java.awt.Color(0, 0, 0));
        Diodos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Diodo.png"))); // NOI18N
        Diodos.setText("Diodos \"D1\"");
        Diodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiodosActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 204, 204));
        Regresar.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Regresar.setForeground(new java.awt.Color(0, 0, 0));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flecha regreso.png"))); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Resistencias.setBackground(new java.awt.Color(255, 204, 204));
        Resistencias.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        Resistencias.setForeground(new java.awt.Color(0, 0, 0));
        Resistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resistencia.png"))); // NOI18N
        Resistencias.setText("Resistencias \"B1\"");
        Resistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResistenciasActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventarios");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BotonCIA1A2)
                        .addGap(122, 122, 122)
                        .addComponent(Pasivos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Resistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Capacitores, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Diodos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(Transistores))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(162, 162, 162)
                                        .addComponent(Varios, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCIA1A2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pasivos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Resistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Varios, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Capacitores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Transistores, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Diodos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
       
        Principal prin = new Principal();
        prin.setVisible(true);
        prin.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_RegresarActionPerformed

    private void BotonCIA1A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCIA1A2ActionPerformed
        InvCI ci = new InvCI();
        ci.setVisible(true);
        ci.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_BotonCIA1A2ActionPerformed

    private void DiodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiodosActionPerformed

        InvDiodos diodo = new InvDiodos();
        diodo.setVisible(true);
        diodo.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_DiodosActionPerformed

    private void CapacitoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CapacitoresActionPerformed
        InvCap cap = new InvCap();
        cap.setVisible(true);
        cap.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_CapacitoresActionPerformed

    private void ResistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResistenciasActionPerformed
        InvRes res = new InvRes();
        res.setVisible(true);
        res.setLocationRelativeTo(null);
        dispose();
    }//GEN-LAST:event_ResistenciasActionPerformed

    private void VariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VariosActionPerformed
        
        InvVarios vario = new InvVarios();
        vario.setVisible(true);
        vario.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_VariosActionPerformed

    private void TransistoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransistoresActionPerformed
     
        InvTransistores trans = new InvTransistores();
        trans.setVisible(true);
        trans.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_TransistoresActionPerformed

    private void PasivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasivosActionPerformed
      
        InvPasivos pasivo = new InvPasivos();
        pasivo.setVisible(true);
        pasivo.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_PasivosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCIA1A2;
    private javax.swing.JButton Capacitores;
    private javax.swing.JButton Diodos;
    private javax.swing.JButton Pasivos;
    private javax.swing.JButton Regresar;
    private javax.swing.JButton Resistencias;
    private javax.swing.JButton Transistores;
    private javax.swing.JButton Varios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
