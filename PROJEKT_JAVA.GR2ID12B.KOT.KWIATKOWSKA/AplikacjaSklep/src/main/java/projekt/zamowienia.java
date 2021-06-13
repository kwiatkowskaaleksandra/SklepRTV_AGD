package projekt;

/**
 * Klasa zawiera deklaracje zmiennych uzytych do zamowien.
 */
public class zamowienia {
    int id;
    int numer_telefonu;
    int numer_zamowienia;
    String imie;
    String nazwisko;
    String email;
    String adres;
    String kod_pocztowy;
    String platnosc;
    String data;

    /**
     * Jest to konstruktor klasy 'zamowienia'.
     * @param id Parametr okreslajacy numer zamowienia.
     * @param imie Parametr okreslajacy imie zamawiajacego.
     * @param nazwisko Parametr okreslajacy nazwisko zamawiajacego.
     * @param numer_telefonu Parametr okreslajacy numer telefonu zamawiajacego.
     * @param email Parametr okreslajacy e-mail zamawiajacego.
     * @param adres Parametr okreslajacy adres zamawiajacego.
     * @param kod_pocztowy Parametr okreslajacy kod pocztowy zamawiajacego.
     * @param platnosc Parametr okreslajacy sposob platnosci zamawiajacego.
     * @param data Parametr okreslajacy date zlozenia zamowienia.
     * @param numer_zamowienia Parametr okreslajacy numer zamowienia.
     */
    public zamowienia(int id, String imie, String nazwisko, int numer_telefonu, String email, String adres, String kod_pocztowy, String platnosc, String data, int numer_zamowienia)
    {
        this.id=id;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.numer_telefonu=numer_telefonu;
        this.email=email;
        this.adres=adres;
        this.kod_pocztowy=kod_pocztowy;
        this.platnosc=platnosc;
        this.data=data;
        this.numer_zamowienia=numer_zamowienia;
    }

    /**
     * Funkcja pobiera numer zamowienia.
     * @return Zwraca podany numer zamowienia.
     */
    public int getNumer_zamowienia() {
        return numer_zamowienia;
    }

    /**
     * Funkcja ustawia numer zamowienia.
     * @param numer_zamowienia Parametr przez ktory przekazany jest numer zamowienia.
     */
    public void setNumer_zamowienia(int numer_zamowienia) {
        this.numer_zamowienia = numer_zamowienia;
    }

    /**
     * Funkcja pobiera numer telefonu zamawiajacego.
     * @return Zwraca numer telefonu.
     */
    public int getNumer_telefonu() {
        return numer_telefonu;
    }

    /**
     * Funkcja ustawia numer telefonu.
     * @param numer_telefonu Parametr przez ktory jest przekazany numer telefonu.
     */
    public void setNumer_telefonu(int numer_telefonu) {
        this.numer_telefonu = numer_telefonu;
    }

    /**
     * Funkcja pobiera imie zamawiajacego.
     * @return Zwraca imie zamawiajacego.
     */
    public String getImie() {
        return imie;
    }

    /**
     * Funkcja ustawia imie zamawiajacego.
     * @param imie Parametr przez ktory jest przekazane imie zamawiajacego.
     */
    public void setImie(String imie) {
        this.imie = imie;
    }

    /**
     * Funkcja pobiera nazwisko zamawiajacego.
     * @return Zwraca nazwisko zamawiajacego.
     */
    public String getNazwisko() {
        return nazwisko;
    }

    /**
     * Funkcja ustawia nazwisko zamawiajacego.
     * @param nazwisko Parametr przez ktory jest przekazane nazwisko zamawiajacego.
     */
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    /**
     * Funkcja pobiera e-mail zamawiajacego.
     * @return Zwraca e-mail zamawiajacego.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Funkcja ustawia e-mail zamawiajacego.
     * @param email Parametr przez ktory jest przekazany e-mail zamawiajacego.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Funkcja pobiera adres zamawiajacego.
     * @return Zwraca adres zamawiajacego.
     */
    public String getAdres() {
        return adres;
    }

    /**
     * Funkcja ustawia adres zamawiajacego.
     * @param adres Parametr przez ktory jest przekazany adres zamawiajacego.
     */
    public void setAdres(String adres) {
        this.adres = adres;
    }

    /**
     * Funkcja pobiera kod pocztowy zamawiajacego.
     * @return Zwraca kod pocztowy zamawiajacego.
     */
    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    /**
     * Funkcja ustawia kod pocztowy zamawiajacego.
     * @param kod_pocztowy Parametr przez ktory jest przekazany kod pocztowy zamawiajacego.
     */
    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    /**
     * Funkcja pobiera sposob platnosci.
     * @return Zwraca sposob platnosci.
     */
    public String getPlatnosc() {
        return platnosc;
    }

    /**
     * Funkcja ustawia sposob platnosci.
     * @param platnosc Parametr przez ktory jest przekazany sposob platnosci za zamowienie.
     */
    public void setPlatnosc(String platnosc) {
        this.platnosc = platnosc;
    }

    /**
     * Funkcja pobiera date zlozenia zamowienia.
     * @return Zwraca date zlozenia zamowienia.
     */
    public String getData() {
        return data;
    }

    /**
     * Funkcja ustawia date zlozenia zamowienia.
     * @param data Parametr przez ktory jest przekazywana data zlozenia zamowienia.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Funkcja pobiera ID zamowienia.
     * @return Zwraca ID zamowienia.
     */
    public int getId() {
        return id;
    }

    /**
     * Funkcja ustawia ID zamowienia.
     * @param id Parametr przez ktory jest przekazywane ID zamowienia.
     */
    public void setId(int id) {
        this.id = id;
    }

}
