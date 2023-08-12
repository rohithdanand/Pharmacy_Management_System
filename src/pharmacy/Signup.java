/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pharmacy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author rajat
 */
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
        initComponents();
    }

    Connection Con=null;
    Statement St=null;
    ResultSet Rs=null;
    Random rand=new Random();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        SignupBtn = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ConfirmPassword = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Gender = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Customer_login = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 3, 36)); // NOI18N
        jLabel1.setText("VRR PHARMACY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 350, 70));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel2.setText("SIGNUP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 110, 45));
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 280, 229, 35));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel3.setText("User Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 135, 35));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel4.setText("Password  :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, -1, 35));

        ClearBtn.setBackground(new java.awt.Color(204, 255, 255));
        ClearBtn.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        ClearBtn.setText("CLEAR");
        ClearBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ClearBtn.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        ClearBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearBtnMouseClicked(evt);
            }
        });
        jPanel1.add(ClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 120, 50));

        SignupBtn.setBackground(new java.awt.Color(204, 255, 255));
        SignupBtn.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        SignupBtn.setText("SIGNUP");
        SignupBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SignupBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupBtnMouseClicked(evt);
            }
        });
        jPanel1.add(SignupBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 130, 50));

        exit.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 0, -1, 60));

        jLabel6.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel6.setText("( CUSTOMER )");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 140, 30));

        ConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(ConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 230, 35));

        jLabel8.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel8.setText("GENDER :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 100, 35));
        jPanel1.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 229, 35));

        jLabel10.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel10.setText("CONFIRM PASSWORD :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 360, 240, 35));
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 229, 35));

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel11.setText("E - MAIL :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 110, 35));

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHER" }));
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 402, 230, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("TO LOGIN AS CUSTOMER");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("CLICK");

        Customer_login.setFont(new java.awt.Font("Trajan Pro", 3, 20)); // NOI18N
        Customer_login.setForeground(new java.awt.Color(0, 153, 0));
        Customer_login.setText("CUSTOMER");
        Customer_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Customer_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Customer_loginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Customer_login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(Customer_login))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 550, 420, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pharmacy-wallpaper-HD34.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 760));

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

        setSize(new java.awt.Dimension(1210, 760));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearBtnMouseClicked
        Username.setText("");
        Email.setText("");
        Password.setText("");
        ConfirmPassword.setText("");
    }//GEN-LAST:event_ClearBtnMouseClicked

    private void SignupBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignupBtnMouseClicked
        try{
            
            if(!Username.getText().matches("[a-zA-z]{5,20}"))
            {
                JOptionPane.showMessageDialog(this,"Enter the valid User Name");
            }
            else if(!Email.getText().matches("[a-zA-Z0-9]+@(gmail|outlook).com$"))
            {
                JOptionPane.showMessageDialog(this,"Enter the valid E-mail");
            }
            else if(!Password.getText().matches("[a-zA-Z0-9]{6,10}$"))
            {
                JOptionPane.showMessageDialog(this,"Enter the valid Password");
            }
            else if(!ConfirmPassword.getText().matches(Password.getText()))
            {
                JOptionPane.showMessageDialog(this,"Password is NOT Matching");
            }
            else if(Password.getText().isEmpty() || Username.getText().isEmpty() || Email.getText().isEmpty() || ConfirmPassword.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(this,"Missing Information");
            }
            else{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmadb","root","Raj2002");
            PreparedStatement add=Con.prepareStatement("insert into pharmadb.admintbl values(?,?,?,?,?,?)");
            add.setInt(1, rand.nextInt(1,10000));
            //add.setInt(1,);
            add.setString(2, Username.getText());
            add.setString(3, "CUSTOMER");
            add.setString(4, Email.getText());
            add.setString(5, Password.getText());
            add.setString(6,Gender.getSelectedItem().toString() );
            int row=add.executeUpdate();
            JOptionPane.showMessageDialog(this,"Account Created\n   Login Again");
            new Login_cust().setVisible(true);
            this.dispose();
            Con.close();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        catch(Exception e)
    {
        e.printStackTrace();
    }
        
//        JOptionPane.showMessageDialog(this,"Account Created\nLogin Again");
//        new Login_cust().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_SignupBtnMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void ConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmPasswordActionPerformed

    private void Customer_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Customer_loginMouseClicked
        new Login_cust().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Customer_loginMouseClicked

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.JLabel Customer_login;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Password;
    private javax.swing.JButton SignupBtn;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
