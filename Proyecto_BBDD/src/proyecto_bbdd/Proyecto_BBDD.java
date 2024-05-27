package proyecto_bbdd;

public class Proyecto_BBDD {
    public static void main(String[] args) {
        //Creamos una nueva conexion Con SQL 
        DBConexion db = new DBConexion();
        db.getConnection();
        
        //Ejecutamos la primera ventana
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }
    
}