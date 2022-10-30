/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Aditya
 */
public class Community {
    
    EnumMap<City, String[]> LstCommunity = new EnumMap<>(City.class);
    Map<String, String> Community = new HashMap<>();
    
    public EnumMap<City, String[]> getLstCommunity() {
        return LstCommunity;
    }

    public void setLstCommunity() {
        LstCommunity.put(City.NewYork, new String[]{"Brooklyn", "Manhattan", "Queens", "Bronx", });
        LstCommunity.put(City.Boston, new String[]{"Northeastern University", "Prudential", "Arlington", "Cambridge"});
        
        LstCommunity.put(City.Austin, new String[]{"Downtown", "Caldwell", "Williamson"});
        
    }

    public Map<String, String> getCommunity() {
        return Community;
    }

    public void setCommunity(Map<String, String> Community) {
        this.Community = Community;
    }
}
