package demo;

import java.util.Date;

/**
 * A simple Date demonstration
 * @author siomara.com.br
 * @version 2016.09.27
 */

public class DateDemo {

   public static void main(String args[]) {
       
       System.out.println("\n********************** Date Demonstration **********************\n");
       
      // Instantiate a Date object
      Date date = new Date();

      // Display time and date using toString()
      System.out.println(date.toString());
   }
}