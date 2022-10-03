/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author adityapande
 */
public class Employee {
    private String Name; 
    private int Employee_ID;
    private int Age; 
    private String Gender; 
    private Date Start_date; 
    private String Level; 
    private String Team_info; 
    private String Position_title;
    private long Phone_Number;
    private String Email;
    private ImageIcon pic;

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }
    public String getName() {
        return Name;
    }

    public int getEmployee_ID() {
        return Employee_ID;
    }

    public int getAge() {
        return Age;
    }

    public String getGender() {
        return Gender;
    }

    public Date getStart_date() {
        return Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public String getTeam_info() {
        return Team_info;
    }

    public String getPosition_title() {
        return Position_title;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmployee_ID(int Employee_ID) {
        this.Employee_ID = Employee_ID;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public void setTeam_info(String Team_info) {
        this.Team_info = Team_info;
    }

    public void setPosition_title(String Position_title) {
        this.Position_title = Position_title;
    }

    public long getPhone_Number() {
        return Phone_Number;
    }

    public String getEmail() {
        return Email;
    }

    /**
     *
     * @param Phone_Number
     */
    public void setPhone_Number(long Phone_Number) {
        this.Phone_Number = Phone_Number;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    @Override
    public String toString(){
        return String.valueOf(Employee_ID);
    }

    public void setStart_Date(Date date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getEmployeeId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setStartDate(Date date1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setTeamInfo(String teamInfo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPostitionTitle(String positionTitle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setCellPhoneNumber(long cellPhoneNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPhoto(ImageIcon photo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getStartDate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getTeamInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getPositionTitle() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object getCellPhoneNumber() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Icon getPhoto() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getEmployeeID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
