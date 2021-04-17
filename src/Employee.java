/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Employee extends Person{
    
    private String off;
    private double sal;
    private String dateH;

    public Employee(String office, double salary, String dateHired, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.off = office;
        this.sal = salary;
        this.dateH = dateHired;
    }
    
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }
    
    
}