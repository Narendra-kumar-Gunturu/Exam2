/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author Narendra Kumar Gunturu
 */
import java.util.*;
public class AddingOb
{
	public static void main(String[] args) {
	    Loan loan = new Loan("ABC123",234500.0,2.8);
	    Circle circle = new Circle(2.5);
	    Date date = new Date();
	    ArrayList<Object> list = new ArrayList <Object>();
	    list.add(loan);
	    list.add(date);
	    list.add(circle);
	    for(int i=0;i<(list.size());i++)
	    {
	        System.out.println(list.get(i).toString() + "\n");
	    }
		
	}
}

class Loan
{
    String AccountNo;
    double amount;
    double interest;
    Loan(String AccountNo,double amount, double interest){
        this.AccountNo = AccountNo;
        this.amount = amount;
        this.interest = interest;
        
    }
    public String toString()
    {
        return AccountNo + " " + amount + " " + interest;
        
    }
}

class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
   public  String toString()
    {
       return radius+""; 
    }
}
