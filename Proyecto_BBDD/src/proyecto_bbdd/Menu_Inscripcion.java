package proyecto_bbdd;

import javax.swing.JOptionPane;

public class Menu_Inscripcion extends javax.swing.JFrame {

    public Menu_Inscripcion() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        P_Menu = new javax.swing.JPanel();
        Fede = new javax.swing.JButton();
        Esc = new javax.swing.JButton();
        jTextArea3 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        Info = new javax.swing.JLabel();
        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        P_Menu.setBackground(new java.awt.Color(255, 51, 51));

        Fede.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Fede.setText("Federado");
        Fede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FedeActionPerformed(evt);
            }
        });

        Esc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Esc.setText("Escuela");

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(255, 51, 51));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("En el equipo {FD} {Gen} las clases son \n{Hora 1}\n{Hora 2}\ny serian {Precio} al mes \n");
        jTextArea3.setOpaque(false);
        jTextArea3.setPreferredSize(new java.awt.Dimension(190, 50));

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(new java.awt.Color(255, 51, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("En el equipo {FD} {Gen} las clases son \n{Hora 1}\n{Hora 2}\ny serian {Precio} al mes \n");
        jTextArea4.setOpaque(false);
        jTextArea4.setPreferredSize(new java.awt.Dimension(190, 50));

        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        Info.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Info.setText(" ");

        javax.swing.GroupLayout P_MenuLayout = new javax.swing.GroupLayout(P_Menu);
        P_Menu.setLayout(P_MenuLayout);
        P_MenuLayout.setHorizontalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_MenuLayout.createSequentialGroup()
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Fede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextArea3, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextArea4, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );
        P_MenuLayout.setVerticalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fede, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextArea3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        P_Titulo.setBackground(new java.awt.Color(102, 102, 102));

        Titulo.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Inscripciones a equipos");

        javax.swing.GroupLayout P_TituloLayout = new javax.swing.GroupLayout(P_Titulo);
        P_Titulo.setLayout(P_TituloLayout);
        P_TituloLayout.setHorizontalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        P_TituloLayout.setVerticalGroup(
            P_TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_TituloLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(P_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(P_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void FedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FedeActionPerformed
        JOptionPane.showMessageDialog(null, "Muy bien ya te has inscrito en el equipo");
    }//GEN-LAST:event_FedeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    public static void Equipo(){
        
        switch(DBConexion.ComprobarE()){
            case 0 -> {
                
            }
            case 1, 2 -> {
                Info.setText("YA TIENES UN EQUIPO, SI SELECCIONAS OTRO CAMBIARAS A ESE");
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Esc;
    private javax.swing.JButton Fede;
    private static javax.swing.JLabel Info;
    private javax.swing.JPanel P_Menu;
    private javax.swing.JPanel P_Titulo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables
}
