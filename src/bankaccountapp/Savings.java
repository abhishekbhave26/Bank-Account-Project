package bankaccountapp;

public class Savings extends Account
{
    // list properties specific to saving account like 1 as first digit in account
    int safetyDepositBoxID,getSafetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name,String SSN, double initDeposit)
    {
        super(name,SSN,initDeposit);
        accountNumber='1'+accountNumber;


    }

    // list any methods specific to the savings account

    public void showInfo()
    {
        super.showInfo();
        System.out.println("ACCOUNT TYPE : SAVINGS  ");
    }
}
