/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pack_Herramientas;

/**
 *
 * @author pc
 */
public class Escanerpuerto extends javax.swing.JPanel {

    /**
     * Creates new form Escanerpuerto
     */
    public Escanerpuerto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_IpTarget = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton_Limpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel_Resultado_Ping = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 24, 44));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Corbel", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ESCANER DE PUERTOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 30));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 580, 1));

        jLabel3.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Ip Host:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jTextField_IpTarget.setBackground(new java.awt.Color(30, 34, 64));
        jTextField_IpTarget.setFont(new java.awt.Font("Corbel", 1, 12)); // NOI18N
        jTextField_IpTarget.setForeground(new java.awt.Color(84, 65, 212));
        jTextField_IpTarget.setBorder(null);
        add(jTextField_IpTarget, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 500, 20));

        jButton1.setBackground(new java.awt.Color(85, 66, 214));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ESCANEO");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 130, 30));

        jButton_Limpiar.setBackground(new java.awt.Color(255, 0, 51));
        jButton_Limpiar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Limpiar.setText("Limpiar");
        jButton_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LimpiarActionPerformed(evt);
            }
        });
        add(jButton_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 100, 30));

        jPanel2.setBackground(new java.awt.Color(30, 34, 64));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Resultados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Corbel", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel_Resultado_Ping.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel_Resultado_Ping.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Puertos Encontrados:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Resultado_Ping, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 405, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Resultado_Ping, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 560, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Gurados la URL en una variacle
        String ipTarget = jTextField_IpTarget.getText(); //guardamos el valor ingresaro a la variable ipTarget

        //llamada de Clase Ping
        ClassEscaner Target = new ClassEscaner();//Instanciando la clase ClassEscancer en una varible Target
        Target.setEscaner(ipTarget); //al setEscaner le pasamos el paramentro ipTarget -> guarda la direccion ip
        
        
        //Mostramos informacion retornada por el getInfo2
        jLabel_Resultado_Ping.setText(Target.getInfo2());

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LimpiarActionPerformed

        //Limpiamos los resultados
        jLabel_Resultado_Ping.setText("");
    }//GEN-LAST:event_jButton_LimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Resultado_Ping;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField_IpTarget;
    // End of variables declaration//GEN-END:variables
}