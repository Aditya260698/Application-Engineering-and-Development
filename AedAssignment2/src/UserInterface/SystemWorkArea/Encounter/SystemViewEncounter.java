/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemWorkArea.Encounter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.VitalSigns;
/**
 *
 * @author Aditya
 */
public class SystemViewEncounter extends javax.swing.JPanel {

    /**
     * Creates new form SystemViewEncounter
     */
    PatientDirectory patientDirectory;
 
    
    public SystemViewEncounter(PatientDirectory patientDirectory) {
        initComponents();
        this.patientDirectory = patientDirectory;
        populateEncountersData();
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
        txtSearchEncounters = new javax.swing.JTextField();
        lblSearchEnctounter = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        btnSearchEncounter = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEncountersList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        txtSearchEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchEncountersActionPerformed(evt);
            }
        });

        lblSearchEnctounter.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblSearchEnctounter.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSearchEnctounter.setText("Search Encounter By Patient Id :");

        lblTitle.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View Encounters");

        btnSearchEncounter.setBackground(new java.awt.Color(102, 255, 102));
        btnSearchEncounter.setText("Search");
        btnSearchEncounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEncounterActionPerformed(evt);
            }
        });

        tblEncountersList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EncounterId", "Date", "Patient ID", "Doctor ID", "Blood Pressure", "Pulse", "Temperature"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEncountersList);

        btnDelete.setBackground(new java.awt.Color(102, 255, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSearchEnctounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSearchEnctounter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchEncounter, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 711, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchEncountersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchEncountersActionPerformed

    private void btnSearchEncounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEncounterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchEncounterActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:

        //        int selectedRowIndex = tblEmployeeList.getSelectedRow();
        //
        //        if(selectedRowIndex<0){
            //            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            //            return;
            //        }
        //
        //        DefaultTableModel model = (DefaultTableModel) tblEmployeeList.getModel();
        //        Employee selectedEmployee = (Employee) model.getValueAt(selectedRowIndex,0 );
        //        employeeList.deleteEmployee(selectedEmployee);
        //
        //        JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
        //
        //        populateEmployeeTable();
        //        txtTeamInfo.setText("");
        //        txtCellPhoneNumber.setText("");
        //        txtEmailAddress.setText("");
        //        lblDisplayPhoto.setIcon(null);
    }//GEN-LAST:event_btnDeleteActionPerformed
private void populateEncountersData() {
        try{
   
            var patients = patientDirectory.getPatients();
            DefaultTableModel model = new DefaultTableModel(new Object[]{ "PatientID","EncounterID" ,"Encounter Date", "PatientName","DoctorID","Date Of Vitals", "Blood Pressure","Pulse","Temperature"}, 0);
            if(patients!=null && !patients.isEmpty())
            {
                
                for(Patient patient: patients){
                    int patientId=0;
                    int doctorId =0;
                    int encounterId =0;
                    String encounterDate = null;
                    String dateOfVitals = null;
                    String patientName=patient.getName();
                    
                    int bloodpressure = 0;
                    int pulse =0;
                    int temperature =0;
                    
                    System.out.println(patient.getPatientHistoryMap().entrySet());
                    
                    for (Map.Entry<Integer, EncounterHistory> pair : patient.getPatientHistoryMap().entrySet())
                    {
                        patientId= pair.getKey();       
                        
                        ArrayList<Encounter> encounters = pair.getValue().getPatientEncounterHistory();
                        
                        for(Encounter e: encounters){
                            encounterId = e.getEncounterId();
                         
                            VitalSigns vitalSigns = null;  
                            doctorId = e.getDoctorId();
                            Map<Date, VitalSigns> vitalSignMap = e.getPatientEncounter();
                            
                            for(Map.Entry m: vitalSignMap.entrySet()){  
                                            
                                 try {
                                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                    encounterDate = simpleDateFormat.format((Date)m.getKey());
                                } catch (Exception ex) {
                                    System.out.println("Date is null");
                                    System.out.println(ex);
                                }
                                
                                vitalSigns = (VitalSigns) m.getValue();
                            }

                            try {
                                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                                dateOfVitals = simpleDateFormat.format(vitalSigns.getDateOfVitals());
                             
                            } catch (Exception ex) {
                               System.out.println("Date is null");
                            }
                            
                            bloodpressure = vitalSigns.getBloodPressure();
                            pulse = vitalSigns.getPulse();
                            temperature = vitalSigns.getTemperature();
                            
                            model.addRow(new Object[]
                            {patientId,encounterId,encounterDate,patientName,doctorId,dateOfVitals,bloodpressure,pulse,temperature});
                            
                        }
                        
                    } 
             
                }
                
            tblEncountersList.setModel(model);
            }
            
        
        }
        catch(Exception e){
            System.out.println(e);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchEncounter;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearchEnctounter;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblEncountersList;
    private javax.swing.JTextField txtSearchEncounters;
    // End of variables declaration//GEN-END:variables
}
