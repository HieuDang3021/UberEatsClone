public class Paypal extends Payment{
    private String email;
    private int phoneNo;


    public Paypal(String paymentType, String email, int phoneNo){
        super(paymentType);
        this.email = email;
        this.phoneNo = phoneNo;

    }

    public void makePayment(){

	}

}

