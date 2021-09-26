/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.entities;

import br.com.unipar.coffeeshop.Contractors.OrderAdditional;

/**
 *
 * @author Matheus
 */
public class LemonZest implements OrderAdditional{

    private final double ADDITIONAL_COST = 0.50;
    
    @Override
    public double calculate(int quantitie, float drink) {
        return drink += quantitie * ADDITIONAL_COST;
    }
    
}
