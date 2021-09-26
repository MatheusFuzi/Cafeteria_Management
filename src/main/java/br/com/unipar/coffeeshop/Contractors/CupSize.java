/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.Contractors;

import br.com.unipar.coffeeshop.entities.BigCup;
import br.com.unipar.coffeeshop.entities.MediumCup;
import br.com.unipar.coffeeshop.entities.NormalCup;

/**
 *
 * @author Matheus
 */
public enum CupSize {
   BIGCUP{
    @Override
    public OrderSize getCupSize(double drink){
        return new BigCup();
    }    
   },
   MEDIUMCUP{
    @Override
    public OrderSize getCupSize(double drink){
        return new MediumCup();
    }
   },
   CONTINUAR{
    @Override
    public OrderSize getCupSize(double drink){
        return new NormalCup();
    }   
   };
    public abstract OrderSize getCupSize(double drink);
}
