/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.ArrayList;

/**
 *
 * @author alexandru
 */
public class Solution {
    ArrayList<Item> tookItems;
    int weight;
    public Solution()
    {
        tookItems = new ArrayList<>();
        weight = 0;
    }
    
    public void addItem(Item it)
    {
        tookItems.add(it);
        weight += it.getWeight();
    }
    
    public int weight()
    {
        return weight;
    }
    
}
