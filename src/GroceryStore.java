/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class GroceryStore extends Walmart{
    
    
    private double price;
    private int quantity;
    private double tax;
    public GroceryStore(double price, int quantity, double tax) {
        this.price=price;
        this.quantity=quantity;
        this.tax=tax;
    }

    public double priceAfterTax() {
        return price + tax/100.00;
    }
    }
