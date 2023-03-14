public class Währungsrechner {
    private String name;
    private double kurs;

    public Währungsrechner(String name, double kurs) {
        this.name = name;
        this.kurs = kurs;
    }

    public String getName() {
        return name;
    }

    public double inFremd(double betrag) {
        return betrag * kurs;
    }

    public double inEuro(double betrag) {
        return betrag / kurs;
    }
}
