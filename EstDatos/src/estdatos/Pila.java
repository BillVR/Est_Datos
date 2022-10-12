/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estdatos;

/**
 *
 * @author auxiliar
 */
public class Pila {
    
    private int top;
    private Libro[] list;
    
    public Pila(){
        
    }
    
    public void create(int size){
        top = -1;
        list = new Libro[size];
    }
    
    public void push(Libro elemento){
        if (isEmpty()){
            top++;
            list[top] = elemento;
        }
    }
    
    public Libro pop(){
        Libro aux = null;
        if (!isEmpty()){
            aux = list[top];
            list[top] = null;
            top--;
        }      
        return aux;
    }
    
    public void clear(){
        for(int i = 0; i < list.length; i++){
            list[i] = null;
        }
        
    }
    
    public Libro getTop(){
        if (top == -1){
            return null;
        }
        else {
            return list[top];
        }
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == list.length;
    } 
  
}
