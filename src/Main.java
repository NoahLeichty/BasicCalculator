import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
//Will be a calculator that adds, subtracts, multiplies, and divides
public class Main extends JFrame implements ActionListener {

    // Setting Buttons
    JTextField outputTextField;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button0;
    JButton buttonAdd;
    JButton buttonSub;
    JButton buttonMult;
    JButton buttonDiv;
    JButton buttonC;
    JButton buttonEquals;

    public Main(){
        // Sets Frame
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 400);
        frame.setLocationRelativeTo(null);

        // Jpanels for layout
        JPanel panel = new JPanel(new BorderLayout());
        JPanel panel1 = new JPanel(new GridLayout(4,4));

        // Text Field that displays numbers
        outputTextField = new JTextField();
        outputTextField.setEditable(false);
        outputTextField.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(outputTextField);

        // Adding buttons to frame and action listeners to buttons
        button7 = new JButton("7");
        button7.addActionListener(this);
        panel1.add(button7);

        button8 = new JButton("8");
        button8.addActionListener(this);
        panel1.add(button8);

        button9 = new JButton("9");
        button9.addActionListener(this);
        panel1.add(button9);

        buttonDiv = new JButton("/");
        buttonDiv.addActionListener(this);
        panel1.add(buttonDiv);

        button4 = new JButton("4");
        button4.addActionListener(this);
        panel1.add(button4);

        button5 = new JButton("5");
        button5.addActionListener(this);
        panel1.add(button5);

        button6 = new JButton("6");
        button6.addActionListener(this);
        panel1.add(button6);

        buttonMult = new JButton("X");
        buttonMult.addActionListener(this);
        panel1.add(buttonMult);

        button1 = new JButton("1");
        button1.addActionListener(this);
        panel1.add(button1);

        button2 = new JButton("2");
        button2.addActionListener(this);
        panel1.add(button2);

        button3 = new JButton("3");
        button3.addActionListener(this);
        panel1.add(button3);

        buttonSub = new JButton("-");
        buttonSub.addActionListener(this);
        panel1.add(buttonSub);

        button0 = new JButton("0");
        button0.addActionListener(this);
        panel1.add(button0);

        buttonC = new JButton("C");
        buttonC.addActionListener(this);
        panel1.add(buttonC);

        buttonEquals = new JButton("=");
        buttonEquals.addActionListener(this);
        panel1.add(buttonEquals);

        buttonAdd = new JButton("+");
        buttonAdd.addActionListener(this);
        panel1.add(buttonAdd);

        frame.add(panel, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);

        frame.setVisible(true);
    }
    // Deals with action events
    @Override
    public void actionPerformed(ActionEvent e){
        String input;
        int number;
        String operator;
        int answer;

        if (e.getSource() == button7) {
            outputTextField.setText(outputTextField.getText() + "7");
        } else if (e.getSource() == button8) {
            outputTextField.setText(outputTextField.getText() + "8");
        } else if (e.getSource() == button9) {
            outputTextField.setText(outputTextField.getText() + "9");
        } else if (e.getSource() == button4) {
            outputTextField.setText(outputTextField.getText() + "4");
        } else if (e.getSource() == button5) {
            outputTextField.setText(outputTextField.getText() + "5");
        } else if (e.getSource() == button6) {
            outputTextField.setText(outputTextField.getText() + "6");
        } else if (e.getSource() == button1) {
            outputTextField.setText(outputTextField.getText() + "1");
        } else if (e.getSource() == button2) {
            outputTextField.setText(outputTextField.getText() + "2");
        } else if (e.getSource() == button3) {
            outputTextField.setText(outputTextField.getText() + "3");
        } else if (e.getSource() == button0) {
            outputTextField.setText(outputTextField.getText() + "0");
        } else if (e.getSource() == buttonC) {
            outputTextField.setText("");
        } else if (e.getSource() == buttonAdd) {
            outputTextField.setText(outputTextField.getText() + "+");
        } else if (e.getSource() == buttonSub) {
            outputTextField.setText(outputTextField.getText() + "-");
        } else if (e.getSource() == buttonMult) {
            outputTextField.setText(outputTextField.getText() + "X");
        } else if (e.getSource() == buttonDiv) {
            outputTextField.setText(outputTextField.getText() + "/");
        } else if (e.getSource() == buttonEquals) {
            if (outputTextField.getText().contains("+")) {
                outputTextField.setText(outputTextField.getText() + "=");
            } else if (outputTextField.getText().contains("-")) {
                outputTextField.setText(outputTextField.getText() + "=");
            } else if (outputTextField.getText().contains("X")) {
                outputTextField.setText(outputTextField.getText() + "=");
            } else if (outputTextField.getText().contains("/")) {
                outputTextField.setText(outputTextField.getText() + "=");
            } else {
                outputTextField.setText("");
            }
        } else {
            outputTextField.setText("");
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);
    }
}
