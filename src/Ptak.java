public class Ptak extends Zwierze {

    public Ptak(String nazwa, int wiek, int rozpietoscSkrzydel) {
        super(nazwa, wiek);
    }

    private int rozpietoscSkrzydel;

    @Override
    public String wydajDzwiek() {
        return "";
    }

    @Override
    public String poruszajSie() {
        return "";
    }
}
