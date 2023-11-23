public class CreditCard {
    int nomerscheta;
    double symmanaschety;

    public CreditCard(int nomerscheta, double symmanaschety) {
        this.nomerscheta = nomerscheta;
        this.symmanaschety = symmanaschety;
    }

    public void dobavitDengi(double money) {
        symmanaschety = symmanaschety + money;
    }

    public void snatDeneg (double money) {

        if (money < symmanaschety) {
            symmanaschety = symmanaschety - money;

        } else
            System.out.println("денег нет " + nomerscheta);
    }

    public void inf () {
        System.out.println("номер счета " + nomerscheta);
        System.out.println("сумма на счету " + symmanaschety);
    }


}
