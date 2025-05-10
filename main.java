public class main {
    public static void main(String[] args) {
        InteligentnyDom dom = new InteligentnyDom("Domek");

        Lampa lampa = new Lampa("L1", "Lampa salonowa", "Salon");
        Termostat termostat = new Termostat("T1", "Termostat główny", "Korytarz");

        dom.dodajUrzadzenie(lampa);
        dom.dodajUrzadzenie(termostat);

        System.out.println("Status początkowy:");
        dom.wyswietlStatusWszystkichUrzadzen();

        lampa.ustawPoziom(70);
        termostat.ustawPoziom(22);

        System.out.println("Po regulacji:");
        dom.wyswietlStatusWszystkichUrzadzen();
    }

    }