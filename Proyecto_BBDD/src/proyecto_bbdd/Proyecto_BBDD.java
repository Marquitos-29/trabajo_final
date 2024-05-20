package proyecto_bbdd;

public class Proyecto_BBDD {
    public static void main(String[] args) {
        
        DBConexion db = new DBConexion();
        db.getConnection();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}