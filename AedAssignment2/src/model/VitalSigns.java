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
public class VitalSigns {
    private int bloodPressure;
    private int pulse;
    private int temperature;
    private Date dateOfVitals;

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Date getDateOfVitals() {
        return dateOfVitals;
    }

    public void setDateOfVitals(Date dateOfVitals) {
        this.dateOfVitals = dateOfVitals;
    }
}