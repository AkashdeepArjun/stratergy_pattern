package home;

public class Product {

    private String id;
    private int price;
    public Product(String id,int price){
        this.id=id;
        this.price=price;
    }

    public String getId(){
        return this.id;
    }
    public int getPrice(){
        return this.price;
    }
    
}
