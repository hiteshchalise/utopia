package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

    private final CalculatorModel calculatorModel;
    private final CalculatorView calculatorView;

    CalculatorController(CalculatorModel calculatorModel, CalculatorView calculatorView){

        this.calculatorModel = calculatorModel;
        this.calculatorView = calculatorView;

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
