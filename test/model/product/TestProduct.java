package model.product;

import br.com.siomara.model.product.Product;
import br.com.siomara.model.product.ProductManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Driver test for Product class
 *
 * @author siomara.com.br
 */
public class TestProduct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {

        // Create new product and set values to its attributes
        Product product = new Product();
        product.setName("Barbie Professora");
        product.setPrice(30.50f);
        product.setWeight(0.8f);
        product.setDetail("Esta Barbie ensina outras bonecas e bichinos de pelúcia");

        // Print product
        System.out.println(product);

        // print all products
        ProductManager productMgr = new ProductManager();
        Vector <Product> products = new Vector <Product>(50);
        productMgr.getAll();
        
        // Enumerate the elements in the vector. 
        Enumeration vEnum = products.elements();
        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement().getClass().getName() + "=====");
        }
        System.out.println();
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products);
        }
    }

}
