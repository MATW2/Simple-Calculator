package action;

import abstractClass.AbstractActionCalculator;
import abstractClass.AbstractNegationAction;

public class NegationAction extends AbstractNegationAction {

    public NegationAction(AbstractActionCalculator actionCalculator) {
      super(actionCalculator);
    }

    @Override
    public void negation() {
        if(!ACTION_CALCULATOR.isFlag()) {
            parts = ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().split(" ");
            if(parts.length > 2) ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(parts[0] + " " + parts[1] + " " + parts[2].replace(parts[2], tempString(2)));
            else ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().setText(tempString(0).replace(",", "."));
        }
    }

    private String tempString(int index) {
        parts = ACTION_CALCULATOR.getCALCULATOR_GUI().getResultTextField().getText().split(" ");
        double temp = Double.parseDouble(parts[index]);
        temp *= -1;
        return String.valueOf(temp);
    }
}
