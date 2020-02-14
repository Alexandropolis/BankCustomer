import customer.Client;
import customer.Entity;
import customer.Individual;
import customer.Ip;

public class Main {
    public static void main(String[] args) {
        System.out.println("*****Физическое лицо*****");
        Client fiz = new Individual();
        fiz.withdrawMoneyAccount(1500);
        fiz.putMoneyAccount(2000);
        fiz.withdrawMoneyAccount(1500);
        System.out.println("сумма счета: " + fiz.getMoneyAccount() + "р");

        System.out.println("\n*****Юридическое лицо*****");
        Client yur = new Entity();
        yur.withdrawMoneyAccount(1500);
        yur.putMoneyAccount(2000);
        yur.withdrawMoneyAccount(1500);
        System.out.println("сумма счета: " + yur.getMoneyAccount() + "р");

        System.out.println("\n*****Индивидуальный предприниматаль*****");
        Client ip = new Ip();
        ip.withdrawMoneyAccount(1500);
        ip.putMoneyAccount(2000);
        System.out.println("сумма счета: " + ip.getMoneyAccount() + "р");
        ip.withdrawMoneyAccount(990);
        ip.putMoneyAccount(900);
        System.out.println("сумма счета: " + ip.getMoneyAccount() + "р");
    }
}
