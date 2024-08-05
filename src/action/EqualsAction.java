package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractEqualsAction;

public class EqualsAction extends AbstractEqualsAction {

    public EqualsAction(AbstractActionCalculator actionCalculator) {
        super(actionCalculator);
    }

    @Override
    public void resault() {
        parts = ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().split(" ");
        if(parts.length < 2) ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(String.valueOf(parts[0]).replace(",", "."));
        else if(parts.length == 2) switchOperation(Double.parseDouble(parts[0]));
        else switchOperation(Double.parseDouble(parts[2]));
    }

    private void switchOperation(Double num2) {
        double num1 = ACTION_CALCULATOR.getMATHEMATICAL_OPERATION().getNum1();
        switch (ACTION_CALCULATOR.getMATHEMATICAL_OPERATION().getOperation()) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(String.valueOf(result).replace(",", "."));
    }
}
