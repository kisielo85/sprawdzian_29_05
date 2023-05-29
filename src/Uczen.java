public class Uczen extends Osoba{
    private String klasa;
    private Boolean czyZdaje=true;

    public Uczen(String imie, String nazwisko, String PESEL, String klasa) {
        super(imie, nazwisko, PESEL);
        this.klasa = klasa;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    public Boolean getCzyZdaje() {
        return czyZdaje;
    }

    public void setCzyZdaje(Boolean czyZdaje) {
        this.czyZdaje = czyZdaje;
    }
}
