/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Aditya
 */
public class DoctorDirectory {
    private Set<Doctor> doctors = new HashSet<>();
    public DoctorDirectory() {
        
        House house = new House();
        Community community = new Community();
                    
        house.setHouseNum(75);
        house.setStreet("Saint Aphonsus Street");
                    
        Map<String,String>communities=new HashMap<>();
        communities.put("Boston","Northeastern University");
        community.setCommunity(communities);
        house.setCommunity(community);
       
        Doctor d = new Doctor("Shreyas",Long.parseLong("8422097015"), "tg@g.com", 22, "Male", house, 1989, new Date(), DoctorSpecialization.DiagnosticRadiology,"s11");
       
        this.doctors.add(d);
    }

    public Set<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }
    
    public void addNewDoctor(Person doctor)
    {
        doctors.add((Doctor) doctor);
    }
    
}
