
package Interfaz;

import InventariosMyA.InvArneses;
import InventariosMyA.InvManuales;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BotonInventario = new javax.swing.JButton();
        BotonSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BtnInventarioM = new javax.swing.JButton();
        BtnInventarioA = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Inventario Avionica");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BotonInventario.setBackground(new java.awt.Color(255, 204, 153));
        BotonInventario.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        BotonInventario.setForeground(new java.awt.Color(0, 0, 0));
        BotonInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avion.png"))); // NOI18N
        BotonInventario.setText("Ver inventario");
        BotonInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInventarioActionPerformed(evt);
            }
        });

        BotonSalir.setBackground(new java.awt.Color(255, 204, 153));
        BotonSalir.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        BotonSalir.setForeground(new java.awt.Color(0, 0, 0));
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avion.png"))); // NOI18N
        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\avionics12\\Downloads\\1630589990427.jpg")); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel2.setMinimumSize(new java.awt.Dimension(300, 300));
        jLabel2.setPreferredSize(new java.awt.Dimension(300, 300));

        BtnInventarioM.setBackground(new java.awt.Color(255, 204, 153));
        BtnInventarioM.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        BtnInventarioM.setForeground(new java.awt.Color(0, 0, 0));
        BtnInventarioM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avion.png"))); // NOI18N
        BtnInventarioM.setText("Ver inventario de manuales");
        BtnInventarioM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioMActionPerformed(evt);
            }
        });

        BtnInventarioA.setBackground(new java.awt.Color(255, 204, 153));
        BtnInventarioA.setFont(new java.awt.Font("Elephant", 0, 14)); // NOI18N
        BtnInventarioA.setForeground(new java.awt.Color(0, 0, 0));
        BtnInventarioA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Avion.png"))); // NOI18N
        BtnInventarioA.setText("Ver inventario de arneses");
        BtnInventarioA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInventarioAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInventarioM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnInventarioA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(BotonInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnInventarioM, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnInventarioA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInventarioActionPerformed

        Inventarios inventarioCI = new Inventarios();
        inventarioCI.setVisible(true);
        inventarioCI.setLocationRelativeTo(null);
        dispose();
        
    }//GEN-LAST:event_BotonInventarioActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BtnInventarioMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioMActionPerformed
     InvManuales im = new InvManuales();
     im.setVisible(true);
     im.setLocationRelativeTo(null);
     dispose();
    }//GEN-LAST:event_BtnInventarioMActionPerformed

    private void BtnInventarioAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInventarioAActionPerformed
       InvArneses ia = new InvArneses();
       ia.setVisible(true);
       ia.setLocationRelativeTo(null);
       dispose();
    }//GEN-LAST:event_BtnInventarioAActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonInventario;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BtnInventarioA;
    private javax.swing.JButton BtnInventarioM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
