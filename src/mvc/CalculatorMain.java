package mvc;

public class CalculatorMain {
    public static void main(String[] args) {

        CalculatorView calculatorView = new CalculatorView();
        CalculatorModel calculatorModel = new CalculatorModel();
        CalculatorController calculatorController = new CalculatorController(calculatorModel, calculatorView);


    }
}
