package projekt;

/**
 * Klasa zawiera deklaracje zmiennych uzytych do urzadzen.
 */
public class agd1 {
    int id1,cena,raty;
    String  nazwa,producent,opis;

    /**
     * Jest to konstruktor klasy 'agd1'
     * @param id1 Parametr okreslajacy numer sprzetu.
     * @param nazwa Parametr okreslajacy nazwe sprzetu.
     * @param producent Parametr okreslajacy nazwe producenta.
     * @param cena Parametr okreslajacy cene sprzetu.
     * @param raty Parametr okreslajacy raty za sprzet.
     * @param opis Parametr okreslajacy opis sprzetu.
     */
    public agd1(int id1, String nazwa, String producent, int cena, int raty, String opis) {
        this.id1 = id1;
        this.cena = cena;
        this.raty = raty;
        this.nazwa = nazwa;
        this.producent=producent;
        this.opis=opis;
    }

    /**
     * Funkcja pobiera ID sprzetu.
     * @return Zwraca ID sprzetu.
     */
    public int getId1() {
        return id1;
    }

    /**
     * Funkcja ustawia ID sprzetu.
     * @param id1 Parametr przez ktory jest przekazywane ID sprzetu.
     */
    public void setId1(int id1) {
        this.id1 = id1;
    }

    /**
     * Funkcja pobiera cene sprzetu.
     * @return Zwraca cene sprzetu.
     */
    public int getCena() {
        return cena;
    }

    /**
     * Funkcja ustawia cene za sprzet.
     * @param cena Parametr przez ktory jest przekazywana cena za sprzet.
     */
    public void setCena(int cena) {
        this.cena = cena;
    }

    /**
     * Funkcja pobiera raty za sprzet.
     * @return Zwraca raty za sprzet.
     */
    public int getRaty() { return raty; }

    /**
     * Funkcja ustawia ilosc rat za sprzet.
     * @param raty Parametr przez ktory jest przekazywana ilosc rat za sprzet.
     */
    public void setRaty(int raty) {
        this.raty = raty;
    }

    /**
     * Funkcja pobiera nazwe sprzetu.
     * @return Zwraca nazwe sprzetu.
     */
    public String getNazwa() { return nazwa; }

    /**
     * Funkcja ustawia nazwe sprzetu.
     * @param nazwa Parametr przez ktory jest przekazywana nazwa sprzetu.
     */
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    /**
     * Funkcja pobiera nazwe producenta.
     * @return Zwraca nazwe producenta.
     */
    public String getProducent() {return producent;}

    /**
     * Funkcja ustawia nazwe producenta.
     * @param producent  Parametr przez ktory jest przekazywana nazwa producenta.
     */
    public void setProducent(String producent) {this.producent=producent;}

    /**
     * Funkcja pobiera opis sprzetu.
     * @return Zwraca opis sprzetu.
     */
    public String getOpis() {return opis;}

    /**
     * Funkcja ustawia opis sprzetu.
     * @param opis Parametr przez ktory jest przekazywane opis sprzetu.
     */
    public void setOpis(String opis) { this.opis=opis;}
}
