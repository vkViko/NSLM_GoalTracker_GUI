/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package org.example.interfaces;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static org.example.interfaces.Login.c;
import static org.example.interfaces.Login.passwd;
import static org.example.interfaces.Login.s;
import static org.example.interfaces.Login.url;
import static org.example.interfaces.Login.user;

/**
 *
 * @author vicen
 */
public class CrearCuenta extends javax.swing.JFrame {

    /**
     * Creates new form CrearCuenta
     */
    public CrearCuenta() {
        initComponents();
        configInicial();
    }

    public void configInicial(){
        setLocationRelativeTo(null);
        setTitle("NSLM GoalTracker");
        setIconImage(new ImageIcon(getClass().getResource("images/icono.png")).getImage());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        btnCrearCuenta = new javax.swing.JButton();
        lblIcono1 = new javax.swing.JLabel();
        txtFieldUser = new LIB.JTexfieldPH_FielTex();
        jSeparator1 = new javax.swing.JSeparator();
        lblIcono2 = new javax.swing.JLabel();
        txtFieldPasswd = new LIB.JTexfieldPH_Password();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearCuenta.setBackground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setFont(new java.awt.Font("Arial monospaced for SAP", 0, 18)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(0, 0, 0));
        btnCrearCuenta.setText("Crear cuenta");
        btnCrearCuenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 250, 40));

        lblIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/example/interfaces/images/iconoUser.png"))); // NOI18N
        panelPrincipal.add(lblIcono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 60));

        txtFieldUser.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldUser.setBorder(null);
        txtFieldUser.setPlaceholder("Usuario");
        panelPrincipal.add(txtFieldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, 30));
        panelPrincipal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 210, 20));

        lblIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/example/interfaces/images/iconPasswd.png"))); // NOI18N
        panelPrincipal.add(lblIcono2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 30, 40));

        txtFieldPasswd.setBackground(new java.awt.Color(255, 255, 255));
        txtFieldPasswd.setBorder(null);
        txtFieldPasswd.setPlaceholder("Contraseña");
        panelPrincipal.add(txtFieldPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 30));
        panelPrincipal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 210, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        try {
            c = DriverManager.getConnection(url, user, passwd);
            s = c.createStatement();
            s.executeUpdate("INSERT INTO usuario VALUES(null,'"+ txtFieldUser.getText()+ "','"+txtFieldPasswd.getText()+"')");
            JOptionPane.showMessageDialog(rootPane,"Usuario creado");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCuenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIcono1;
    private javax.swing.JLabel lblIcono2;
    private javax.swing.JPanel panelPrincipal;
    private LIB.JTexfieldPH_Password txtFieldPasswd;
    private LIB.JTexfieldPH_FielTex txtFieldUser;
    // End of variables declaration//GEN-END:variables
}
