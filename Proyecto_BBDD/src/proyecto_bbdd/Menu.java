package proyecto_bbdd;
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        P_Menu = new javax.swing.JPanel();
        M_Tienda = new javax.swing.JButton();
        M_Inscripcion = new javax.swing.JButton();
        M_Reserva = new javax.swing.JButton();
        M_Tienda1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setLocation(new java.awt.Point(660, 340));

        P_Titulo.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("BIENVENIDO AL CVA");

        javax.swing.GroupLayout P_TituloLayout = new javax.swing.GroupLayout(P_Titulo);
        P_Titulo.setLayout(P_TituloLayout);
        P_TituloLayout.setHorizontalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        P_TituloLayout.setVerticalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_Menu.setBackground(new java.awt.Color(255, 51, 51));

        M_Tienda.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        M_Tienda.setText("Tienda");
        M_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_TiendaActionPerformed(evt);
            }
        });

        M_Inscripcion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        M_Inscripcion.setText("Inscripciones");
        M_Inscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_InscripcionActionPerformed(evt);
            }
        });

        M_Reserva.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        M_Reserva.setText("Reserva");
        M_Reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_ReservaActionPerformed(evt);
            }
        });

        M_Tienda1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        M_Tienda1.setText("Cerrar sesion");
        M_Tienda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_Tienda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_MenuLayout = new javax.swing.GroupLayout(P_Menu);
        P_Menu.setLayout(P_MenuLayout);
        P_MenuLayout.setHorizontalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addComponent(M_Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(M_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addComponent(M_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(M_Tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        P_MenuLayout.setVerticalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_Inscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_Reserva, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M_Tienda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(M_Tienda1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(P_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(P_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void M_InscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_InscripcionActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Menu_Inscripcion().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_M_InscripcionActionPerformed

    private void M_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_TiendaActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Tienda().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_M_TiendaActionPerformed

    private void M_ReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_ReservaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_M_ReservaActionPerformed

    private void M_Tienda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_Tienda1ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_M_Tienda1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton M_Inscripcion;
    private javax.swing.JButton M_Reserva;
    private javax.swing.JButton M_Tienda;
    private javax.swing.JButton M_Tienda1;
    private javax.swing.JPanel P_Menu;
    private javax.swing.JPanel P_Titulo;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
