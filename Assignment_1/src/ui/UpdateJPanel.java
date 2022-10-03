/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author adityapande
 */
public class UpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateJPanel
     */
    EmployeeHistory employeeList;

    public UpdateJPanel(EmployeeHistory employeeList) {
        initComponents();

        this.employeeList = employeeList;
        lblPhotoUrl.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbEmployeeID = new javax.swing.JLabel();
        btnUpdateDetails = new javax.swing.JButton();
        lbEmployeeName = new javax.swing.JLabel();
        lbAge = new javax.swing.JLabel();
        lbGender = new javax.swing.JLabel();
        lbStartDate = new javax.swing.JLabel();
        lbLevel = new javax.swing.JLabel();
        lbTeamInfo = new javax.swing.JLabel();
        lbPositionTitle = new javax.swing.JLabel();
        lbCellPhoneNumber = new javax.swing.JLabel();
        lbEmailAddress = new javax.swing.JLabel();
        lbPhoto = new javax.swing.JLabel();
        txtEnterEmployeeID = new javax.swing.JTextField();
        txtEmployeeName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        comboBoxGenderActionPerformed = new javax.swing.JComboBox<>();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtCellPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        lblPhotoUrl = new javax.swing.JLabel();
        btnNewPhoto = new javax.swing.JButton();
        lblFileName = new javax.swing.JLabel();
        lblPhotoDisplay = new javax.swing.JLabel();
        btnViewDetails = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Employee Data");

        lbEmployeeID.setText("Enter Employee ID :");

        btnUpdateDetails.setText("Update Details");
        btnUpdateDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateDetailsActionPerformed(evt);
            }
        });

        lbEmployeeName.setText("Employee Name :");

        lbAge.setText("Age :");

        lbGender.setText("Gender :");

        lbStartDate.setText("Start Date :");

        lbLevel.setText("Level :");

        lbTeamInfo.setText("Team Info :");

        lbPositionTitle.setText("Position Title :");

        lbCellPhoneNumber.setText("Cell Phone Number :");

        lbEmailAddress.setText("Email Address :");

        lbPhoto.setText("Photo");

        txtEmployeeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeNameActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        comboBoxGenderActionPerformed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        comboBoxGenderActionPerformed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGenderActionPerformedActionPerformed(evt);
            }
        });

        txtTeamInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeamInfoActionPerformed(evt);
            }
        });

        txtPositionTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPositionTitleActionPerformed(evt);
            }
        });

        txtCellPhoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCellPhoneNumberActionPerformed(evt);
            }
        });

        lblPhotoUrl.setText("PhotoURL");

        btnNewPhoto.setText("Select New Photo");
        btnNewPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewPhotoActionPerformed(evt);
            }
        });

        lblPhotoDisplay.setText("Photo Display");

        btnViewDetails.setText("View Employee Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmployeeID)
                    .addComponent(lbEmailAddress)
                    .addComponent(lbCellPhoneNumber)
                    .addComponent(lbPositionTitle)
                    .addComponent(lbTeamInfo)
                    .addComponent(lbLevel)
                    .addComponent(lbAge)
                    .addComponent(lbEmployeeName)
                    .addComponent(lbStartDate)
                    .addComponent(lbGender))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboBoxGenderActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(txtCellPhoneNumber)
                            .addComponent(txtPositionTitle)
                            .addComponent(txtTeamInfo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLevel)
                            .addComponent(txtStartDate)
                            .addComponent(txtEnterEmployeeID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmployeeName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAge, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNewPhoto)
                                    .addContainerGap())
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblFileName)
                                    .addGap(65, 65, 65))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblPhotoUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnUpdateDetails)
                                        .addComponent(lblPhotoDisplay))
                                    .addGap(35, 35, 35)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbPhoto)
                                .addGap(56, 56, 56))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(btnViewDetails)
                .addGap(253, 253, 253))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEnterEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbEmployeeID)
                        .addComponent(btnUpdateDetails)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmployeeName)
                    .addComponent(txtEmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGender)
                    .addComponent(comboBoxGenderActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbStartDate)
                            .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblPhotoDisplay)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhotoUrl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCellPhoneNumber)
                            .addComponent(txtCellPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblFileName)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmailAddress)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewPhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnViewDetails)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateDetailsActionPerformed
        // TODO add your handling code here:

        String employeeId = txtEnterEmployeeID.getText();
        String employeeName = txtEmployeeName.getText();
        int age = Integer.parseInt(txtAge.getText());
        String gender = comboBoxGenderActionPerformed.getSelectedItem().toString();
        String startDate = txtStartDate.getText();

        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher((CharSequence) startDate);

        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Enter Start Date as per Pattern");
            return;
        }

        String level = txtLevel.getText();
        String teamInfo = txtTeamInfo.getText();
        String positionTitle = txtPositionTitle.getText();
        String cellPhoneNumberRegex = "\\d{10}";
        long cellPhoneNumber = Long.parseLong(txtCellPhoneNumber.getText());

        if (!txtCellPhoneNumber.getText().matches(cellPhoneNumberRegex)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Cell Phone Number");
            return;
        }

        String emailRegex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        String emailAddress = txtEmail.getText();

        if (!emailAddress.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Enter Valid Email Address!");
            return;
        }

        ImageIcon photo = new ImageIcon(lblPhotoUrl.getText());
        for (Employee e : employeeList.getHistory()) {
            if (employeeId.equals(String.valueOf(e.getEmployee_ID()))) {
                e.setName(employeeName);
                e.setAge(age);
                e.setGender(gender);
                Date date1;
                try {
                    date1 = new SimpleDateFormat("MM/dd/yyyy").parse(startDate);
                    e.setStart_date(date1);
                } catch (ParseException ex) {
                    //Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                e.setLevel(level);
                e.setTeam_info(teamInfo);
                e.setPosition_title(positionTitle);
                e.setPhone_Number(cellPhoneNumber);
                e.setEmail(emailAddress);
                e.setPic(photo);
                JOptionPane.showMessageDialog(this, "Employee Details Saved Successfully");
                return;

            }

        }
        JOptionPane.showMessageDialog(this, "Employee ID is incorrect");
        txtEnterEmployeeID.setText("");
        txtEmployeeName.setText("");
        txtAge.setText("");
        comboBoxGenderActionPerformed.setSelectedIndex(0);
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeamInfo.setText("");
        txtPositionTitle.setText("");
        txtCellPhoneNumber.setText("");
        txtEmail.setText("");
        lblPhotoUrl.setText("");
        lblPhotoDisplay.setIcon(null);

    

    }//GEN-LAST:event_btnUpdateDetailsActionPerformed

    private void txtEmployeeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtTeamInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeamInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeamInfoActionPerformed

    private void txtPositionTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPositionTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPositionTitleActionPerformed

    private void btnNewPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewPhotoActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setAcceptAllFileFilterUsed(false);
        j.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png"));
        int r = j.showOpenDialog(null);
        
        if (r == JFileChooser.APPROVE_OPTION) {
            lblPhotoUrl.setText(j.getSelectedFile().getAbsolutePath());
            lblFileName.setText(j.getSelectedFile().getName());
            
        }
        else{
            lblPhotoUrl.setText("Image Not Added");
            
        }
    }//GEN-LAST:event_btnNewPhotoActionPerformed

    private void txtCellPhoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCellPhoneNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCellPhoneNumberActionPerformed

    private void comboBoxGenderActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGenderActionPerformedActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_comboBoxGenderActionPerformedActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int employeeId = Integer.parseInt(txtEnterEmployeeID.getText());
        
        for (Employee e: employeeList.getHistory()){
        
        if(employeeId == e.getEmployee_ID()){
            
            txtEmployeeName.setText(e.getName());
            txtAge.setText(String.valueOf(e.getAge()));
            comboBoxGenderActionPerformed.setSelectedItem(e.getGender());
            
        
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String startDate = simpleDateFormat.format(e.getStart_date());
            txtStartDate.setText(startDate);
        } catch (Exception ex) {
            System.out.println("Date error occured");
        }
        txtLevel.setText(e.getLevel());
        txtTeamInfo.setText(e.getTeam_info());
        txtPositionTitle.setText(e.getPosition_title());
        txtCellPhoneNumber.setText(String.valueOf(e.getPhone_Number()));
        txtEmail.setText(e.getEmail());
//        lblPhotoDisplay.setIcon(e.getPhoto());
  //      lblPhotoUrl.setText(e.getPhoto().toString());
        return;
        
        
        
        }
        }
            
        
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewPhoto;
    private javax.swing.JButton btnUpdateDetails;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox<String> comboBoxGenderActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCellPhoneNumber;
    private javax.swing.JLabel lbEmailAddress;
    private javax.swing.JLabel lbEmployeeID;
    private javax.swing.JLabel lbEmployeeName;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbLevel;
    private javax.swing.JLabel lbPhoto;
    private javax.swing.JLabel lbPositionTitle;
    private javax.swing.JLabel lbStartDate;
    private javax.swing.JLabel lbTeamInfo;
    private javax.swing.JLabel lblFileName;
    private javax.swing.JLabel lblPhotoDisplay;
    private javax.swing.JLabel lblPhotoUrl;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCellPhoneNumber;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeName;
    private javax.swing.JTextField txtEnterEmployeeID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextField txtTeamInfo;
    // End of variables declaration//GEN-END:variables

    
}
