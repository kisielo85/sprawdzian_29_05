public class Main {
    public static void main(String[] args) {

        Uczen Marek = new Uczen("Marek","Korwin","32323232","3TEBTEBTEBTEB");
        Uczen Henryk = new Uczen("Henryk","Fajny", "123123", "3TP");
        Komputer komputer1 = new Komputer(1,false);
        Komputer komputer2 = new Komputer(2,false);

        Pracownia pracownia=new Pracownia();
        pracownia.dodajKomputerDoUcznia(Marek,komputer1);
        pracownia.dodajKomputerDoUcznia(Henryk,komputer2);

        pracownia.wyswietlPracownie();

    }
}