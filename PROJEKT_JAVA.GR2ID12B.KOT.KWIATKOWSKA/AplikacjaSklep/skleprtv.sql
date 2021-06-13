-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Czas generowania: 13 Cze 2021, 14:23
-- Wersja serwera: 10.4.17-MariaDB
-- Wersja PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `skleprtv`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `agd_duze`
--

CREATE TABLE `agd_duze` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `agd_duze`
--

INSERT INTO `agd_duze` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'lodówka', 'Sharp', 1599, 30, 'Posiada pojemnik na kostki lodu, funkcje \"eco\", wentylator.'),
(2, 'lodówka', 'Samsung', 1999, 20, 'Posiada ledowowe oświetlenie oraz alarm niedomkniętych drzwi, 4 szklane półki, szuflade na warzywa i owoce'),
(3, 'zmywarka', 'Whirlpool', 1649, 15, 'Zmywarka wysokiej klasy. Posiada wskaźnik braku soli i nabłyszczacza. Zawiera trzy programy zmywania: eco, intensywny i szkło.'),
(4, 'zmywarka', 'Beko', 1399, 15, 'Posiada  cztery programy zmywania: automatyczny, eco, intensywny, program 30 min. Została zastosowana technologia suszenie Extra Dry oraz system ochrony szkła'),
(5, 'pralka', 'Amica', 1299, 10, 'Posiada program antyalegriczny, eco, łatwe prasowanie, odświeżanie, wełna i inne. Ma możliwość skrócenia czasu prania oraz odłożenia prania. Posiada certyfikat Woolmark.'),
(6, 'pralka', 'Simens', 1899, 25, 'Ma do wyboru 12 różnych programów prania. Posiada funkcje prania wstępnego oraz aktywna piana. Gwarancja na 24 miesiące.'),
(7, 'kuchenka', 'Electrolux', 999, 0, 'Kuchenka gazowa z czterema palnikami i rusztem dwuczęściowym. Posiada wbudowany piekarnika z funkcją pary.'),
(8, 'kuchenka', 'Amica', 4759, 10, 'Kuchenka elektryczna z czterema palnikami ze stali nierdzewnej. Wbudowany piekarnik elektryczny z termoobiegiem.'),
(9, 'okap kuchenny', 'Whirlpool', 1539, 30, 'Czarny okap typu kominowego z dotykowym sterowaniem. Posiada funkcje turbo oraz technologię \"Szósty Zmysł\".'),
(10, 'suszarka', 'Bosch', 3499, 25, 'Zapewnia ciche suszenie bez drgań i wibracji.');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `agd_male`
--

CREATE TABLE `agd_male` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `agd_male`
--

INSERT INTO `agd_male` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'odkurzacz', 'Electrolux', 949, 30, 'Odkurzacz workowy antyalergiczny. Posiada funkcję regulacji mocy ssania, wskaźnik zapełnienia worka, możliwość odkurzania na sucho, czyszczenie wszytskich rodzajów powierzchni.Ma ssawke 3 w 1, szczotk'),
(2, 'ekspres ciśnieniowy', 'Philips', 2899, 25, 'Ekspres ciśnieniowy z młynkiem ceramicznym do kawy ziarnistej i mielonej. Posiada panel dotykowy i wyświetlacz TFT. Ma 13 dostępnych napojów. Posiada automatyczne odkamienianie i program czyszczenia o'),
(3, 'żelazko', 'Tefal', 369, 15, 'Żelazko z ceramiczną stopą i wbudowaną wytwornicą pary. Posiada spryskiwacz i system antywapienny. Ma funkcję automatycznego wyłączenia i oszczędzania energii.'),
(4, 'robot kuchenny', 'Bosch', 1539, 20, 'Robot kuchenny z regulacją obrótów. Umożliwia tarcie ziemniaków, mielenie mięsa, ubijanie piany, cięcia w kostkę, zagniatanie ciasta oraz wyciskanie soku. Możliwość mycia wyposażenia w zmywarce.'),
(5, 'czajnik elektryczny', 'RAVEN', 129, 0, 'Czajnik elektryczny z automatycznym wyłączaniem po zagotowaniu wody. Ma bezpiecznik termiczny i podświetlenie wnętrza.'),
(6, 'suszarka do włosów', 'Philips', 139, 0, 'Duża suszarka o mocy 2100W. Posiada zimny nawiew i zabezpieczenie przed przegrzaniem. Gwarancja na 24 miesiące.'),
(7, 'maszynka do strzyżenia', 'Braun', 299, 0, 'Maszynka do strzyżenia z możliwością mycia pod wodą. Posiada funkcję szybkiego ładowania. Czas pracy akumulatora to 100 minut. W wyposażniu znajduje się 7 nasadek, grzebień do przycinania wąsów i brod'),
(8, 'waga', 'RAVEN', 149, 0, 'Elektroniczna waga łazienkowa dokonuje pomiarów tkanki kostnej, mięśniowei, tłuszczowej oraz wskaźnika BMI.'),
(9, 'blender', 'Bosch', 199, 0, 'Blender o mocy 600W. Posiada funkcje miksowania, rozdrabniania i ubijania piany. Ma 2 pokrywki ochronne, pojemnik do miksowania i rozdrabniacz oraz końcówki do miskowania i ubjania.'),
(10, 'nawilżacz powietrza', 'RAVEN', 239, 0, 'Nawiżacz powietrza z elektroniczny, sterowaniem. Posiada higrostat, wymienny filtr oraz wyjmowany zbiornik na wode. Ma tryb nocny i wyłącznik czasowy oraz obrotową dysze do kierowania strumieniem zimn');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `komputery`
--

CREATE TABLE `komputery` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `komputery`
--

INSERT INTO `komputery` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'komputer stacjonarny', 'Acina', 8199, 30, 'Komputer bez systemu operacyjnego z procesorem Intel Core 7 i7-10700KF, liczba rdzeni:8, częstotliwość taktowania 3,8GHz, 16GB pamięci RAM, pojemność dysku twardego to 2TB HDD.'),
(2, 'komputer stacjonarny', 'Acer', 3699, 20, 'Komputer z procesorem Intel Core i5-10400F, 8GB pamięci ram, zintegrowana karta graficzna i dźwiękowa, pojemność dysku 1000GB.'),
(3, 'laptop', 'Lenovo', 2449, 15, 'Laptop z matową matrycą LED i ekranem 15.6 cala, procesor Intel Core i5-1025G1, 8GB pamięci RAM i systemem operacyjnym Windows 10. Bez napędu, z zintegrowaną kartą dźwiękową.'),
(4, 'laptop', 'HP', 5499, 30, 'Laptop z matową matrycą LED i ekranem 16 cala, z procesorem AMD Ryzen i zintegrowanym układem graficznym AMD Readeon Graphics. System operacyjny: Windows 10.'),
(5, 'monitor', 'LG', 1769, 10, 'Obrotowy monitor 27 cali. Posiada złącze Combo jack. Z możliwością montażu na ścianie.'),
(6, 'monitor', 'Philips', 529, 25, 'Ekran 24 cale z częstotliowścią odświeżania obrazu 75Hz. Kąt widzenia w pionie/w poziomie: 178/178 stopni.'),
(7, 'tablet', 'Lenovo', 849, 10, 'Tablet z Android 9.0Pie i procesorem MediaTek Helio P22T, 8-rdzeniowy. Pojemność 127GB, pojemność RAM 4GB. Przejątna ekranu to 10.3 cala.'),
(8, 'router', 'Huawei', 219, 0, 'Router bezprzewodowy z trzema portami LAN i jednym portem WAN. Częstotliwość pracy to 2.4/5Ghz DuwalBand.'),
(9, 'tablet', 'Samsung', 999, 10, 'Tablet z Android 10 i procesorem Qualcomm Snapdragon 662, 8-rdzeniowy. Przkątna ekranu to 10.4 cala, pojemność RAM 3GB.'),
(10, 'oprogramowanie', 'Microsoft', 299, 0, 'Oprogramowanie przenaczone dla 5 urządzeń z okresem licensji na 12 miesięcy. Kompatybilne urządzenia to: komputer PC, laptop, smartfon, tabelt.');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `konsole_gry`
--

CREATE TABLE `konsole_gry` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `konsole_gry`
--

INSERT INTO `konsole_gry` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'Xbox Series S', 'Microsoft', 1499, 20, 'Konsola typu Xbox Series S, procesor 8 rdzeni AMD, pojemność dysku 512GB SSD. W wyposażeniu dwa pady, kabel HDMI.'),
(2, 'PlayStation 5', 'Sony', 3319, 30, 'Konsola typu Xbox Series S, procesor 8 rdzeni AMD, pojemność dysku 825GB SSD. W wyposażeniu dwa pady DualSense, kabel HDMI, kabel USB, podstawka, 3 gry: Marvel’s Spider-Man: Miles Morales, FIFA 21, pr'),
(3, 'gra Metro Exodus Complete Edit', '4A Games', 159, 0, 'Gra Metro Exodus Complete Edition przenaczona dla platformy Xbox Series X. Wymagnia sprzętowe to: konsola Xbox One, konsola Xbox Series X. Wymagania systemowe: gra online sieciowa wymaga opłacania abo'),
(4, 'gra Hot Wheels Unleashed', 'Milenstone', 199, 0, 'Gra Hot Wheels Unleashed przeznaczona dla platformy Xbox Series X. Wymagania sprzętowe to: konsola Xbox Series X. Wymagania systemowe: gra online sieciowa wymaga opłacania abonamentu Xbox Live Gold.'),
(5, 'gra Assassin’s Creed Valhalla', 'Ubisoft', 249, 0, 'Gra Assassin’s Creed Valhalla przeznaczona dla platformy PlayStation5. Wymagania sprzętowe to: konsola PlayStation 5. Wymagania systemowe: 	gra online sieciowa wymaga opłacania abonamentu PlayStation '),
(6, 'gra Marvel’s Spider-Man: Miles', 'Insomniac Games', 219, 0, 'Gra Marvel’s Spider-Man: Miles Morales przenzaczona dla platformy PlayStation 5. Wymagania sprzętowe to: konsola PlayStation 5. Wymagania systemowe: gra online sieciowa wymaga opłacania abonamentu Pla'),
(7, 'Xbox Series X', 'Microsoft', 2590, 15, 'Konsola typu Xbox Series X, procesor 8 rdzeni AMD, pojemność dysku 1TB SSD. W wyposażeniu dwa pady, kabel HDMI + 2 gry'),
(8, 'gra Hunting Simulator 2', 'Neopica', 179, 0, 'Gra Hunting Simulator 2 dla platformy Xbox Series X. Wymagnia sprzętowe to: konsola Xbox Series X. Wymagania systemowe: gra online sieciowa wymaga opłacania abonamentu Xbox Live Gold.'),
(9, 'gra Super Mario 3D World', 'Nitendo', 249, 0, 'Gra Super Mario 3D World przeznaczona dla platformy Nintendo Switch. Wymagania sprzętowe: konsola Nintendo Switch. Wymagania systemowe: gra online sieciowa wymaga opłacania abonamentu Nintendo Switch '),
(10, 'gra LEGO Iniemamocni', 'Nitendo', 199, 0, 'Gra LEGO Iniemamocni przeznaczona dla platformy Nintendo Switch. Wymagania sprzętowe: konsola Nintendo Switch. Wymagania systemowe: gra online sieciowa wymaga opłacania abonamentu Nintendo Switch Onli');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `konta`
--

CREATE TABLE `konta` (
  `id_konta` int(30) NOT NULL,
  `Imie` varchar(30) NOT NULL,
  `Nazwisko` varchar(30) NOT NULL,
  `Login` varchar(30) NOT NULL,
  `Haslo` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `konta`
--

INSERT INTO `konta` (`id_konta`, `Imie`, `Nazwisko`, `Login`, `Haslo`) VALUES
(1, 'Jarek', 'Kot', 'Admin', 'admin');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `smartfony`
--

CREATE TABLE `smartfony` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `smartfony`
--

INSERT INTO `smartfony` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'smartfon Moto E6s 2/32', 'Motorola', 349, 10, 'Smartfon z wyświetlaczem 6.1 cala i procesorem MediaTek Helio P22 MT6762 8-rdzeniowy oraz Androidem 9Pie. Pojemność baterii to: 3000mAh. Pamięć wbudowana:32GB. Aparat tylny 12Mpix+2Mpix, aparat przedn'),
(2, 'smartfon Samsung Galaxy A21s', 'Samsung', 599, 10, 'Smartfon z wyświetlaczem 6.5 cala i procesorem Samsung Exynos 850 8-rdzeniowy oraz Androidem 10. Pojemność baterii to: 5000mAh. Pamięć wbudowana:32GB. Aparat tylny 48 Mpix + 8 Mpix + 2 Mpix, aparat pr'),
(3, 'smartfon Xiaomi Redmi Note 9', 'Xiaomi', 699, 10, 'Smartfon z wyświetlaczem 6.5 cala i procesorem MediaTek Helio G85 8-rdzeniowy oraz Androidem 10. Pojemność baterii to: 5020mAh. Pamięć wbudowana:128GB. Aparat tylny 48 Mpix + 8 Mpix + 2 Mpix, aparat p'),
(4, 'smartfon Apple iPhone 11', 'Apple', 2999, 15, 'iPhone z wyświetlaczem 6.1 cala i procesorem Apple A13 Bionic oraz iOS13. Pojemność baterii to: 3110mAh. Pamięć wbudowana:64GB. Aparat tylny 12 Mpix + 12 Mpix, aparat przedni 10Mpix.'),
(5, 'smartfon moto g9 power 4', 'Motorola', 990, 20, 'Smartfon z wyświetlaczem 6.8 cala i procesorem Qualcomm Snapdragon 662 8-rdzeniowy oraz Androidem 10. Pojemność baterii to: 6000mAh. Pamięć wbudowana:32GB. Aparat tylny 64Mpix+2Mpix, aparat przedni 16'),
(6, 'smartfon Huawei P30 Pro 6', 'Huawei', 2399, 0, 'Smartfon z wyświetlaczem 6.5 cala i procesorem HiSilicon Kirin 980 8-rdzeniowy 2 x 2,6 GHz Plus oraz Androidem 9+EMUI 9. Pojemność baterii to: 4200mAh. Pamięć wbudowana:32GB. Aparat tylny 	40 Mpix + 2'),
(7, 'smartfon Huawei P40 Pro', 'Huawei', 3099, 0, 'Smartfon z wyświetlaczem 6.5 cala i HiSilicon Kirin 990 5G 8-rdzeniowy oraz Androidem 10+EMUI10. Pojemność baterii to: 4200mAh. Pamięć wbudowana:256GB. Aparat tylny 	50 Mpix + 40 Mpix + 12 Mpix, apara'),
(8, 'smartfon Apple iPhone SE', 'Apple', 1949, 0, 'iPhone z wyświetlaczem 4.7 cala i procesorem Apple A13 Bionic oraz iOS13. Pojemność baterii to: 3110mAh. Pamięć wbudowana:64GB. Aparat tylny 12 Mpix, aparat przedni 8Mpix.'),
(9, 'smartfon Xiaomi Mi 11 Lite 6', 'Xiaomi', 1499, 10, 'Smartfon z wyświetlaczem 6.5 cala i procesorem Qualcomm Snapdragon 732G 8-rdzeniowy oraz Androidem 11. Pojemność baterii to: 4250mAh. Pamięć wbudowana:64GB. Aparat tylny 64 Mpix + 5 Mpix + 8 Mpix, apa'),
(10, 'smartfon Samsung Galaxy A53 5G', 'Samsung', 3100, 10, 'Smartfon z wyświetlaczem 6.5 cala i procesorem Qualcomm Snapdragon 750G 8-rdzeniowy oraz Androidem 11. Pojemność baterii to: 6000mAh. Pamięć wbudowana:64GB. Aparat tylny 64Mpix+2Mpix, aparat przedni 1');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `tv_audio`
--

CREATE TABLE `tv_audio` (
  `id_produktu` int(30) NOT NULL,
  `nazwa` varchar(30) NOT NULL,
  `producent` varchar(30) NOT NULL,
  `cena` int(30) NOT NULL CHECK (`cena` > 0),
  `raty` int(30) NOT NULL CHECK (`raty` >= 0),
  `opis` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `tv_audio`
--

INSERT INTO `tv_audio` (`id_produktu`, `nazwa`, `producent`, `cena`, `raty`, `opis`) VALUES
(1, 'telewizor Samsung QLED', 'Samsung', 2399, 10, 'Telewizor z ekranem 65 cali i podświetleniem matrycy. Technologia obrazu: QLED,LED. Funkcje: wyszukiwanie głosowe, USB - zdjęcia, muzyka, film, Digital EPG, PVR - nagrywanie USB, TimeShift, możliwość '),
(2, 'kino domowe Yamaha RX-V485', 'Yamaha', 2499, 0, 'Kino domowe z maksymalną mocą wyjściową 750W. Łączność bezprzewodowa, wyłącznik czasowy, wbudowany Asystent Google. Funkcje: amplituner obsługa sygnału 3D, amplituner obsługa sygnału 4K, automatyczna '),
(3, 'słuchawki', 'Philips', 399, 10, 'Nauszne słuchawki Philips Performance TAPH805BK/00 bezprzewodowe z opcją kabla 3.5mm. Czas pracy sięga 30h,a zasięg do 10m. Ma mikrfon, regulację głśności oraz redukcje szumów.'),
(4, 'słuchawki', 'Motorola', 219, 0, 'Douszne słuchawki Motorola Vervebuds 250 True Wireless bezprzewodowe. Czas pracy sięga 6h,a zasięg do 10m. Ma mikrfon, regulację głśności i dotykowe sterowanie.'),
(5, 'telewizor LG OLED65A13LA', 'LG', 6999, 30, 'Telewizor z ekranem 65 cali i podświetleniem matrycy. Technologia obrazu: OLED. Funkcje: procesor 4-rdzeniowy, sterowanie głosem, USB - zdjęcia, muzyka, film, SimpLink, Digital EPG, TimeShift, możliwo'),
(6, 'słuchawki', 'Lenovo', 89, 0, 'Douszne słuchawki bezprzewodowe Lenovo HE05. Czas pracy sięga 6h,a zasięg do 10m. Ma mikrfon, regulację głśności.'),
(7, 'odtwarzacz DVD', 'Manta', 149, 0, 'Odtwarzacz Manta DVD072 EMPEROR BASIC HDMI otwiera obraz DVD Video, DVD+R/RW, DVD–R/RW, MPEG-4, VCD, SVCD. Wyposażony w 2 baterie AAA, instrukcja obsługi w języku polskim, karta gwarancyjna, pilot.'),
(8, 'słuchawki', 'Sony', 469, 0, 'Nauszne słuchawki Sony WH-CH710N ANC bezprzewodowe z opcją kabla 3.5mm. Czas pracy sięga 35h,a zasięg do 10m. Ma mikrfon, regulację głśności oraz redukcje szumów. Posiada dwa czujniki hałasu i szybkie'),
(9, 'kino domowe Denon AVR-S650H, W', 'Denon', 3299, 15, 'Kino domowe z maksymalną mocą wyjściową 500W. Łączność bezprzewodowa, wyłącznik czasowy, wbudowany Asystent Google. Funkcje: amplituner obsługa sygnału 3D, amplituner obsługa sygnału 4K, automatyczna '),
(10, 'telewizor Sony KE-65XH9096', 'Sony', 4699, 25, 'Telewizor z ekranem 65 cali i podświetleniem matrycy. Technologia obrazu: LED. Funkcje: wyszukiwanie głosowe, USB - zdjęcia, muzyka, film, Digital EPG, PVR - nagrywanie USB, TimeShift, możliwość aktua');

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `zamowienia`
--

CREATE TABLE `zamowienia` (
  `id_zamowienia` int(30) NOT NULL,
  `Imie` varchar(30) NOT NULL,
  `Nazwisko` varchar(30) NOT NULL,
  `Numer_telefonu` int(9) NOT NULL CHECK (`Numer_telefonu` >= 111111111 and `Numer_telefonu` <= 999999999),
  `Email` varchar(30) NOT NULL,
  `Adres` varchar(30) NOT NULL,
  `Kod_pocztowy` varchar(200) NOT NULL,
  `Platnosc` varchar(30) NOT NULL CHECK (`Platnosc` = 'gotówka' or `Platnosc` = 'przelew'),
  `Data` date NOT NULL,
  `Numer_zamowienia` int(8) NOT NULL CHECK (`Numer_zamowienia` >= 11111111 and `Numer_zamowienia` <= 99999999)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Zrzut danych tabeli `zamowienia`
--

INSERT INTO `zamowienia` (`id_zamowienia`, `Imie`, `Nazwisko`, `Numer_telefonu`, `Email`, `Adres`, `Kod_pocztowy`, `Platnosc`, `Data`, `Numer_zamowienia`) VALUES
(1, 'Jarosław', 'Kot', 987123465, 'jarekkot@wp.pl', 'Kielce ul. Warszawska', '23456', 'gotówka', '2021-09-06', 45642901),
(2, 'Aleksandra', 'Kwiatkowska', 877146265, 'kwiatekola12@wp.pl', 'Kielce ul. Miodowa', '23676', 'gotówka', '2021-10-06', 87642901),
(3, 'Marian', 'Maj', 765432109, 'maniek123@wp.pl', 'Kielce ul.Duża', '98156', 'przelew', '2021-09-10', 81029001),
(4, 'Kaja', 'Rak', 901982048, 'kajunia09@wp.pl', 'Małogoszcz ul.Mała', '20456', 'gotówka', '2021-06-06', 45642911),
(5, 'Adrian', 'Kowalik', 876093214, 'kowalikadrain@wp.pl', 'Miechów ul. Kwiatowa', '20956', 'przelew', '2021-10-12', 45420901),
(6, 'Jakub', 'Mig', 876098098, 'kuba12mig12@onet.pl', 'Poznań ul.Akacjowa', '98701', 'przelew', '2021-10-10', 87609812);

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `agd_duze`
--
ALTER TABLE `agd_duze`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `agd_male`
--
ALTER TABLE `agd_male`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `komputery`
--
ALTER TABLE `komputery`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `konsole_gry`
--
ALTER TABLE `konsole_gry`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `smartfony`
--
ALTER TABLE `smartfony`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `tv_audio`
--
ALTER TABLE `tv_audio`
  ADD PRIMARY KEY (`id_produktu`);

--
-- Indeksy dla tabeli `zamowienia`
--
ALTER TABLE `zamowienia`
  ADD PRIMARY KEY (`id_zamowienia`);

--
-- AUTO_INCREMENT dla zrzuconych tabel
--

--
-- AUTO_INCREMENT dla tabeli `agd_duze`
--
ALTER TABLE `agd_duze`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `agd_male`
--
ALTER TABLE `agd_male`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `komputery`
--
ALTER TABLE `komputery`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `konsole_gry`
--
ALTER TABLE `konsole_gry`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `smartfony`
--
ALTER TABLE `smartfony`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `tv_audio`
--
ALTER TABLE `tv_audio`
  MODIFY `id_produktu` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT dla tabeli `zamowienia`
--
ALTER TABLE `zamowienia`
  MODIFY `id_zamowienia` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
