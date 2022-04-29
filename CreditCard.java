public class CreditCard extends Payment{
    private String nameOnCard;
    private String numberOnCard;
    private String expiryDate;
    private int cvv;

    public CreditCard(String paymentType, String nameOnCard, String numberOnCard, String expiryDate, int cvv){
        super(paymentType);
        this.nameOnCard = nameOnCard;
        this.numberOnCard = numberOnCard;
        this.expiryDate = expiryDate;
        this.cvv = cvv;

    }

    public void makePayment(){

	}
}
