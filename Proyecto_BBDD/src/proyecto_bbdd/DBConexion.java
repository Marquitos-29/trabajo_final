package proyecto_bbdd;

import java.sql.*;
import javax.swing.JOptionPane;

public class DBConexion {
    
    private static String DRIVER    ="com.mysql.jdbc.Driver";
    private static String R_USUARIO   ="root";
    private static String R_PASWORD   ="2005";
    private static String URL       ="jdbc:mysql://localhost:3306/cva?useSSL=false";
    
    private static Connection con;

    
    //Datos Login
    
    private static int ID;
    private static int acceso=0;
    
    
    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER: "+e);
        }
    }
            
    public Connection getConnection(){
        con = null;
        
        
        try {
            
            con = DriverManager.getConnection(URL,R_USUARIO,R_PASWORD);
            System.out.println("Connexion exitosa");   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR EN LA CONEXION: "+e);
        }
        return con;  
    }
    
    
    //Inicio de sesion del Login        acceso = 0 (Acceptado) 1 (error de contraseña) 2 (error de usuario)     -1 (error de conexion)
    public static int Inicio(String User, String password){
              
        PreparedStatement Query = null;
        ResultSet respuesta = null; 
        
       try{
            //Con prepared Stament se ejecutam las lineas de la query desde java a la conexion
            Query = con.prepareStatement("SELECT ID FROM TInicio WHERE Usuario = ? AND Contraseña = ?");
            
            //Se dan los valores para ? siendo el primer ? User y el segundo ? Password
            Query.setString(1, User);
            Query.setString(2, password);
            
            //Ejecuta la Query
            respuesta = Query.executeQuery();
            
            // Verificar el resultado de la consulta
            if (respuesta.next()) {
                // Si hay resultados, las credenciales son correctas
                ID = respuesta.getInt("ID");
                acceso = 0; // Credenciales correctas
            } else {
                // Si no hay resultados, la contraseña es incorrecta
                acceso = 1; // Error de contraseña
            }
        } catch (SQLException e) {
            // Manejar excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
        } finally {
            // Cerrar los recursos para evitar fugas de memoria
            try {
                if (respuesta != null) respuesta.close();
                if (Query != null) Query.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "ERROR AL CERRAR LOS RECURSOS: " + e);
            }
        }       
        
       
        return acceso;
    }
    
    
    public static int Registro(String User, String password){
        
        PreparedStatement Query = null;
        
       try{
           
            //Con prepared Stament se ejecutam las lineas de la query desde java a la conexion
            Query = con.prepareStatement("insert into TInicio values(?,?,?)");
            //Se dan los valores para ? siendo el primer ? User y el segundo ? Password
            Query.setString(1, "0");
            Query.setString(2, User);
            Query.setString(3, password);
            //Ejecuta la Query
            Query.executeUpdate();
           
            acceso = Inicio(User,password);
            
            
        } catch (SQLException e) {
            // Manejar excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
        }   
        
        return acceso;
    }  
 }