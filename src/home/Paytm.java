package home;

public class Paytm implements PaymentMode{

    String name;
    String pasword;

    public Paytm(String uname,String upassword){
        this.name=name;
        this.pasword=upassword;
    }
    @Override
    public void pay(int amount) {
        String amount_in_string="$"+String.valueOf(amount);
        MyUtils.log("PAYTM PAYMENT MODE","amount "+amount_in_string+" payment success!!" );
        
    }
    
}
