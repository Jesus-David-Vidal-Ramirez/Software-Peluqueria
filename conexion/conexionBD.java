package conexion;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Usuario
 */
public class conexionBD {
    
//private Connection conexion;
      // private Statement sentencia;
       private static Connection conexion;
       private static Statement sentencia;
       
       private String servidor = "127.0.0.1";
       private String usuario = "root";
       private String pass = "";
       private String BD = "peluqueria";
       
       
       public void conectar(){
           
               try{                   
                    // se carga el driver jdbc
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    // se crea una cadena de conexion con los parametros iniciales
                    String url = "jdbc:mysql://"+servidor+":3306"+"/"+BD;
                    // se establece la conexion a la base de datos
                    conexion = DriverManager.getConnection(url, usuario, pass);
                    // se crea un objeto para las sentencias SQL
                    sentencia=conexion.createStatement();
                    System.out.println("Conexión exitosa.");
                    
               }catch(Exception e){
                   System.out.println("Error en la conexión");
                   JOptionPane.showMessageDialog(null, "EEROR en la conexion");
               }
           
       }
  public Statement getSentencia(){
    return sentencia;
  }
 
   public static Connection getConexion(){
           return  conexion;
       }
  public static ResultSet getTabla(String Consulta) {
        
        conexion = getConexion();
        Statement st;
        ResultSet datos = null;
        try {
            st = conexion.createStatement();
            datos = st.executeQuery(Consulta);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }  

   
   
}
