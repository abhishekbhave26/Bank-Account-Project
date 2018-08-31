package bankaccountapp;



public abstract class Account implements IBaseRate
{
    // list common properties for savings and checkings account
    private String name,SSN;
    protected String accountNumber;
    private double balance;
    protected double rate;
    private static int index=10000;

    // Constructor to set base properties and initialize account

    public Account(String name,String SSN,double initDeposit)
    {
            this.name=name;
            this.SSN=SSN;
            balance=initDeposit;

            index++;
            this.accountNumber=setAccountNumber();
            setRate();


    }


    public abstract void setRate();


    // set account number
    private String setAccountNumber()
    {
        String last2ofSSN=SSN.substring(SSN.length()-2,SSN.length());
        int randomNo=(int)(Math.random()*Math.pow(10,3));
        int uniqueID=index;
        return last2ofSSN+uniqueID+randomNo;


    }

    public void compound()
    {
        double accruedInterest=balance*(rate/100);
        balance+=accruedInterest;
        System.out.println("Accrued Interest : "+accruedInterest);
        printsBalance();

    }


    // list common methods like deposit withdraw etc


    public void showInfo()
    {
        System.out.println("NAME : "+name+
                           "\nACCOUNT NUMBER : "+accountNumber+
                            "\nBALANCE  :$ "+balance+
                            "\nRATE : "+rate


        );


    }

    public void deposit(double amount)
    {
        balance+=amount;
        System.out.println("Deposited " +amount+ " to your account");
        printsBalance();

    }

    public void withdraw(double amount)
    {
        if(amount>balance)
            System.out.println("Invalid");
        else
            balance-=amount;
            System.out.println("Withdrew " +amount+ " from your account");
            printsBalance();

    }

    public void transfer(String toWhere,double amount)
    {
        if(amount>balance)
            System.out.println("Invalid");
        else
            balance-=amount;
            System.out.println("Transferring " +amount+ " from your account to "+toWhere);
            printsBalance();

    }

    public void printsBalance()
    {
        System.out.println("Your balance is : $"+balance);

    }
}
