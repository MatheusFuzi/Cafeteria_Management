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
public class NormalCup implements OrderSize {

    @Override
    public double calculate(double drink) {
        return drink;
    }    
}
