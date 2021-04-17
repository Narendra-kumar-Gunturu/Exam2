/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Student extends Person{
    
    private double grade;
    private static final String STATUS = "Graduate";

    public Student(double grade, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + getName();
    }
    
}

