/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

import java.util.ArrayList;

/**
 *
 * @author adity
 */
public class EncounterHistory {
    private ArrayList<Encounter> patientEncounterHistory = new ArrayList<>();

    public ArrayList<Encounter> getPatientEncounterHistory() {
        return patientEncounterHistory;
    }

    public void setPatientEncounterHistory(Encounter patientEncounterHistory) {
        this.patientEncounterHistory.add(patientEncounterHistory);
    }
}
