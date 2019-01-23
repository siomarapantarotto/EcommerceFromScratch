package br.com.siomara.database;

import br.com.siomara.model.customer.Customer;
import br.com.siomara.model.product.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author siomara.com.br
 */
public class Query {

    private Connection connection;

    public Query() {
        Connector connector = new Connector();
        this.connection = connector.getConnection();
    }

    public void execute(String query) {
        Statement stmt = null;

        try {
            stmt = this.connection.createStatement();
            stmt.executeQuery(query);
        } catch (SQLException e) {
            System.out.println("Erro: " + e);
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    //Logger.getLogger(TestJDBC.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public List execute(String sql, String table) throws SQLException {
        Statement statement = null;
        

        try {
            //this.connection = getDBConnection();
            statement = this.connection.createStatement();

            System.out.println(sql);

            // execute select SQL stetement
            ResultSet rs = statement.executeQuery(sql);

            if (table.equals("product")) {
                List<Product> products = new ArrayList<>();
                while (rs.next()) {
                    Product product = new Product();
                    product.setId(rs.getInt(1));
                    product.getRegister().setInsertedOn(rs.getTimestamp(2));
                    product.getRegister().setInsertedBy(rs.getString(3));
                    product.getRegister().setLastUpdatedOn(rs.getTimestamp(4));
                    product.getRegister().setLastUpdatedBy(rs.getString(5));
                    product.setName(rs.getString(6));
                    product.setPrice(rs.getFloat(7));
                    product.setWeight(rs.getFloat(8));
                    product.setDetail(rs.getString(9));
                    product.getProductType().setId(rs.getInt(10));
                    products.add(product);
                }
                return products;
            } else if (table.equals("customer")) {
                List<Customer> customers = new ArrayList<>();
                while (rs.next()) {
                    Customer customer = new Customer();
                    customer.setId(rs.getInt(1));
                    customer.getRegister().setInsertedOn(rs.getTimestamp(2));
                    customer.getRegister().setInsertedBy(rs.getString(3));
                    customer.getRegister().setLastUpdatedOn(rs.getTimestamp(4));
                    customer.getRegister().setLastUpdatedBy(rs.getString(5));
                    customer.setName(rs.getString(6));
                    customer.setBirthday(rs.getDate(7));
                    customers.add(customer);
                }
                return customers;
            }

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }

        }
        return null;
    }

}
