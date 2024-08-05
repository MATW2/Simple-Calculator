package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractCalculator;

import java.awt.event.ActionEvent;

public class ActionCalculator extends AbstractActionCalculator {

    public ActionCalculator(AbstractCalculator calculatorGui) {
      super(calculatorGui);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == CALCULATOR_GUI.getNumberButtons()[i]) NUMBER_ACTION.numberDisplay(i);
        }
        if (e.getSource() == CALCULATOR_GUI.getDotButton()) CONCAT_ACTION.numberConcat();
        if (e.getSource() == CALCULATOR_GUI.getPlusButton()) MATHEMATICAL_OPERATION.mathematicalOperation('+');
        if (e.getSource() == CALCULATOR_GUI.getMinusButton()) MATHEMATICAL_OPERATION.mathematicalOperation('-');
        if (e.getSource() == CALCULATOR_GUI.getMultiplyButton())  MATHEMATICAL_OPERATION.mathematicalOperation('*');
        if (e.getSource() == CALCULATOR_GUI.getDivideButton())  MATHEMATICAL_OPERATION.mathematicalOperation('/');
        if (e.getSource() == CALCULATOR_GUI.getEqualsButton()) EQUALS_ACTION.resault();
        if (e.getSource() == CALCULATOR_GUI.getClearButton()) CLEAR_ACTION.clear();
        if (e.getSource() == CALCULATOR_GUI.getNegateButton()) NEGATION_ACTION.negation();
    }
}




