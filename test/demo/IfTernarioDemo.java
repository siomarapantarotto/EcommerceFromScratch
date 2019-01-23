package demo;

/**
 *
 * @author siomara.com.br
 * @version 2016.09.29
 */
public class IfTernarioDemo {

    public static void main(String[] args) {

        // A normal if - else
        int a = 7, b;

        if (a > 0) {
            b = 1;
        } else {
            b = 2;
        }
        System.out.println("b = " + b);

        // A compact way for if - else --> (Expression) ? TrueValue : FalseValue
        b = (a > 0) ? 100 : 200;
        System.out.println("b = " + b);
    }
    
}
