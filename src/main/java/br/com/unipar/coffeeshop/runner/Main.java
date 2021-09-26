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
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class Main {
    static double total;
    static int selectquantitie = 0;
    static String quantitiedrink;
    static String quantitieadditional;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] DRINKS = {"Café","Café com Leite","Chocolate com Leite","Café Mocha", "Expresso Pana"};
        String[] ADDITIONAL = {"Raspas de limão","Canela em pó","Leite em pó","Gelo de creme de leite", "Leite condensado","Cocolate em pó","Cookie"};
        String[] CUPSIZE = {"Copo Grande", "Copo Médio","Copo Normal"};
        int returndrink = JOptionPane.showOptionDialog(null, "Escolha o tipo de Bebida desejada: ", "Escolha de Bebida",JOptionPane.WARNING_MESSAGE, 0, null,DRINKS,DRINKS[0]);
        Drink drink = Drink.values()[returndrink];
        OrderDrink orderDrink = drink.getDrink(returndrink);
        quantitiedrink = JOptionPane.showInputDialog(null, "Insira quantidade de bebidas"); 
        int returncupsize = JOptionPane.showOptionDialog(null, "Escolha o tamanho da bebida: ", "Escolha do tamanho",JOptionPane.WARNING_MESSAGE, 0, null,CUPSIZE,CUPSIZE[0]);
        CupSize cupsize = CupSize.values()[returncupsize];
        OrderSize OrderSize = cupsize.getCupSize(returncupsize);
        int returnadditional = JOptionPane.showOptionDialog(null, "Escolha o tamanho da bebida: ", "Escolha do tamanho",JOptionPane.WARNING_MESSAGE, 0, null,ADDITIONAL,ADDITIONAL[0]);
        Additional Additional = Additional.values()[returnadditional];
        quantitieadditional = JOptionPane.showInputDialog(null, "Insira quantidade de Adicionais desejados"); 
        OrderAdditional orderAdditional = Additional.getAdditional(quantitieadditional, returndrink);
        try{
            selectquantitie = Integer.parseInt(quantitiedrink);
            total = orderDrink.calculate(selectquantitie);
            total = OrderSize.calculate(total);
            JOptionPane.showMessageDialog(null, "O valor total do pedido é R$: " + total);
        }catch(Exception EX){
            JOptionPane.showMessageDialog(null, "Digite somente números", "Atenção",JOptionPane.WARNING_MESSAGE);
        }
        
                }
    
}
