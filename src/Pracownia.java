import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Pracownia {
    private Map<Osoba, Komputer> map = new HashMap<>();

    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        map.put(uczen,komputer);
    }

    public void wyswietlPracownie(){
        Set<Osoba> setOsoba = map.keySet();

        for (Osoba osoba : setOsoba) {
            Komputer komputer = map.get(osoba);

            System.out.println(osoba.getImie() + ", " + osoba.getNazwisko() + " -> " + komputer.getNumer());
        }
    }
}
