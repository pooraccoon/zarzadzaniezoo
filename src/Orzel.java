public class Orzel extends Ptak{
    public Orzel(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "skrzeczy?";
    }

    @Override
    public String poruszajSie() {
        return "ZIUUUU (leci)";
    }
}
