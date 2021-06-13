package projekt;

import com.mysql.jdbc.PreparedStatement;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * Klasa jest odpowiedzialna za wykonywanie operacji dodawania, wyszukiwania, usuwania, edycji i wyswietlania urzadzen z kategorii Komputery.
 */
@SuppressWarnings( "unchecked" )public class KontrolerKomputery implements Initializable {

    PreparedStatement pst = null;
    @FXML
    private Button DodajButton;
    @FXML
    private Button UsunButton;
    @FXML
    private Button EdytujButton;
    @FXML
    private Button ZamknijButton;
    @FXML
    private TableView<agd1> Tab1;
    @FXML
    private TableColumn<agd1, Integer> idp;
    @FXML
    private TableColumn<agd1, String> naz;
    @FXML
    private TableColumn<agd1, Integer> cen;
    @FXML
    private TableColumn<agd1, Integer> rat;
    @FXML
    private TableColumn<agd1, String> proc;
    @FXML
    private TableColumn<agd1, String> op;
    @FXML
    private TextField TextWyszukaj;
    @FXML
    private TextField TextK1;
    @FXML
    private TextField TextK2;
    @FXML
    private TextField TextK3;
    @FXML
    private TextField TextK4;
    @FXML
    private TextField TextK5;
    @FXML
    private TextArea TextK6;
    int index = -1;

    /**
     * Funkcja wywoluje dwie funkcje odpowiedzialna ze wyswietlenie wpisow oraz wyszukiwanie.
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Odswiezanie();
        wyszukaj();
    }

    /**
     * Funkcja jest odpowiedzialna za wyszukiwanie urzadzen po polach takich jak: nazwa urzadzenia, nazwa producenta i ilosci rat.
     */
    public void wyszukaj()
    {
        Polaczenie connectNow = new Polaczenie();
        Connection connectDB = connectNow.getConnection();
        final ObservableList WczTab = FXCollections.observableArrayList();

        String danee = "SELECT * FROM komputery";

        Statement st = null;
        try {
            st = connectDB.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        agd1 sklep1;

        ResultSet rs = null;
        try {
            assert st != null;
            rs = st.executeQuery(danee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (Objects.requireNonNull(rs).next()) {
                int id1 = rs.getInt("id_produktu");
                String nazwa = rs.getString("nazwa");
                String producent=rs.getString("producent");
                String opis=rs.getString("opis");
                int cena = rs.getInt("cena");
                int raty = rs.getInt("raty");
                sklep1 = new agd1(id1,nazwa,producent,cena,raty,opis);
                WczTab.add(sklep1);
            }
            st.close();

        } catch(Exception  e) {
            System.out.println("Wyjątek!.");
            System.out.println(e.getMessage());
        }
        idp.setCellValueFactory(new PropertyValueFactory<>("id1"));
        naz.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        proc.setCellValueFactory(new PropertyValueFactory<>("producent"));
        cen.setCellValueFactory(new PropertyValueFactory<>("cena"));
        rat.setCellValueFactory(new PropertyValueFactory<>("raty"));
        op.setCellValueFactory(new PropertyValueFactory<>("opis"));

        Tab1.setItems(WczTab);

        FilteredList<agd1> wyszukiwanie = new FilteredList<>(WczTab, b->true);
        TextWyszukaj.textProperty().addListener((observable, oldValue, newValue) ->
                wyszukiwanie.setPredicate(agd1 -> {
                    if(newValue == null || newValue.isEmpty()) {
                        return true;
                    }
                    String literki = newValue.toLowerCase();
                    if(agd1.getNazwa().toLowerCase().contains(literki)) {
                        return true;
                    } else if (agd1.getProducent().toLowerCase().contains(literki)) {
                        return true;
                    }
                    else return String.valueOf(agd1.getRaty()).contains(literki);
                }));
        SortedList<agd1> posortowane = new SortedList<>(wyszukiwanie);
        posortowane.comparatorProperty().bind(Tab1.comparatorProperty());
        Tab1.setItems(posortowane);
    }

    /**
     * Funkcja jest odpowiedzialna za wyswietlenie wszytskich urzadzen znajdujacych sie w bazie danych majacych kategorie Komputery.
     */
    public void Odswiezanie()
    {
        Polaczenie connectNow = new Polaczenie();
        Connection connectDB = connectNow.getConnection();
        final ObservableList WczTab = FXCollections.observableArrayList();

        String danee = "SELECT * FROM komputery";

        Statement st = null;
        try {
            st = connectDB.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        agd1 sklep1;

        ResultSet rs = null;
        try {
            rs = Objects.requireNonNull(st).executeQuery(danee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            while (Objects.requireNonNull(rs).next()) {
                int id1 = rs.getInt("id_produktu");
                String nazwa = rs.getString("nazwa");
                String producent = rs.getString("producent");
                int cena = rs.getInt("cena");
                int raty = rs.getInt("raty");
                String opis = rs.getString("opis");
                sklep1 = new agd1(id1, nazwa,producent, cena, raty,opis);
                WczTab.add(sklep1);

            }
            st.close();
        } catch (Exception e) {
            System.out.println("There is an Exception.");
            System.out.println(e.getMessage());
        }
        idp.setCellValueFactory(new PropertyValueFactory<>("id1"));
        naz.setCellValueFactory(new PropertyValueFactory<>("nazwa"));
        proc.setCellValueFactory(new PropertyValueFactory<>("producent"));
        cen.setCellValueFactory(new PropertyValueFactory<>("cena"));
        rat.setCellValueFactory(new PropertyValueFactory<>("raty"));
        op.setCellValueFactory(new PropertyValueFactory<>("opis"));

        Tab1.setItems(WczTab);
    }

    /**
     * Funkcja jest odpowiedzialna za dodanie nowego urzadzenia z kategorii Komputery do bazy danych.
     */
    public void DodawanieProduktu()
    {
        Polaczenie connectNow = new Polaczenie();
        Connection connectDB = connectNow.getConnection();
        String danee = "insert into komputery(id_produktu,nazwa,producent,cena,raty,opis)values(?,?,?,?,?,?)";

        try{
            pst = (PreparedStatement) connectDB.prepareStatement(danee);
            pst.setString(1 , TextK1.getText());
            pst.setString(2 , TextK2.getText());
            pst.setString(3 , TextK3.getText());
            pst.setString(4 , TextK4.getText());
            pst.setString(5 , TextK5.getText());
            pst.setString(6 , TextK6.getText());
            if(TextK1.getText().isEmpty()||TextK2.getText().isEmpty()||TextK3.getText().isEmpty()||TextK4.getText().isEmpty()||TextK5.getText().isEmpty()||TextK6.getText().isEmpty()) {
                throw new Exception();
            }else {
                pst.execute();

                JOptionPane.showMessageDialog(null, "Dodano pomyslnie!");
                Odswiezanie();
            }
        }catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Blad dodawania!");
        }
    }

    /**
     * Funkcja jest odpowiedzialna za edycje wybranego urzadzenia z kategorii Komputery .
     */
    public void edytowanie()
    {
        try {
            Polaczenie connectNow = new Polaczenie();
            Connection connectDB = connectNow.getConnection();
            String val1 = TextK1.getText();
            String val2 = TextK2.getText();
            String val3 = TextK3.getText();
            String val4 = TextK4.getText();
            String val5 = TextK5.getText();
            String val6 = TextK6.getText();

            String danee = "update komputery set id_produktu= '"+val1+"',nazwa = '"+val2+"',producent = '"+val3+"',cena = '"+val4+"',raty = '"+val5+"',opis = '"+val6+"' where id_produktu ='"+val1+"' ";
            pst = (PreparedStatement) connectDB.prepareStatement(danee);
            if(TextK1.getText().isEmpty()||TextK2.getText().isEmpty()||TextK3.getText().isEmpty()||TextK4.getText().isEmpty()||TextK5.getText().isEmpty()||TextK6.getText().isEmpty()) {
                throw new Exception();
            }else {
                pst.execute();
                JOptionPane.showMessageDialog(null, "Edytowano");
                Odswiezanie();
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Blad przy edytowaniu!");
        }
    }

    /**
     * Funkcja jest odpowiedzialna za usuniecie dowolnego urzadzenia z kategorii Komputery z bazy danych.
     */
    public void usuwanie() {
        Polaczenie connectNow = new Polaczenie();
        Connection connectDB = connectNow.getConnection();
        String danee = "delete from komputery where id_produktu = ?";
        try {
            pst = (PreparedStatement) connectDB.prepareStatement(danee);
            pst.setString(1 , TextK1.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Usunieto");
            Odswiezanie();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Blad przy usuwaniu!");
        }
    }

    /**
     * Funkcja uruchamia DodawanieProduktu() po nacisnieciu przycisku 'Dodaj'.
     */
    public void DodajButtonOnActionEvent() { DodawanieProduktu(); }

    /**
     * Funkcja uruchamia usuwanie() po nacisnieciu przycisku 'Usun'.
     */
    public void UsunButtonOnActionEvent() { usuwanie(); }

    /**
     * Funkcja uruchamia edytowanie po nacisnieciu przycisku 'Aktualizuj'.
     */
    public void EdytujButtonOnActionEvent() { edytowanie(); }

    /**
     * Funkcja sluzy do zamkniecia okna dotyczacego urzadzen z kategorii Komputery.
     */
    public void zamknijButtonOnAction() {
        Stage stage = (Stage) ZamknijButton.getScene().getWindow();
        stage.close();

        try {
            Parent root;
            root = FXMLLoader.load(getClass().getResource("/Menu.fxml"));
            Stage menuStage = new Stage();
            menuStage.initStyle(StageStyle.DECORATED);
            menuStage.setScene(new Scene(root, 800, 600));
            menuStage.setTitle("Hurtownia sprzetu AGD i RTV");
            menuStage.getIcons().add(new Image("file:ikona.png"));
            menuStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    /**
     * Funkcja sluzy do wyboru jednego wpisu z listy.
     * Jest uzywana przy usuwaniu i edycji.
     */
    public void getSelected() {
        index = Tab1.getSelectionModel().getSelectedIndex();
        if(index <= -1)
        {
            return;
        }
        TextK1.setText(idp.getCellData(index).toString());
        TextK2.setText(naz.getCellData(index));
        TextK3.setText(proc.getCellData(index));
        TextK4.setText(cen.getCellData(index).toString());
        TextK5.setText(rat.getCellData(index).toString());
        TextK6.setText(op.getCellData(index));
    }
}
