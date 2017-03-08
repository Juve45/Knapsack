/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author alexandru
 */
public class Knapsack {

    private int capacity;
    private ArrayList<Item> itemList;
    /**
     * @param args the command line arguments
     * items, capacity, constructor
     */
       
    public Knapsack(int __capacity) {
        capacity = __capacity;
    }

    @Override
    public String toString()
    {
        return "a";
    }
    
    public void sortItem()
    {
        Collections.sort(itemList);
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public void addItem(Item item)
    {
        itemList.add(item);
    }
    
    public ArrayList<Item> getItemList()
    {
        return itemList;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("saa");
        Knapsack k = new Knapsack(5);
        
        
        
        
        k.sortItem();
        
        
        
    }
    
}
