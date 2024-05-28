package proyecto_bbdd;

import java.time.Year;
import javax.swing.ImageIcon;

public class Menu_Usuario extends javax.swing.JFrame {

    public Menu_Usuario() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../Recursos/balon.jpg")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        G_Fede = new javax.swing.ButtonGroup();
        P_Titulo = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        P_Inicio = new javax.swing.JPanel();
        L_Equipo = new javax.swing.JLabel();
        L_Nombre = new javax.swing.JLabel();
        L_Apodo = new javax.swing.JLabel();
        L_Apellidos = new javax.swing.JLabel();
        L_Ano_nac = new javax.swing.JLabel();
        L_N_jugador = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JTextField();
        Apodo = new javax.swing.JTextField();
        Apellidos = new javax.swing.JTextField();
        Ano_nac = new javax.swing.JTextField();
        N_jugador = new javax.swing.JTextField();
        R_Federado = new javax.swing.JRadioButton();
        R_Escuela = new javax.swing.JRadioButton();
        Genero = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Usuario");
        setLocation(new java.awt.Point(660, 340));
        setResizable(false);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        P_Inicio.setBackground(new java.awt.Color(255, 51, 51));

        L_Equipo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Equipo.setText("Ya estas en un equipo?");

        L_Nombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Nombre.setText("Nombre:");

        L_Apodo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Apodo.setText("Apodo:");

        L_Apellidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Apellidos.setText("Apellidos:");

        L_Ano_nac.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_Ano_nac.setText("Año nac:");

        L_N_jugador.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        L_N_jugador.setText("Nº jugador:");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Genero:");

        Nombre.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Apodo.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Apellidos.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        Ano_nac.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        N_jugador.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        G_Fede.add(R_Federado);
        R_Federado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        R_Federado.setText("Federado");

        G_Fede.add(R_Escuela);
        R_Escuela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        R_Escuela.setText("Escuela   ");

        Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Info.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout P_InicioLayout = new javax.swing.GroupLayout(P_Inicio);
        P_Inicio.setLayout(P_InicioLayout);
        P_InicioLayout.setHorizontalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_InicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(L_Nombre)
                                    .addComponent(L_Apodo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(P_InicioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)))
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Genero, 0, 172, Short.MAX_VALUE)
                            .addComponent(Nombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apodo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(L_Equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125))
                            .addGroup(P_InicioLayout.createSequentialGroup()
                                .addComponent(L_Apellidos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Apellidos))
                            .addGroup(P_InicioLayout.createSequentialGroup()
                                .addComponent(L_Ano_nac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Ano_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(L_N_jugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addComponent(N_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(R_Federado)
                                .addComponent(R_Escuela))
                            .addComponent(Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        P_InicioLayout.setVerticalGroup(
            P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, P_InicioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Nombre)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Apellidos))
                .addGap(20, 20, 20)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L_Apodo)
                    .addComponent(Apodo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_Ano_nac)
                    .addComponent(N_jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(L_N_jugador)
                    .addComponent(Ano_nac, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(L_Equipo))
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addComponent(R_Federado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R_Escuela)))
                .addGroup(P_InicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(Guardar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE))
                    .addGroup(P_InicioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(P_Titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
 
        //Se comprueba que los campos estan rellenos
        if(Nombre.getText().isEmpty() || Apellidos.getText().isEmpty() || Apodo.getText().isEmpty() || Ano_nac.getText().isEmpty()){
        
            Info.setText("Rellene todos los campos (Menos equipo si no esta inscrito)");
        
        }else{
            
            //Se guardan y solicitan los datos
            int Fede = Federado();
            String Cat = Categoria();
            String Gen = Genero();
            
            //Se comprueba q no sea muy pequeño
            
            if(Cat == "Pequeño"){
                Info.setText("Muy pequeño para jugar");
            }else{
                //Se llama al metodo para guardar los datos
                DBConexion.GuardarDatosP(Nombre.getText(),Apellidos.getText(),Apodo.getText(),Cat,Integer.parseInt(N_jugador.getText()),Gen,Fede);
            
                //Se abre la ventana menu
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Menu().setVisible(true);
                        dispose();
                    }
                });
            }
        }        
    }//GEN-LAST:event_GuardarActionPerformed
    
    //COmprobamos si es federado, de escuela o no tiene equipo
    public int Federado(){
        
        if (G_Fede.getSelection()==null) {
            return 0;
        }else{
            if (R_Federado.isSelected()==true) {
                return 1;
            }else{
                return 2;   
            }
        } 
    }
    
    //Comprobamos la categoria
    public String Categoria(){
        //Se calcula la edad
        int años = Year.now().getValue()-Integer.parseInt(Ano_nac.getText());
        
        //Se asigna la categoria a la edad 
        return switch (años) {
            case 0, 1, 2, 3, 4, 5, 6 -> "Pequeño";
            case 7, 8, 9, 10 -> "Alevin";
            case 11, 12 -> "Infantil";
            case 13, 14 -> "Cadete";
            case 15, 16 -> "Junior";
            case 17, 18 -> "Juvenil";
            case 19, 20 -> "Junior";
            default -> "Senior";
        };
    }
    
    public String Genero(){
        if (Genero.getSelectedIndex()==0){
            return "M";
        }else{
            return "F";
        }
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Ano_nac;
    private javax.swing.JTextField Apellidos;
    private javax.swing.JTextField Apodo;
    private javax.swing.ButtonGroup G_Fede;
    private javax.swing.JComboBox<String> Genero;
    private javax.swing.JButton Guardar;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel L_Ano_nac;
    private javax.swing.JLabel L_Apellidos;
    private javax.swing.JLabel L_Apodo;
    private javax.swing.JLabel L_Equipo;
    private javax.swing.JLabel L_N_jugador;
    private javax.swing.JLabel L_Nombre;
    private javax.swing.JTextField N_jugador;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPanel P_Inicio;
    private javax.swing.JPanel P_Titulo;
    private javax.swing.JRadioButton R_Escuela;
    private javax.swing.JRadioButton R_Federado;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
