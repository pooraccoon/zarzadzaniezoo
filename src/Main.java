import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Zwierze> zoo = new ArrayList<>();

        List<Ssak> ssaki = new ArrayList<>();
        ssaki.add(new Lew("Grześ", 5));
        ssaki.add(new Slon("Krzyś", 10));

        List<Ptak> ptaki = new ArrayList<>();
        ptaki.add(new Orzel("Piotrek", 3, 17));
        ptaki.add(new Pingwin("Stanisław", 4, 18));

        List<Gad> gady = new ArrayList<>();
        gady.add(new Waz("Kasia", 7, 100));
        gady.add(new Krokodyl("Alicja", 12, 250));

        for (Ssak s : ssaki) {
            System.out.println("SSAK: " + s.getNazwa());
            System.out.println(s.wydajDzwiek());
            System.out.println(s.poruszajSie());
            s.wyswietlInformacje();
            System.out.println();
        }

        for (Ptak p : ptaki) {
            System.out.println("PTAK: " + p.getNazwa());
            System.out.println(p.wydajDzwiek());
            System.out.println(p.poruszajSie());
            p.wyswietlInformacje();
            System.out.println();
        }


        for (Gad g : gady) {
            System.out.println("GAD: " + g.getNazwa());
            System.out.println(g.wydajDzwiek());
            System.out.println(g.poruszajSie());
            g.wyswietlInformacje();
            System.out.println();
        }



    }
    }

