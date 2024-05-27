package proyecto_bbdd;
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        P_Inicio = new javax.swing.JPanel();
        L_Nombre = new javax.swing.JLabel();
        L_Contra = new javax.swing.JLabel();
        INFO_Ini = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Contrasena = new javax.swing.JPasswordField();
        Iniciar = new javax.swing.JButton();
        Registrarse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(660, 340));
        setName("Login"); // NOI18N
        setResizable(false);

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

        P_Inicio.setBackground(new java.awt.Color(255, 51, 51));

        L_Nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Nombre.setText("Usuario:");

        L_Contra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Contra.setText("Contraseña:");

        INFO_Ini.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        INFO_Ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Contrasena.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Iniciar.setText("INICIAR SESION");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Registrarse.setText("REGISTRARSE");
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_InicioLayout = new javax.swing.GroupLayout(P_Inicio);
        P_Inicio.setLayout(P_InicioLayout);
        P_InicioLayout.setHorizontalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(INFO_Ini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_InicioLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(L_Contra)
                            .addComponent(L_Nombre)
                            .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                .addComponent(Contrasena)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, P_InicioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Iniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        P_InicioLayout.setVerticalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(L_Nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(L_Contra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(INFO_Ini, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Registrarse)
                    .addComponent(Iniciar))
                .addContainerGap())
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
                .addComponent(P_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    // INICIAR SESION
    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        //Si ambos campos estan rellenos continuamos, si no, pedimos que los rellenen
        if(Nombre.getText().isEmpty() || Contrasena.getText().isEmpty()){
            INFO_Ini.setText("Rellene ambos campos");
        }else{
            //Comprobamos el estado de la consulta 0 (accedemos a la app) 1(error del usuario) 2 (Error de la contraseña) -1 (error de la consulta)
            switch(DBConexion.Inicio(Nombre.getText(),Contrasena.getText())){
                case 0:
                    
                    //Si accedemos, se abre el menu
                    java.awt.EventQueue.invokeLater(() -> {
                        new Menu().setVisible(true);
                        dispose();
                    });
                    break;
                case 1:
                    INFO_Ini.setText("El usuario no existe");
                    break;
                case 2:
                    INFO_Ini.setText("Contraseña incorrecta");
                    break;
                case -1:
                    INFO_Ini.setText("Error en la consulta");
                    break;
                
            }

        }
    }//GEN-LAST:event_IniciarActionPerformed

    // REGISTRARSE
    private void RegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarseActionPerformed
        
        //Si no se han rellenado ambos campos se notifica
        if(Nombre.getText().isEmpty() || Contrasena.getText().isEmpty()){
            INFO_Ini.setText("Rellene ambos campos");
        }else{
            //Si se han rellenado y se ha registrado correctamente se abre la ventana de Menu de usuario para ingresar los datos 
            int acceso = DBConexion.Registro(Nombre.getText(),Contrasena.getText());
            
            switch(acceso){
                case 0 -> 
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new Menu_Usuario().setVisible(true);
                            dispose();
                        }
                    });
                case 1 -> INFO_Ini.setText("Nombre de usuario ya en uso");
                default -> INFO_Ini.setText("Error en el registro, vuelve a intentarlo");
            }
        }
    }//GEN-LAST:event_RegistrarseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JLabel INFO_Ini;
    private javax.swing.JButton Iniciar;
    private javax.swing.JLabel L_Contra;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel P_Inicio;
    private javax.swing.JPanel P_Titulo;
    private javax.swing.JButton Registrarse;
    private javax.swing.JLabel Titulo;
    // End of variables declaration//GEN-END:variables
}
