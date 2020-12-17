package proyecto_peluqueria;

/**
 *
 * @author Usuario
 */
import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public final class Estilistas extends javax.swing.JFrame {

    private final conexionBD conexion = new conexionBD();
    /**
     * Creates new form Contabilidad
     */
   

    public Estilistas() {
        initComponents();
        conexion.conectar();
        setLocationRelativeTo(null);
       CargarTodos();
       Valores();

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
        jButtonRegre1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonEnviar = new javax.swing.JButton();
        jCB1 = new javax.swing.JCheckBox();
        jCB2 = new javax.swing.JCheckBox();
        jCB3 = new javax.swing.JCheckBox();
        jLabelResul6 = new javax.swing.JLabel();
        ComboBoxEsti = new javax.swing.JComboBox<>();
        JFecha = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(218, 4, 122)));

        jButtonRegre1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar.png"))); // NOI18N
        jButtonRegre1.setBorderPainted(false);
        jButtonRegre1.setContentAreaFilled(false);
        jButtonRegre1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegre1.setFocusable(false);
        jButtonRegre1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        jButtonRegre1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Regresar_Oscuro.png"))); // NOI18N
        jButtonRegre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegre1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Corte de cabello");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Cepillado");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Planchado");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("PRECIOS");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("INDUMENTARIA");

        jButtonEnviar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar - copia.png"))); // NOI18N
        jButtonEnviar.setBorderPainted(false);
        jButtonEnviar.setContentAreaFilled(false);
        jButtonEnviar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEnviar.setFocusable(false);
        jButtonEnviar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        jButtonEnviar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        jButtonEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnviarActionPerformed(evt);
            }
        });

        jCB1.setBackground(new java.awt.Color(255, 255, 255));
        jCB1.setContentAreaFilled(false);
        jCB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCB2.setContentAreaFilled(false);
        jCB2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jCB3.setContentAreaFilled(false);
        jCB3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelResul6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 212)));

        ComboBoxEsti.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ComboBoxEsti.setBorder(null);
        ComboBoxEsti.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ComboBoxEsti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEstiActionPerformed(evt);
            }
        });

        JFecha.setEditable(false);
        JFecha.setBackground(new java.awt.Color(255, 255, 255));
        JFecha.setForeground(new java.awt.Color(255, 255, 255));
        JFecha.setBorder(null);
        JFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFechaActionPerformed(evt);
            }
        });

        jTextField1.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Otros");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("ESTILISTAS");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Configuracion.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConfiguracionOscuro.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConfiguracionOscuro.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel5)
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1)
                        .addGap(84, 84, 84)
                        .addComponent(jCB1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(jCB3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel6)
                        .addGap(151, 151, 151)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelResul6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jButtonEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jLabel7))
                                    .addComponent(ComboBoxEsti, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116)
                                .addComponent(jButtonRegre1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(JFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addComponent(ComboBoxEsti, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonRegre1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB2))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCB3))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabelResul6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonEnviar))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegre1ActionPerformed

        Empleados E = new Empleados();
        E.show();

        this.dispose();
    }//GEN-LAST:event_jButtonRegre1ActionPerformed

    private void jButtonEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnviarActionPerformed
        if (ComboBoxEsti.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(rootPane, "Seleccionar un ID");
        } else {
            Guardar_Ventas();
        }

    }//GEN-LAST:event_jButtonEnviarActionPerformed

    private void ComboBoxEstiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEstiActionPerformed

    }//GEN-LAST:event_ComboBoxEstiActionPerformed

    private void JFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JFechaActionPerformed

    }//GEN-LAST:event_JFechaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        boolean encontrado = false;
        String usuario = JOptionPane.showInputDialog(null, "USUARIO", "USUARIO", JOptionPane.QUESTION_MESSAGE);
        String contraseña = JOptionPane.showInputDialog(jPanel1, "CONTRASEÑA", "CONTRASEÑA", JOptionPane.QUESTION_MESSAGE);

        String sql = "select * from Login where usuario = '" + usuario + "' and contraseña='" + contraseña + "' ";

        try {
            ResultSet res = conexion.getSentencia().executeQuery(sql);
            if (res.next()) {
                JOptionPane.showMessageDialog(null, "Acceso Concedido", "BIENVENIDO", JOptionPane.INFORMATION_MESSAGE);
                encontrado = true;
            }
        } catch (SQLException e) {
        }

        if (encontrado) {
            ConfiguracionEst CE = new ConfiguracionEst();
            CE.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Acceso denegado", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    public void Valores() {

        ResultSet r = conexion.getTabla("Select precio1 from configuracion");
        ResultSet res = conexion.getTabla("Select precio2 from configuracion");
        ResultSet ress = conexion.getTabla("Select precio3 from configuracion");
        String cadena = null;
        String cadena1 = null;
        String cadena2 = null;

        try {

            while (r.next() && res.next() && ress.next()) {
                jCB1.setText(r.getString("precio1"));
                cadena = r.getString("precio1");
                jCB2.setText(res.getString("precio2"));
                cadena1 = res.getString("precio2");
                jCB3.setText(ress.getString("Precio3"));
                cadena2 = ress.getString("Precio3");

            }
            jCB3.setText(cadena);
            jCB2.setText(cadena1);
            jCB3.setText(cadena2);

        } catch (SQLException j) {
            System.out.println("ERROR");
        }

    }

    public void Guardar_Ventas() {
        boolean si = true;
        String Valor1 = jCB1.getText();
        String Valor2 = jCB2.getText();
        String Valor3 = jCB3.getText();
        int acum = 0;

        String mensaje = "Valor a cancelar : ";
        int valor1 = Integer.parseInt(Valor1);

        int valor2 = Integer.parseInt(Valor2);
        int valor3 = Integer.parseInt(Valor3);

        if (jCB1.isSelected() && jCB2.isSelected() && jCB3.isSelected()) {

            acum = valor1 + valor2 + valor3;
        } else if (jCB2.isSelected() && jCB1.isSelected()) {

            acum = valor2 + valor1;
        } else if (jCB3.isSelected() && jCB2.isSelected()) {
            acum = valor3 + valor2;
            //acum=valor3;
        } else if (jCB1.isSelected() && jCB3.isSelected()) {
            acum = valor1 + valor3;
        } else if (jCB1.isSelected()) {
            acum = valor1;
        } else if (jCB2.isSelected()) {
            acum = valor2;
        } else if (jCB3.isSelected()) {
            acum = valor3;
        } else if (jTextField1.getText().length() > 0) {
            acum = Integer.parseInt(jTextField1.getText());

        } else {
            JOptionPane.showMessageDialog(rootPane, "Ingrese algun valor", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            si = false;
        }

        if (si) {

            mensaje += acum;

            jLabelResul6.setText(mensaje);
            String dato = ComboBoxEsti.getSelectedItem().toString();

            Metodos Me = new Metodos();
            Me.Fecha();
            JFecha.setText(Me.Fecha());

            String Fecha = JFecha.getText();
            String SQL = "Insert Into contabilidad  (ID , Valor , Fecha) VALUES ('" + dato + "' , '" + acum + "', '" + Fecha + "' ) ";
            try {

                int filas = conexion.getSentencia().executeUpdate(SQL);

                if (filas == 1) {
                    JOptionPane.showMessageDialog(rootPane, "Guardado", "GUARDADO", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "NO Guardado", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException e) {
                System.out.println("Error");
            }

        }
    }

    public void CargarTodos() {
        String Estilista = "Estilista";
        ResultSet sql = conexionBD.getTabla("Select ID from Trabajadores where labor='" + Estilista + "'");
        try {

            ComboBoxEsti.addItem("Seleccionar ID");
            while (sql.next()) {

                ComboBoxEsti.addItem(sql.getString("ID"));

            }

        } catch (SQLException J) {
            System.out.println("ERROR");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estilistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Estilistas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxEsti;
    private javax.swing.JTextField JFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonEnviar;
    private javax.swing.JButton jButtonRegre1;
    private javax.swing.JCheckBox jCB1;
    private javax.swing.JCheckBox jCB2;
    private javax.swing.JCheckBox jCB3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelResul6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
