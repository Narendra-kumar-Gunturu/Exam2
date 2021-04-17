/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side");
        double s = scanner.nextDouble();
        System.out.println("Enter the second side");
        double s2 = scanner.nextDouble();
        System.out.println("Enter the third side");
        double s3 = scanner.nextDouble();
        System.out.println("Enter the color side");
        String color = scanner.next();
       System.out.println("Enter if triangle is filled");
        boolean bol = scanner.nextBoolean();
        Triangle triangle = new Triangle(s,s2, s3, color, bol );
        
        System.out.println("The area of Triangle is: " +Math.round(triangle.area() * 100.00) / 100.00);
        System.out.println("The perimeter of Triangle is: " +triangle.perimeter());
        System.out.println("The Traingle is of color " + triangle.getColor());
        System.out.println("The Triangle is Filled: " +triangle.getIsFilled());
    }
    
}
