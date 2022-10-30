/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class EncounterHistory {
    private ArrayList<Encounter> patientEncounterHistory = new ArrayList<>();

    public ArrayList<Encounter> getPatientEncounterHistory() {
        return patientEncounterHistory;
    }

    public void setPatientEncounterHistory(Encounter patientEncounter) {
        this.patientEncounterHistory.add(patientEncounter);
    }
    
    @Override
    public String toString() {
        return "EncounterHistory{" + "patientEncounterHistory=" + patientEncounterHistory + '}';
    }
}
