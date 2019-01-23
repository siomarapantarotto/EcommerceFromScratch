package demo;

import java.util.Date;

public class DateDiffDemo {

   public static void main(String args[]) {
       
       System.out.println("\n********************** Date Difference Demonstration **********************\n");
       
      try {
         long start = System.currentTimeMillis( );
         System.out.println(new Date( ) + "\n");
         
         Thread.sleep(5*60*10);
         System.out.println(new Date( ) + "\n");
         
         long end = System.currentTimeMillis( );
         long diff = end - start;
         System.out.println("Difference is : " + diff);
      }catch (Exception e) {
         System.out.println("Got an exception!");
      }
      
   }
}