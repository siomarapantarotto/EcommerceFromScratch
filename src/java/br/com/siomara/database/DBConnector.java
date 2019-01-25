package br.com.siomara.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Class responsible to establish connection with DB Postgres
 * This course does not implement DB connection pool
 *
 * @author siomara.com.br
 * @version 20160917
 */
public class DBConnector {

    // Database parameters
    private static final String DB_DRIVER = "org.postgresql.Driver";
    private static final String DB_CONNECTION = "jdbc:postgresql://127.0.0.1:5432/ecommerce_db";
    private static final String DB_USER = "ecommerce_dba";
    private static final String DB_PASSWORD = "ecommercedbapwd";

    
    // NO ARGUMENT constructor
    public DBConnector() {
    }

    
    // Set and returns a connection to the database 
    public Connection getConnection() {

        System.out.println("---------------------- PostgreSQL JDBC Connection ----------------------");

        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            System.out.println("No PostgreSQL JDBC Driver was found. Include in your library path! " + e);
            return null;
        }

        System.out.println("PostgreSQL JDBC Driver successfully registered!");

        Connection connection;

        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.out.println("Failed to make connection! Error: " + e);
            return null;
        }

        if (connection != null) {
            System.out.println("Well done! Connection is ready to be used!");
            return connection;
        } else {
            System.out.println("Connection failed!");
            return null;
        }
    }
}
