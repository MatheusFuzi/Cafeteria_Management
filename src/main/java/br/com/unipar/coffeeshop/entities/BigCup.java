/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.entities;

import br.com.unipar.coffeeshop.Contractors.OrderSize;

/**
 *
 * @author Matheus
 */
public class BigCup implements OrderSize{

    private final double CUP_SIZE_COST = 0.35; 
    
    @Override
    public double calculate(double drink) {
        return drink + (drink * CUP_SIZE_COST);
    }
       
}
