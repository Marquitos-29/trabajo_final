package proyecto_bbdd;


//Imports para que funcione el codigo correctamente
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


//En esta clase se ejecutara la logica del programa
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
            
    //Conectamos con la base de datos C
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
    
    //Creo un metodo para reiniciar las query y las respuestas de estas C
    public static void Reiniciar(){
        Query = null;
        respuesta = null;
    }
    
    //Inicio de sesion del Login        acceso = 0 (Acceptado) 1 (error de usuario) 2 (error de contraseña)    -1 (error de conexion) C
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
    
    //Registro del login C
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
    
    // Guardamos los datos del usuario C
    public static int GuardarDatosP(String Nombre,String Apellidos,String Apodo, String Cat,int Numero, String Genero, int Fede){
        //Reiniciamos 
        Reiniciar();
        
        //Recogemos el Id del equipo del metodo IDEquipo
        int IDEquipo = IDEquipo(Fede, Cat, Genero);
        
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
                Query.setInt(7, IDEquipo);
                Query.setString(8, Apodo);

                //Ejecuta la Query
                Query.executeUpdate();
                
                Reiniciar();
                
                
        } catch (SQLException e) {
            // Manejar excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
        } 
        return 1;
    }
    
    //Añadir productos al carrito C
    public static void AnadirC(String producto, String talla, int precio){
        
        // Agregamos el producto a la tabla e informamos
        tabla.add(new Object[]{producto, talla, precio});
        JOptionPane.showMessageDialog(null, "Artículo añadido al carrito con éxito", "Información", JOptionPane.INFORMATION_MESSAGE);
    }
    
   //Con este metodo cargamos la tabla en el carrito para verlo  C
    public static void VerCarrito(){
        
        //Reseteamos el carrito para evitar duplicar valores 
        Carrito.Resetear();
        
        //Reiniciamos el precio y el builder
        PrecioT = 0;
        StringBuilder producto = new StringBuilder();
        
        //Pasamos por cada una de las filas de la tabla 
        for (Object[] fila : tabla) {
            //Añadimos la fila al carrito
            Carrito.AñadirFila(fila);
            int indice = 0;
            
            //Pasamos por los objetos de la tabla del carrito
            for (Object dato : fila) {
                //Si es el 1º objeto se guarda el nombre para el combobox, si es el segundo se guarda la talla
                switch(indice){
                    case 0 ->{
                            producto.append((String)dato);
                        }
                    case 1 ->{
                        if((String)dato!=null){producto.append(" "+(String)dato);}
                        
                            Carrito.AñadirCombo(producto.toString());
                            producto.setLength(0);
                        }
                    
                    //Si es el 3º se suma el precio para generar la suma del precio
                    case 2 -> PrecioT = PrecioT + (int) dato;
                    
                }
                ++indice;
            }
        }
        //Añadimos el precio total al frame
        Carrito.Precio(PrecioT);
    }
    
    //Añadir la compra a la BBDD C
    public static void Comprar(){
        
        //reiniciamos la query 
        Reiniciar();
        
       try{
            
            //Insertamos los valores del la compra  
            String SQL = "insert into TPedidos values(?,?,?)";
            Query = con.prepareStatement(SQL,PreparedStatement.RETURN_GENERATED_KEYS);
            //Se dan los valores para este insert que son los valores de la compra
            Query.setInt(1, ID);
            Query.setInt(2, 0);
            Query.setInt(3, PrecioT);
            
            //Ejecuta la Query
            Query.executeUpdate();
            //Recogemos la KEY (ID)
            respuesta = Query.getGeneratedKeys();
            
            //Recoger la KEY (ID)
            if (respuesta.next()) {
                NCarro = respuesta.getInt(1);
            }
            
            // Creamos un indice de objetos
            int Nproducto = 0;
            //Pasamos por todos los procuctos
            for (Object[] fila : tabla) {
                
                //Reiniciamos
                Reiniciar();
                
                //Generamos la Query para insertar los productos
                Query = con.prepareStatement("insert into TDatosC values(?,?,?,?,?)");
                
                
                int indice = 0;
                ++Nproducto;
                
                //insertamos el numero del carro
                Query.setInt(1, NCarro);
                //Insertamos el Index de productos 
                Query.setInt(2, Nproducto);
                    
                    for (Object dato : fila) {  
                        //Pasamos objeto por objeto Si es el 1º se guarda como Producto, el 2º como talla y el 3º como precio
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
                //Ejecutamos la Query y pasamos al siguiente producto del carrito
                Query.executeUpdate();
        
            }
            
        } catch (SQLException e) {
            
            // Manejar otras excepciones SQLException
            JOptionPane.showMessageDialog(null, "ERROR EN LA CONSULTA: " + e);
            acceso = -1; // Error de conexión o consulta SQL
            
        }  
       //Limpiamos la tabla
       tabla.clear();
       
    }
    
    //Insertamos el precio total a la confirmacion de compra C
    public static void Precio(){
        FCompra.EscPrecio(PrecioT);
    }
    
    //Comprobamos el equipo del user C
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
                Fede = respuesta.getInt("Federado");
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Fede;
    }
    
    //Buscamos el ID del equipo en el q esta el user C
    public static int IDE(){
        Reiniciar();
    
        try{
        
            Query = con.prepareStatement("SELECT ID_equipo FROM TDatosP WHERE ID = ?");

            Query.setInt(1, ID);

            respuesta = Query.executeQuery();
            
            if (respuesta.next()) {
                System.out.println(respuesta.getInt("ID_equipo"));
                return respuesta.getInt("ID_equipo");
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
    //Buscar los datos de los equipos disponibles para la inscripcion C
    public static void INFO_Equipos(){
        
        //Datos del user
        String Gen ="";
        String Cat ="";

        //Datos del federado
        int ID1= 0;
        String H1_1="";
        String H2_1="";
        int Precio1=0;
        
        //Datos de escuela
        int ID2=0;
        String H1_2="";
        String H2_2="";
        int Precio2=0;
        
        try{
            Reiniciar();
            //Buscamos el genero y la categoria del user
            Query = con.prepareStatement("SELECT Genero,Categoria FROM TDatosP WHERE ID = ?");

            Query.setInt(1, ID);

            respuesta = Query.executeQuery();
            
            //Recogemos la respuesta
            if (respuesta.next()) {
                Gen = respuesta.getString("Genero");
                Cat = respuesta.getString("Categoria");                
            }
            
            //Reiniciamos
            Reiniciar();
            
            //Preguntamos por el ID y las horas del federado
            Query = con.prepareStatement("SELECT ID,primera_hora,segunda_hora,Precio FROM TEquipo WHERE categoria = ? and genero = ? and federado = ?");

            Query.setString(1, Cat);
            Query.setString(2, Gen);
            Query.setBoolean(3, true);
            
            respuesta = Query.executeQuery();
            //Recogemos los datos
            if (respuesta.next()) {
                ID1 = respuesta.getInt("ID");
                H1_1 = respuesta.getString("primera_hora");   
                H2_1 = respuesta.getString("segunda_hora"); 
                Precio1 = respuesta.getInt("Precio");
            }
            
            //Reiniciamos
            Reiniciar();
            
            //Preguntamos por el ID y las horas del equipo de escuela
            Query = con.prepareStatement("SELECT ID,primera_hora,segunda_hora,Precio FROM TEquipo WHERE categoria = ? and genero = ? and federado = ?");

            Query.setString(1, Cat);
            Query.setString(2, Gen);
            Query.setBoolean(3, false);
            
            respuesta = Query.executeQuery();
            
            //Recogemos los datos
            if (respuesta.next()) {
                ID2 = respuesta.getInt("ID");
                H1_2 = respuesta.getString("primera_hora");   
                H2_2 = respuesta.getString("segunda_hora"); 
                Precio2 = respuesta.getInt("Precio");
            }
            
            //Escribimos los datos de los equipos por pantalla
            Menu_Inscripcion.TextEQ(Cat,Gen,ID1,H1_1,H2_1,Precio1,ID2,H1_2,H2_2,Precio2);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
      
    //Sacar el ID del equipo en el que esta o deveria  C
    public static int IDEquipo(int Fede, String Categoria, String Genero){
        //En caso de que ya este en algun equipo se le asigna el equipo
        
        //En caso de no estar en ningun equipo se asignara el equipo 0 que representa q no esta en ninguno
        boolean federado = false;
        switch(Fede){
            case 0 -> {
                //No tiene equipo
                return 0;
            }
            case 1 -> {
                federado = true;
            }
            case 2 -> {    
                federado = false;
            }
        }
        
        //reiniciamos los valores de las querys para evitar conflictos
        Reiniciar();
        try{
            // Preguntamos por el ID del equipo
            Query = con.prepareStatement("SELECT ID FROM TEquipo WHERE categoria = ? and genero = ? and federado = ?");

            Query.setString(1, Categoria);
            Query.setString(2, Genero);
            Query.setBoolean(3, federado);

            respuesta = Query.executeQuery();
            
            //Devolvemos el ID del equipo
            if (respuesta.next()) {
                return respuesta.getInt("ID");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //En caso de error devolvemos 0 q es el generico
        return 0;
    }
    
    //Cambiar de equipo C
    public static void CambioEq(int op,int IDE){
        //Reiniciamos 
        Reiniciar();
        
        //Si es de un equipo se cambia al otro cambiando el ID
        try{
           if(op == 1){
               IDE=IDE+2;
            }else{
               IDE=IDE-2;
            }
           
           //Se acctualiza el ID del equipo al usuario
            Query = con.prepareStatement("UPDATE TDatosP SET ID_equipo = ? WHERE ID = ?");
            Query.setInt(1, IDE);
            Query.setInt(2, ID); // Asumiendo que ID es el identificador único para el registro

            // Ejecuta la actualización
            Query.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }   
    }
    
    //Quitamos un item de la tabla y la actualizamos C
    public static void QProductos(int index){
        tabla.remove(index);
        VerCarrito();
    }
}