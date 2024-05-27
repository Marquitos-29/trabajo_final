package proyecto_bbdd;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBConexion {
    
    //Datos para la conexion SQL
    
    private static String DRIVER    ="com.mysql.jdbc.Driver";
    private static String R_USUARIO   ="root";
    private static String R_PASWORD   ="2005";
    private static String URL       ="jdbc:mysql://localhost:3306/cva?useSSL=false";
    
    private static Connection con;

    
    //Datos Login
    
    private static int ID;
    private static int acceso=0;
    
    
    //Query
    
    private static PreparedStatement Query = null;
    private static ResultSet respuesta = null;
    
    
    //Tienda
    //Carritos disponibles y aun abiertos
    private static ArrayList<Object[]> tabla = new ArrayList<>();
    private static int PrecioT = 0;
    private static int NCarro = 0;
    
    
    //Cargamos el driver
    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER: "+e);
        }
    }
            
    
    //Conectamos con la base de datos
    public Connection getConnection(){
        con = null;
        
        
        try {            
            con = DriverManager.getConnection(URL,R_USUARIO,R_PASWORD);
            //Si la conexion es exitosa se muestra por la consola, para que el usuario no se entere 
            System.out.println("Connexion exitosa");   
        }catch(SQLException e){
            //En caso de fallar la conexion se notifica al usuario para que no intente continuar
            JOptionPane.showMessageDialog(null,"ERROR EN LA CONEXION: "+e);
        }
        return con;  
    }
    
    //Creo un metodo para reiniciar las query y las respuestas de estas 
    public static void Reiniciar(){
        Query = null;
        respuesta = null;
    }
    
    //Inicio de sesion del Login        acceso = 0 (Acceptado) 1 (error de usuario) 2 (error de contraseña)    -1 (error de conexion)
    public static int Inicio(String User, String password){
        
        //Reiniciamos
        Reiniciar();
        
        try{
            // Primero, verificar si el usuario existe
            Query = con.prepareStatement("SELECT ID FROM TInicio WHERE Usuario = ?");
            Query.setString(1, User);
            respuesta = Query.executeQuery();
            
            //Si existe...
            if (respuesta.next()) {
            
                //Creamos una query a la conexion y hacemos una query en la que se pregunte por el usuario y contraseña indicados
                Query = con.prepareStatement("SELECT ID FROM TInicio WHERE Usuario = ? AND Contraseña = ?");

                //Se dan los valores para ? siendo el primer ? User y el segundo ? Password
                Query.setString(1, User);
                Query.setString(2, password);

                //Ejecuta la Query
                respuesta = Query.executeQuery();

                // Comprobamos la respuesta
                if (respuesta.next()) {
                    // Si hay resultados, las credenciales son correctas
                    ID = respuesta.getInt("ID");
                    acceso = 0; // Acceptamos la solicitud
                } else {
                    // Si no hay resultados, la contraseña es incorrecta
                    acceso = 2; // Error de contraseña
                }
            }else{
                //si no hay usuario se le notificara en el login
                return 1;
            }
            //en caso de error en cualquier momento se notificara 
        } catch (SQLException e) {
            // Manejar excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
        }     

        //Se devuelve el estado del acceso 
        return acceso;
    }
    
    public static int Registro(String User, String password){
        //reiniciamos la query 
        Reiniciar();
        
       try{
           
            //Insertamos los valores del registro 
            Query = con.prepareStatement("insert into TInicio values(?,?,?)");
            //Se dan los valores para este insert que seran los futuros valores del login
            Query.setString(1, "0");
            Query.setString(2, User);
            Query.setString(3, password);
            //Ejecuta la Query
            Query.executeUpdate();
           
            //Probamos a iniciar sesion con los datos ingresados 
            acceso = Inicio(User,password);
            
            
        } catch (SQLException e) {
            if (e.getErrorCode() == 1062) {
                // SI el usuario ya esta registrado se avisara
                //El codigo 1062 es cuando ingresas un valor repetido para una atrivuto unique 
                acceso = 1; // Error de usuario duplicado
            } else {
                // Manejar otras excepciones SQLException
                JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
                acceso = -1; // Error de conexión o consulta SQL
            }
        }   
        
       //Devolvemos el estado del acceso 
        return acceso;
    }  
    
    // Guardamos los datos del usuario
    public static int GuardarDatosP(String Nombre,String Apellidos,String Apodo, String Cat,int Numero, String Genero, int Fede){
        //Reiniciamos 
        Reiniciar();
        
        try{
            
            //Insertamos los datos en los datos 
            Query = con.prepareStatement("insert into TDatosP values(?,?,?,?,?,?,?,?)");
                //Se dan los valores para ? siendo el primer ? User y el segundo ? Password
                Query.setInt(1, ID);
                Query.setString(2, Nombre);
                Query.setString(3, Apellidos.trim());
                Query.setString(4, Cat);
                Query.setInt(5, Numero);
                Query.setString(6, Genero);
                Query.setInt(7, Fede);
                Query.setString(8, Apodo);

                //Ejecuta la Query
                Query.executeUpdate();
        } catch (SQLException e) {
            // Manejar excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
        } 
        return 1;
    }
    
    //Añadir productos al carrito
    public static void AnadirC(String producto, String talla, int precio){
        
        // Agregamos el producto a la tabla
        tabla.add(new Object[]{producto, talla, precio});
        JOptionPane.showMessageDialog(null, "Artículo añadido al carrito con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    public static void VerCarrito(){
        PrecioT = 0;
        for (Object[] fila : tabla) {
            Carrito.AñadirFila(fila);
            int indice = 0;
            
            for (Object dato : fila) {
                if(indice==2){
                    
                    PrecioT = PrecioT + (int) dato;
                }
                ++indice;
            }
        }
        Carrito.Precio(PrecioT);
    }
    
    public static void Comprar(){
        
        //reiniciamos la query 
        Reiniciar();
        
       try{
            
            //Insertamos los valores del registro 
            String SQL = "insert into TPedidos values(?,?,?)";
            Query = con.prepareStatement(SQL,PreparedStatement.RETURN_GENERATED_KEYS);
            //Se dan los valores para este insert que seran los futuros valores del login
            Query.setInt(1, ID);
            Query.setInt(2, 0);
            Query.setInt(3, PrecioT);
            
            //Ejecuta la Query
            Query.executeUpdate();
            respuesta = Query.getGeneratedKeys();
            
            //Recoger la respuesta
            if (respuesta.next()) {
                NCarro = respuesta.getInt(1);
            }
            
            
            int Nproducto = 0;
            for (Object[] fila : tabla) {
                
                
                Reiniciar();

                Query = con.prepareStatement("insert into TDatosC values(?,?,?,?,?)");

                int indice = 0;
                ++Nproducto;
                
                Query.setInt(1, NCarro);
                Query.setInt(2, Nproducto);
                    
                    for (Object dato : fila) {
                        switch(indice){
                            case 0 -> {
                                Query.setString(3, (String)dato);
                            }
                            case 1 -> {
                                Query.setString(4, (String)dato);
                            }
                            case 2 -> {
                                Query.setInt(5, (int)dato);
                            }
                        }
                        ++indice;
                    }
                
                Query.executeUpdate();
        
            }
            
        } catch (SQLException e) {
            
            // Manejar otras excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
            
        }  
       
       tabla.clear();
       
    }
    
    public static void Precio(){
        FCompra.EscPrecio(PrecioT);
    }
    
    public static int ComprobarE(){
        Reiniciar();
        int Fede = 0;
        try {
            String selectSQL = "SELECT Fede FROM TDatosP WHERE ID = ?";
            Query = con.prepareStatement(selectSQL);

            // Asigna el valor al parámetro de la consulta
            Query.setInt(1, ID); // Suponiendo que ya tienes definido el ID

            // Ejecuta la consulta
            respuesta = Query.executeQuery();

            // Procesa el resultado
            if (respuesta.next()) {
                Fede = respuesta.getInt("Fede");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Fede;
    }
}