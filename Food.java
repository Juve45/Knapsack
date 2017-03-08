/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

/**
 *
 * @author ada
 */
public class Food extends AbstractItem implements Item {

    String name;
    int Weight;
    int value;

    public Food(String name, int weight, int value) {
        super(name, weight, value);
    }
    
}
