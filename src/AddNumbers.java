import java.util.Scanner;

public class AddNumbers {

public static void main(String [] args) {
int a, b, sum;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the first number: ");
    a = input.nextInt();
    System.out.println("Enter the second number: ");
    b = input.nextInt ();
    sum = a + b;
        System.out.println("Sum of these numbers is "+sum);
}
}