public class Main {
    public static void main(String[] args) {
        Währungsrechner dollar = new Währungsrechner(1.06);

        System.out.println("100 Euro entsprechen " + dollar.inFremd(100) + " Dollar");
        System.out.println("100 Dollar entsprechen " + dollar.inEuro(100) + " Euro");
    }
}
