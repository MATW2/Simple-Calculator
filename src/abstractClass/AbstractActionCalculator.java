package abstractClass;

import action.*;

import java.awt.event.ActionListener;

public abstract class AbstractActionCalculator implements ActionListener {
    protected final AbstractCalculator CALCULATOR_GUI;
    protected final AbstractMathematicalOperationAction MATHEMATICAL_OPERATION;
    protected final AbstractNumberAction NUMBER_ACTION;
    protected final AbstractConcatAction CONCAT_ACTION;
    protected final AbstractEqualsAction EQUALS_ACTION;
    protected final AbstractClearAction CLEAR_ACTION;
    protected final AbstractNegationAction NEGATION_ACTION;
    protected boolean flag;

    public AbstractCalculator getCALCULATOR_GUI() {
        return CALCULATOR_GUI;
    }

    public AbstractMathematicalOperationAction getMATHEMATICAL_OPERATION() {
        return MATHEMATICAL_OPERATION;
    }

    public AbstractNumberAction getNUMBER_ACTION() {
        return NUMBER_ACTION;
    }

    public AbstractConcatAction getCONCAT_ACTION() {
        return CONCAT_ACTION;
    }

    public AbstractEqualsAction getEQUALS_ACTION() {
        return EQUALS_ACTION;
    }

    public AbstractClearAction getCLEAR_ACTION() {
        return CLEAR_ACTION;
    }

    public AbstractNegationAction getNEGATION_ACTION() {
        return NEGATION_ACTION;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public AbstractActionCalculator(AbstractCalculator calculatorGui) {
        this.CALCULATOR_GUI = calculatorGui;
        this.NUMBER_ACTION = new NumberAction(this);
        this.CONCAT_ACTION = new ConcatAction(this);
        this.MATHEMATICAL_OPERATION = new MathematicalOperationAction(this);
        this.EQUALS_ACTION =  new EqualsAction(this);
        this.CLEAR_ACTION = new ClearAction(this);
        this.NEGATION_ACTION = new NegationAction(this);
        this.flag = true;
    }
}
