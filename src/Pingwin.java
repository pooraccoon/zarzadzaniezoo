public class Pingwin extends Ptak{
    public Pingwin(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "kle kle kle?";
    }

    @Override
    public String poruszajSie() {
        return "tup tup tup";
    }
}
