public class Bancomat {
 int vsego;
 int cypura20;
 int cypura50;
 int cypura100;


 public Bancomat(int cypura20, int cypura50, int cypura100) {
        this.cypura20 = cypura20;
        this.cypura50 = cypura50;
        this.cypura100 = cypura100;
     this.vsego = (cypura20 * 20) + (cypura50 * 50) + (cypura100 * 100);
 }

    public boolean snimatDengi(int summa) {
        if (summa > vsego) {
            return false; // недостаточно средств в банкомате
        }

        int cypura100Potrebno = summa / 100;
        int cypura50Potrebno = (summa % 100) / 50;
        int cypura20Potrebno = ((summa % 100) % 50) / 20;

        if (cypura100Potrebno <= cypura100 && cypura50Potrebno <= cypura50 && cypura20Potrebno <= cypura20) {
            cypura100 -= cypura100Potrebno;
            cypura50 -= cypura50Potrebno;
            cypura20 -= cypura20Potrebno;
            vsego -= summa;
            System.out.println("Выдано купюр: \n" +
                    "100: " + cypura100Potrebno + "\n" +
                    "50: " + cypura50Potrebno + "\n" +
                    "20: " + cypura20Potrebno);
            return true;
        } else {
            return false; // невозможно выдать требуемую сумму доступными купюрами
        }
    }

}
