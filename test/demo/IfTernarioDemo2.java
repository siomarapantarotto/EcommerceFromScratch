/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author siomara.com.br
 * @version 2016.09.29
 */
public class IfTernarioDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Try this on your projrct but remember that Strings should not be compared 
        // with == unless you want to know if they point to the same Object.        
        String employee = "yujh";

        List<String> employees = new ArrayList<>();
        employees.add("Antonio");
        employees.add("Daniel");
        employees.add("Francisco");
        employees.add("Maria");
        employees.add("Teresa");
        employees.add("Valentina");              

        for (String s : employees) {
            System.out.println(s.equals(employee) ? "Esta pessoa eh o(a) funcionário(a)\t" + employee : "Esta pessoa não é o(a) funcionário(a)\t" + s);
        }
        
        System.out.println(employees.contains(employee) ? "\nEsta pessoa eh o(a) funcionário(a)\t" + employee : "\nEsta pessoa não é funcionário(a)");

    }
}
