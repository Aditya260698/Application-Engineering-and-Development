/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aditya
 */
public class Encounter {
    
    private int encounterId;
     private int doctorId;
    private Map<Date, VitalSigns> patientEncounter = new HashMap<>();

    public Map<Date, VitalSigns> getPatientEncounter() {
        return patientEncounter;
    }

    public void setPatientEncounter(Map<Date, VitalSigns> patientEncounter) {
        this.patientEncounter = patientEncounter;
    }

    public int getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(int encounterId) {
        this.encounterId = encounterId;
    }
    
    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    @Override
    public String toString() {
        return "Encounter{" + "encounterId=" + encounterId + ", doctorId=" + doctorId + ", patientEncounter=" + patientEncounter + '}';
    }
}
