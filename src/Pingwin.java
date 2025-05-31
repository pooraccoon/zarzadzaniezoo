public class Pingwin extends Ptak{
    public Pingwin(String nazwa, int wiek, int rozpietoscSkrzydel) {
        super(nazwa, wiek, rozpietoscSkrzydel);
    }

    private int wspolczynnikNiezdarnosci;

    @Override
    public String wydajDzwiek() {
        return "kle kle kle?";
    }

    @Override
    public String poruszajSie() {
        return "tup tup tup";
    }

    public String stojBezradnie() {
        return "Stoi bezradnie";
    }
}
