/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package knapsack;

/**
 *
 * @author alexandru
 */
public interface Item extends Comparable {
    public double getProfitFactor();
    public String getName();
    public int getValue();
    public int getWeight();
    
}
