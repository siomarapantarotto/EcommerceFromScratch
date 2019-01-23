package demo;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

/**
 *
 * @author siomara.com.br
 * @version 2016.09.27
 */
public class TimestampDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n********************** Timestamp Demonstration **********************\n");
        
        // Get current timestamp
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(currentTimestamp);

        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));

        ft = new SimpleDateFormat("E, dd.MM.yyyy, hh:mm:ss a");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));

        ft = new SimpleDateFormat("E, dd.MM.yyyy, HH:mm:ss");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));

        ft = new SimpleDateFormat("'Brasília', dd 'de' MMMM 'de' yyyy.");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));

        ft = new SimpleDateFormat("yyyy.MM.dd");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));

        ft = new SimpleDateFormat("EEEE, dd.MM.yyyy");
        System.out.println("\nFormatted Timestamp: " + ft.format(currentTimestamp));
    }

}
