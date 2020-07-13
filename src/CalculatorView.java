import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorView {

    private int WINDOW_WIDTH = 400;
    private JFrame frame;

    private JLabel operationLabel;
    private JLabel resultLabel;

    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton plus;
    private JButton minus;
    private JButton multiplicationSign;
    private JButton divisionSign;
    private JButton secondPower;
    private JButton squareRoot;
    private JButton equalSign;
    private JButton dot;
    private JButton backspace;
    private JButton clear;

    public CalculatorView() {

        frame = new JFrame();
        frame.setTitle("Kalkulator");
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.PAGE_AXIS));
        frame.setMinimumSize(new Dimension(WINDOW_WIDTH, 520)); // Ramka wyższa o 20p od Panelu

        addComponentsToPane();

        frame.setVisible(true);
    }

    private void addComponentsToPane() {

        JPanel resultPanel = new JPanel();
        resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.PAGE_AXIS));
        resultPanel.setPreferredSize(new Dimension(WINDOW_WIDTH, 100));
        resultPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        operationLabel = new JLabel("");
        operationLabel.setPreferredSize(new Dimension(WINDOW_WIDTH, 30));
        operationLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        operationLabel.setFont(new Font("Arial", Font.BOLD, 20));

        resultLabel = new JLabel("0");
        resultLabel.setPreferredSize(new Dimension(WINDOW_WIDTH, 70));
        resultLabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 50));

        resultPanel.add(operationLabel);
        resultPanel.add(resultLabel);

        JPanel keyPanel = new JPanel();
        keyPanel.setPreferredSize(new Dimension(WINDOW_WIDTH, 400));
        keyPanel.setLayout(new GridLayout(5, 4, 3, 3));
        keyPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);

        createButtons();
        setButtonsFonts();
        addButtonsToPanel(keyPanel);

        frame.getContentPane().add(resultPanel);
        frame.getContentPane().add(keyPanel);
    }

    private void createButtons() {

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        plus = new JButton("+");
        minus = new JButton("-");
        multiplicationSign = new JButton("×");
        divisionSign = new JButton("÷");
        secondPower = new JButton("x²");
        squareRoot = new JButton("√x");
        equalSign = new JButton("=");
        dot = new JButton(".");
        backspace = new JButton("backspace");
        clear = new JButton("clear");
    }

    private void setButtonsFonts() {

        Font numbersFont = new Font("Arial", Font.BOLD, 20);
        Font signFont = new Font("Times New Roman", Font.BOLD, 35);
        Font remainSignFont = new Font("Times New Roman", Font.ITALIC | Font.BOLD, 21);

        zero.setFont(numbersFont);
        one.setFont(numbersFont);
        two.setFont(numbersFont);
        three.setFont(numbersFont);
        four.setFont(numbersFont);
        five.setFont(numbersFont);
        six.setFont(numbersFont);
        seven.setFont(numbersFont);
        eight.setFont(numbersFont);
        nine.setFont(numbersFont);
        plus.setFont(signFont);
        minus.setFont(signFont);
        multiplicationSign.setFont(signFont);
        divisionSign.setFont(signFont);
        secondPower.setFont(remainSignFont);
        squareRoot.setFont(remainSignFont);
        equalSign.setFont(signFont);
        dot.setFont(signFont);
    }

    private void addButtonsToPanel(JPanel keyPanel) {

        keyPanel.add(backspace);
        keyPanel.add(secondPower);
        keyPanel.add(squareRoot);
        keyPanel.add(divisionSign);
        keyPanel.add(seven);
        keyPanel.add(eight);
        keyPanel.add(nine);
        keyPanel.add(multiplicationSign);
        keyPanel.add(four);
        keyPanel.add(five);
        keyPanel.add(six);
        keyPanel.add(minus);
        keyPanel.add(one);
        keyPanel.add(two);
        keyPanel.add(three);
        keyPanel.add(plus);
        keyPanel.add(clear);
        keyPanel.add(zero);
        keyPanel.add(dot);
        keyPanel.add(equalSign);
    }

    public void addListeners(ActionListener actionListener, KeyListener keyListener) {

        zero.addActionListener(actionListener);
        one.addActionListener(actionListener);
        two.addActionListener(actionListener);
        three.addActionListener(actionListener);
        four.addActionListener(actionListener);
        five.addActionListener(actionListener);
        six.addActionListener(actionListener);
        seven.addActionListener(actionListener);
        eight.addActionListener(actionListener);
        nine.addActionListener(actionListener);
        plus.addActionListener(actionListener);
        minus.addActionListener(actionListener);
        multiplicationSign.addActionListener(actionListener);
        divisionSign.addActionListener(actionListener);
        secondPower.addActionListener(actionListener);
        squareRoot.addActionListener(actionListener);
        equalSign.addActionListener(actionListener);
        dot.addActionListener(actionListener);
        backspace.addActionListener(actionListener);
        clear.addActionListener(actionListener);

        zero.addKeyListener(keyListener);
        one.addKeyListener(keyListener);
        two.addKeyListener(keyListener);
        three.addKeyListener(keyListener);
        four.addKeyListener(keyListener);
        five.addKeyListener(keyListener);
        six.addKeyListener(keyListener);
        seven.addKeyListener(keyListener);
        eight.addKeyListener(keyListener);
        nine.addKeyListener(keyListener);
        plus.addKeyListener(keyListener);
        minus.addKeyListener(keyListener);
        multiplicationSign.addKeyListener(keyListener);
        divisionSign.addKeyListener(keyListener);
        equalSign.addKeyListener(keyListener);
        dot.addKeyListener(keyListener);
        backspace.addKeyListener(keyListener);
        clear.addKeyListener(keyListener);
    }

    public void setOperationLabelText(String text) {
        operationLabel.setText(text);
    }

    public void setResultLabelText(String text) {
        resultLabel.setText(text);
    }

    public JButton getZero() {
        return zero;
    }

    public JButton getOne() {
        return one;
    }

    public JButton getTwo() {
        return two;
    }

    public JButton getThree() {
        return three;
    }

    public JButton getFour() {
        return four;
    }

    public JButton getFive() {
        return five;
    }

    public JButton getSix() {
        return six;
    }

    public JButton getSeven() {
        return seven;
    }

    public JButton getEight() {
        return eight;
    }

    public JButton getNine() {
        return nine;
    }

    public JButton getPlus() {
        return plus;
    }

    public JButton getMinus() {
        return minus;
    }

    public JButton getMultiplicationSign() {
        return multiplicationSign;
    }

    public JButton getDivisionSign() {
        return divisionSign;
    }

    public JButton getSecondPower() {
        return secondPower;
    }

    public JButton getSquareRoot() {
        return squareRoot;
    }

    public JButton getEqualSign() {
        return equalSign;
    }

    public JButton getDot() {
        return dot;
    }

    public JButton getBackspace() {
        return backspace;
    }

    public JButton getClear() {
        return clear;
    }
}
