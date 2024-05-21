package proyecto_bbdd;
public class Menu_Usuario extends javax.swing.JFrame {

    public Menu_Usuario() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G_Fede = new javax.swing.ButtonGroup();
        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        P_Inicio = new javax.swing.JPanel();
        L_Nombre = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        L_Apodo = new javax.swing.JLabel();
        Apodo = new javax.swing.JTextField();
        L_Apellidos = new javax.swing.JLabel();
        Apellidos = new javax.swing.JTextField();
        L_Ano_nac = new javax.swing.JLabel();
        Ano_nac = new javax.swing.JTextField();
        L_N_jugador = new javax.swing.JLabel();
        N_jugador = new javax.swing.JTextField();
        R_Federado = new javax.swing.JRadioButton();
        R_Escuela = new javax.swing.JRadioButton();
        Cancelar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(660, 340));

        P_Titulo.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Menu de Usuario");

        javax.swing.GroupLayout P_TituloLayout = new javax.swing.GroupLayout(P_Titulo);
        P_Titulo.setLayout(P_TituloLayout);
        P_TituloLayout.setHorizontalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        P_TituloLayout.setVerticalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        P_Inicio.setBackground(new java.awt.Color(255, 51, 51));

        L_Nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Nombre.setText("Nombre:");

        Nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });

        L_Apodo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Apodo.setText("Apodo:");

        Apodo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Apodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApodoActionPerformed(evt);
            }
        });

        L_Apellidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Apellidos.setText("Apellidos:");

        Apellidos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Apellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosActionPerformed(evt);
            }
        });

        L_Ano_nac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Ano_nac.setText("Año nac:");

        Ano_nac.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ano_nac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ano_nacActionPerformed(evt);
            }
        });

        L_N_jugador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_N_jugador.setText("Nº jugador:");

        N_jugador.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        N_jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_jugadorActionPerformed(evt);
            }
        });

        G_Fede.add(R_Federado);
        R_Federado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        R_Federado.setText("Federado");
        R_Federado.setOpaque(false);

        G_Fede.add(R_Escuela);
        R_Escuela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        R_Escuela.setText("Escuela   ");
        R_Escuela.setOpaque(false);

        Cancelar.setText("Cancelar");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_InicioLayout = new javax.swing.GroupLayout(P_Inicio);
        P_Inicio.setLayout(P_InicioLayout);
        P_InicioLayout.setHorizontalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L_Nombre)
                    .addComponent(L_Apellidos)
                    .addComponent(L_Ano_nac))
                .addGap(13, 13, 13)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Apellidos)
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(P_InicioLayout.createSequentialGroup()
                                .addComponent(Ano_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(L_N_jugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(N_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_Federado)
                                    .addComponent(R_Escuela)))
                            .addGroup(P_InicioLayout.createSequentialGroup()
                                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(L_Apodo)
                                .addGap(125, 125, 125)))
                        .addGap(0, 78, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Apodo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(P_InicioLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Guardar)
                .addGap(12, 12, 12))
        );
        P_InicioLayout.setVerticalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Nombre)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L_Apodo)
                        .addComponent(Apodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Apellidos)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L_Ano_nac)
                            .addComponent(Ano_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(L_N_jugador)
                            .addComponent(N_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Cancelar)
                            .addComponent(Guardar))
                        .addContainerGap())
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(R_Federado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R_Escuela)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(P_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(P_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(P_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Ano_nacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ano_nacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ano_nacActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void ApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosActionPerformed

    private void N_jugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_jugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_jugadorActionPerformed

    private void ApodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApodoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_GuardarActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu_Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu_Usuario().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano_nac;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Apodo;
    private javax.swing.JButton Cancelar;
    private javax.swing.ButtonGroup G_Fede;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel L_Ano_nac;
    private javax.swing.JLabel L_Apellidos;
    private javax.swing.JLabel L_Apodo;
    private javax.swing.JLabel L_N_jugador;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JTextField N_jugador;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel P_Inicio;
    private javax.swing.JPanel P_Titulo;
    private javax.swing.JRadioButton R_Escuela;
    private javax.swing.JRadioButton R_Federado;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
