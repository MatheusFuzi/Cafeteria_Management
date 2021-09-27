/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.coffeeshop.runner;

import br.com.unipar.coffeeshop.Contractors.Additional;
import br.com.unipar.coffeeshop.Contractors.CupSize;
import br.com.unipar.coffeeshop.Contractors.Drink;
import br.com.unipar.coffeeshop.Contractors.OrderAdditional;
import br.com.unipar.coffeeshop.Contractors.OrderDrink;
import br.com.unipar.coffeeshop.Contractors.OrderSize;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Main {
    static double total;
    static int selectquantitie = 0;
    static String quantitiedrink;
    static String additionalprint;
    static String quantitieadditional;
    static boolean continuar = false;
    static int returndrink;
    static int returncupsize;
    static int returnadditional;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] DRINKS = {"Caf�","Caf� com Leite","Chocolate com Leite","Caf� Mocha", "Expresso Pana"};
        String[] ADDITIONAL = {"Raspas de lim�o","Canela em p�","Leite em p�(Colher)","sour cream ice(Cubo)", "Leite condensado(Colher)","Chocolate em p�(Colher)","um Cookie","Continuar"};
        String[] CUPSIZE = {"X�cara Grande", "X�cara M�dia","X�cara Normal"};
        returndrink = JOptionPane.showOptionDialog(null, "Escolha o tipo de Bebida desejada: ", "Escolha de Bebida",JOptionPane.WARNING_MESSAGE, 0, null,DRINKS,DRINKS[0]);
        Drink drink = Drink.values()[returndrink];
        OrderDrink orderDrink = drink.getDrink(returndrink);
        total = orderDrink.calculate(1);
        //quantitiedrink = JOptionPane.showInputDialog(null, "Insira quantidade de bebidas"); 
        returncupsize = JOptionPane.showOptionDialog(null, "Escolha o tamanho da bebida: ", "Escolha do tamanho",JOptionPane.WARNING_MESSAGE, 0, null,CUPSIZE,CUPSIZE[0]);
        if (returncupsize != 2){
            CupSize cupsize = CupSize.values()[returncupsize];
            OrderSize OrderSize = cupsize.getCupSize(returncupsize);
            total = OrderSize.calculate(total);
        }
        while(!continuar){
            returnadditional = JOptionPane.showOptionDialog(null, "Escolha os adicionais da bebida: ", "Escolha os adicionais",JOptionPane.WARNING_MESSAGE, 0, null,ADDITIONAL,ADDITIONAL[0]);
            if(returnadditional != 7){
                additionalprint = ((additionalprint == null)?ADDITIONAL[returnadditional]:additionalprint+", "+ADDITIONAL[returnadditional]);
                Additional additional = Additional.values()[returnadditional];
                OrderAdditional orderAdditional = additional.getAdditional(returndrink);
                total = orderAdditional.calculate(total);
            }else{
                continuar = true;
                }
            //quantitieadditional = JOptionPane.showInputDialog(null, "Insira quantidade de Adicionais desejados"); 
        }
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, DRINKS[returndrink]+" "+CUPSIZE[returncupsize]+"\n"+
                                            additionalprint +"\n"+
                                            "O valor total do pedido � R$: " +(df.format(total)));
    
    }
}
