package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;


public class Administrador extends javax.swing.JFrame {
    
    String user, nombre_usuario;
    public static int sesion_usuario;


    public Administrador() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1;
        setSize(664, 534);
        setResizable(false);
        setTitle("Administrador - Sesion de " + user);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
                ImageIcon wallpaper = new ImageIcon("src/images/fondoazul.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                "select nombre_usuarios from usuarios where username = '"
                    + user + "'");
            
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText("nombre_usuario");
                
            }
        } catch (Exception e) {
            System.err.println("Error en conexion desde la interfaz Administrador");
        }
        
    }
    
        @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/admin2.png"));
        return retValue;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_RegistrarSoporte = new javax.swing.JButton();
        jButton_RegistrarAdmin = new javax.swing.JButton();
        jButton_RegistrarTec = new javax.swing.JButton();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_Credenciales = new javax.swing.JButton();
        jButton_Estadisticas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel_NombreUsuario = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_RegistrarSoporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/support.png"))); // NOI18N
        getContentPane().add(jButton_RegistrarSoporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 120, 120));

        jButton_RegistrarAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/otro.png"))); // NOI18N
        getContentPane().add(jButton_RegistrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 120, 120));

        jButton_RegistrarTec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tec.png"))); // NOI18N
        getContentPane().add(jButton_RegistrarTec, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 120, 120));

        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, 120, 120));

        jButton_Credenciales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/informationuser.png"))); // NOI18N
        getContentPane().add(jButton_Credenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 120, 120));

        jButton_Estadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grafica.png"))); // NOI18N
        getContentPane().add(jButton_Estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 120, 120));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gestionar usuarios:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 130, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registrar Usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registrar tecnico:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registrar soporte:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Estadisiticas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Credenciales");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, -1, -1));
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 140, 20));

        jLabel_Wallpaper.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Credenciales;
    private javax.swing.JButton jButton_Estadisticas;
    private javax.swing.JButton jButton_RegistrarAdmin;
    private javax.swing.JButton jButton_RegistrarSoporte;
    private javax.swing.JButton jButton_RegistrarTec;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
