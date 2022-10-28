/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

/**
 *
 * @author adity
 */
public class Person {
    
   private static int personId; 
   private String PersonName;
   private long MobileNumber;
   private String email;
   private int age;
   private String sex;
   private House house;

    public Person(String name, long cellPhoneNumber, String emailId, int age, String gender, House house) {
        this.PersonName = name;
        this.MobileNumber = cellPhoneNumber;
        this.email = emailId;
        this.age = age;
        this.sex = gender;
        this.house = house;
    }
   
   static {
       personId = 1;
   }
   
    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String name) {
        this.PersonName = name;
    }

    public long getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(long cellPhoneNumber) {
        this.MobileNumber = cellPhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailId) {
        this.email = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String gender) {
        this.sex = gender;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
