package bankaccountapp;



public abstract class Account implements IBaseRate
{
    // list common properties for savings and checkings account
    String name,SSN,accountNumber;
    double balance,rate;
    static int index=10000;

    // Constructor to set base properties and initialize account

    public Account(String name,String SSN,double initDeposit)
    {
            this.name=name;
            this.SSN=SSN;
            balance=initDeposit;

            index++;
            this.accountNumber=setAccountNumber();

    }

    // set account number
    private String setAccountNumber()
    {
        String last2ofSSN=SSN.substring(SSN.length()-2,SSN.length());
        int randomNo=(int)(Math.random()*Math.pow(10,3));
        int uniqueID=index;
        return last2ofSSN+uniqueID+randomNo;


    }


    // list common methods like deposit withdraw etc


    public void showInfo()
    {
        System.out.println("NAME : "+name+
                           "\nACCOUNT NUMBER : "+accountNumber+
                            "\nBALANCE  :$ "+balance


        );


    }


}
