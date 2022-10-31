/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HospitalWorkArea.Encounters;

import UserInterface.SystemWorkArea.Encounter.*;
import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import model.DoctorDirectory;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.VitalSigns;

/**
 *
 * @author Aditya
 */
public class HospitalCreateEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SystemCreatePatient
     */
    
    PatientDirectory patientDirectory;
    DoctorDirectory doctorDirectory;
    boolean validationCheck=true;
    
    public HospitalCreateEncounter(PatientDirectory patientDirectory,DoctorDirectory doctorDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        this.doctorDirectory = doctorDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblHospitalName = new javax.swing.JLabel();
        txtHospName = new javax.swing.JTextField();
        lblPatientId = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        lblDoctorId = new javax.swing.JLabel();
        txtDoctorId = new javax.swing.JTextField();
        lblBloodPressure = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        lblPulse = new javax.swing.JLabel();
        txtPulse = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        btnCreateEncounter = new javax.swing.JButton();
        btnSearchDoctor = new javax.swing.JButton();
        btnSearchPatient1 = new javax.swing.JButton();
        txtEncounterDate = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(191, 172, 224));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTitle.setText("Create Encounter ");

        lblDate.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDate.setText("Date :");

        lblHospitalName.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblHospitalName.setText("Hospital Name :");

        txtHospName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHospNameActionPerformed(evt);
            }
        });

        lblPatientId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPatientId.setText("Patient ID :");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        lblDoctorId.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblDoctorId.setText("Doctor ID :");

        txtDoctorId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorIdActionPerformed(evt);
            }
        });

        lblBloodPressure.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblBloodPressure.setText("Blood Pressure :");

        txtBloodPressure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodPressureActionPerformed(evt);
            }
        });

        lblPulse.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPulse.setText("Pulse :");

        txtPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPulseActionPerformed(evt);
            }
        });

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWeight.setText("Temperature :");

        txtTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperatureActionPerformed(evt);
            }
        });

        btnCreateEncounter.setBackground(new java.awt.Color(102, 255, 102));
        btnCreateEncounter.setText("Create Encounter");
        btnCreateEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEncounterActionPerformed(evt);
            }
        });

        btnSearchDoctor.setBackground(new java.awt.Color(102, 255, 102));
        btnSearchDoctor.setText("Search Doctor");
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        btnSearchPatient1.setBackground(new java.awt.Color(102, 255, 102));
        btnSearchPatient1.setText("Search Patient");
        btnSearchPatient1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPatient1ActionPerformed(evt);
            }
        });

        txtEncounterDate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("MM/dd/yyyy"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblDoctorId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPatientId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchPatient1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblWeight)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreateEncounter)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(224, 224, 224))
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEncounterDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchPatient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDoctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPulse, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110)
                .addComponent(btnCreateEncounter)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchPatient1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPatient1ActionPerformed
        // TODO add your handling code here:

        if(txtPatientId.getText().trim().isEmpty()|| txtPatientId.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Patient Id");
            return;
        }
        boolean patientAvailable=false;
        for(var patient : patientDirectory.getPatients())
        {
            if(patient.getPatientId()==Integer.parseInt(txtPatientId.getText()))
            {
                patientAvailable=true;
            }
        }
        if(!patientAvailable)
        {
            JOptionPane.showMessageDialog(this,"Patient does not exist ."
                + "Please register before making an Appointment");
        }
        if(patientAvailable)
        {
            JOptionPane.showMessageDialog(this,"Patient exist .");
        }
    }//GEN-LAST:event_btnSearchPatient1ActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here:

        if(txtDoctorId.getText().trim().isEmpty()|| txtDoctorId.getText()==null)
        {
            JOptionPane.showMessageDialog(this,"Please Enter a valid Doctor Id");
            return;
        }
        boolean doctorAvailable=false;
        for(var doctor : doctorDirectory.getDoctors())
        {
            if(doctor.getDoctorId()==Integer.parseInt(txtDoctorId.getText()))
            {
                doctorAvailable=true;
            }
        }
        if(!doctorAvailable)
        {
            JOptionPane.showMessageDialog(this,"Doctor does not exist ."
                + "Please register before making an Appointment");
        }
        if(doctorAvailable)
        {
            JOptionPane.showMessageDialog(this,"Doctor exist .");
        }

    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void btnCreateEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEncounterActionPerformed
        // TODO add your handling code here:

        try{

            if(checkForNullorEmptyValue()){

                if(RegexValidation()){
                    VitalSigns vitalSigns=new VitalSigns();
                    vitalSigns.setPulse(Integer.parseInt(txtPulse.getText()));
                    vitalSigns.setBloodPressure(Integer.parseInt(txtBloodPressure.getText()));
                    vitalSigns.setTemperature(Integer.parseInt(txtTemperature.getText()));
                    vitalSigns.setDateOfVitals(new Date());

                    Encounter encounter=new Encounter();
                    Map<Date,VitalSigns> patientEncounter=new HashMap<>();

                    String encDate = txtEncounterDate.getText();

                    Date encounterDate;
                    try {
                        encounterDate = new SimpleDateFormat("MM/dd/yyyy").parse(encDate);
                        patientEncounter.put(encounterDate,vitalSigns);

                    } catch (ParseException ex) {
                        Logger.getLogger(HospitalCreateEncounter.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    encounter.setPatientEncounter(patientEncounter);

                    Random random = new Random();
                    int encounterID =random.nextInt((9999 - 100) + 1) + 10;
                    encounter.setEncounterId(encounterID);

                    if(patientDirectory.getPatients().size() > 0){

                        boolean patientPresent=false;
                        for(Patient patient:patientDirectory.getPatients())
                        {
                            if(patient.getPatientHistoryMap().containsKey(Integer.parseInt(txtPatientId.getText())))
                            {
                                patientPresent=true;
                                var a = patient.getPatientHistoryMap().get(Integer.parseInt(txtPatientId.getText()));
                                a.setPatientEncounterHistory(encounter);

                                System.out.println(a.getPatientEncounterHistory());
                                patientDirectory.getPatients().remove(a);
                                patientDirectory.addNewPatient(patient);
                            }
                        }

                        if(!patientPresent)
                        {
                            EncounterHistory patientHistory=new EncounterHistory();
                            patientHistory.setPatientEncounterHistory(encounter);
                            Map<Integer,EncounterHistory> newPatientHistory=new HashMap<>();
                            newPatientHistory.put(Integer.parseInt(txtPatientId.getText()),patientHistory);
                            Patient patient=patientDirectory.getPatientById(Integer.parseInt(txtPatientId.getText()));
                            patient.setPatientHistoryMap(newPatientHistory);
                            patientDirectory.addNewPatient(patient);
                        }

                    }
                    else
                    {
                        EncounterHistory patientHistory=new EncounterHistory();
                        patientHistory.setPatientEncounterHistory(encounter);
                        Map<Integer,EncounterHistory> newPatientHistory=new HashMap<>();
                        newPatientHistory.put(Integer.parseInt(txtPatientId.getText()),patientHistory);
                        Patient patient=patientDirectory.getPatientById(Integer.parseInt(txtPatientId.getText()));
                        patient.setPatientHistoryMap(newPatientHistory);
                        patientDirectory.addNewPatient(patient);
                    }

                    JOptionPane.showMessageDialog(this,"Encounter Made Successfully");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Validation Failed .Please hover over red field to know more");
                    validationCheck=true;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Validation Failed .Please hover over red field to know more");
                validationCheck=true;
            }

        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"Error Occured.Encounter Could not be made");
        }
    }//GEN-LAST:event_btnCreateEncounterActionPerformed

    private void txtTemperatureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperatureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperatureActionPerformed

    private void txtPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPulseActionPerformed

    private void txtBloodPressureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodPressureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodPressureActionPerformed

    private void txtDoctorIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorIdActionPerformed

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void txtHospNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHospNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHospNameActionPerformed

    private boolean RegexValidation() throws ParseException {
        
        if(!txtEncounterDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$")){
            txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEncounterDate.setToolTipText("Please enter date in format mm/dd/yyyy");
            validationCheck=false;
        }
        
        if(txtEncounterDate.getText().matches("^(1[0-2]|0[1-9])/(3[01]" + "|[12][0-9]|0[1-9])/[0-9]{4}$"))
        {
            txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Pleae enter a valid Blood Pressure");
            validationCheck=false;
        }
        if(txtBloodPressure.getText().matches("\\b\\d+\\b"))
        {
            txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        if(!txtPulse.getText().matches("\\b\\d+\\b"))
        {
            txtPulse.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulse.setToolTipText("Pleae enter a valid Pulse Rate");
            validationCheck=false;
        }
        if(txtPulse.getText().matches("\\b\\d+\\b"))
        {
            txtPulse.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        if(!txtTemperature.getText().matches("^(8[0-9]|9[0-9]|10[0-9]|110)$"))
        {
            txtTemperature.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtTemperature.setToolTipText("Pleae enter a valid body temperature");
            validationCheck=false;
        }
        if(txtTemperature.getText().matches("^(8[0-9]|9[0-9]|10[0-9]|110)$"))
        {
            txtTemperature.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        
        return validationCheck;
    }
    
    private boolean checkForNullorEmptyValue() {
       if(txtEncounterDate.getText()==(null))
       {
           txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtEncounterDate.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(txtEncounterDate.getText()!=(null))
       {
           txtEncounterDate.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtHospName.getText()==(null))
       {
           txtHospName.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtHospName.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(txtHospName.getText()!=(null))
       {
           txtHospName.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtPatientId.getText().equals(null) || txtPatientId.getText().isEmpty())
       {
           txtPatientId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPatientId.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtPatientId.getText().equals(null) && !txtPatientId.getText().isEmpty())
       {
           txtPatientId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
       
       if(txtDoctorId.getText().equals(null) || txtDoctorId.getText().isEmpty())
       {
           txtDoctorId.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtDoctorId.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtDoctorId.getText().equals(null) && !txtDoctorId.getText().isEmpty())
       {
           txtDoctorId.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
       }
   
       
       if(txtPulse.getText().equals(null) || txtPulse.getText().isEmpty())
       {
           txtPulse.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtPulse.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtPulse.getText().equals(null) && !txtPulse.getText().isEmpty())
       {
           txtPulse.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
           
       }
       
       if(txtBloodPressure.getText().equals(null) || txtBloodPressure.getText().isEmpty())
       {
           txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtBloodPressure.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtBloodPressure.getText().equals(null) && !txtBloodPressure.getText().isEmpty())
       {
           txtBloodPressure.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            
       }
       
       if(txtTemperature.getText().equals(null) || txtTemperature.getText().isEmpty())
       {
           txtTemperature.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtTemperature.setToolTipText("Field Cannot be left empty");
            validationCheck=false;
       }
       if(!txtTemperature.getText().equals(null) && !txtTemperature.getText().isEmpty())
       {
           txtTemperature.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
            
       }
       
       return validationCheck;
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateEncounter;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnSearchPatient1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDoctorId;
    private javax.swing.JLabel lblHospitalName;
    private javax.swing.JLabel lblPatientId;
    private javax.swing.JLabel lblPulse;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtDoctorId;
    private javax.swing.JFormattedTextField txtEncounterDate;
    private javax.swing.JTextField txtHospName;
    private javax.swing.JTextField txtPatientId;
    private javax.swing.JTextField txtPulse;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
