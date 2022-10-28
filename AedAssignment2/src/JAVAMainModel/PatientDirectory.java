/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author adity
 */
public class PatientDirectory {
    
    private Set<Patient> patients = new HashSet<>();
    
    public PatientDirectory() {
       House house = new House();
       Community community = new Community();
                    
       house.setAptNum(75);
       house.setStreetAddress("75 Saint Aphonsus Street");
                    
       Map<String,String>communities=new HashMap<>();
       communities.put("Boston","Northeastern University");
       community.setCommunity(communities);
       house.setCommunity(community);
        
        Patient patient=new Patient("Aditya",Long.parseLong("8877665512"),"aditya@gmail.com",20,"Male",house,2554,Float.parseFloat("6.5"),88);
        EncounterHistory encounterHistory=new EncounterHistory();
        Encounter encounter=new Encounter();
        
        VitalSigns vitalSign_1=new VitalSigns();
        vitalSign_1.setBP(100);
        vitalSign_1.setPulse(50);
        vitalSign_1.setTemp(102);
        vitalSign_1.setDateOfVitals(new Date());
        
        VitalSigns vitalSigns_2=new VitalSigns();
        vitalSigns_2.setBP(130);
        vitalSigns_2.setPulse(80);
        vitalSigns_2.setTemp(105);
        vitalSigns_2.setDateOfVitals(new Date());  
        
        Map<Date,VitalSigns> EncounterMap=new HashMap<>();
        
        EncounterMap.put(new Date(), vitalSign_1);
        encounter.setPatientEncounter(EncounterMap);
        
        EncounterMap.put(new Date(), vitalSigns_2);
        encounter.setPatientEncounter(EncounterMap);
        
        encounterHistory.setPatientEncounterHistory(encounter);
        Map<Integer,EncounterHistory> encounterHistoryMapping =new HashMap<>();
        encounterHistoryMapping.put(1234, encounterHistory);
        patient.setPatient(encounterHistoryMapping);
        
        patients.add(patient);
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }
    
    public void addNewPatient(Person patient)
    {
        patients.add((Patient) patient);
    }  
    
    
}
