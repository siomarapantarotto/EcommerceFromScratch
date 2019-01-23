package demo;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Vector Demonstration
 *
 * @author siomara.com.br
 * @version 2016.09.24
 */
public class VectorDemo {

    public static void main(String[] args) {
        
        System.out.println("\n********************** Vector Demonstration **********************\n");

        // Initial size is 3, increment is 2 
        Vector v = new Vector(3, 2);
        System.out.println("Initial capacity: " + v.capacity());
        System.out.println("Initial size: " + v.size());

        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("\n" + v.toString());
        System.out.println("Capacity after four additions: " + v.capacity());
        System.out.println("Current size: " + v.size());

        v.addElement(new Double(5.45));
        System.out.println("\n" + v.toString());
        System.out.println("Capacity after one addition: " + v.capacity());
        System.out.println("Current size: " + v.size());
        
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("\n" + v.toString());
        System.out.println("Capacity after two additions: " + v.capacity());
        System.out.println("Current size: " + v.size());
        
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("\n" + v.toString());
        System.out.println("Capacity after two additions: " + v.capacity());
        System.out.println("Current size: " + v.size());

        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("\n" + v.toString());
        System.out.println("Capacity after two additions: " + v.capacity());
        System.out.println("Current size: " + v.size());

        System.out.println("\nFirst element: " + (Integer) v.firstElement());
        System.out.println("Last element: "  + (Integer) v.lastElement());

        // Verify if vector contains the integer 3
        if (v.contains(new Integer(3))) {
            System.out.println("\nVector contains the integer 3.");
        }
        
        // Enumerate the elements in the vector. 
        Enumeration vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
        System.out.println();
    }
}
