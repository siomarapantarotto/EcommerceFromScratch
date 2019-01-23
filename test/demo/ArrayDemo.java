package demo;

import java.util.Arrays;

/**
 * Class for array demo
 *
 * @author siomara.com.br
 * @version 21060829
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n************************* Array Demonstration *************************\n");

        /**
         * You can either use array declaration or array literal(but only when
         * you declare and affect the variable right away, array literals cannot
         * be used for re-assigning an array).
         */
        /**
         * For primitive types
         */
        int[] myIntArray = new int[3];
        int[] myIntArray2 = {1, 2, 3};
        int[] myIntArray3 = new int[]{1, 2, 3};
        System.out.println(myIntArray);
        System.out.println(myIntArray2);
        System.out.println(myIntArray3);
        System.out.println();
        System.out.println(Arrays.toString(myIntArray));
        System.out.println(Arrays.toString(myIntArray2));
        System.out.println(Arrays.toString(myIntArray3));
        System.out.println("\n**********************************************************************\n");

        /**
         * For classes, for example String, it's the same
         */
        String[] myStringArray = new String[3];
        String[] myStringArray2 = {"a", "b", "c"};
        String[] myStringArray3 = new String[]{"a", "b", "c"};
        System.out.println(myStringArray);
        System.out.println(myStringArray2);
        System.out.println(myStringArray3);
        System.out.println();
        System.out.println(Arrays.toString(myStringArray));
        System.out.println(Arrays.toString(myStringArray2));
        System.out.println(Arrays.toString(myStringArray3));
        System.out.println("\n**********************************************************************\n");

        /**
         * Add and display total values from a float array
         */
        float[] weights = {(float) 32.50, (float) 32.50, (float) 32.50};
        //float weights[] = {(float) 32.50, (float) 32.50, (float) 32.50};
        System.out.println("Printing weights:\t " + weights);
        System.out.println("Printing weights:\t " + Arrays.toString(weights));
        System.out.println("Printing weights:\t " + weights[0] + "\t" + weights[1] + "\t" + weights[1]);
        System.out.println("Printing weights length: " + weights.length);
        float pesoTotal = weights[0] + weights[1] + weights[2];
        System.out.println("Printing total weight:\t " + pesoTotal);
        System.out.println("\n**********************************************************************\n");

        float accounts[] = new float[2];
        //float[] accounts = new float[2];
        accounts[0] = (float) 10.30;
        accounts[1] = (float) 20.30;
        //accounts[2] = (float) 30.30; // Error - array index out of bound

        int[] ages = new int[5];
        System.out.println("ages = " + Arrays.toString(ages));
        ages[0] = 1;
        ages[1] = 15;
        ages[2] = 33;
        ages[3] = 50;
        ages[4] = 100;
        System.out.println("ages: " + Arrays.toString(ages));
        int[] anotherArray = new int[ages.length * 3];  // Create another array
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));        
        System.arraycopy(ages, 0, anotherArray, 0, ages.length);    // Copy old array to nnew onne
        System.out.println("anotherArray: " + Arrays.toString(anotherArray));
        System.out.println("\n**********************************************************************\n");
    }
}
