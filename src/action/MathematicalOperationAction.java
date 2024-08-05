package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractMathematicalOperationAction;

public class MathematicalOperationAction extends AbstractMathematicalOperationAction {

    public MathematicalOperationAction(AbstractActionCalculator actionCalculator) {
        super(actionCalculator);
    }

    @Override
    public void mathematicalOperation(char operation) {
        if(!ACTION_CALCULATOR.isFlag()){
            parts = ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().split(" ");
            num1 = Double.parseDouble(parts[0]);
            ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(num1 + " " + operation + " ");
            this.operation = operation;
        }
    }
}
