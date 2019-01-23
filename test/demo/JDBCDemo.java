package demo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siomara.com.br
 * @version 20160920
 */
public class JDBCDemo {
    
    public static void main(String[] argv) {
        
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("No PostgreSQL JDBC Driver was found. Include in your library path!");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully registered!");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.0.0.1:5432/ecommerce", "postgres",
                    "pgtoor");
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("Well done! Connection is ready to be used!");
        } else {
            System.out.println("Failed to make connection!");
        }

        ///////////////////////////////////////////////////////////////////////
        
        Statement statement = null;

        String selectTableSQL = "select * from customer";

        try {
            statement = connection.createStatement();
            System.out.println(selectTableSQL);

            // Execute select SQL statement
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                System.out.println("id : " + id);
                System.out.println("name : " + name);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(JDBCDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
