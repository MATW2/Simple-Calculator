package abstractClass;

public abstract class AbstractClearAction {
    protected final AbstractActionCalculator ACTION_CALCULATOR;

    public AbstractActionCalculator getACTION_CALCULATOR() {
        return ACTION_CALCULATOR;
    }

    public AbstractClearAction(AbstractActionCalculator ACTION_CALCULATOR) {
        this.ACTION_CALCULATOR = ACTION_CALCULATOR;
    }

    public abstract void clear();
}
