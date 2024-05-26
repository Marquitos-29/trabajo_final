package proyecto_bbdd;
public class Tienda extends javax.swing.JFrame {

    public Tienda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton6 = new javax.swing.JButton();
        Titulo = new javax.swing.JPanel();
        Menu = new javax.swing.JButton();
        L_titulo = new javax.swing.JLabel();
        Carrito = new javax.swing.JButton();
        Custom = new javax.swing.JPanel();
        Seleccion = new javax.swing.JPanel();
        Camiseta = new javax.swing.JButton();
        Pantalon = new javax.swing.JButton();
        Zapatillas = new javax.swing.JButton();
        Rodilleras = new javax.swing.JButton();
        Balon = new javax.swing.JButton();

        jButton6.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setBackground(new java.awt.Color(204, 204, 204));
        Titulo.setPreferredSize(new java.awt.Dimension(800, 80));

        Menu.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Menu.setText("Menú");
        Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuActionPerformed(evt);
            }
        });

        L_titulo.setFont(new java.awt.Font("Segoe UI", 1, 44)); // NOI18N
        L_titulo.setForeground(new java.awt.Color(255, 255, 255));
        L_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L_titulo.setText("TIENDA");

        Carrito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Carrito.setText("Carrito");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(L_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Custom.setBackground(new java.awt.Color(255, 51, 51));
        Custom.setMaximumSize(new java.awt.Dimension(600, 400));
        Custom.setPreferredSize(new java.awt.Dimension(600, 400));

        javax.swing.GroupLayout CustomLayout = new javax.swing.GroupLayout(Custom);
        Custom.setLayout(CustomLayout);
        CustomLayout.setHorizontalGroup(
            CustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        CustomLayout.setVerticalGroup(
            CustomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        Seleccion.setBackground(new java.awt.Color(0, 204, 204));
        Seleccion.setPreferredSize(new java.awt.Dimension(200, 400));

        Camiseta.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Camiseta.setText("Camiseta");
        Camiseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamisetaActionPerformed(evt);
            }
        });

        Pantalon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Pantalon.setText("Pantalon");
        Pantalon.setPreferredSize(new java.awt.Dimension(165, 45));
        Pantalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PantalonActionPerformed(evt);
            }
        });

        Zapatillas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Zapatillas.setText("Zapatillas");
        Zapatillas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZapatillasActionPerformed(evt);
            }
        });

        Rodilleras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Rodilleras.setText("Rodilleras");
        Rodilleras.setPreferredSize(new java.awt.Dimension(165, 45));
        Rodilleras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RodillerasActionPerformed(evt);
            }
        });

        Balon.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Balon.setText("Balon");
        Balon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SeleccionLayout = new javax.swing.GroupLayout(Seleccion);
        Seleccion.setLayout(SeleccionLayout);
        SeleccionLayout.setHorizontalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Rodilleras, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(Balon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Zapatillas, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        SeleccionLayout.setVerticalGroup(
            SeleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SeleccionLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(Camiseta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Zapatillas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Rodilleras, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Balon, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Custom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Custom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Custom.getAccessibleContext().setAccessibleName("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_MenuActionPerformed

    private void CamisetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamisetaActionPerformed
        Productos.Camiseta pn = new Productos.Camiseta();
        pn.setSize(600,400);
        pn.setLocation(0,0);
        
        Custom.removeAll();
        Custom.add(pn);
        Custom.revalidate();
        Custom.repaint();
    }//GEN-LAST:event_CamisetaActionPerformed

    private void PantalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PantalonActionPerformed
        Productos.Pantalon pn = new Productos.Pantalon();
        pn.setSize(600,400);
        pn.setLocation(0,0);
        
        Custom.removeAll();
        Custom.add(pn);
        Custom.revalidate();
        Custom.repaint();
    }//GEN-LAST:event_PantalonActionPerformed

    private void ZapatillasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZapatillasActionPerformed
        Productos.Zapatillas pn = new Productos.Zapatillas();
        pn.setSize(600,400);
        pn.setLocation(0,0);
        
        Custom.removeAll();
        Custom.add(pn);
        Custom.revalidate();
        Custom.repaint();
    }//GEN-LAST:event_ZapatillasActionPerformed

    private void RodillerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RodillerasActionPerformed
        Productos.Rodilleras pn = new Productos.Rodilleras();
        pn.setSize(600,400);
        pn.setLocation(0,0);
        
        Custom.removeAll();
        Custom.add(pn);
        Custom.revalidate();
        Custom.repaint();
    }//GEN-LAST:event_RodillerasActionPerformed

    private void BalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalonActionPerformed
        Productos.Balon pn = new Productos.Balon();
        pn.setSize(600,400);
        pn.setLocation(0,0);
        
        Custom.removeAll();
        Custom.add(pn);
        Custom.revalidate();
        Custom.repaint();
    }//GEN-LAST:event_BalonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Balon;
    private javax.swing.JButton Camiseta;
    private javax.swing.JButton Carrito;
    private javax.swing.JPanel Custom;
    private javax.swing.JLabel L_titulo;
    private javax.swing.JButton Menu;
    private javax.swing.JButton Pantalon;
    private javax.swing.JButton Rodilleras;
    private javax.swing.JPanel Seleccion;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton Zapatillas;
    private javax.swing.JButton jButton6;
    // End of variables declaration//GEN-END:variables
}
