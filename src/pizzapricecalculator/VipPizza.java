/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzapricecalculator;

/**
 *
 * @author Acer
 */
public class VipPizza extends Pizza {
   
    
    public VipPizza(boolean veg){
        super(veg);
        super.addExtraChees();
        super.addExtraTopping();
        System.out.println("you are buying a Vip Pizza");
    }
    @Override
    public void addExtraChees(){
        
    }
    @Override
    public void addExtraTopping(){
        
    }
    
    
}
