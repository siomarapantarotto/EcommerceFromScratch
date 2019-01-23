/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import br.com.siomara.model.product.Product;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author siomara.com.br
 */
public class ArrayListDemo3 {

    public static void main(String[] args) {
        
        System.out.println("\n********************** ArrayList Demonstration 3 **********************\n");

        // Define and set values to a new product
        Product product = new Product();
        product.setName("Barbie Safari");
        product.setPrice(30.60f);
        product.setWeight(0.6f);
        product.setDetail("Esta boneca é a melhor amiga do TARZAN.");

        // Create new ArrayList
        ArrayList<Object> list = new ArrayList<Object>();
        // Add elements to ArrayList
        list.add("Teste");
        list.add(new Integer(1));
        list.add(new Long(2));
        list.add(new Float(3.3));
        list.add(Boolean.TRUE);
        list.add(product);
        Iterator it = list.iterator();
        // Display elements using WHILE loop
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\n***************************************************************************\n");

        // Create new ArrayList
        ArrayList list2 = new ArrayList();
        // Add elements to ArrayList
        list2.add("Geladeira");
        list2.add("Fogão");
        list2.add("Televisão");
        list2.add("Microondas");
        list2.add("Freezer");
        list2.add("Lavadora de pratos");
        list2.add(product);
        // Display elements using WHILE loop
        while (!list2.isEmpty()) {
            System.out.println(list2.remove(0));
        }

        System.out.println("\n***************************************************************************\n");

        // Create new ArrayList
        ArrayList list3 = new ArrayList();
        // Add elements to ArrayList
        list3.add("Rosa");
        list3.add("Cravo");
        list3.add("Margarida");
        list3.add("Violeta");
        list3.add("Tulipa");
        list3.add("Girassol");
        list3.add(product);
        // Display elements using FOR loop
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        System.out.println("\n***************************************************************************\n");

        // Create new ArrayList
        ArrayList list4 = new ArrayList();
        // Add elements to ArrayList
        list4.add("Ferrari");
        list4.add("Jaguar");
        list4.add("Porche");
        list4.add("Sportage");
        list4.add("Fiat Palio");
        list4.add("Fiat Adventure");
        list4.add(product);
        // Display elements using FOR loop
        for (Object obj : list4) {
            System.out.println(obj);
        }
    }

}
