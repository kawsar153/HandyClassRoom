/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import javax.swing.*;
import Users.Student.*;
import Users.Teacher.*;
/**
 *
 * @author Xeron
 */
public class LoginForm extends javax.swing.JFrame {

    
    /**
     * Creates new form LoginForm
     */
    public Login loginClass;
    public LoginForm() {
        initComponents();
        this.setTitle("Login");
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setLayout(null);
        this.loginClass=new Login();
//        emailField=new JTextField();
//        passField=new JTextField();
//        loginButton=new JButton();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailField = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailField.setName("email"); // NOI18N

        loginButton.setText("Log In");
        loginButton.setName("login"); // NOI18N
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel1.setText("Email");

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jLabel3.setText("Log In ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(emailField)
                            .addComponent(loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(passField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel3)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(loginButton)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        emailField.getAccessibleContext().setAccessibleName("email");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonClicked
          // TODO add your handling code here:
        this.loginClass.email=emailField.getText();
        char[] pass=passField.getPassword();
        this.loginClass.password=new String(pass);
       
        int x=this.loginClass.checkValidation();
        if(x==0){
            JOptionPane.showMessageDialog(this, "Enter all the Field");
        }
        else if(x==2){
          JOptionPane.showMessageDialog(this, "Wrong Email or Password");
        }
        else{
             JOptionPane.showMessageDialog(this, "Login SuccessFul");
            if(this.loginClass.userClass.role.equalsIgnoreCase("teacher")){
               JOptionPane.showMessageDialog(this, "Teacher");
               TeacherClass teacher=new TeacherClass();
               teacher.email=this.loginClass.userClass.email;
               teacher.userId=this.loginClass.userClass.userId;
              
               new TeacherGUI(teacher).setVisible(true);
               this.setVisible(false);
            }else if(this.loginClass.userClass.role.equalsIgnoreCase("student")){
                JOptionPane.showMessageDialog(this, "Student");
            }
           
        }
        
        
    }//GEN-LAST:event_loginButtonClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField emailField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JButton loginButton;
    public javax.swing.JPasswordField passField;
    // End of variables declaration//GEN-END:variables
}
