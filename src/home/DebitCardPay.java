package home;

public class DebitCardPay implements PaymentMode {

    String name_of_holder;
    String card_number;
    String cvv;
    String date_of_expiry;

    public DebitCardPay(String name_of_holder,String card_number,String cvv,String doe){
        this.name_of_holder=name_of_holder;
        this.card_number=card_number;
        this.cvv=cvv;
        this.date_of_expiry=doe;
    }
    @Override
    public void pay(int amount) {
        String amount_in_string="$"+String.valueOf(amount);
        MyUtils.log("DEBIT CARD PAYMENT MODE","amount "+amount_in_string+" payment success!!" );
        
    }
    
}
