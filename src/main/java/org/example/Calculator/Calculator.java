package org.example.Calculator;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator extends JFrame {
    public static void main(String[] args) {
        Calculator frame = new Calculator() ;
        frame.setVisible(true);
    }
    public Calculator (){
        Queue<Double> numbers = new LinkedList<>();
        Queue <Character> operators = new LinkedList<>();

        JPanel panel = new JPanel();
        setTitle("Kalkulator");
        setContentPane(panel);
        panel.setLayout(null);
        setSize(445 , 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        //ResultsMath
        JTextField mathResults = new JTextField();
        mathResults.setBounds(10,110 , 410 , 50);
        mathResults.setEditable(false);
        panel.add(mathResults);


        //Results
        JTextField results = new JTextField() ;
        results.setBounds(10 , 10 , 410 , 100);
        panel.add(results);

        Font customFont = new Font("Arial", Font.PLAIN, 34);
        results.setFont(customFont);
        results.setHorizontalAlignment(JTextField.RIGHT);
        results.setEditable(false);

        Color lightGray = new Color(214 ,217, 223);
        panel.setBackground(lightGray);

        Color buttonColor = new Color(230 , 231 , 233);
        //Buttons
        JButton button1 = new JButton("1");
        button1.setBackground(buttonColor);
        JButton button2 = new JButton("2");
        button2.setBackground(buttonColor);
        JButton button3 = new JButton("3");
        button3.setBackground(buttonColor);
        JButton button4 = new JButton("4");
        button4.setBackground(buttonColor);
        JButton button5 = new JButton("5");
        button5.setBackground(buttonColor);
        JButton button6 = new JButton("6");
        button6.setBackground(buttonColor);
        JButton button7 = new JButton("7");
        button7.setBackground(buttonColor);
        JButton button8 = new JButton("8");
        button8.setBackground(buttonColor);
        JButton button9 = new JButton("9");
        button9.setBackground(buttonColor);
        JButton button0 = new JButton("0");
        button0.setBackground(buttonColor);
        JButton button00 = new JButton("00");
        button00.setBackground(buttonColor);
        JButton buttonDot = new JButton(".");
        buttonDot.setBackground(buttonColor);
        JButton buttonPlus = new JButton("+");
        buttonPlus.setBackground(buttonColor);
        JButton buttonMinus = new JButton("-");
        buttonMinus.setBackground(buttonColor);
        JButton buttonTimes = new JButton("×");
        buttonTimes.setBackground(buttonColor);
        JButton buttonDivide = new JButton("/");
        buttonDivide.setBackground(buttonColor);
        JButton buttonClear = new JButton("C");
        buttonClear.setBackground(buttonColor);
        JButton buttonEquals = new JButton("=");
        buttonEquals.setBackground(buttonColor);



        //Buttons SetBounds
        button1.setBounds(10 , 170 , 65 , 65);panel.add(button1);
        button4.setBounds(10 , 240 , 65 , 65);panel.add(button4);
        button7.setBounds(10 , 310 , 65 , 65);panel.add(button7);
        buttonDot.setBounds(10 , 380 , 65 , 65);panel.add(buttonDot);

        button2.setBounds(90 , 170 , 65 , 65 );panel.add(button2);
        button5.setBounds(90 , 240 , 65 , 65 );panel.add(button5);
        button8.setBounds(90 , 310 , 65 , 65 );panel.add(button8);
        button0.setBounds(90 , 380 , 65 , 65 );panel.add(button0);

        button3.setBounds(170 , 170 , 65 , 65 );panel.add(button3);
        button6.setBounds(170 , 240 , 65 , 65 );panel.add(button6);
        button9.setBounds(170 , 310 , 65 , 65 );panel.add(button9);
        button00.setBounds(170 , 380 , 65 , 65 );panel.add(button00);

        buttonPlus.setBounds(250 , 170 , 75 , 65);panel.add(buttonPlus);
        buttonMinus.setBounds(340 , 170 , 75 , 65);panel.add(buttonMinus);

        buttonTimes.setBounds(250 , 240  , 75 , 65);panel.add(buttonTimes);
        buttonDivide.setBounds(340 , 240  , 75 , 65);panel.add(buttonDivide);

        buttonClear.setBounds(250 , 315 , 75 , 130);panel.add(buttonClear);
        buttonEquals.setBounds(340 , 315 , 75 , 130);panel.add(buttonEquals);


        //Event Listeners

            //Numbers
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "1");
                handleMath(mathResults , results , numbers , operators);
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "2");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "3");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "4");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "5");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "6");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "7");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "8");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "9");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "0");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        button00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "00");
                handleMath(mathResults , results , numbers , operators);
            }
        });

        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + ".");
                handleMath(mathResults , results , numbers , operators);
            }
        });

            //Symbols
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText("");
                mathResults.setText("");
                operators.clear();
                numbers.clear();
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText()+ "+");
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "-");
            }
        });

        buttonTimes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "x");
            }
        });

        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(results.getText() + "/");
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                results.setText(mathResults.getText());
            }
        });

        results.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ((c >= '0' && c <= '9') || c == '.') {
                    results.setText(results.getText() + c);
                    handleMath(mathResults , results , numbers , operators);
                }else if (c == '+') results.setText(results.getText() + c);
                 else if (c == '-') results.setText(results.getText() + c);
                 else if (c == '/') results.setText(results.getText() + c);
                 else if (c == 'x' || c == '*') results.setText(results.getText() + 'x');
                 else if (c == '\n') results.setText(mathResults.getText());
                 else if (c == 'c'){
                    results.setText("");
                    mathResults.setText("");
                    operators.clear();
                    numbers.clear();
                }
            }
        });

    }
    public void handleMath (JTextField mathResults , JTextField results , Queue<Double> numbers , Queue<Character> operators){
        String input = results.getText();
        String number = "";

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c) || c == '.') number += c;
             else if (!number.isEmpty()) {
                numbers.add(Double.parseDouble(number));
                operators.add(c);
                number = "";
            }
        }

        if (!number.isEmpty()) {
            numbers.add(Double.parseDouble(number));
        }

        double finalResult = numbers.poll();
        while (!numbers.isEmpty() && !operators.isEmpty()) {
            double nextNumber = numbers.poll();
            char operator = operators.poll();

            if (operator == '+') finalResult += nextNumber;
            else if (operator == '-')finalResult -= nextNumber;
            else if (operator == 'x') finalResult *= nextNumber;
            else if (operator == '/') {
                if (nextNumber == 0){
                    mathResults.setText("ERROR");
                    return ;
                }
                else finalResult /= nextNumber;
            }
        }
        String formattedResult = handleNumberFormat(finalResult);
        mathResults.setText(formattedResult);
    }
    public String handleNumberFormat(double results){
        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setGroupingUsed(true);
        return numberFormat.format(results) ;
    }
}
