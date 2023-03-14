public class Main {

    public static void ausgabe(Währungsrechner w, int betrag) {
        System.out.println(betrag + " Euro entsprechen " + w.inFremd(betrag) + " " + w.getName());
        System.out.println(betrag + " " + w.getName() + " entsprechen " + w.inEuro(betrag) + " Euro");
    }


    public static void main(String[] args) {
        Währungsrechner dollar = new Währungsrechner("Dollar", 1.06);
        Währungsrechner yen = new Währungsrechner("Yen", 142.88);

        ausgabe(dollar, 100);
        ausgabe(yen, 100);
    }
}
