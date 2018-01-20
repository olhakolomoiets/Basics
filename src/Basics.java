/**
 * Execises to practice the basic syntax
 */
public class Basics {

    public static void main(String[] args) {
        // TODO: Write a Java program to print the sum of two numbers.

        int a=7, b=3, sum;
        sum = a + b;
        System.out.println("The sum of the two numbers is "+sum);


        // TODO: Write a Java program to divide two numbers and print on the screen. Use both integers and doubles.

        double quotient;
        quotient = a / b;
        System.out.println("The result of the division is "+quotient);


        // TODO: Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

        double m, s, r; int q;
        m = a * b;
        s = a - b;
        q = a / b;
        r = a - q;
        System.out.println("The sum of the numbers is "+sum);
        System.out.println("The result of the multiplication is "+m);
        System.out.println("The result of the subtraction is "+s);
        System.out.println("The result of the division is "+q);
        System.out.println("The remainder is "+r);

        // TODO: Write a Java program to swap two variables. Print the before and after switching.

        int temp;
        System.out.println("The first number is "+a);
        System.out.println("The second number is "+b);
        temp = a;
        a= b;
        b = temp;
        System.out.println("The first number after swapping is "+a);
        System.out.println("The second number after swapping is "+b);
    }

}


