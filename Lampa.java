public class Lampa extends Urzadzenie implements IPrzelaczalne, IRegulowalne {
    private int jasnosc;

    public Lampa(String id, String nazwa, String lok) {
        super(id, nazwa, lok);
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return String.format("Lampa: %s (Jasność: %d%%)", zobaczNazwa(), jasnosc);
    }

    @Override
    public void wlacz() { zmienStatus(true); }
    @Override
    public void wylacz() { zmienStatus(false); }
    @Override
    public void ustawPoziom(int poziom) { jasnosc = Math.min(100, Math.max(0, poziom)); }
}
