package home;

import java.util.List;

public class ShoppingCart {

    List<Product> items;

    public ShoppingCart(List<Product> items){

        this.items=items;
    }

    public void addItem(Product item){
        this.items.add(item);
    }

    public void removeItem(Product item){

        this.items.remove(item);
    }

    public int genBill(){
        int sum=0;
        for(Product item:this.items){
            sum+=item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentMode pay_mode){
        int amount =genBill();
        pay_mode.pay(amount);
    }
    
}
