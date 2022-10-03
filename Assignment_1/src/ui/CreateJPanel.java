/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.logging.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import model.Employee;
import model.EmployeeHistory;

/**
 *
 * @author adityapande
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeleteJPanel
     */
    EmployeeHistory History;
    public CreateJPanel(EmployeeHistory History) {
        initComponents();
        this.History = History;
        lblPhoto.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblCreate = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployee_ID = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblStart_Date = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        lblTeam_info = new javax.swing.JLabel();
        lblPosition_Title = new javax.swing.JLabel();
        lblEmail_Address = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployee_ID = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtStartDate = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        txtPosition_Title = new javax.swing.JTextField();
        txtEmail_Address = new javax.swing.JTextField();
        lblPhone_Number = new javax.swing.JLabel();
        txtPhone_Number = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtTeam_Info = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        ComboBoxGender = new javax.swing.JComboBox<>();
        PicButton = new javax.swing.JButton();
        lblPhotoUrl = new javax.swing.JLabel();
        lblFileName = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblCreate.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        lblCreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreate.setText("Create");
        lblCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblName.setText("Name");

        lblEmployee_ID.setText("Employee ID");

        lblAge.setText("Age");

        lblGender.setText("Gender");

        lblStart_Date.setText("Start Date");

        lblLevel.setText("Level");

        lblTeam_info.setText("Team info");

        lblPosition_Title.setText("Position Title");

        lblEmail_Address.setText("Email Address");

        lblPhoto.setText("Photo");

        txtEmployee_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployee_IDActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLevelActionPerformed(evt);
            }
        });

        txtEmail_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmail_AddressActionPerformed(evt);
            }
        });

        lblPhone_Number.setText("Phone Number");

        txtPhone_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhone_NumberActionPerformed(evt);
            }
        });

        txtTeam_Info.setColumns(20);
        txtTeam_Info.setRows(5);
        jScrollPane2.setViewportView(txtTeam_Info);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        ComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other", " " }));
        ComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxGenderActionPerformed(evt);
            }
        });

        PicButton.setText("Select & Upload");
        PicButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PicButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPhone_Number)
                    .addComponent(lblPhoto)
                    .addComponent(lblEmail_Address)
                    .addComponent(lblPosition_Title)
                    .addComponent(lblTeam_info)
                    .addComponent(lblLevel)
                    .addComponent(lblStart_Date)
                    .addComponent(lblGender)
                    .addComponent(lblAge)
                    .addComponent(lblEmployee_ID)
                    .addComponent(lblName))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtEmail_Address)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PicButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ComboBoxGender, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtEmployee_ID)
                                    .addComponent(txtAge)
                                    .addComponent(txtStartDate)
                                    .addComponent(txtLevel)
                                    .addComponent(txtPhone_Number, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPosition_Title, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPhotoUrl)
                            .addComponent(lblFileName))
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreate)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhotoUrl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployee_ID)
                    .addComponent(txtEmployee_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFileName))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(ComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStart_Date)
                    .addComponent(txtStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLevel)
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTeam_info)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPosition_Title, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPosition_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone_Number)
                    .addComponent(txtPhone_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail_Address)
                    .addComponent(txtEmail_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(PicButton)
                    .addComponent(btnSave))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmployee_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployee_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployee_IDActionPerformed

    private void txtEmail_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmail_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmail_AddressActionPerformed

    private void txtPhone_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhone_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhone_NumberActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        String Name = (txtName.getText());
        int Employee_ID = Integer.parseInt(txtEmployee_ID.getText());
        int Age = Integer.parseInt(txtAge.getText());
        String Gender = ComboBoxGender.getSelectedItem().toString();
        
        
        String Start_Date = txtStartDate.getText();
        
        String dateRegex = "^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(dateRegex);
        Matcher matcher = pattern.matcher((CharSequence) Start_Date);

        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(this, "Enter Start Date as per Pattern");
            return;
        }
        String Level = txtLevel.getText();
        String Team_info = (txtTeam_Info.getText());
        String Position_title = (txtPosition_Title.getText());
        long Phone_Number = Long.parseLong(txtPhone_Number.getText());
        
        
        String Email = (txtEmail_Address.getText());
        ImageIcon pic = new ImageIcon(lblPhotoUrl.getText());
        Employee e = History.addEmployee();
        
        e.setName(Name);
        e.setEmployee_ID(Employee_ID);
        e.setAge(Age);
        e.setGender(Gender);
        e.setPic(pic);
        
        Date date;
        try {
            date = new SimpleDateFormat("MM/dd/yyyy").parse(Start_Date);
            e.setStart_date(date);
        } catch (Exception ex) {
          System.out.print(ex);  
        }
        
        
//        
//        try {
//            date = new SimpleDateFormat("MM/dd/yyyy").parse(Start_Date);
//            e.setStartDate(date);
//        } catch (ParseException ex) {
//            //Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
            
        
        e.setLevel(Level);
        e.setTeam_info(Team_info);
        e.setPosition_title(Position_title);
        e.setPhone_Number(Phone_Number);
        e.setEmail(Email);
        
        JOptionPane.showMessageDialog(this, "Employee Information Saved.");
        
        txtName.setText("");
        txtEmployee_ID.setText("");
        txtAge.setText("");
        txtStartDate.setText("");
        txtLevel.setText("");
        txtTeam_Info.setText("");
        txtPosition_Title.setText("");
        txtPhone_Number.setText("");
        txtEmail_Address.setText("");
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void ComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxGenderActionPerformed

    private void txtLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLevelActionPerformed

    private void PicButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PicButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setAcceptAllFileFilterUsed(false);
        j.addChoosableFileFilter(new FileNameExtensionFilter( "Images", "jpg", "png"));
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION){
            lblPhotoUrl.setText(j.getSelectedFile().getAbsolutePath());
            lblFileName.setText(j.getSelectedFile().getName());
            
        }
        else{
            lblPhotoUrl.setText("Image Not Added");
        }
    }//GEN-LAST:event_PicButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxGender;
    private javax.swing.JButton PicButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCreate;
    private javax.swing.JLabel lblEmail_Address;
    private javax.swing.JLabel lblEmployee_ID;
    private javax.swing.JLabel lblFileName;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone_Number;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPhotoUrl;
    private javax.swing.JLabel lblPosition_Title;
    private javax.swing.JLabel lblStart_Date;
    private javax.swing.JLabel lblTeam_info;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail_Address;
    private javax.swing.JTextField txtEmployee_ID;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone_Number;
    private javax.swing.JTextField txtPosition_Title;
    private javax.swing.JTextField txtStartDate;
    private javax.swing.JTextArea txtTeam_Info;
    // End of variables declaration//GEN-END:variables
}