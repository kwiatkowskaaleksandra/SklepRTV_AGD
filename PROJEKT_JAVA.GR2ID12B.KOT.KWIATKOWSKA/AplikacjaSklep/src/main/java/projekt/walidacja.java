package projekt;

/**
 * Klasa sluzaca do przeprowadzenia sprawdzen w testach jednostkowych.
 * Funkcje sprawdzaja czy podane parametry są zgodne z wymogami.
 */

public class walidacja {
    /**
     *Funkcja sluzy do sprawdzenia podanej ceny. W przypadku gdy bedzie ona mniejsza lub rewna 0 funkcja zwroci wartosc 'false'.
     * @param cena parametr w ktorym przekazywana jest cena
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprCena(int cena){
        return cena > 0;
        }

    /**
     *Funkcja sluzy do sprawdzenia, czy podana nazwa nie zawiera pustego pola.
     * @param nazwa parametr ktorym jest przekazywana nazwa urzadzenia typu String
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprNazwa(String nazwa){
        return !nazwa.isEmpty();
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podana nazwa producenta nie zawiera pustego pola.
     * @param producent parametr ktorym jest przekazywana nazwa producenta typu String
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprProducent(String producent){
        return !producent.isEmpty();
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podany opis produktu nie zawiera pustego pola.
     * @param opis parametr ktorym jest przekazywany opis produktu typu String
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprOpis(String opis){
        return !opis.isEmpty();
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podane ID nie jest mniejsze lub równe 0.
     * @param id1 parametr ktory dotyczy podawanego ID sprzetu
     * @return  zwracana wartosc jest typu boolean
     */
    public boolean sprId1(int id1){
        return id1 > 0;
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podana ilosc rat nie jest mniejsza lub rowna 0.
     * @param raty parametr ktory dotyczy ilosci rat
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprRata(int raty){
        return raty > 0;
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podane ID zamowienia nie jest mniejsze lub równe 0.
     * @param id  parametr ktory dotyczy podawanego id zamowienia
     * @return zwracana wartosc jest typu boolean
     */
        public boolean sprId(int id){
            return id > 0;
        }

    /**
     *Funkcja sluzy do sprawdzenia czy podany numer telefonu ma odpowiednią ilosc cyfr.
     * @param numer_telefonu parametr dotyczy podawanego numeru telefonu klienta
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprNrTel(int numer_telefonu){

        return numer_telefonu <= 999999999 && numer_telefonu >= 111111111;
        }

    /**
     * Funkcja sprawdza czy podane imie nie zawiera pustego pola.
     * @param imie parametr okreslajacy imie zamawiajacego.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprImie(String imie){
        return !imie.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podane nazwisko nie zawiera pustego pola.
     * @param nazwisko parametr okreslajacy nazwisko zamawiajacego.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprNazwisko(String nazwisko){
        return !nazwisko.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podany e-mail nie zawiera pustego pola.
     * @param email parametr okreslajacy e-mail zamawiajacego.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprEmail(String email){
        return !email.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podany adresl nie zawiera pustego pola.
     * @param adres parametr okreslajacy adres zamawiajacego.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprAdres(String adres){
        return !adres.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podany kod pocztowy nie zawiera pustego pola.
     * @param kod_pocztowy parametr okreslajacy kod pocztowy zamawiajacego.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprKod(String kod_pocztowy){
        return !kod_pocztowy.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podany sposob platnosci jest zgodny z wymogiem. Aby funkcja zadzialala poprawnie nalezy podac: 'przelew' lub 'gotówka'.
     * @param platnosc parametr okrealajacy sposob platnosci.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprPlatnosc(String platnosc){
        return platnosc.equals("gotówka") || platnosc.equals("przelew");
        }

    /**
     * Funkcja sprawdza czy podana data nie zawiera pustego pola.
     * @param data parametr okreslajacy date zlozenia zamowienia.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprData(String data){
        return !data.isEmpty();
        }

    /**
     * Funkcja sprawdza czy podany numer zamowienia ma odpowednia ilosc cyfr.
     * @param numer_zamowienia parametr okreslajacy numer zlozenia zamowienia.
     * @return zwracana wartosc jest typu boolean
     */
    public boolean sprNrZam(int numer_zamowienia){
        return numer_zamowienia >= 11111111 && numer_zamowienia <= 99999999;
        }
    }


