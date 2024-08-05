package abstractClass;

public abstract class AbstractNumberAction {
    protected final AbstractActionCalculator ACTION_CALCULATOR;

    public AbstractActionCalculator getACTION_CALCULATOR() {
        return ACTION_CALCULATOR;
    }

    public AbstractNumberAction(AbstractActionCalculator ACTION_CALCULATOR) {
        this.ACTION_CALCULATOR = ACTION_CALCULATOR;
    }

    public abstract void numberDisplay(int number);
}
