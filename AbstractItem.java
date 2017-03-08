/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import sun.security.krb5.internal.rcache.AuthList;

/**
 *
 * @author alexandru
 */
public class AbstractItem implements Item{

    private String name;
    private int weight;
    private int value;

    public AbstractItem(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
    }
    
  public void  setName(String name) {
        this.name = name;
        
    }
  public void setWeight( int weight) {
         this.weight = weight;

    }
   public void setValue(int value) {
    
        this.value = value;
    }
    public String  getName() {
        return this.name ;
        
    }
  public int getWeight() {
         return this.weight;

    }
   public int getValue() {
    
        return this.value;
    }
   getProfitFactor(this.weight,this.value);

}
