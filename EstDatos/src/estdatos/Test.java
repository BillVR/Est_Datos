/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos;

/**
 *
 * @author auxiliar
 */
public class Test {
    
    public static void main(String [] args){
        Pila p = new Pila();
        
        p.create(10);
        
        System.out.println(p.isEmpty());
        System.out.println(p.isFull());
        
        System.out.println(p.getTop());

        p.pop();
    }
    
}
