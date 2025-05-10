import java.util.ArrayList;
import java.util.List;

public class InteligentnyDom {
    private final String nazwaDomu;
    private final List<Urzadzenie> urzadzenia = new ArrayList<>();

    public InteligentnyDom(String nazwa) {
        this.nazwaDomu = nazwa;
    }

    public void dodajUrzadzenie(Urzadzenie u) {
        urzadzenia.add(u);
    }

    public void wyswietlStatusWszystkichUrzadzen() {
        urzadzenia.forEach(u -> System.out.println(u.pobierzSzczegolowyOpis()));
    }

    public void wlaczWszystkiePrzelaczalne() {
        urzadzenia.forEach(u -> {
            if (u instanceof IPrzelaczalne) ((IPrzelaczalne) u).wlacz();
        });
    }
}
