public class Krokodyl extends Gad{
    public Krokodyl(String nazwa, int wiek, int dlugoscCiala) {
        super(nazwa, wiek, dlugoscCiala);
    }

    private int dlugoscPaszczy;

    @Override
    public String wydajDzwiek() {
        return "nic nie slychac, bo krokodyle nie mowia";
    }

    @Override
    public String poruszajSie() {
        return "niezgrabne czlapanie";
    }

    public String zjedzPodroznika(){
        return "omnomnom";
    }
}
