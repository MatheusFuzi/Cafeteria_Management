/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.Contractors;

import br.com.unipar.coffeeshop.entities.ChocolatePowder;
import br.com.unipar.coffeeshop.entities.CinnamonPowder;
import br.com.unipar.coffeeshop.entities.CondensedMilk;
import br.com.unipar.coffeeshop.entities.Cookie;
import br.com.unipar.coffeeshop.entities.LemonZest;
import br.com.unipar.coffeeshop.entities.PowderedMilk;
import br.com.unipar.coffeeshop.entities.SourCreamIce;

/**
 *
 * @author Matheus
 */
public enum Additional {
    LEMONZEST{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new LemonZest();
        }
    },
    CINNAMONPOWDER{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new CinnamonPowder();
        }    
    },
    PODEREDMILK{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new PowderedMilk();
        }    
    },
    SOURCRAMICE{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new SourCreamIce();
        }    
    },
    CONDENSEDMILK{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new CondensedMilk();
        }
    },
    CHOCOLATEPOWDER{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new ChocolatePowder();
        }   
    },
    COOKIE{
        @Override
        public OrderAdditional getAdditional(float drink){
            return new Cookie();
        }    
    };
    
    public abstract OrderAdditional getAdditional(float drink);
}
