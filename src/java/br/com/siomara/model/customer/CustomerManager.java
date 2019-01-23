package br.com.siomara.model.customer;

import br.com.siomara.database.Query;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author siomara.com.br
 */
public class CustomerManager {

    private Query query;

    public CustomerManager() {
        this.query = new Query();
    }

    public void addNew(Customer customer) {
        String query = "insert into customer(name, birthday) values('"
                + customer.getName() + "', "
                + customer.getBirthday() + ")";
        this.query.execute(query);
    }

    public void save(Customer customer) {
        String query = "update customer set name = '" + customer.getName()
                + "' where id = " + customer.getId();
        this.query.execute(query);
    }

    public void remove(int id) {
        String query = "delete from customer where id = " + id;
        this.query.execute(query);
    }

    public Customer getByID() {
        return null;
    }

    public List getAll() throws SQLException {
        String table = "customer";
        String sql = "select * from " + table;
        List<Customer> customers = this.query.execute(sql, table);
        return customers;
    }

}
