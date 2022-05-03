package home;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){

        List<Product> items=new ArrayList<Product>();

        items.add(new Product("whirlpool_307_280l", 26000));

        items.add(new Product("invertor", 10000));
        
        ShoppingCart  mycart =new ShoppingCart(items);

        mycart.pay(new Paytm("kash", "poplu"));
    }
    
    
}
