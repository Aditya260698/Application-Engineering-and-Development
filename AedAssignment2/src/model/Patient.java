/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aditya
 */
public class Patient extends Person{

    private int patientId;
    private float height;
    private float weight;
    
    private Map<Integer,EncounterHistory> patientHistoryMap=new HashMap<>();
    

    public Patient(String name, long cellPhoneNumber, String emailId, int age, String gender, House house, int patiendId, float height, float weight, String password) {
        super(name,cellPhoneNumber,emailId,age,gender,house, password);
        this.patientId =  patiendId;
        this.height = height;
        this.weight = weight;
        
    }    

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

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public Map<Integer,EncounterHistory> getPatientHistoryMap() {
        return patientHistoryMap;
    }

    public void setPatientHistoryMap(Map<Integer,EncounterHistory> patientHistoryMap) {
        this.patientHistoryMap = patientHistoryMap;
    }
    
    @Override
    public String toString(){
        return String.valueOf(patientId);
    } 

}
