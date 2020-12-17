/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_peluqueria;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;

import java.text.SimpleDateFormat;
import java.util.Date;
import com.toedter.calendar.JDateChooser;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class Metodos {
private conexionBD  conexion= new conexionBD();


 

    
public void CargarTodosManicurista(JComboBox ComboBoxMani){
        String Manicurista="Manicurista";
        ResultSet sql=conexionBD.getTabla("Select ID from Trabajadores where labor='"+Manicurista+"'");
        try{
     // ComboBoxMani.addItem(new )
       ComboBoxMani.addItem("Seleccionar ID");
            while(sql.next()){

               ComboBoxMani.addItem(sql.getString("ID"));
                
            }
         
        }
        catch(SQLException J){
            System.out.println("ERROR");
        }
        
        
    }

  
        public  String Fecha(){
        Date Fecha = new Date();
        SimpleDateFormat formatodefecha=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
        return formatodefecha.format(Fecha);
    }

        public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Ejecutar.jpg"));
             return retValue;
    }
    
     SimpleDateFormat Formato = new SimpleDateFormat("yyyy-MM-dd");
        public String getChooser1(JDateChooser jd){
        if (jd.getDate()!=null){
        return Formato.format(jd.getDate());
            }else{
                 return null;
            }
        }
        
        ///////////////
        
        
        
        /////////////
        int confi;
        int precio1, precio2,precio3;
        int precio;

    public void ConfiguracionEsti(JTextField jTextField1,JTextField jTextField2, JTextField jTextField3){
          
       ResultSet r=conexion.getTabla("Select precio1 from configuracion");
       ResultSet res=conexion.getTabla("Select precio2 from configuracion");
       ResultSet ress=conexion.getTabla("Select precio3 from configuracion");
       
        String cadena=null, cadena1=null ,cadena2=null;
       

      try{
      
       while(r.next() && res.next() && ress.next()){
       jTextField1.setText(r.getString("precio1"));
       cadena=r.getString("precio1");
       jTextField2.setText(res.getString("precio2"));
       cadena1=res.getString("precio2");
       jTextField3.setText(ress.getString("Precio3"));
       cadena2=ress.getString("Precio3");
       
       
       
       
         }
         jTextField1.setText(cadena);
         jTextField2.setText(cadena1);
         jTextField3.setText(cadena2);
         
         
    
       }catch(SQLException j){
           System.out.println("ERROR");
       }
      }
      //////////
    
     public void ConfiguracionMani(JTextField jTextField4,JTextField jTextField5, JTextField jTextField6){
          
       ResultSet r=conexion.getTabla("Select mani from configuracion");
       ResultSet res=conexion.getTabla("Select pedi from configuracion");
       ResultSet ress=conexion.getTabla("Select figu from configuracion");
       
        String cadena=null, cadena1=null ,cadena2=null;
       

      try{
      
       while(r.next() && res.next() && ress.next()){
       jTextField4.setText(r.getString("mani"));
       cadena=r.getString("mani");
       jTextField5.setText(res.getString("pedi"));
       cadena1=res.getString("pedi");
       jTextField6.setText(ress.getString("figu"));
       cadena2=ress.getString("figu");
       
       
       
       
         }
         jTextField4.setText(cadena);
         jTextField5.setText(cadena1);
         jTextField6.setText(cadena2);
         
         
    
       }catch(SQLException j){
           System.out.println("ERROR");
       }
      }
      
}
