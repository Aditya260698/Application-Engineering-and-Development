/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adity
 */
class Patient extends Person {
    private int patientId;
    private float height;
    private float weight;
    

    public Patient(String name, long cellPhoneNumber, String emailId, int age, String gender, House house, int patiendId, float height, float weight) {
        super(name,cellPhoneNumber,emailId,age,gender,house);
        this.patientId =  patiendId;
        this.height = height;
        this.weight = weight;
    }
    
    Map<Integer,EncounterHistory> patient=new HashMap<>();


    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    public Map<Integer, EncounterHistory> getPatient() {
        return patient;
    }

    public void setPatient(Map<Integer, EncounterHistory> patient) {
        this.patient = patient;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }
}
