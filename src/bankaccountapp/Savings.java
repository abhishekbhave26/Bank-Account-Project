package bankaccountapp;

public class Savings extends Account
{
    // list properties specific to saving account like 1 as first digit in account
    int safetyDepositBoxID,getSafetyDepositBoxKey;

    // Constructor to initialize savings account properties
    public Savings(String name,String SSN, double initDeposit)
    {
        super(name,SSN,initDeposit);
        System.out.println("New Savings account");

    }

    // list any methods specific to the savings account
}
