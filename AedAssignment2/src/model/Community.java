/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
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

    public Community() {
        this.LstCommunity = new EnumMap<>(City.class);
        setLstCommunity();
    }
    
    public String[] getCommunityListFromCity(City city){
        return LstCommunity.get(city);
    }
    
    public void addToLstCommunity(City city, String community){
        String[] existingCommunities = getCommunityListFromCity(city);
        ArrayList<String> newCommunities = new ArrayList<String>(); 
        newCommunities.addAll(Arrays.asList(existingCommunities));
        newCommunities.add(community);
        String[] newCommunitiesArr = new String[newCommunities.size()];
        for (int i = 0; i < newCommunities.size(); i++) {
            newCommunitiesArr[i] = newCommunities.get(i);
        }
        LstCommunity.replace(city, existingCommunities, newCommunitiesArr);
       
    }

    public void setLstCommunity() {
        LstCommunity.put(City.NewYork, new String[]{"Brooklyn", "Manhattan", "Queens", "Bronx", });
        LstCommunity.put(City.Boston, new String[]{"Northeastern University", "Prudential", "Arlington", "Cambridge"});
        LstCommunity.put(City.SouthernCalifornia, new String[]{"Los Angeles", "Santa Barbara", "San Diego"});
        LstCommunity.put(City.Austin, new String[]{"Downtown", "Caldwell", "Williamson"});
    }

    public Map<String, String> getCommunity() {
        return Community;
    }

    public void setCommunity(Map<String, String> Community) {
        this.Community = Community;
    }
}
