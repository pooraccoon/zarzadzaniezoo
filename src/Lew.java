public class Lew extends Ssak{
    public Lew(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    private int promienGrzywy;

    @Override
    public String wydajDzwiek() {
        return "ROAAAARRRRRRR";
    }

    @Override
    public String poruszajSie() {
        return "nie porusza sie, to samice lwa poluja";
    }

    public String nicNieRob() {
        return "lew nic nie robi";
    }
}
