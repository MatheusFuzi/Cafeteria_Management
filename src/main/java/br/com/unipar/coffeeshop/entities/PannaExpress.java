/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.entities;

import br.com.unipar.coffeeshop.Contractors.OrderDrink;

/**
 *
 * @author Matheus
 */
public class PannaExpress  implements OrderDrink{
    
    private final double DRINK_COST = 4.50;
    
    @Override
    public double calculate(int drink){
        return drink * DRINK_COST;
    }
    
}
