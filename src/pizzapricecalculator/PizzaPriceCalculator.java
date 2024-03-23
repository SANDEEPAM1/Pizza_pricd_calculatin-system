/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzapricecalculator;

/**
 *
 * @author Acer
 */
public class PizzaPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Pizza p1 = new Pizza (false);
        p1.addExtraChees();
        p1.addExtraTopping();
        p1.takeAway();
        p1.getBill();*/
       
       
       VipPizza vp =  new VipPizza(true);
       vp.takeAway();
       vp.getBill();
       
       
    }
    
}
