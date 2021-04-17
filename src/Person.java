/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Person {
    
    private String name;
    private String add;
    private String phNum;
    private String emailadd;

    public Person(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.add = address;
        this.phNum = phoneNumber;
        this.emailadd = email;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString(){
        return "Class Name: " + getClass().getName() + ", Person Name: " + name;
    }
    
    
}