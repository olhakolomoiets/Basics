import java.util.Scanner;

public class DivideNumbers {
    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        a = input.nextDouble();
        System.out.print("Enter the second number: ");
        b = input.nextDouble();
        c = a / b;
        System.out.print("The quotient of these numbers is " + c);
    }
}
