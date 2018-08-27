package bankaccountapp;

public abstract class Account implements IBaseRate
{
    // list common properties for savings and checkings account
    String name,SSN,accountNumber;
    double balance,rate;

    // Constructor to set base properties and initialize account

    public Account(String name,String SSN,double initDeposit)
    {
        this.name=name;
        this.SSN=SSN;
        balance=initDeposit;
        System.out.println("Name : "+name+" SSN :"+SSN+" Balance : $"+balance);

    }


    // list common methods like deposit withdraw etc



}
