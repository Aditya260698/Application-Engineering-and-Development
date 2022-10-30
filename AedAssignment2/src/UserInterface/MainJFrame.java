/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UserInterface;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import model.Doctor;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.UserRoles;
import UserInterface.CommunityWorkArea.CommunityJFrame;
import UserInterface.DoctorWorkArea.DoctorJFrame;
import UserInterface.HospitalWorkArea.HospitalJFrame;
import UserInterface.PatientWorkArea.PatientJFrame;
import UserInterface.SystemWorkArea.SystemJFrame;

/**
 *
 * @author Aditya
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public  PersonDirectory personDirectory;
    public  DoctorDirectory doctorDirectory;
    public  PatientDirectory patientDirectory;
    public  HospitalDirectory hospitalDirectory;
    
    public MainJFrame() {
        initComponents();
        this.personDirectory = new PersonDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.patientDirectory = new PatientDirectory();
        this.hospitalDirectory = new HospitalDirectory();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        comboBoxRole = new javax.swing.JComboBox<>();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Hospital Management System");

        lblRole.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblRole.setText("Role   :");

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System_Admin", "Hospital_Admin", "Community_Admin", "Doctor", "Patient" }));
        comboBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxRoleActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username  :");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password  :");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(212, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(comboBoxRole, javax.swing.GroupLayout.Alignment.TRAILING, 0, 222, Short.MAX_VALUE))
                            .addComponent(btnLogin))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void comboBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxRoleActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:

       UserRoles userRole = UserRoles.valueOf( comboBoxRole.getSelectedItem().toString());
        String username = txtUsername.getText();
        String password = new String(txtPassword.getPassword());
        Boolean loginStatus = false;

        try{

            if((username != null && !username.trim().isEmpty()) && (password != null && !password.trim().isEmpty())){

                if(userRole.equals(UserRoles.System_Admin)){
                    if(username.equals("s") && password.equals("s")){
                        reset();
                        loginStatus = true;
//                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
//                        mainFrame.dispose();
                        SystemJFrame systemFrame = new SystemJFrame(username,personDirectory,doctorDirectory,patientDirectory,hospitalDirectory);
                        systemFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    }
                }

                if(userRole.equals(UserRoles.Community_Admin)){
                    if(username.equals("c") && password.equals("c")){
                        reset();
                        loginStatus = true;
//                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
//                        mainFrame.dispose();
                        CommunityJFrame communityFrame = new CommunityJFrame(username);
                        communityFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    }
                }

                if(userRole.equals(UserRoles.Hospital_Admin)){
                    if(username.equals("h") && password.equals("h")){
                        reset();
                        loginStatus = true;
//                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
//                        mainFrame.dispose();
                        HospitalJFrame hospitalFrame = new HospitalJFrame(username,personDirectory, doctorDirectory, patientDirectory, hospitalDirectory);
                        hospitalFrame.main(null);
                    }
                    else{
                        loginStatus = false;
                    }
                }
                
                
                if(userRole.equals(UserRoles.Doctor)){
                    
                    for(Doctor doctor: doctorDirectory.getDoctors()){
                        if(username.equals(String.valueOf(doctor.getDoctorId())) && password.equals(doctor.getPassword())){
                            reset();
                            loginStatus = true;
    //                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
    //                        mainFrame.dispose();
                            DoctorJFrame doctorFrame = new DoctorJFrame(username,personDirectory, patientDirectory, doctorDirectory, hospitalDirectory);
                            doctorFrame.main(null);
                        }
                        else{
                            loginStatus = false;
                        }
                    }    
                        
                }

                //                if(userRole.equals(UserRoles.Doctor)){
                    //                    if(username.equals("d") && password.equals("d")){
                        //                        reset();
                        //                        loginStatus = true;
                        ////                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                        ////                        mainFrame.dispose();
                        //                        DoctorJFrame doctorFrame = new DoctorJFrame(username,personDirectory, patientDirectory, doctorDirectory, hospitalDirectory);
                        //                        doctorFrame.main(null);
                        //                    }
                    //                    else{
                        //                        loginStatus = false;
                        //                    }
                    //                }

                if(userRole.equals(UserRoles.Patient)){

                    for(Patient patient: patientDirectory.getPatients()){

                        if(username.equals(String.valueOf(patient.getPatientId())) && password.equals(patient.getPassword())){
                            reset();
                            loginStatus = true;
                            System.out.println(patientDirectory.getPatients().toString()+ " p patient jfraame call");
                            PatientJFrame patientFrame = new PatientJFrame(username,personDirectory,patientDirectory,doctorDirectory,hospitalDirectory);
                            patientFrame.main(null);
                        }
                        else{
                            loginStatus = false;
                        }

                    }
                }

                //                if(userRole.equals(UserRoles.Patient)){
                    //                    if(username.equals("p") && password.equals("p")){
                        //                        reset();
                        //                        loginStatus = true;
                        ////                        JFrame mainFrame = (JFrame) SwingUtilities.getRoot(this);
                        ////                        mainFrame.dispose();
                        //
                        //                       // System.out.println(hospitalDirectory.getHospitals().toString()+ " patient jfraame call");
                        //                        System.out.println(patientDirectory.getPatients().toString()+ " p patient jfraame call");
                        //                        PatientJFrame patientFrame = new PatientJFrame(username,personDirectory,patientDirectory,doctorDirectory,hospitalDirectory);
                        //                        patientFrame.main(null);
                        //                    }
                    //                    else{
                        //                        loginStatus = false;
                        //                    }
                    //                }

            }

            if(loginStatus == false){
                JOptionPane.showMessageDialog(this, "Please enter correct credentials!");
                reset();
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please try Again");
            reset();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainJFrame frame = new MainJFrame();
                frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
                frame.setVisible(true);
//                LoginJPanel loginPanel = new LoginJPanel();
//                frame.setContentPane(loginPanel);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> comboBoxRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void reset() {
        txtUsername.setText(null);
        txtPassword.setText(null);          
    }
}
