/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class One {
    private int a;
    public One(int in){
        a = in;
    }
    public int guess (int x){
        System.out.println("One guess " + x);
        return a + x;
    }
    
    public int apply (int x){
        System.out.println("One guess " + x);
        return guess(x + 3);
    }
} // end class One
