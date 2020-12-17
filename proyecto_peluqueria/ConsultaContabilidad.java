package proyecto_peluqueria;

import javax.swing.table.DefaultTableModel;
import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ConsultaContabilidad extends javax.swing.JPanel {

    public static javax.swing.JPanel PanelPrincipal;
    private conexionBD conexion = new conexionBD();

    public ConsultaContabilidad() {
        initComponents();
        conexion.conectar();
        CargarTodo();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    public void CargarTodo() {
        try {
            ResultSet Sql = conexion.getTabla("select ID from Trabajadores  ; ");
            jComboBox1.addItem("Seleccionar ID");

            while (Sql.next()) {
                jComboBox1.addItem(Sql.getString("ID"));
            }
        } catch (SQLException ex) {
            System.err.println("Error" + ex.toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Total = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Contabilidad = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ENVIAR = new javax.swing.JButton();
        Fecha = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(425, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar.png"))); // NOI18N
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusable(false);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_Oscuro.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Limpiar_Oscuro.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 70, 70));

        Total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Total.setFocusable(false);
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 100, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 100, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Ganancias");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 67, 27));

        Tabla_Contabilidad.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(248, 4, 122)));
        Tabla_Contabilidad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Tabla_Contabilidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Valor"
            }
        ));
        Tabla_Contabilidad.setEditingColumn(1);
        Tabla_Contabilidad.setEditingRow(1);
        Tabla_Contabilidad.setGridColor(new java.awt.Color(248, 4, 122));
        Tabla_Contabilidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Tabla_ContabilidadKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Contabilidad);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 380, 150));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 158, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Ingresar ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CONSULTA CONTABILIDAD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 12, -1, -1));

        ENVIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/enviar - copia.png"))); // NOI18N
        ENVIAR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        ENVIAR.setBorderPainted(false);
        ENVIAR.setContentAreaFilled(false);
        ENVIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENVIAR.setFocusable(false);
        ENVIAR.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        ENVIAR.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EnviarOScuro.png"))); // NOI18N
        ENVIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENVIARActionPerformed(evt);
            }
        });
        jPanel1.add(ENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 90, -1));

        Fecha.setEditable(false);
        Fecha.setBackground(new java.awt.Color(255, 255, 255));
        Fecha.setForeground(new java.awt.Color(255, 255, 255));
        Fecha.setBorder(null);
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 20, 30, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed
    public void limpiar() {
        DefaultTableModel Modelo = new DefaultTableModel();
        Total.setText("");
        while (Modelo.getRowCount() > 0) {
            Modelo.removeRow(0);
        }
        jComboBox1.setSelectedItem("Seleccionar ID");
    }
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        this.Buscar_Empleado();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void ENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIARActionPerformed
       if(jComboBox1.getSelectedItem().equals("Seleccionar ID")){
           JOptionPane.showMessageDialog(null, "SELECCIONE UN ID" , "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
       }else{
           
       

        Metodos Fe = new Metodos();
        Fe.Fecha();
        Fecha.setText(Fe.Fecha());
        String fecha = Fecha.getText();
        String datos;
        String valor = Total.getText();
        datos = jComboBox1.getSelectedItem().toString();

        String SQL = "Insert Into Finanzas (ID, Ganancias,Fecha) values ('" + datos + "', '" + valor + "', '" + fecha + "' )";
        String Sql = "Delete from contabilidad where ID='" + datos + "'";

        try {
            int filas = conexion.getSentencia().executeUpdate(SQL);

            if (filas == 1) {
                JOptionPane.showMessageDialog(null, "Contabilidad guardada");

                limpiar();
            } else {
                System.out.println("Errorrr");
            }

            conexion.getSentencia().executeUpdate(Sql);

        } catch (SQLException e) {
            System.out.println("Error");
        }
}

    }//GEN-LAST:event_ENVIARActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void Tabla_ContabilidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Tabla_ContabilidadKeyReleased

    }//GEN-LAST:event_Tabla_ContabilidadKeyReleased

    public void Buscar_Empleado() {

        DefaultTableModel Modelo = new DefaultTableModel();
        String Seleccion;
        Seleccion = jComboBox1.getSelectedItem().toString();

        ResultSet Sql = conexion.getTabla("select * From contabilidad where ID ='" + Seleccion + "' ");
        Modelo.setColumnIdentifiers(new Object[]{"Fecha", "Salario"});

        try {

            while (Sql.next()) {
                Modelo.addRow(new Object[]{Sql.getString("Fecha"), Sql.getString("Valor")});

            }

            Tabla_Contabilidad.setModel(Modelo);

            Sql.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO hay usuarios con esta ID");
        }

        Tabla_Contabilidad.selectAll();
        int datos = Tabla_Contabilidad.getSelectedRowCount();

        int columna = 0;
        int filas;
        int acu = 0;
        for (int i = 0; i < datos; i++) {
            Tabla_Contabilidad.selectAll();
            filas = Integer.parseInt(String.valueOf(Tabla_Contabilidad.getValueAt(columna, 1)));
            acu = filas + acu;
            columna += 1;

        }

        Total.setText(" " + acu);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENVIAR;
    private javax.swing.JTextField Fecha;
    private javax.swing.JTable Tabla_Contabilidad;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
