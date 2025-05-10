public abstract class Urzadzenie {
    private String idUrzadzenia;
    private String nazwaPrzyjazna;
    private String lokalizacja;
    protected boolean status;

    public Urzadzenie(String id, String nazwa, String lok) {
        this.idUrzadzenia = id;
        this.nazwaPrzyjazna = nazwa;
        this.lokalizacja = lok;
    }

    public String pobierzStatus() {
        return status ? "AKTYWNE" : "NIEAKTYWNE";
    }

    public abstract String pobierzSzczegolowyOpis();

    public void zmienStatus(boolean nowyStatus) {
        this.status = nowyStatus;
    }

    public String zobaczId() {
        return idUrzadzenia;
    }

    public String zobaczNazwa() {
        return nazwaPrzyjazna;
    }

    public String zobaczLokalizacja() {
        return lokalizacja;
    }
}

