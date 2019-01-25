/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import br.com.siomara.model.customer.Customer;
import br.com.siomara.model.customer.CustomerManager;
import br.com.siomara.model.product.Product;
import br.com.siomara.model.product.ProductManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author siomara.com.br
 */
public class TestApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        List<Product> products = new ArrayList<>();
        try {
            products = productManager.getAll();
        } catch (SQLException ex) {
            Logger.getLogger(TestApp.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Check LOG for SQLException ERROR: " + ex);
        }

        // Display elements using FOR loop
        System.out.println("\n---------- FIRST SYNTAX to display elements using FOR loop and toString() format ----------");
        for (Object obj : products) {
            System.out.println(obj);
        }

        // Display elements using FOR loop
        System.out.println("\n---------- SECOND SYNTAX to display elements using FOR loop and toString() format ----------");
        for (Product p : products) {
            System.out.println(p);
        }

        // Display elements using FOR loop
        System.out.println("\n---------- THIRD SYNTAX to display elements using specified format ----------");
        for (Product p : products) {
            System.out.println("\nName:"+ p.getName()
                    + ", \nPrice: "     + p.getPrice()
                    + ", \nWeight: "    + p.getWeight()
                    + ", \nDetails: "    + p.getDetail());
        }

        //CustomerManager customerManager = new CustomerManager();        
        //List<Customer> customers = new ArrayList<>();
        //try {
        //    customers = customerManager.getAll();
        //} catch (SQLException ex) {
        //    Logger.getLogger(TestApp.class.getName()).log(Level.SEVERE, null, ex);
        //}
        // Display elements using FOR loop
        //for (Object obj : customers) { 
        //    System.out.println(obj);
        //}
        // Display elements using FOR loop
        // for (Customer c : customers) {
        //     System.out.println(c);
        // }
    }

}
