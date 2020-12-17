package proyecto_peluqueria;

import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 *
 * @author Usuario
 */
public class ConsultaEmpleados extends javax.swing.JPanel {

    public static javax.swing.JPanel PanelPrincipal;

    private conexionBD conexion = new conexionBD();
//TableRowSorter trs; 

    public ConsultaEmpleados() {
        initComponents();
        conexion.conectar();
        Cargar_Todos();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    public void Cargar_Todos() {
        DefaultTableModel model = new DefaultTableModel();
        ResultSet Sql = conexion.getTabla("select * from Trabajadores");
        model.setColumnIdentifiers(new Object[]{"Nombres", "Apellidos", "ID", "Telefonos", "Labor"});//SE INSERTAN LOS TITULOS DE LAS COLUMNAS DE LA TABLA
        try {
            while (Sql.next()) {
                // añade los resultado a al modelo de tabla
                model.addRow(new Object[]{Sql.getString("Nombre"), Sql.getString("Apellido"), Sql.getString("ID"), Sql.getString("Telefono"), Sql.getString("Labor")});
            }
            // asigna el modelo a la tabla
            Tabla_Empleados.setModel(model);
            Sql.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Empleados = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jPanel1.setPreferredSize(new java.awt.Dimension(425, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("CONSULTAR EMPLEADOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 12, -1, -1));

        Tabla_Empleados.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(248, 4, 122)));
        Tabla_Empleados.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Tabla_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tabla_Empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla_Empleados.setGridColor(new java.awt.Color(248, 4, 122));
        Tabla_Empleados.setOpaque(false);
        jScrollPane1.setViewportView(Tabla_Empleados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 464, 140));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oscuro.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oscuro.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, 70));

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 110, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Ingresar ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar_Oscuro.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar_Oscuro.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 70, 70));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 110, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 552, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String advertencia = "ADVERTENCIA";
        Tabla_Empleados.selectAll();

        if (Tabla_Empleados.getSelectedRow() == -1) {

            JOptionPane.showMessageDialog(PanelPrincipal, "NO hay ningun usuario", advertencia, HEIGHT);

        } else {

            String textos = jTextField1.getText();
            Buscar_Empleado(textos);
            JOptionPane.showMessageDialog(PanelPrincipal, "Usuario en pantalla: " + textos, advertencia, HEIGHT);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cargar_Todos();
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
//       DefaultTableModel modelo= new DefaultTableModel();
//       jTextField1.addKeyListener(new KeyAdapter(){
//           @Override
//            public void keyReleased(KeyEvent e) {
//          trs.setRowFilter(RowFilter.regexFilter(jTextField1.getText(),1));  
//               
//           }
//       
//       });
//        trs= new TableRowSorter(modelo);
//      Tabla_Empleados.setRowSorter(trs);
//        


    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        String textos = jTextField1.getText();
        this.Buscar_Empleado(textos);

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String textos = jTextField1.getText();
        this.Buscar_Empleado(textos);
    }//GEN-LAST:event_jTextField1KeyReleased

    public void Buscar_Empleado(String textos) {
        String Busqueda = textos;

        DefaultTableModel modelo = new DefaultTableModel();

        ResultSet rs = conexion.getTabla("select * from Trabajadores where ID = '" + Busqueda + "'");
        modelo.setColumnIdentifiers(new Object[]{"Nombres", "Apellidos", "ID", "Telefonos", "Labor"});//SE INSERTAN LOS TITULOS DE LAS COLUMNAS DE LA TABLA
        //if(filas = 0 ){

        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("ID"), rs.getString("Telefono"), rs.getString("Labor")});
            }
            rs.close();
            // asigna el modelo a la tabla
            Tabla_Empleados.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No hay ningun usuario con este ID");
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Empleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
