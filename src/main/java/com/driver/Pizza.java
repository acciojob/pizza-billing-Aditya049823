package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;



    boolean cheeseAdded;
    boolean toppingAdded;
    boolean bagAdded;

    boolean isbillCreated;
    private int toppingPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg)
        {
            this.price=300;
            this.toppingPrice=70;
        }
        else
        {
            this.price=400;
            this.toppingPrice=120;
        }
        this.bill="Base Price Of The Pizza:"+ this.price +"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (!cheeseAdded) {
            this.price += 80;
            this.cheeseAdded = true;
        }
    }

    public void addExtraToppings() {
            // your code goes here
            if (!toppingAdded) {
                this.price += this.toppingPrice;
                this.toppingAdded = true;
            }
        }

    public void addTakeaway() {
                // your code goes here
                if (!bagAdded) {
                    this.price += 20;
                    this.bagAdded = true;
                }
            }

    public String getBill(){
        // your code goes here
        if(!isbillCreated) {
            if (cheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (toppingAdded) {
                this.bill += "Extra Toppings Added:" + this.toppingPrice + "\n";
            }
            if (bagAdded) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price:" + this.price + "\n";
            this.isbillCreated=true;
            return this.bill;
        }
        return "";
    }
}
