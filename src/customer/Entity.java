package customer;

public class Entity extends Client {

    @Override
    public void withdrawMoneyAccount(double money) {
        money = Math.abs(money);
        double calculatedMoney = money + money * 0.01;
        if (calculatedMoney > getMoneyAccount())
        {
            System.out.println("Недостаточно средств для снятия");
        }else{
            calculatedMoney = getMoneyAccount() - calculatedMoney;
            setMoneyAccount(calculatedMoney);
            System.out.println("сумма счета уменьшилась на: " + money + "р + 1%");
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
