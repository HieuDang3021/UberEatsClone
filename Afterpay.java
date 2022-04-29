public class Afterpay extends Payment{
    private String reciever;
    private Double amount;

    public Afterpay(String paymentType, String reciever, double amount){
        super(paymentType);
        this.reciever = reciever;
        this.amount = amount;
    }

    public void makePayment(){

	}
}
