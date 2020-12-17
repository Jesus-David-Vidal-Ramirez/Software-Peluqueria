package proyecto_peluqueria;

import javax.swing.table.DefaultTableModel;
import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JESÚS
 */
public final class Finanzas extends javax.swing.JPanel {

    Metodos JD = new Metodos();

    private final conexionBD conexion = new conexionBD();

    public Finanzas() {

        initComponents();
        conexion.conectar();

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Chooser1 = new com.toedter.calendar.JDateChooser();
        Chooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        Finanzas = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ganancias", "Fecha"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(248, 4, 122));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 156, -1, 168));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Fechas a consultar");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 21, -1, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 62, 90, 70));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel2.setText("Inicio");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 68, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel3.setText("Fin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 68, -1, -1));

        Chooser1.setBackground(new java.awt.Color(255, 255, 255));
        Chooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Chooser1.setDateFormatString("yyyy/MM/dd");
        Chooser1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(Chooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 93, 114, -1));

        Chooser2.setBackground(new java.awt.Color(255, 255, 255));
        Chooser2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Chooser2.setDateFormatString("yyyy/MM/dd");
        Chooser2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jPanel1.add(Chooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 93, 116, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Finanzas");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        Finanzas.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Finanzas.setBorder(null);
        jPanel1.add(Finanzas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 80, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 80, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 440));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Finanzas();

    }//GEN-LAST:event_jButton1ActionPerformed

    public void Finanzas() {

        String FI = JD.getChooser1(Chooser1);
        String FF = JD.getChooser1(Chooser2);

        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet res = conexionBD.getTabla("Select * from Finanzas where fecha between '" + FI + "' AND '" + FF + " 23:00:00' ");
        modelo.setColumnIdentifiers(new Object[]{"ID", "Ganancias", "Fecha"});

        try {
            while (res.next()) {

                modelo.addRow(new Object[]{res.getString("ID"), res.getString("Ganancias"), res.getString("Fecha")});

            }
            res.close();

            jTable1.setModel(modelo);

        } catch (SQLException e) {
            System.out.println("Error");
        }
           jTable1.selectAll();
            int datos = jTable1.getSelectedRowCount();

        int columna = 0;
        int filas;
        int acu = 0;
        for (int i = 0; i < datos; i++) {
            jTable1.selectAll();
            filas = Integer.parseInt(String.valueOf(jTable1.getValueAt(columna, 1)));
            acu = filas + acu;
            columna += 1;

        }

        Finanzas.setText(" " + acu);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Chooser1;
    private com.toedter.calendar.JDateChooser Chooser2;
    private javax.swing.JTextField Finanzas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    // End of variables declaration//GEN-END:variables
}
