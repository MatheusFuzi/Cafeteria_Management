/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.entities;

import br.com.unipar.coffeeshop.Contractors.OrderAdditional;
import br.com.unipar.coffeeshop.Contractors.OrderDrink;

/**
 *
 * @author Matheus
 */
public class Cookie implements OrderAdditional{

    private final double ADDITIONAL_COST = 0.90;
    
    @Override
    public double calculate(int quantitie, float drink) {
        return drink += quantitie * ADDITIONAL_COST;
    }
    
}
