/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aditya
 */
public class Person {
    
   private static int personId; 

    public static int getPersonId() {
        return personId;
    }

    public static void setPersonId(int aPersonId) {
        personId = aPersonId;
    }
   private String name;
   private long cellPhoneNumber;
   private String emailId;
   private int age;
   private String gender;
   private House house;
   private String password;

    public Person(String name, long cellPhoneNumber, String emailId, int age, String gender, House house, String password) {
        this.name = name;
        this.cellPhoneNumber = cellPhoneNumber;
        this.emailId = emailId;
        this.age = age;
        this.gender = gender;
        this.house = house;
        this.password = password;
    }
   
   static {
       personId = 1;
   }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
  
}

