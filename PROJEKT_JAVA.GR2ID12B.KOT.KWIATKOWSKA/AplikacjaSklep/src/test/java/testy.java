import org.junit.jupiter.api.Test;
import projekt.walidacja;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Klasa zawiera szereg tesow jednostkowych.
 */
public class testy {
        final walidacja w=new walidacja();

        @Test
        void sprCenaFalse(){ assertFalse(w.sprCena(0)); }

        @Test
        void sprCenaFalse1(){ assertFalse(w.sprCena(-10)); }

        @Test
        void sprCenaTrue(){ assertTrue(w.sprCena(100)); }

        @Test
        void sprNazwaFalse(){assertFalse(w.sprNazwa(""));}

        @Test
        void sprNazwaTrue(){assertTrue(w.sprNazwa("pralka"));}

        @Test
        void sprProducentTrue(){assertTrue(w.sprProducent("Becko"));}

        @Test
        void sprProducentFalse(){assertFalse(w.sprProducent(""));}

        @Test
        void sprOpisFalse(){assertFalse(w.sprOpis(""));}

        @Test
        void sprOpisTrue(){assertTrue(w.sprOpis("Wysokiej klasy pralka"));}

        @Test
        void sprRataTrue(){assertTrue(w.sprRata(10));}

        @Test
        void sprRataFalse(){assertFalse(w.sprRata(-1));}

        @Test
        void sprIdTrue(){assertTrue(w.sprId1(100));}

        @Test
        void sprIdFalse(){assertFalse(w.sprId1(-10));}

        @Test
        void sprId1True(){assertTrue(w.sprId(10));}

        @Test
        void sprId1False(){assertFalse(w.sprId(-1));}

        @Test
        void spraNrTelTrue(){assertTrue(w.sprNrTel(786542091));}

        @Test
        void spraNrTelFalse(){assertFalse(w.sprNrTel(1012890134));}

        @Test
        void spraNrTelFalse1(){assertFalse(w.sprNrTel(67901234));}

        @Test
        void spraNrTelFalse2(){assertFalse(w.sprNrTel(0));}

        @Test
        void sprImieTrue(){assertTrue(w.sprImie("Anna"));}

        @Test
        void sprImieFalse(){assertFalse(w.sprImie(""));}

        @Test
        void sprNazwiskoTrue(){assertTrue(w.sprNazwisko("Kowalik"));}

        @Test
        void sprNazwiskoFalse(){assertFalse(w.sprNazwisko(""));}

        @Test
        void sprEmailTrue(){assertTrue(w.sprEmail("kowalik12@wp.pl"));}

        @Test
        void sprEmailFalse(){assertFalse(w.sprEmail(""));}

        @Test
        void sprAdresTrue(){assertTrue(w.sprAdres("Kielce"));}

        @Test
        void sprAdresFalse(){assertFalse(w.sprAdres(""));}

        @Test
        void sprKodTrue(){assertTrue(w.sprKod("26-009"));}

        @Test
        void sprKodFalse(){assertFalse(w.sprKod(""));}

        @Test
        void sprPlatnoscTrue(){assertTrue(w.sprPlatnosc("gotówka"));}

        @Test
        void sprPlatnoscFalse(){assertFalse(w.sprPlatnosc("pieniadze"));}

        @Test
        void sprPlatnoscFalse1(){assertFalse(w.sprPlatnosc(""));}

        @Test
        void sprDataTrue(){assertTrue(w.sprData("12-09-2012"));}

        @Test
        void sprDataFalse(){assertFalse(w.sprData(""));}

        @Test
        void sprNrZamTrue(){assertTrue(w.sprNrZam(54678907));}

        @Test
        void sprNrZamFalse(){assertFalse(w.sprNrZam(909807652));}

        @Test
        void sprNrZamFalse1(){assertFalse(w.sprNrZam(9007652));}

        @Test
        void sprNrZamFalse2(){assertFalse(w.sprNrZam(0));}

    }
