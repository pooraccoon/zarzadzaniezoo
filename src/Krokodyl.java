public class Krokodyl extends Gad{
    public Krokodyl(String nazwa, int wiek) {
        super(nazwa, wiek);
    }
    @Override
    public String wydajDzwiek() {
        return "nic nie slychac, bo krokodyle nie mowia";
    }

    @Override
    public String poruszajSie() {
        return "niezgrabne czlapanie";
    }
}
