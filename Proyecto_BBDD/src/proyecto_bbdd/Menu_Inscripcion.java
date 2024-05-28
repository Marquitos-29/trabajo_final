package proyecto_bbdd;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Menu_Inscripcion extends javax.swing.JFrame {

    //Guardamos unos datos
    private static int IDE;
    private static int F;
    
    //INIciamos y ponemos el icono
    public Menu_Inscripcion() {
        initComponents();
        //Recogemos el ID del equipo del usuario
        IDE = DBConexion.IDE();
        //Recivimos la informacion de los equipos
        DBConexion.INFO_Equipos();
        setIconImage(new ImageIcon(getClass().getResource("../Recursos/balon.jpg")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        P_Menu = new javax.swing.JPanel();
        Fede = new javax.swing.JButton();
        Esc = new javax.swing.JButton();
        TXT1 = new javax.swing.JTextArea();
        TXT2 = new javax.swing.JTextArea();
        Volver = new javax.swing.JButton();
        Info = new javax.swing.JLabel();
        EquipoAc = new javax.swing.JLabel();
        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inscripciones");
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
        Esc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EscActionPerformed(evt);
            }
        });

        TXT1.setEditable(false);
        TXT1.setBackground(new java.awt.Color(255, 51, 51));
        TXT1.setColumns(20);
        TXT1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TXT1.setRows(5);
        TXT1.setText("En el equipo {FD} {Gen} las clases son \n{Hora 1}\n{Hora 2}\ny serian {Precio} al mes \n");
        TXT1.setOpaque(false);

        TXT2.setEditable(false);
        TXT2.setBackground(new java.awt.Color(255, 51, 51));
        TXT2.setColumns(20);
        TXT2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TXT2.setRows(5);
        TXT2.setText("En el equipo {FD} {Gen} las clases son \n{Hora 1}\n{Hora 2}\ny serian {Precio} al mes \n");
        TXT2.setOpaque(false);

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        Info.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Info.setText(" ");

        EquipoAc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EquipoAc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EquipoAc.setText(" ");

        javax.swing.GroupLayout P_MenuLayout = new javax.swing.GroupLayout(P_Menu);
        P_Menu.setLayout(P_MenuLayout);
        P_MenuLayout.setHorizontalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(EquipoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(P_MenuLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_MenuLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(Fede, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(P_MenuLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(Esc, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)))))
                .addGap(55, 55, 55))
        );
        P_MenuLayout.setVerticalGroup(
            P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EquipoAc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Esc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(P_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Volver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(P_TituloLayout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        //Si ya esta federado no permite cambiarlo
        if(F==2||F==0){
            //Se envia el id y el equipo al que se quiere cambiar y se cambia en la parte de la logicay se notifica
            DBConexion.CambioEq(1,IDE);
            JOptionPane.showMessageDialog(null, "Muy bien ya te has inscrito en el equipo");
            
            //Cambia la ventana al menu
            java.awt.EventQueue.invokeLater(() -> {
                new Menu().setVisible(true);
                dispose();
            });
            
        }else{
            JOptionPane.showMessageDialog(null, "Ya estas en este equipo");
        }
        
    }//GEN-LAST:event_FedeActionPerformed

    //Boton para volver al menu
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
            dispose();
        });
    }//GEN-LAST:event_VolverActionPerformed

    //Pasar a escuela
    private void EscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EscActionPerformed
        if(F==1||F==0){
            //Se envia el id y el equipo al que se quiere cambiar y se cambia en la parte de la logicay se notifica
            DBConexion.CambioEq(2,IDE);
            JOptionPane.showMessageDialog(null, "Muy bien ya te has inscrito en el equipo");
            
            //Se vuelve al menu
            java.awt.EventQueue.invokeLater(() -> {
                new Menu().setVisible(true);
                dispose();
            });
            
        }else{
            JOptionPane.showMessageDialog(null, "Ya estas en este equipo");
        }
    }//GEN-LAST:event_EscActionPerformed
    
    //Se cambian y modifican los textos al usuarios
    public static void TextEQ(String Cat,String Gen,int ID1,String H1_1,String H2_1,int Precio1,int ID2,String H1_2,String H2_2,int Precio2){
        
        TXT1.setText("En el equipo federado "+Cat+" "+Gen+"\n las clases son \n" +
                    "los "+ H1_1 +"\n" +
                    "los "+ H2_1 +"\n" +
                    "y serian "+Precio1+"€ al mes ");
        
        TXT2.setText("En el equipo de escuela "+Cat+" "+Gen+"\n las clases son \n" +
                    "los "+ H1_2 +"\n" +
                    "los "+ H2_2 +"\n" +
                    "y serian "+Precio2+"€ al mes ");
        
        
        if(IDE==0){
            EquipoAc.setText("");
            F=0;
        }else{
            if(IDE%4==1 || IDE%4==2){
                EquipoAc.setText("Ya estas en el "+Cat+" "+Gen+" "+" federado, si seleccionas otro cambiaras de equipo");
                F=1;
            }else{
                EquipoAc.setText("Ya estas en el "+Cat+" "+Gen+" "+" de escuela, si seleccionas otro cambiaras de equipo");
                F=2;
           
            }
        }
        
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JLabel EquipoAc;
    private javax.swing.JButton Esc;
    private javax.swing.JButton Fede;
    private static javax.swing.JLabel Info;
    private javax.swing.JPanel P_Menu;
    private javax.swing.JPanel P_Titulo;
    private static javax.swing.JTextArea TXT1;
    private static javax.swing.JTextArea TXT2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Volver;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
