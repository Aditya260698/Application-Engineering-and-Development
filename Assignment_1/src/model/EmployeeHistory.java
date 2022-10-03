/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author adityapande
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> history;
    
    public EmployeeHistory(){
        this.history = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getHistory() {
        return history;
    }
    public void setHistory(ArrayList<Employee> history) {
        this.history = history;
    }
    public Employee addEmployee(){
        Employee e = new Employee();
        history.add(e);
        return e;
        
    }

    /**
     *
     * @param e
     */
    public void deleteEmployee(Employee e){
        history.remove(e);
    }

//    public Iterable<Employee> getEmployeeList() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//    public Iterable<Employee> gethistory() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
