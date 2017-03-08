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


    private final int capacity;
    private ArrayList<Item> itemList;
    /**
     * @param args the command line arguments items, capacity, constructor
     */
    
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
    
        
    public void sortItem() {
        Collections.sort(itemList);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("saa");
        Knapsack k = new Knapsack(5);
        
        
        
        
        k.sortItem();
        
        
    Book b1 = new Book("Dragon Rising", 3, 5);
    Book b2 = new Book("A Blade in the Dark", 3, 5);
    Weapon w1 = new Weapon("Ancient Sword", 5, 10);
    Knapsack knapsack = new Knapsack(10);

    knapsack.add (b1, b2);

    knapsack.add (w1);

    System.out.println (knapsack);

    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        int i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new StringBuilder("Capacitate: "));
        stringBuilder.append(new StringBuilder(this.capacity));
        stringBuilder.append(new StringBuilder("; "));
        for(i=0;i<=itemList.size();i++)
            {
                 stringBuilder.append(new StringBuilder("Numele este: "));
                 stringBuilder.append(new StringBuilder (itemList.get(i).getName()));
                  stringBuilder.append(new StringBuilder("greutatea este: "));
                 stringBuilder.append(new StringBuilder (itemList.get(i).getWeight()));
                  stringBuilder.append(new StringBuilder("Valoarea este: "));
                 stringBuilder.append(new StringBuilder (itemList.get(i).getValue()));
                 stringBuilder.append(new StringBuilder ("; "));
            }

        return stringBuilder.toString();

    }
}
