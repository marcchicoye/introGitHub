/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package certification;
/**
 *
 * @author Marc
 */
public class Child extends Parent{
    public static void main(String[] args){
        System.out.println("x is");
        
        Child c = new Child();
        c.doIt();
    }
    
    public void doIt(){
        System.out.println("x =" + x);
    }
    
}