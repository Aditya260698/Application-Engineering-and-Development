/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Aditya
 */
public class HospitalDirectory {
    
    private Set<Hospital> hospitals = new HashSet<>();

    public Set<Hospital> getHospitals() {
        return hospitals;
    }
    
    public void setHospitals(Hospital hospital) {
        this.hospitals.add(hospital);
    }

}
