package customer;

public abstract  class Client {
   private double moneyAccount;

    public double getMoneyAccount() {
        return moneyAccount;
    }

    protected void setMoneyAccount(double money)
    {
        this.moneyAccount = money;
    }

    public abstract void putMoneyAccount(double money);
    public abstract void withdrawMoneyAccount(double money);

}
