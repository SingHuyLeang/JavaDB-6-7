package Views.Auth;

import Component.MSG;
import Controller.UserController;
import Model.UserModel;
import Views.Home.Home;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class SignUp extends javax.swing.JFrame {
    
    UserController user = new UserController();
    
    public SignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        gotoSignUp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtRePass = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(250, 250, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Barlow", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign Up");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 800, 75));

        jLabel5.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Sign up with your email and password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 117, 788, -1));

        jLabel3.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Email                    : ");
        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 140, 31));

        txtEmail.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 240, 31));

        jLabel4.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Password            : ");
        jLabel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 140, 31));

        txtPassword.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 240, 31));

        btnSignUp.setBackground(new java.awt.Color(240, 240, 240));
        btnSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 160, 40));

        gotoSignUp.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        gotoSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gotoSignUp.setText("Do you have an account ?");
        gotoSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gotoSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(gotoSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 788, -1));

        jLabel6.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Re-Password     : ");
        jLabel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 140, 31));

        txtRePass.setFont(new java.awt.Font("Barlow", 0, 18)); // NOI18N
        txtRePass.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtRePass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(100, 100, 100)));
        jPanel1.add(txtRePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 240, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gotoSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gotoSignUpMouseClicked
        new SignIn().setVisible(true);
        dispose();
    }//GEN-LAST:event_gotoSignUpMouseClicked

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String email    = txtEmail.getText();
        String password = txtPassword.getText();
        String rePass   = txtRePass.getText();
        
        if (!email.isEmpty() && !password.isEmpty() && !rePass.isEmpty()) {
            if(password.equals(rePass)){
                if (user.signUpWithEmailAndPassword(new UserModel(email, password)) == true) {
                    new Home().setVisible(true);
                    dispose();
                }
            }else{
                MSG.error("Wrong Confirm Password");
            }
        }else{
            MSG.error("Please Enter you data");
        }
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel gotoSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRePass;
    // End of variables declaration//GEN-END:variables
}
