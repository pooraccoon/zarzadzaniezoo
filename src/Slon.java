public class Slon extends Ssak{
    public Slon(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "dzwiek trabienia";
    }

    @Override
    public String poruszajSie() {
        return "LUP LUP LUP";
    }
}
