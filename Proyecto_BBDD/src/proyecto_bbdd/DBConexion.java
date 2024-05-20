package proyecto_bbdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBConexion {
    
    private static String DRIVER    ="com.mysql.jdbc.Driver";
    private static String USUARIO   ="root";
    private static String PASWORD   ="2005";
    private static String URL       ="jdbc:mysql://localhost:3306/bdprueba?useSSL=false";

    static{
        try {
            Class.forName(DRIVER);
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER: "+e);
        }
    }
            
    public Connection getConnection(){
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(URL,USUARIO,PASWORD);
            System.out.println("Connexion exitosa");   
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"ERROR EN LA CONEXION: "+e);
        }
        return con;  
    }
    
    
    
}