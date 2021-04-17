/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Triangle extends GeometricObject {

    private double sd1;
    private double sd2;
    private double sd3;
    private String cl;
    private boolean filled;

    public Triangle(double side1, double side2, double side3, String color, boolean isFilled) {
        this.sd1 = side1;
        this.sd2 = side2;
        this.sd3 = side3;
        this.cl = color;
        this.filled = isFilled;
    }
    
      public String getColor() {
        return cl;
    }

    public boolean getIsFilled() {
        return filled;
    }

    @Override
    public double area() {
        double peri = perimeter();
        
        return Math.sqrt(peri * (peri - sd1) * (peri - sd2) * (peri - sd3));
    }

    @Override
    public double perimeter() {
        return sd1 + sd2 + sd3;
    }
}
