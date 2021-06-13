package projekt;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Klasa sluzy do ustawienia polaczenia z baza danych.
 */
public class Polaczenie {
    public Connection databaseLink;

    /**
     * Funkcja sluzaca do polaczenia sie z baza danych.
     * @return Zwraca polaczenie.
     */
    public Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            databaseLink  = DriverManager.getConnection("jdbc:mysql://localhost:3306/skleprtv", "root","");

        } catch(Exception e)
        {
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;
    }
}
