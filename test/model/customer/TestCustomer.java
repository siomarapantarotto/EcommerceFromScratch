package model.customer;

import br.com.siomara.model.customer.Customer;
import br.com.siomara.model.customer.CustomerManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 * Driver test to Customer class.
 *
 * @author siomara.com.br
 * @version 21060917
 */
public class TestCustomer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Create a customer manager to print, insert, update and delete customers 
        CustomerManager customerManager = new CustomerManager();

        // Connects to DB print all customers and close connection
        customerManager.printAll();

        // Create a customer and set its values for CRUD
        Customer customer1 = new Customer();
        customer1.setId(23);
        customer1.setName("Siomara Cíntia Pantarotto");
        customer1.setBirthday(null);
        customer1.setTelephone("99282-6332");
        customer1.getActualAddress().setAddressID(36);
        customer1.getActualAddress().setAddressLine1("Rua Marechal Deodoro da Fonseca, 48");
        customer1.getActualAddress().setAddressLine2("Bairro Penha (ao lado do Banco do Brasil)");
        customer1.getActualAddress().getCity().setName("Name");
        customer1.getActualAddress().getState().setName("São Paulo");
        customer1.getActualAddress().getCountry().setName("Brasil");
        customer1.getActualAddress().setZipcode("70000-000");

        // Print customer on console for debugging
        System.out.println(customer1);

        // Insert customer into database
        System.out.println("Adding customer1");
        customerManager.addNew(customer1);
        System.out.println("Added customer1");
        customerManager.printAll();

        // Select all customers into a list and display them over here
        List<Customer> customers = new ArrayList<>();
        customers = customerManager.getAll();
        for (Customer c : customers) {
            System.out.println(c);
        }

    }
}
