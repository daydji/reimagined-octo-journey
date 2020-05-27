package rpis81.mironyuk.oop.model;

public class CreditAccount extends AbstractAccount implements Credit {
    double AnnualPercentageRate=0;

    public double getAnnualPercentageRate() {
        return AnnualPercentageRate;
    }

    public void setAnnualPercentageRate(double AnnualPercentageRate) {
        this.AnnualPercentageRate=AnnualPercentageRate;
    }

    public CreditAccount()
    {
        AnnualPercentageRate=30;
    }

    public CreditAccount(String number,double balance, double AnnualPercentageRate)
    {
        super(number, balance);
        this.AnnualPercentageRate=AnnualPercentageRate;
    }
}
