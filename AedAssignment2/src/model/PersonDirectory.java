/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Aditya
 */
public class PersonDirectory {
    
    /*
    Person Directory contains an ArrayList of all the Person_.
     */
    List<Person> persons = new ArrayList<>();

//    Adding dummy data for testing purpose
    public PersonDirectory() {
        
        House house = new House();
        Community community = new Community();
        Map<String, String> CityCommunityMap = new HashMap<>();
        CityCommunityMap.put("Boston", "Prudential");
        community.setCommunity(CityCommunityMap);
        
        house.setCommunity(community);
        house.setHouseNum(75);
        house.setStreet("Saint Alphonsus Street");
        
        
        
        Person person = new Person("Shreyas",Long.parseLong("8422097015"),"email@gmail.com",29,"Male",house,"Shreyas1100");

        persons.add(person);
    }
    
    public List<Person> getPersonDirectory() {
        return persons;
    }
    
    public void setPersonDirectory(List<Person> persons) {
        this.persons = persons;
    }
    
    public void addNewPerson(Person person)
    {
        persons.add(person);
    }     
        
}
