/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narendra Kumar Gunturu
 */
public class Circus {
    public void act() {
        System.out.println("Circus will start soon!!");
        
    }
    }
class Animal extends Circus {
    @Override
    public void act() {
        System.out.println("Animal acts will start soon!!");
        
    }
}
 class Run{
     public static void main(String[] args) {
         Circus c = new Animal();
         c.act();
         c= new Circus();
         c.act();
         
     }
     
 }