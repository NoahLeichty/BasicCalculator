import java.util.Scanner;
//Will be a calculator that adds, subtracts, multiplies, and divides
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        // This just does 2 numbers
        // ToDo Make it take in more numbers
        // ToDo make the UI and User experience better
        System.out.println("Enter your first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter what operation you want to do (+,-,*,/) :");
        String operation = scan.next();
        System.out.println("Enter your second number: ");
        double num2 = scan.nextDouble();

        // This checks what operation the user chose and does it
        if (operation.startsWith("+")){
            System.out.println(num1 + num2);
        } else if (operation.startsWith("-")) {
            System.out.println(num1 - num2);
        } else if (operation.startsWith("*")) {
            System.out.println(num1 * num2);
        } else if (operation.startsWith("/")) {
            System.out.println(num1 / num2);
        }else {
            System.out.println("Not a valid operation!");
        }
    }
}