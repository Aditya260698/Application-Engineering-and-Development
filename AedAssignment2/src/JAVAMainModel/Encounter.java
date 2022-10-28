/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adity
 */
public class Encounter {
    
    private int encounterId;
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
}
