package demo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String args[]) {
        
        System.out.println("\n********************** SimpleDateFormat Demonstration **********************\n");

        // Get current date
        Date currentDate = new Date();
        System.out.println("\nCurrent Date: " + currentDate);
        
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
        
        ft = new SimpleDateFormat("E, dd.MM.yyyy, hh:mm:ss a");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
        
        ft = new SimpleDateFormat("E, dd.MM.yyyy, HH:mm:ss");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
        
        ft = new SimpleDateFormat("'Brasília', dd 'de' MMMM 'de' yyyy.");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
        
        ft = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
            
        ft = new SimpleDateFormat("EEEE, dd.MM.yyyy");
        System.out.println("\nFormatted Date: " + ft.format(currentDate));
      
    }
}
