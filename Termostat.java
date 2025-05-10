public class Termostat extends Urzadzenie implements IRegulowalne {
    private int temperatura;

    public Termostat(String id, String nazwa, String lok) {
        super(id, nazwa, lok);
    }

    @Override
    public String pobierzSzczegolowyOpis() {
        return String.format("Termostat: %s (%d°C)", zobaczNazwa(), temperatura);
    }

    @Override
    public void ustawPoziom(int poziom) { temperatura = poziom; }
}
