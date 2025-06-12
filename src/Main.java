import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import javax.swing.JFrame;
//Will be a calculator that adds, subtracts, multiplies, and divides
public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // Creates the starting point of calculator
        // Eventually will look and function like calculator
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);

        // Buttons for caclulator
        frame.setLayout(new BorderLayout());
        JButton buttonText = new JButton("");
        JButton buttonC = new JButton("c");
        JButton buttonBack = new JButton("Back");
        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMult = new JButton("*");
        JButton buttonDiv = new JButton("/");
        JButton buttonDec = new JButton(".");
        JButton buttonEquals = new JButton("=");
        JButton button0 = new JButton("0");
        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");

        JPanel panel = new JPanel();

        // Adding buttons to frame
        frame.add(buttonText);
        frame.add(buttonC);
        frame.add(buttonBack);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMult);
        frame.add(buttonDiv);
        frame.add(buttonDec);
        frame.add(buttonEquals);
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);

        frame.setLayout(new GridLayout(5,4));
        frame.setVisible(true);


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
