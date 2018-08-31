package bankaccountapp;

public class Checking extends Account
{
    // list properties specific to checking account like debit card, pin , 2 as first digit in acount
    private long debitCardNumber;
    private int PIN;


    // Constructor to initialize checking account properties
    public Checking(String name,String SSN,double initDeposit)
    {
        super(name,SSN,initDeposit) ;
        accountNumber='2'+accountNumber;
        setDebitCard();

    }

    @Override
    public void setRate()
    {
        rate=getBaseRate()*0.15;

    }

    // list any methods specific to the checking account

    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE : CHECKING  ");
        super.showInfo();
        System.out.println("Debit Card Number : "+debitCardNumber);
        System.out.println("PIN is : "+PIN);

    }

    private void setDebitCard()
    {
        debitCardNumber=(long)(Math.random()*Math.pow(10,12));
        PIN=(int)(Math.random()*Math.pow(10,4));



    }
}
