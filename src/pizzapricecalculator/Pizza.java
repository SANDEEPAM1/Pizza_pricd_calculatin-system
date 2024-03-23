/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzapricecalculator;

/**
 *
 * @author Acer
 */
public class Pizza {
    private boolean veg;
    private int price = 0;
    
    private int vegPrice = 300;
    private int nonVegPrice = 400;
    private int extraCheesPrice = 100;
    private int extraToppingPrice = 200;
    private int takeAwayPrice = 50;
    
    private boolean isExtraChees;
    private boolean isExtraTopping;
    private boolean isTakeAway;
    
     public Pizza(boolean veg){
         this.veg = veg;
         
         if( this.veg){
             System.out.println("the price is vegitable pizza");
             this.price = this.vegPrice;
             
         }else{
             System.out.println("the price is non vegitable pizza");
             this.price = this.nonVegPrice;
             
         }
         
         
}
   public void addExtraChees (){
       isExtraChees = true;
    this.price += extraCheesPrice;
   
       
} 
   
   public void addExtraTopping() {
       isExtraTopping = true;
    this.price += extraToppingPrice;
       
    
}
   public void takeAway(){
       isTakeAway = true;
       this.price += takeAwayPrice;
      
       
   }
   public void getBill(){
       
      String bill="";
       if(isExtraChees){
           bill +="Extra Chees added:" +extraCheesPrice+ "\n";
           
       }
       if(isExtraTopping){
         bill +="Extra Topping added:" +extraToppingPrice+ "\n";
       }
       
       if(isTakeAway){
           bill +="Packing  added:" +takeAwayPrice+ "\n";
       }
       
       System.out.println(bill+="the total price is " +this.price);
       
   }
           
   
}
