/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.Contractors;

import br.com.unipar.coffeeshop.entities.Coffe;
import br.com.unipar.coffeeshop.entities.CoffeeWithMilk;
import br.com.unipar.coffeeshop.entities.MilkWithChocolate;
import br.com.unipar.coffeeshop.entities.PannaExpress;

/**
 *
 * @author Matheus
 */
public enum Drink {
   COFFE{
       @Override
       public OrderDrink getDrink(float drink){
           return new Coffe();
       } 
   },
   COFFEWITHMILK{
       @Override
        public OrderDrink getDrink(float drink){
           return new CoffeeWithMilk();
       }
   },
   MILKWITHCHOCOLATE{
       @Override
        public OrderDrink getDrink(float drink){
           return new MilkWithChocolate();
       }
   },
   PANNAEXPRESS{
        @Override
        public OrderDrink getDrink(float drink){
           return new PannaExpress();
       }
   };
   public abstract OrderDrink getDrink(float drink);
}
