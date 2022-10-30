/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Aditya
 */
public class Doctor extends Person{
    
    private int doctorId;
    private Date practicingFrom;
    private DoctorSpecialization doctorSpecialization;

    public Doctor(String name, long cellPhoneNumber, String emailId, int age, String gender, House house,int doctorId,Date practicingFrom,DoctorSpecialization doctorSpecialization, String password) {
        super(name, cellPhoneNumber, emailId, age, gender, house,password);
        this.doctorId = doctorId;
        this.practicingFrom = practicingFrom;
        this.doctorSpecialization = doctorSpecialization;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public Date getPracticingFrom() {
        return practicingFrom;
    }

    public void setPracticingFrom(Date practicingFrom) {
        this.practicingFrom = practicingFrom;
    }

    public DoctorSpecialization getDoctorSpecialization() {
        return doctorSpecialization;
    }

    public void setDoctorSpecialization(DoctorSpecialization doctorSpecialization) {
        this.doctorSpecialization = doctorSpecialization;
    }
    
}
