/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sara.Almacen.getConection;
import static sara.Inventario.PASSWORD;
import static sara.Inventario.URL;
import static sara.Inventario.USERNAME;
import sara.login;

public class menu extends javax.swing.JFrame {
  public static String URL = "jdbc:mysql://192.168.100.188/sistema_informatico";
    public static String USERNAME = "root";
    public static String PASSWORD = "1234";
    login mau = new login();
    String Puesto, Id, Nombre;
  PreparedStatement pst = null;
      ResultSet rs = null;

    int IdUsu;
  public static java.sql.Connection getConection() {
        Connection mau = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mau = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {

        }
        return mau;
    }
    public menu() {
        initComponents();
        setLocationRelativeTo(null);
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/logo.png"));
        setIconImage(ico);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbregistro = new javax.swing.JButton();
        lbpersonal = new javax.swing.JButton();
        lbalmacen = new javax.swing.JButton();
        lbsalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbPue = new javax.swing.JLabel();
        lbnom = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(73, 181, 172));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));

        lbregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/botonreg.png"))); // NOI18N
        lbregistro.setBorderPainted(false);
        lbregistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbregistroActionPerformed(evt);
            }
        });

        lbpersonal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/botonpersonal.png"))); // NOI18N
        lbpersonal.setBorderPainted(false);
        lbpersonal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbpersonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbpersonalActionPerformed(evt);
            }
        });

        lbalmacen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/botonalmacen.png"))); // NOI18N
        lbalmacen.setBorderPainted(false);
        lbalmacen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbalmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbalmacenActionPerformed(evt);
            }
        });

        lbsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/boton 3.png"))); // NOI18N
        lbsalir.setBorderPainted(false);
        lbsalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(185, 185, 185))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(144, 144, 144)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbpersonal, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbalmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        lbPue.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbPue.setForeground(new java.awt.Color(255, 255, 255));
        lbPue.setText("Puesto:");

        lbnom.setForeground(new java.awt.Color(33, 45, 62));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbnom, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPue, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbnom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbregistroActionPerformed
        Inventario op = new Inventario();
        dispose();
        op.setVisible(true);
        Puesto = lbPue.getText();
        dispose();
        op.setVisible(true);
        op.Puesto(Puesto, Id);
        
        dispose();
    }//GEN-LAST:event_lbregistroActionPerformed

    private void lbsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbsalirActionPerformed
        login op = new login();
        dispose();
        op.setVisible(true);
    }//GEN-LAST:event_lbsalirActionPerformed

    private void lbpersonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbpersonalActionPerformed
        Personal op = new Personal();
        dispose();
        op.setVisible(true);
        Puesto = lbPue.getText();
        dispose();
        op.setVisible(true);
        op.Puesto(Puesto, Id);
        dispose();
    }//GEN-LAST:event_lbpersonalActionPerformed

    private void lbalmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbalmacenActionPerformed
        Almacen op = new Almacen();
        dispose();
        op.setVisible(true);
        Puesto = lbPue.getText();
        dispose();
        op.setVisible(true);
        op.Puesto(Puesto , Id);
        dispose();
    }//GEN-LAST:event_lbalmacenActionPerformed
      public void Bloqueo(String Puesto, String Id) {
        lbPue.setText(Puesto);

    }
    
    
    public void Bloqueo(String Puesto, int Id) {
        lbPue.setText(Puesto);

        lbnom.setText(Nombre);
        if ("gerente".equals(Puesto) || "gerente".equals(Puesto)) {
            lbalmacen.setEnabled(true);
            lbpersonal.setEnabled(true);
            lbregistro.setEnabled(true);
            lbsalir.setEnabled(true);
        } else if ("colaborador".equals(Puesto)) {
            lbalmacen.setEnabled(false);
            lbpersonal.setEnabled(false);
            lbregistro.setEnabled(true);
            lbsalir.setEnabled(true);
        }
    }

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPue;
    private javax.swing.JButton lbalmacen;
    private javax.swing.JLabel lbnom;
    private javax.swing.JButton lbpersonal;
    private javax.swing.JButton lbregistro;
    private javax.swing.JButton lbsalir;
    // End of variables declaration//GEN-END:variables

}
