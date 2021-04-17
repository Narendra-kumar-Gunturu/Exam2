/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person person = new Person("Jack", "OverlandPark", "235673478", "jackdog12@gmail.com");
        Student stu = new Student(3.95, "Bobby Thomas", "OverlandPark", "9078901234", "bobtom67@gmail.com");
        Employee emp = new Employee("BusinessAnalytics", 280000.00, "2/24/2019", "Doug", "Hall", "8989765423", "Dougbently@gmail.com");
        Faculty faculty = new Faculty(5.0, 5, "Valky", 150000.00, "06/08/2012", "Hoot", "Wabash", "9751699362", "hoot67@gmail.com");
        Staff staff = new Staff("Advisor", "Career Services", 120000.00, "04/17/2014", "Hannah", "Downtown", "8858426534", "hannahc@gmail.com");

        System.out.println(person.toString());
        System.out.println(stu.toString());
        System.out.println(emp.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }

}
