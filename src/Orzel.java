public class Orzel extends Ptak{
    public Orzel(String nazwa, int wiek, int rozpietoscSkrzydel) {
        super(nazwa, wiek, rozpietoscSkrzydel);
    }

    @Override
    public String wydajDzwiek() {
        return "skrzeczy?";
    }

    @Override
    public String poruszajSie() {
        return "ZIUUUU (leci)";
    }

    public String nurkujZPowietrza() {
        return "orzel nurkuje? XD";
    }
}
