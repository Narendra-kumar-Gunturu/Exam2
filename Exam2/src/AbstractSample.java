/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class AbstractSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GroceryStore g = new GroceryStore(20.0,2,2.5);
        
        System.out.println("Price after tax " + g.priceAfterTax());
    }
    }
    
