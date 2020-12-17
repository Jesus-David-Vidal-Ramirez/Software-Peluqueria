package proyecto_peluqueria;

import conexion.conexionBD;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author JESÚS
 */
public class Gastos extends javax.swing.JPanel {

    private final conexionBD conexion = new conexionBD();

    
    /**
     * Creates new form Gastos
     */

    public Gastos() {

        initComponents();
        conexion.conectar();
        JButton jButton3 = new JButton();
        JButton jButton10 = new JButton();
        jButton3.setVisible(false);
        jButton10.setVisible(false);

    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/LOGO.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        PANEL1 = new javax.swing.JPanel();
        Cerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Incrementar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        Mostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tablaa = new javax.swing.JTable();
        Eliminar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ENVIAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANEL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(PANEL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        Cerrar.setBackground(new java.awt.Color(255, 255, 255));
        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar_2.png"))); // NOI18N
        Cerrar.setBorderPainted(false);
        Cerrar.setContentAreaFilled(false);
        Cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Cerrar.setFocusable(false);
        Cerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar_2Oscuro.png"))); // NOI18N
        Cerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar_2Oscuro.png"))); // NOI18N
        Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarActionPerformed(evt);
            }
        });
        add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 1, 67, 65));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("GASTOS");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 21, 80, 30));

        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        Tabla.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Gastos", "Razon"
            }
        ));
        Tabla.setGridColor(new java.awt.Color(248, 4, 122));
        Tabla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 71, 260, 130));

        Incrementar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        Incrementar.setBorderPainted(false);
        Incrementar.setContentAreaFilled(false);
        Incrementar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Incrementar.setFocusable(false);
        Incrementar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mas_Oscuro.png"))); // NOI18N
        Incrementar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mas_Oscuro.png"))); // NOI18N
        Incrementar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IncrementarMouseClicked(evt);
            }
        });
        Incrementar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncrementarActionPerformed(evt);
            }
        });
        add(Incrementar, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 72, 51, -1));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 408, 40, -1));

        Mostrar.setBackground(new java.awt.Color(255, 255, 255));
        Mostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar.png"))); // NOI18N
        Mostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mostrar.setBorderPainted(false);
        Mostrar.setContentAreaFilled(false);
        Mostrar.setFocusable(false);
        Mostrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar_Oscuro.png"))); // NOI18N
        Mostrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Mostrar_Oscuro.png"))); // NOI18N
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });
        add(Mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(608, 250, 70, 50));

        Tablaa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 4, 122)));
        Tablaa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Tablaa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Gastos", "Razon", "Fecha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablaa.setGridColor(new java.awt.Color(248, 4, 122));
        Tablaa.setSelectionBackground(new java.awt.Color(248, 4, 122));
        Tablaa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TablaaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Tablaa);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 72, 318, 129));

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basura_claro.png"))); // NOI18N
        Eliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Eliminar.setBorderPainted(false);
        Eliminar.setContentAreaFilled(false);
        Eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar.setFocusable(false);
        Eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basura_oscuro.png"))); // NOI18N
        Eliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Basura_oscuro.png"))); // NOI18N
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(512, 250, 78, 61));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menos.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Menos_Oscuro.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 160, 51, -1));

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
        add(ENVIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 250, 90, -1));

        jLabel2.setText("Gastos");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 284, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 281, 60, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 300, 60, 20));

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarActionPerformed
        Empleados EM = new Empleados();
        EM.show();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();

    }//GEN-LAST:event_CerrarActionPerformed

    private void IncrementarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncrementarActionPerformed

        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();

        String[] filas = {"", ""};
        modelo.addRow(filas);

    }//GEN-LAST:event_IncrementarActionPerformed

    private void IncrementarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IncrementarMouseClicked

    }//GEN-LAST:event_IncrementarMouseClicked

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
        DefaultTableModel modelo = new DefaultTableModel();
        //Tabla1.setRowCount(0);
        String sql = "Select * from Deudas";
        ResultSet res = conexion.getTabla(sql);
        modelo.setColumnIdentifiers(new Object[]{"Gastos", "Razon", "Fecha"});

        try {
            while (res.next()) {
                modelo.addRow(new Object[]{res.getString("Gastos"), res.getString("Razon"), res.getString("Fecha")});

            }

            Tablaa.setModel(modelo);
        } catch (SQLException j) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        Tablaa.selectAll();
            int datos=Tablaa.getSelectedRowCount(), filas=0, acu=0 ,columnas;
            
            for (int i = 0; i < datos; i++) {
            Tablaa.selectAll();
            columnas = Integer.parseInt(String.valueOf(Tablaa.getValueAt(filas,0)));
                
            acu = columnas + acu;
           filas += 1;
            }
            
            jTextField2.setText(""+acu);
    }//GEN-LAST:event_MostrarActionPerformed

    private void TablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaKeyReleased
        // Enviar();
    }//GEN-LAST:event_TablaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tabla.selectAll();
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        int b = Tabla.getSelectedRowCount();
        b -= 1;
        modelo.removeRow(b);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        if (Tablaa.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(PANEL1, "Seleccione su fila");

        } else {
            Eliminar();
        }

    }//GEN-LAST:event_EliminarActionPerformed

    private void TablaaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TablaaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            EliminarActionPerformed(null);
        }
    }//GEN-LAST:event_TablaaKeyPressed

    private void ENVIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENVIARActionPerformed
        boolean Pasar = ValidarTabla();
        if (Pasar) {

            Enviar();
            limpiar();
        } else {
            JOptionPane.showMessageDialog(null, "Verifique la tabla");
        }

    }//GEN-LAST:event_ENVIARActionPerformed
    public void Eliminar() {
        DefaultTableModel modelo = new DefaultTableModel();
        int filas = Tablaa.getSelectedRow();

        String Gastos = String.valueOf(Tablaa.getValueAt(filas, 0));
        String Razon = String.valueOf(Tablaa.getValueAt(filas, 1));
        String Fecha = String.valueOf(Tablaa.getValueAt(filas, 2));

        String Consulta = "Delete from Deudas where Gastos ='" + Gastos + "' AND Razon='" + Razon + "' AND Fecha='" + Fecha + "' ";

        try {
            conexion.getSentencia().executeUpdate(Consulta);
            JOptionPane.showMessageDialog(null, "Eliminado");
            MostrarActionPerformed(null);

        } catch (SQLException e) {
            System.out.println("Error papito");
        }
    }

    public void limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        int filas = Tabla.getRowCount();
        System.out.println("filas" + filas);
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
        String[] fila = {"", ""};
        modelo.addRow(fila);
        Tabla.setModel(modelo);
    }

    public void Enviar() {
        DefaultTableModel modelo = new DefaultTableModel();

        Tabla.selectAll();
        int contar = Tabla.getSelectedRowCount();
        int fila = 0;
        int columna1 = 0;
        int columna = 1;
        int Final = 0;
        int envio = 0;
        do {
            Metodos Fec = new Metodos();
            Fec.Fecha();
            jTextField1.setText(Fec.Fecha());
            Final++;

            String Gastos = String.valueOf(Tabla.getValueAt(fila, columna1));;
            String Razon = String.valueOf(Tabla.getValueAt(fila, columna));;
            fila += 1;
            String FECHA = jTextField1.getText();

            String Sql = "Insert into Deudas (Fecha,Gastos, Razon) values ('" + FECHA + "','" + Gastos + "' ,'" + Razon + "') ";

            try {

                conexion.getSentencia().executeUpdate(Sql);
                envio = 1;

            } catch (SQLException J) {
                System.out.println("Error");
            }

        } while (Final < contar);

        if (envio == 1) {
            JOptionPane.showMessageDialog(null, "ENVIADO");
        } else {
            JOptionPane.showMessageDialog(null, "NO ENVIADO");
        }

    }

    public Boolean ValidarTabla() {
        boolean Validado = false;
        String i = " ";
        String j = " ";

        for (int f = 0; f < Tabla.getRowCount(); f++) {
            for (int c = 0; c < 2; c++) {

                i = String.valueOf(this.Tabla.getValueAt(f, c));
                j = String.valueOf(this.Tabla.getValueAt(f, c));

                if (i.equals("null") || j.equals("null") || i.equals("null") || j.equals("null") || i.equals(" ") || j.equals(" ") || i.equals("") || j.equals("")) {
                    Validado = false;
                    JOptionPane.showMessageDialog(null, "Valor vacio en la posicion [" + f + "] [" + c + "] ");
                } else {

                    Validado = true;
                }

            }
        }
        return Validado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Cerrar;
    public javax.swing.JButton ENVIAR;
    public javax.swing.JButton Eliminar;
    public javax.swing.JButton Incrementar;
    public javax.swing.JButton Mostrar;
    public javax.swing.JPanel PANEL1;
    public javax.swing.JTable Tabla;
    public javax.swing.JTable Tablaa;
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JScrollBar jScrollBar1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JSeparator jSeparator1;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
