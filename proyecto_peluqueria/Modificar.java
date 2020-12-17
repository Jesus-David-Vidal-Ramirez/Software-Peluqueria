package proyecto_peluqueria;

import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Modificar extends javax.swing.JFrame {

    private final conexionBD conexion = new conexionBD();

    public Modificar() {
        initComponents();
        conexion.conectar();
        Cargar_Todos();
        setLocationRelativeTo(null);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    public void Cargar_Todos() {
        DefaultTableModel modelo = new DefaultTableModel();
        //String Sql = "Select * from Trabajadores";
        ResultSet Sql = conexion.getTabla("select * from Trabajadores");
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        modelo.addColumn("Labor");
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombres", "Apellidos", "Telefonos", "Labor"});
        try {
            //conexion.getSentencia().executeUpdate(Sql);
            while (Sql.next()) {
                modelo.addRow(new Object[]{Sql.getString("ID"), Sql.getString("Nombre"), Sql.getString("Apellido"), Sql.getString("Telefono"), Sql.getString("Labor")});
            }

            Tabla_Modificar.setModel(modelo);
            Sql.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Modificar = new javax.swing.JTable();
        Recargar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFocusable(false);
        setIconImage(getIconImage());
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 4, 122)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Modificar Empleado");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        Tabla_Modificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        Tabla_Modificar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Telefono", "Labor"
            }
        ));
        Tabla_Modificar.setGridColor(new java.awt.Color(248, 4, 122));
        Tabla_Modificar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Tabla_ModificarKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Modificar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 381, 140));

        Recargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar.png"))); // NOI18N
        Recargar.setToolTipText("Recargar");
        Recargar.setBorderPainted(false);
        Recargar.setContentAreaFilled(false);
        Recargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Recargar.setFocusable(false);
        Recargar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar_Oscuro.png"))); // NOI18N
        Recargar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Refrescar_Oscuro.png"))); // NOI18N
        Recargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecargarActionPerformed(evt);
            }
        });
        jPanel1.add(Recargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, -1, 70));

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        Regresar.setBorderPainted(false);
        Regresar.setContentAreaFilled(false);
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.setFocusable(false);
        Regresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        Regresar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 70));

        jTextField1.setBorder(null);
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 116, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ingresar ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, -1));

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setForeground(new java.awt.Color(255, 255, 255));
        Buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        Buscar.setToolTipText("BUSCAR");
        Buscar.setBorderPainted(false);
        Buscar.setContentAreaFilled(false);
        Buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Buscar.setFocusable(false);
        Buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oscuro.png"))); // NOI18N
        Buscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Oscuro.png"))); // NOI18N
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 80, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 110, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecargarActionPerformed
        Cargar_Todos();
        jTextField1.setText("");
    }//GEN-LAST:event_RecargarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Empleados E = new Empleados();
        E.show();
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed

        String Busqueda = jTextField1.getText();
        this.Buscar(Busqueda);
        Tabla_Modificar.selectAll();
        if (Tabla_Modificar.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "No hay Ningun empleado con esta ID");
        } else {
            JOptionPane.showMessageDialog(null, "Su usuario esta en pantalla:" + Busqueda);
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String Busqueda = jTextField1.getText();
        this.Buscar(Busqueda);
    }//GEN-LAST:event_jTextField1KeyReleased

    private void Tabla_ModificarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabla_ModificarKeyPressed
        // Modificar();
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Seleccion();
        }

    }//GEN-LAST:event_Tabla_ModificarKeyPressed

    public void Seleccion() {
        int filas = Tabla_Modificar.getSelectedRow();
        //int columna= Tabla_Modificar.getSelectedColumn();

        String ID = String.valueOf(Tabla_Modificar.getValueAt(filas, 0));
        String nombre = String.valueOf(Tabla_Modificar.getValueAt(filas, 1));
        String apellido = String.valueOf(Tabla_Modificar.getValueAt(filas, 2));
        String telefono = String.valueOf(Tabla_Modificar.getValueAt(filas, 3));
        String labor = String.valueOf(Tabla_Modificar.getValueAt(filas, 4));

        String Sql = "UPDATE trabajadores SET Nombre = '" + nombre + "', Apellido = '" + apellido + "', Telefono='" + telefono + "' , Labor='" + labor + "' WHERE ID=" + ID + " ";

        try {
            String MODIFICACION = "MODIFICACION";
            conexion.getSentencia().executeUpdate(Sql);
            JOptionPane.showConfirmDialog(null, "Cliente " + ID + " Modificado", MODIFICACION, JOptionPane.CANCEL_OPTION);
            Cargar_Todos();
            jTextField1.setText("");
        } catch (SQLException j) {
            System.out.println("QUe problema hermano");

        }
    }

    public void Buscar(String texto) {
        String Busqueda = texto;

        DefaultTableModel modelo = new DefaultTableModel();

        ResultSet rs = conexion.getTabla("select * from Trabajadores where ID = '" + Busqueda + "' ");
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombres", "Apellidos", "Telefonos", "Labor"});

        try {
            if (rs.next()) {

                modelo.addRow(new Object[]{rs.getString("ID"), rs.getString("Nombre"), rs.getString("Apellido"), rs.getString("Telefono"), rs.getString("Labor")});
            }
            rs.close();

            Tabla_Modificar.setModel(modelo);
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {

            ////Cambia el estilo de pantalla de Nibuno algo asi donde esta windows
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Recargar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable Tabla_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
