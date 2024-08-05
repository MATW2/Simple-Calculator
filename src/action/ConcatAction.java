package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractConcatAction;

public class ConcatAction extends AbstractConcatAction {

    public ConcatAction(AbstractActionCalculator actionCalculator) {
        super(actionCalculator);
    }

    @Override
    public void numberConcat() {
        if(!ACTION_CALCULATOR.isFlag()) {
            dotConcat(0);
            if (parts.length > 2) dotConcat(2);
        }
    }

    private void dotConcat(int index) {
        parts = ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().split(" ");
        if (!(parts[index].contains(".") || parts[index].isEmpty())) {
            ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().concat("."));
        }
    }
}
