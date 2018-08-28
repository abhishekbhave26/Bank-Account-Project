package bankaccountapp;

public class Checking extends Account
{
    // list properties specific to checking account like debit card, pin , 2 as first digit in acount
    int debitCardNumber,PIN;


    // Constructor to initialize checking account properties
    public Checking(String name,String SSN,double initDeposit)
    {
        super(name,SSN,initDeposit) ;
        accountNumber='2'+accountNumber;


    }

    // list any methods specific to the checking account

    public void showInfo()
    {
        super.showInfo();
        System.out.println("ACCOUNT TYPE : CHECKING  ");
    }
}
