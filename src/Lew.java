public class Lew extends Ssak{
    public Lew(String nazwa, int wiek) {
        super(nazwa, wiek);
    }

    @Override
    public String wydajDzwiek() {
        return "ROAAAARRRRRRR";
    }

    @Override
    public String poruszajSie() {
        return "nie porusza sie, to samice lwa poluja";
    }
}
