package mvc;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalculatorView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel addLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("calculate");
    private JTextField solutionField = new JTextField(10);

    CalculatorView(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);
        this.setVisible(true);

        JPanel panel = new JPanel();
        panel.add(firstNumber);
        panel.add(addLabel);
        panel.add(secondNumber);
        panel.add(calculateButton);
        panel.add(solutionField);

        this.add(panel);
    }

    public void setSolution(int solution){
        solutionField.setText(String.valueOf(solution));
    }

    public int getFirstNumber(){
        return Integer.parseInt(firstNumber.getText());
    }

    public int getSecondNumber(){
        return Integer.parseInt(secondNumber.getText());
    }

    public void addButtonListener(ActionListener listener){
        calculateButton.addActionListener(listener);
    }
}
