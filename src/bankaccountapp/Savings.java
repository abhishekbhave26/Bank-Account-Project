package bankaccountapp;

public class Savings extends Account
{
    // list properties specific to saving account like 1 as first digit in account
    private int SafetyDepositBoxKey;
    private double safetyDepositBoxID;

    // Constructor to initialize savings account properties
    public Savings(String name,String SSN, double initDeposit)
    {
        super(name,SSN,initDeposit);
        accountNumber='1'+accountNumber;
        setSafetyDepositBox();

    }

    @Override
    public void setRate()
    {
       rate=getBaseRate()-0.25;

    }


    // list any methods specific to the savings account

    public void showInfo()
    {
        System.out.println("ACCOUNT TYPE : SAVINGS  ");
        super.showInfo();
        System.out.println("Safety Deposit Box ID : "+safetyDepositBoxID);
        System.out.println("Safety Deposit Box Key : "+SafetyDepositBoxKey);
    }

    private void setSafetyDepositBox()
    {
        safetyDepositBoxID=(int)(Math.random()*Math.pow(10,3));
        SafetyDepositBoxKey=(int)(Math.random()*Math.pow(10,3));


    }


}
