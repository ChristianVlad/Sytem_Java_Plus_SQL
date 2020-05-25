/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Christian
 */
public class RegistrarUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarUsuarios
     */
    public RegistrarUsuarios() {
        initComponents();
        setSize(600,400);
        setTitle("Registrar usuarios");
        setLocationRelativeTo(null);
        setResizable(false);
        
                ImageIcon wallpaper = new ImageIcon("src/images/fondoazul.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_Email = new javax.swing.JTextField();
        txt_Telefono = new javax.swing.JTextField();
        txt_Username = new javax.swing.JTextField();
        txt_Nombre = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_Title = new javax.swing.JLabel();
        jLabel_Email = new javax.swing.JLabel();
        jLabel_Telefono = new javax.swing.JLabel();
        jLabel_Username = new javax.swing.JLabel();
        jLabel_Password = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Email.setBackground(new java.awt.Color(204, 102, 0));
        txt_Email.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Email.setForeground(new java.awt.Color(255, 255, 255));
        txt_Email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Email.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 210, 30));

        txt_Telefono.setBackground(new java.awt.Color(204, 102, 0));
        txt_Telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_Telefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 30));

        txt_Username.setBackground(new java.awt.Color(204, 102, 0));
        txt_Username.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Username.setForeground(new java.awt.Color(255, 255, 255));
        txt_Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UsernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 210, 30));

        txt_Nombre.setBackground(new java.awt.Color(204, 102, 0));
        txt_Nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txt_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 210, 30));

        jPasswordField1.setBackground(new java.awt.Color(204, 104, 0));
        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPasswordField1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 210, 30));

        jLabel_Title.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Title.setText("Registro de Usuarios");
        getContentPane().add(jLabel_Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 240, -1));

        jLabel_Email.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Email.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Email.setText("Email:");
        getContentPane().add(jLabel_Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 30));

        jLabel_Telefono.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Telefono.setText("Telefono:");
        getContentPane().add(jLabel_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 90, 30));

        jLabel_Username.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Username.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Username.setText("Username:");
        getContentPane().add(jLabel_Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, 30));

        jLabel_Password.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Password.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Password.setText("Password:");
        getContentPane().add(jLabel_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 90, 30));

        jLabel_Nombre.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, 30));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico", " " }));
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 120, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 120, 110));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EmailActionPerformed

    private void txt_TelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TelefonoActionPerformed

    private void txt_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UsernameActionPerformed

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NombreActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_Email;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Password;
    private javax.swing.JLabel jLabel_Telefono;
    private javax.swing.JLabel jLabel_Title;
    private javax.swing.JLabel jLabel_Username;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField txt_Email;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JTextField txt_Telefono;
    private javax.swing.JTextField txt_Username;
    // End of variables declaration//GEN-END:variables
}