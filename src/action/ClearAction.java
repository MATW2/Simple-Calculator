package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractClearAction;

public class ClearAction extends AbstractClearAction {

    public ClearAction(AbstractActionCalculator actionCalculator) {
        super(actionCalculator);
    }

    @Override
    public void clear() {
        ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText("");
        ACTION_CALCULATOR.setFlag(true);
    }
}
