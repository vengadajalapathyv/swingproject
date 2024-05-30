
import java.awt.Color;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author venga
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        wrg_msg.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_close = new javax.swing.JButton();
        login = new javax.swing.JLabel();
        wrg_msg = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        pwd = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        show_pwd = new javax.swing.JCheckBox();
        img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_close.setForeground(new java.awt.Color(0, 118, 221));
        btn_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        btn_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_closeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, -1, -1));

        login.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        login.setForeground(new java.awt.Color(0, 118, 221));
        login.setText("LOGIN");
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 400, -1, -1));

        wrg_msg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        wrg_msg.setForeground(new java.awt.Color(255, 0, 0));
        wrg_msg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        wrg_msg.setText("Incorrect username or password");
        getContentPane().add(wrg_msg, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 470, -1, -1));

        username.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username.setForeground(new java.awt.Color(0, 118, 221));
        username.setText("Enter Username");
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 510, 300, -1));

        pwd.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        pwd.setForeground(new java.awt.Color(0, 118, 221));
        pwd.setText("Enter Password");
        pwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pwdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pwdFocusLost(evt);
            }
        });
        pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdActionPerformed(evt);
            }
        });
        getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 560, 300, -1));

        btn_login.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        btn_login.setForeground(new java.awt.Color(0, 118, 221));
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 630, -1, -1));

        show_pwd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        show_pwd.setForeground(new java.awt.Color(0, 118, 221));
        show_pwd.setText("show password");
        show_pwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                show_pwdActionPerformed(evt);
            }
        });
        getContentPane().add(show_pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 630, -1, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login background1.png"))); // NOI18N
        getContentPane().add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, -1, 1080));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
       if(username.getText().equals("gms") && pwd.getText().equals("admin") ) 
       {
           setVisible(false);
           new home().setVisible(true);
        } 
       else
           wrg_msg.setVisible(true);

           
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_closeActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null,"Do you really want to Exit Application","Select",JOtionPane.YES_NO_OPTION);
        if(a==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_btn_closeActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdActionPerformed

    private void show_pwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_pwdActionPerformed
        // TODO add your handling code here:
        if(show_pwd.isSelected())
        {
            pwd.setEchoChar((char)0);
            
        }
        else
        {
          pwd.setEchoChar('*');
        }
    }//GEN-LAST:event_show_pwdActionPerformed

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusGained
        // TODO add your handling code here:
        wrg_msg.setVisible(false);
        if(username.getText().equals("Enter Username"))
        {
            username.setText("");
            username.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_usernameFocusGained

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFocusLost
        // TODO add your handling code here:
        wrg_msg.setVisible(false);
        if(username.getText().equals(""))
        {
            username.setText("Enter Username");
            username.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_usernameFocusLost

    private void pwdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusGained
        // TODO add your handling code here:
         wrg_msg.setVisible(false);
        if(pwd.getText().equals("Enter Password"))
        {
            pwd.setText("");
            pwd.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_pwdFocusGained

    private void pwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pwdFocusLost
        // TODO add your handling code here:
        wrg_msg.setVisible(false);
        if(pwd.getText().equals(""))
        {
            pwd.setText("Enter Password");
            pwd.setForeground(new Color(0,118,221));
        }
    }//GEN-LAST:event_pwdFocusLost

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_close;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JCheckBox show_pwd;
    private javax.swing.JTextField username;
    private javax.swing.JLabel wrg_msg;
    // End of variables declaration//GEN-END:variables

//    private static class color extends Color {
//
//        public color(int i, int i0, int i1) {
//        }
//    }
}
