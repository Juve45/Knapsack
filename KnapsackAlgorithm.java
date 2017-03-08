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
public class KnapsackAlgorithm implements Algorithm{
    Knapsack knapsack;

    public KnapsackAlgorithm(Knapsack k) {
        knapsack = k;
    }
    
    public Solution solve()
    {
        Solution sol = new Solution();
        for(Item ai : knapsack.getItemList())
        {
            if(sol.weight() + ai.getWeight() > knapsack.getCapacity()) continue;
            sol.addItem(ai);
        }
        return sol;
    }
    
}
