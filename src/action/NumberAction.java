package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractNumberAction;

public class NumberAction extends AbstractNumberAction {

    public NumberAction(AbstractActionCalculator actionCalculator) {
        super(actionCalculator);
    }

    @Override
    public void numberDisplay(int number) {
        ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().concat(String.valueOf(number)));
        ACTION_CALCULATOR.setFlag(false);
    }
}
