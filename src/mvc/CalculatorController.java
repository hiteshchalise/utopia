package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView){

        calculatorView.addButtonListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int firstNumber = calculatorView.getFirstNumber();
                int secondNumber = calculatorView.getSecondNumber();

                int solution = calculatorModel.addNumbers(firstNumber, secondNumber);

                calculatorView.setSolution(solution);
            }
        });
    }
}
