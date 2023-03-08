public class Währungsrechner {
    private double kurs;

    public Währungsrechner(double kurs) {
        this.kurs = kurs;
    }

    public double inFremd(double betrag) {
        return betrag * kurs;
    }

    public double inEuro(double betrag) {
        return betrag / kurs;
    }
}
