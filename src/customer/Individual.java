package customer;

public class Individual extends Client {

    @Override
    public void withdrawMoneyAccount(double money) {
        money = Math.abs(money);
        if (money > getMoneyAccount())
        {
            System.out.println("Недостаточно средств для снятия");
        }else{
            double calculatedMoney = getMoneyAccount() - money;
            setMoneyAccount(calculatedMoney);
            System.out.println("сумма счета уменьшилась на: " + money + "р");
        }
    }

    @Override
    public void putMoneyAccount(double money) {
        money = Math.abs(money);
        double calculatedMoney = getMoneyAccount() + money;
        setMoneyAccount(calculatedMoney);
        System.out.println("сумма счета увеличилась на: " + money + "р");

    }
}
