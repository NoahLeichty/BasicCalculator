
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

        // Adding text field to show calculations
        JPanel panel = new JPanel(new BorderLayout());
        JTextField textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(textField);

        // Buttons for caclulator
        JPanel panel1 = new JPanel(new GridLayout(4,4));
        JButton buttonC = new JButton("c");
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


        // Adding buttons to frame
        panel1.add(button7);
        panel1.add(button8);
        panel1.add(button9);
        panel1.add(buttonDiv);
        panel1.add(button4);
        panel1.add(button5);
        panel1.add(button6);
        panel1.add(buttonMult);
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
        panel1.add(buttonSub);
        panel1.add(button0);
        panel1.add(buttonC);
        panel1.add(buttonEquals);
        panel1.add(buttonAdd);

        // Layout of frame
        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                textField.setText("7");
            }
        });
        // Makes frame visible
        frame.setVisible(true);
    }
}
