package br.com.siomara.model.customer;

import br.com.siomara.database.Query;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * Manager class for POJO Customer
 * @author siomara.com.br
 * @version 20190124
 * 
 */
public class CustomerManager {

    private Query query;

    // NO ARGUMENT constructor
    public CustomerManager() {
        this.query = new Query();
    }

    
    // Insert a new customer into customer table
    public void addNew(Customer customer) {
        String query = "insert into customer(name, birthday) values('"
                + customer.getName() + "', "
                + customer.getBirthday() + ")";
        this.query.execute(query);
    }

    
    // Update an existing customer 
    public void save(Customer customer) {
        String query = "update customer set name = '" + customer.getName()
                + "' where id = " + customer.getId();
        this.query.execute(query);
    }

    
    // Delete a customer from customer table by its id
    public void remove(int id) {
        String query = "delete from customer where id = " + id;
        this.query.execute(query);
    }

    
    // Select a customer by its id
    public Customer getByID() {
        return null;
    }

    
    // Select all customers from customer table
    public List getAll() throws SQLException {
        String table = "customer";
        String sql = "select * from " + table;
        List<Customer> customers = this.query.execute(sql, table);
        return customers;
    }

}
