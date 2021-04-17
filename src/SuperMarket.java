/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public enum SuperMarket {
    FRUITS(19.99), EGGS(7.69), BREAD(2.99);
    
    private double cost;
    
    private SuperMarket(double cost){
        this.cost = cost;
    }
}