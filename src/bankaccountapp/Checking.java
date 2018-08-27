package bankaccountapp;

public class Checking extends Account
{
    // list properties specific to checking account like debit card, pin , 2 as first digit in acount
    int debitCardNumber,PIN;


    // Constructor to initialize checking account properties
    public Checking(String name,String SSN,double initDeposit)
    {
        super(name,SSN,initDeposit) ;
        System.out.println("New Checking account");

    }

    // list any methods specific to the checking account
}
