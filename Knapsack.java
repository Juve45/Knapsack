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
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("saa");
        
        
    }
    
      @Override
          public String toString()
        {
            int i;
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(new StringBuilder ("Capacitate: "));
            stringBuilder.append(new StringBuilder (this.capacity));
            stringBuilder.append(new StringBuilder ("; "));
            for(i=0;i<=itemList.size();i++)
            {
                 stringBuilder.append(new StringBuilder (itemList.get(i).getName()));
                 stringBuilder.append(new StringBuilder ("; "));
            }
            
            
        return stringBuilder.toString();
        
        }
}
