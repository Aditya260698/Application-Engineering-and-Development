/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVAMainModel;

import java.util.Date;

/**
 *
 * @author adity
 */
public class Doctor extends Person {
    private int docId;
    private DoctorSpecialization doctorSpecialization;
    private Date practicingFrom;

    public Doctor(String name, long cellPhoneNumber, String emailId, int age, String gender, House house,int doctorId,Date practicingFrom,DoctorSpecialization doctorSpecialization) {
        super(name, cellPhoneNumber, emailId, age, gender, house);
        this.docId = doctorId;
        this.practicingFrom = practicingFrom;
        this.doctorSpecialization = this.doctorSpecialization;
    }

    public int getDoctorId() {
        return docId;
    }

    public void setDoctorId(int doctorId) {
        this.docId = doctorId;
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
