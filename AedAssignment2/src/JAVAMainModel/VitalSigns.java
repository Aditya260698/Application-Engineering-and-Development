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
class VitalSigns {
    private int BP;
    private int pulse;
    private int temp;
    private Date dateOfVitals;

    public int getBP() {
        return BP;
    }

    public void setBP(int BP) {
        this.BP = BP;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {
        this.pulse = pulse;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public Date getDateOfVitals() {
        return dateOfVitals;
    }

    public void setDateOfVitals(Date dateOfVitals) {
        this.dateOfVitals = dateOfVitals;
    }

    
}
