/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sara;

import Metodos_Principales.Metodos;
import static Metodos_Principales.conexionglobal.PASSWORD;
import static Metodos_Principales.conexionglobal.URL;
import static Metodos_Principales.conexionglobal.USERNAME;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Personal extends javax.swing.JFrame {

    public static String URL = "jdbc:mysql://192.168.100.188/sistema_informatico";
    public static String USERNAME = "root";
    public static String PASSWORD = "1234";

    boolean opc;
    ResultSet rs;
    Metodos met = new Metodos();
    int count;
    String Sexo, Horario, Puesto, Direcion, Id;
    PreparedStatement ps;
//metodode coneccion ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static java.sql.Connection getConection() {
        Connection mau = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mau = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {

        }
        return mau;
    }

    private void limpiarcajas() {
        txtNom.setText(null);
        txtPat.setText(null);
        txtMat.setText(null);
        txtUsu.setText(null);
        txtCon.setText(null);
        cboxPue.setSelectedIndex(0);

    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    public Personal() {
        initComponents();
        Image ico = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("IMAGENES/logo.png"));
        setIconImage(ico);
        setLocationRelativeTo(null);
        txtId.setEnabled(false);
        txtId.setText("Campo Automatico");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAgre = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        txtBus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLim = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPat = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        txtUsu = new javax.swing.JTextField();
        txtCon = new javax.swing.JTextField();
        cboxPue = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbPue = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(33, 45, 62));

        jPanel2.setBackground(new java.awt.Color(33, 45, 62));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4), "Acciones a Realizar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        btnAgre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar.png"))); // NOI18N
        btnAgre.setBorder(null);
        btnAgre.setBorderPainted(false);
        btnAgre.setContentAreaFilled(false);
        btnAgre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgre.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar.png"))); // NOI18N
        btnAgre.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/agregar-1.png"))); // NOI18N
        btnAgre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgre);
        btnAgre.setBounds(70, 40, 117, 39);

        btnMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Modificar.png"))); // NOI18N
        btnMod.setBorder(null);
        btnMod.setBorderPainted(false);
        btnMod.setContentAreaFilled(false);
        btnMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMod.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Modificar.png"))); // NOI18N
        btnMod.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/Modificar-.png"))); // NOI18N
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });
        jPanel2.add(btnMod);
        btnMod.setBounds(70, 90, 117, 39);

        btnEli.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEli.setBorder(null);
        btnEli.setBorderPainted(false);
        btnEli.setContentAreaFilled(false);
        btnEli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEli.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar.png"))); // NOI18N
        btnEli.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/eliminar-.png"))); // NOI18N
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });
        jPanel2.add(btnEli);
        btnEli.setBounds(70, 150, 117, 39);

        txtBus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBus.setForeground(new java.awt.Color(153, 153, 153));
        txtBus.setBorder(null);
        txtBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusActionPerformed(evt);
            }
        });
        jPanel2.add(txtBus);
        txtBus.setBounds(70, 270, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES-2/campo-buscar.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 260, 206, 50);

        btnLim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/limpiar.png"))); // NOI18N
        btnLim.setBorder(null);
        btnLim.setBorderPainted(false);
        btnLim.setContentAreaFilled(false);
        btnLim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLim.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/limpiar.png"))); // NOI18N
        btnLim.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/limpiar-1.png"))); // NOI18N
        btnLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimActionPerformed(evt);
            }
        });
        jPanel2.add(btnLim);
        btnLim.setBounds(70, 200, 117, 39);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(33, 45, 62), 4), "Datos del Empleado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(33, 45, 62))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Nombres :");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Materno :");

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Apellido Paterno :");

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Usuario :");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Contraseña :");

        cboxPue.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cboxPue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puestos", "gerente\t", "colaborador" }));
        cboxPue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPueActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel17.setText("Id Empleado :");

        txtId.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(61, 61, 61)
                                .addComponent(txtId))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(353, 353, 353))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(cboxPue, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtUsu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cboxPue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanel4.setBackground(new java.awt.Color(73, 181, 172));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Manejo de usuarios");

        lbPue.setForeground(new java.awt.Color(73, 181, 172));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbPue)
                .addGap(141, 141, 141))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/boton 3.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton para agregar usuario ---------------------------------------------------------------------------------

    private void btnAgreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreActionPerformed
        Connection mau = null;

        try {
            mau = (Connection) getConection();
            ps = mau.prepareStatement("INSERT INTO empleados(Nombre, Ape_Pat, Ape_Mat, Puesto, Usuario, Contraseña) VALUES (?,?,?, ?,?,?)");
            ps.setString(1, txtNom.getText());
            ps.setString(2, txtPat.getText());
            ps.setString(3, txtMat.getText());
            ps.setString(4, cboxPue.getSelectedItem().toString());
            ps.setString(5, txtUsu.getText());
            ps.setString(6, txtCon.getText());
           

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona guardada con exito");
                limpiarcajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");

                limpiarcajas();
            }
            mau.close();
        } catch (Exception e) {
            System.err.println(e);
        }

    }//GEN-LAST:event_btnAgreActionPerformed
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
  Connection mau = null;

        try {
            mau = (Connection) getConection();
            ps = mau.prepareStatement("UPDATE empleados SET Nombre=?, Ape_Pat=?, Ape_Mat=?, Puesto=?, Usuario=?, Contraseña=? WHERE Id_Emp=?");
            ps.setString(1, txtNom.getText());
            ps.setString(2, txtPat.getText());
            ps.setString(3, txtMat.getText());
            ps.setString(4, cboxPue.getSelectedItem().toString());
            ps.setString(5, txtUsu.getText());
            ps.setString(6, txtCon.getText());
            ps.setString(7,txtId.getText());

            int res = ps.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Persona modificada");
                limpiarcajas();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");

                limpiarcajas();
            }
            mau.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimActionPerformed
 limpiarcajas();
        cboxPue.setSelectedItem("Puestos");
        met.Limpiar(jPanel1);
    }//GEN-LAST:event_btnLimActionPerformed

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed

        if (opc == true) {
            JOptionPane.showMessageDialog(null, "Datos obligatorios favor de ingresarlos");
        } else {

            met.Delete(" Delete from empleados where Id_Emp='" + txtId.getText() + "' ");
        }
         limpiarcajas();
    }//GEN-LAST:event_btnEliActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        menu op = new menu();
        op.setVisible(true);
        dispose();
        String Puesto = lbPue.getText();
        op.Bloqueo(Puesto, Id);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboxPueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPueActionPerformed

    private void txtBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusActionPerformed
        Connection mau = null;

        try {
            mau = (Connection) getConection();
            ps = mau.prepareStatement("SELECT * FROM  empleados "+"WHERE Usuario LIKE '%"+txtBus.getText() +"%'"+ "OR Nombre LIKE '%"+txtBus.getText() +"%'"+" OR Ape_Pat LIKE '%"+txtBus.getText() +"%'"+" OR Usuario LIKE '%"+txtBus.getText() +"%'");
           

            rs = ps.executeQuery();
            if(rs.next()){
                txtId.setText(rs.getString("Id_Emp"));
                txtNom.setText(rs.getString("Nombre"));
                txtPat.setText(rs.getString("Ape_Pat"));
                txtMat.setText(rs.getString("Ape_Mat"));
                txtUsu.setText(rs.getString("Usuario"));
                txtCon.setText(rs.getString("Contraseña"));
                cboxPue.setSelectedItem(rs.getString("Puesto"));

            }
            else {
                JOptionPane.showMessageDialog(null,"no se encontro persona prueba de nuevo o verifica que este dada de alta.");

            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_txtBusActionPerformed

    public void Puesto(String Puesto, String Id) {
        lbPue.setText(Puesto);
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
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgre;
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnLim;
    private javax.swing.JButton btnMod;
    private javax.swing.JComboBox cboxPue;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lbPue;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtCon;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPat;
    private javax.swing.JTextField txtUsu;
    // End of variables declaration//GEN-END:variables
}
