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
        frame.setLocationRelativeTo(null);

        // Buttons for caclulator
        JButton buttonText = new JButton("");
        JButton buttonC = new JButton("c");
        JButton buttonBack = new JButton("Back");
        JButton buttonAdd = new JButton("+");
        JButton buttonSub = new JButton("-");
        JButton buttonMult = new JButton("*");
        JButton buttonDiv = new JButton("/");
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
        JButton buttonDec = new JButton(".");
        JButton buttonEquals = new JButton("=");
        JPanel panel = new JPanel(new FlowLayout());

        // Adding buttons to frame
        frame.add(buttonText);
        frame.add(buttonC);
        frame.add(buttonBack);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMult);
        frame.add(buttonDiv);
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
        frame.add(buttonDec);
        frame.add(buttonEquals);

        buttonText.setSize(300,50);
        buttonC.setSize(50,25);
        buttonBack.setSize(50,25);
        buttonAdd.setSize(50,25);
        buttonSub.setSize(50,25);
        buttonMult.setSize(50,25);
        buttonDiv.setSize(50,25);
        buttonEquals.setSize(50,25);

        frame.setVisible(true);
    }
}
