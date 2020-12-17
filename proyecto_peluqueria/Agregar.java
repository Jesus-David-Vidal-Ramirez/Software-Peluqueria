package proyecto_peluqueria;

import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 * @author Jesus Vidal
 */
public final class Agregar extends javax.swing.JFrame {

    private final conexionBD conexion = new conexionBD();

    public Agregar() {
        initComponents();
        conexion.conectar();
        setLocationRelativeTo(null);

    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        Enviar = new javax.swing.JButton();
        jButtonRegre2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Telefono");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, 25));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Labor");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, 25));

        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 140, 20));

        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 134, 20));

        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 134, 20));

        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 134, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Estilista", "Manicurista" }));
        jComboBox1.setToolTipText("");
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jComboBox1.setKeySelectionManager(null);
        jComboBox1.setName("Seleccionar"); // NOI18N
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 130, -1));

        Enviar.setBackground(new java.awt.Color(255, 255, 255));
        Enviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar - copia.png"))); // NOI18N
        Enviar.setBorderPainted(false);
        Enviar.setContentAreaFilled(false);
        Enviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Enviar.setFocusable(false);
        Enviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        Enviar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnviarActionPerformed(evt);
            }
        });
        jPanel1.add(Enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 90, 70));

        jButtonRegre2.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRegre2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButtonRegre2.setBorderPainted(false);
        jButtonRegre2.setContentAreaFilled(false);
        jButtonRegre2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegre2.setFocusable(false);
        jButtonRegre2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        jButtonRegre2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        jButtonRegre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegre2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 80));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 130, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 130, 20));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 130, 20));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 130, 20));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("AGREGAR EMPLEADO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnviarActionPerformed

        if (Buscar() == true) {
            //System.out.println("ingrese de nuevo");

        } else {
            AgregarUsuario();
        }

    }//GEN-LAST:event_EnviarActionPerformed

    private void jButtonRegre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegre2ActionPerformed
        Empleados E = new Empleados();
        E.show();
        dispose();

    }//GEN-LAST:event_jButtonRegre2ActionPerformed

    public boolean AgregarUsuario() {

        boolean Agregado = false;
        String usuario = jTextField1.getText();
        String ape = jTextField2.getText();
        String ID = jTextField3.getText();
        String Tel = jTextField4.getText();

        String labor = jComboBox1.getSelectedItem().toString();

        String sql = "INSERT INTO trabajadores (Nombre, Apellido, ID , Telefono ,Labor) VALUES ('" + usuario + "','" + ape + "','" + ID + "','" + Tel + "','" + labor + "' )";

        if (usuario.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en usuario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else if (ape.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en apellido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else if (ID.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en ID", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else if (Tel.equals("")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en Telefono", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else if (labor.equals("Seleccionar")) {
            JOptionPane.showMessageDialog(null, "Ingrese un valor en el campo labor", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        } else {

            try {
                int filas = conexion.getSentencia().executeUpdate(sql);

                if (filas == 1) {
                    JOptionPane.showMessageDialog(null, "Empleado Guardado Con Éxito", "GUARDADO", JOptionPane.INFORMATION_MESSAGE);
                    Borrar();
                } else {
                    JOptionPane.showMessageDialog(null, "Empleado no se insertó", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Empleado no se insertó");
            }
        }
        return Agregado;

    }

    public Boolean Buscar() {
        boolean Buscar = false;

        String ID = jTextField3.getText();
        String Sql = "select ID from trabajadores where ID='" + ID + "'";

        try {
            ResultSet res = conexion.getSentencia().executeQuery(Sql);
            if (res.next()) {
                JOptionPane.showMessageDialog(null, "ID ya existente", "RESTRICCION", JOptionPane.ERROR_MESSAGE);
                Buscar = true;
            }
        } catch (SQLException e) {

        }

        return Buscar;
    }

    public void Borrar() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        String dato = "Labor";
        jComboBox1.setSelectedItem("Seleccionar");

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Agregar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enviar;
    private javax.swing.JButton jButtonRegre2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
