package demo;

/**
 * This class deals with String and Substring.
 *
 * @author Siomara
 * @version 21060829
 */
public class StringSubstringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\n********************** String and Substring Demonstration **********************\n");

        // Trabalhando com String e Substring
        String text = "abcdefghijklmnopqrstuvxzmariagjhkjhcdmariakjhsfdkbjfhkc";
        System.out.println(text);
        System.out.println(text.substring(10, 20));
        
        System.out.println();
        System.out.println("Posição da primeira letra a é: " + text.indexOf('a'));
        System.out.println("Posição da primeira letra b é: " + text.indexOf('b'));
        System.out.println("Posição da primeira letra c é: " + text.indexOf('c'));
        
        System.out.println();
        System.out.println("Posição da última letra a é: " + text.lastIndexOf("a"));
        System.out.println("Posição da última letra b é: " + text.lastIndexOf("b"));
        System.out.println("Posição da última letra c é: " + text.lastIndexOf("c"));
        
        System.out.println();
        System.out.println("Primeira posição da substring maria é: " + text.indexOf("maria"));
        System.out.println("Última posição da substring maria é: " + text.lastIndexOf("maria"));
        System.out.println("1a. posição da substring antonieta é: " + text.lastIndexOf("antonieta"));
        
        System.out.println();
        System.out.println("text maiúsculo: " + text.toUpperCase());
        System.out.println("text minusculo: " + text.toLowerCase());

        // Array
        String semana[] = new String[7];
        semana[0] = "domingo";
        semana[1] = "segunda";
        semana[2] = "terça";
        semana[3] = "quarta";
        semana[4] = "quinta";
        semana[5] = "sexta";
        semana[6] = "sábado";
        System.out.println();
        System.out.println("O primeiro dia da semana é "    + semana[0]);
        System.out.println("O segundo dia da semana é "     + semana[1]);
        System.out.println("O terceiro dia da semana é "    + semana[2]);
        System.out.println("O quarto dia da semana é "      + semana[3]);
        System.out.println("O quinto dia da semana é "      + semana[4]);
        System.out.println("O sexto dia da semana é "       + semana[5]);
        System.out.println("O sétimo dia da semana é "      + semana[6]);
    }
}
