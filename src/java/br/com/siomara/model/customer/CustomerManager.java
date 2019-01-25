package br.com.siomara.model.customer;

import br.com.siomara.database.DBConnector;
import br.com.siomara.database.Query;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Manager class for POJO Customer
 *
 * @author siomara.com.br
 * @version 20190124
 *
 */
public class CustomerManager {

    private Connection connection;

    // NO ARGUMENT constructor
    public CustomerManager() {
        //this.query = new Query();
    }

    // Insert a new customer into customer table
    public void addNew(Customer customer) {
        String query = "insert into customer(name, birthday) values('"
                + customer.getName() + "', "
                + customer.getBirthday() + ")";
        //this.query.execute(query);
    }

    // Update an existing customer 
    public void save(Customer customer) {
        String query = "update customer set name = '" + customer.getName()
                + "' where id = " + customer.getId();
        //this.query.execute(query);
    }

    // Delete a customer from customer table by its id
    public void remove(int id) {
        String query = "delete from customer where id = " + id;
        //this.query.execute(query);
    }

    // Select a customer by its id
    public Customer getByID() {
        return null;
    }

    // Returns a list with all customers
    public List<Customer> getAll() {
        return null;
    }

    // Access DB in a rudimentar way and just print all customers
    public void printAll() {
        try {
            // Step 1: Load Postgres driver
            Class.forName("org.postgresql.Driver");

            // Step 2: Allocate a database 'Connection' object
            Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/ecommerce_db", "ecommerce_dba", "ecommercedbapwd");

            // Step 3: Allocate a 'Statement' object in the Connection
            Statement stmt = connection.createStatement();

            // Step 4: Execute a SQL SELECT query, the query result is returned in a 'ResultSet' object.
            String strSelect = "select id, name, birthday from customer";
            System.out.println("The SQL query is: " + strSelect); // Echo For debugging
            System.out.println();

            ResultSet rset = stmt.executeQuery(strSelect);

            // Step 5: Process the ResultSet by scrolling the cursor forward via next().
            //  For each row, retrieve the contents of the cells with getXxx(columnName).
            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {   // Move the cursor to the next row, return false if no more row
                String id = rset.getString("id");
                String name = rset.getString("name");
                Date birthday = rset.getDate("birthday");
                System.out.println(id + ", " + name + ", " + birthday);
                ++rowCount;
            }
            System.out.println("Total number of records = " + rowCount);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CustomerManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // Step 6: Close the resources - Done automatically by try-with-resources
    }

}
