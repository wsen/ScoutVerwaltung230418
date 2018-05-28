package de.gfn.oca.scoutcamp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author tlubowiecki
 */
public class DBManager {
    
    static private DBManager instance;
    
    private static final String HOST = "jdbc:mysql://localhost";
    // Standardport MySQL 3306
    private static final int PORT = 8889;
    private static final String DB_NAME = "scoutbase2018";
    private static final String USER = "root";
    // XAMPP DB Passwort für root ist leer
    private static final String PASSWORD = "root";

    private DBManager() {
    }

    public static DBManager getInstance() {
        if(instance == null) {
            instance = new DBManager();
        }
        return instance;
    }
    
    public Connection getConnection() throws SQLException {
        /* Ab JDBC 4 nicht mehr nötig
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        */
        
        // Alles als ein String
        //return DriverManager.getConnection(HOST + ":" + PORT + "/" + DB_NAME + "?user=" + USER + "&password=" + PASSWORD);
        // User und Password getrennt
        //return DriverManager.getConnection(HOST + ":" + PORT + "/" + DB_NAME, USER, PASSWORD);
        // Mit Properties
        Properties prop = new Properties();
        prop.put("user", USER);
        prop.put("password", PASSWORD);
        return DriverManager.getConnection(HOST + ":" + PORT + "/" + DB_NAME, prop);
    }
}
