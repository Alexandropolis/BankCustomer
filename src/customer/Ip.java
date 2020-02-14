package customer;

public class Ip extends Client{

    @Override
    public void withdrawMoneyAccount(double money) {
        money = Math.abs(money);
        if (money > getMoneyAccount()){
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
        double calculatedMoney, comission;
        if (money > 1000)
        {
            comission = money * 0.005;
        }else{
            comission = money * 0.01;
        }
        calculatedMoney = money - comission;
        setMoneyAccount(calculatedMoney);
        System.out.println("сумма счета увеличилась на: " + calculatedMoney +
                "р (с учетом комисси в размере " + ((money > 1000)? "0.5%)": "1%)"));

    }

}
