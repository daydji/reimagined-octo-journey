package rpis81.mironyuk.oop.model;

public abstract class AbstractAccount implements Account{
    private String number;
    private double balance;

    public String getNumber()
    {
        return number;
    }

    public void setNumber(String number)
    {
        this.number=number;
    }

    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }

    public AbstractAccount()
    {
        number="";
        balance=0;
    }

    public AbstractAccount(String number, double balance)
    {
        this.number=number;
        this.balance=balance;
    }
}
