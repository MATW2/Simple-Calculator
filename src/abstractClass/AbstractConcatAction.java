package abstractClass;

public abstract class AbstractConcatAction {
    protected final AbstractActionCalculator ACTION_CALCULATOR;
    protected String[] parts;

    public AbstractActionCalculator getACTION_CALCULATOR() {
        return ACTION_CALCULATOR;
    }

    public String[] getParts() {
        return parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public AbstractConcatAction(AbstractActionCalculator ACTION_CALCULATOR) {
        this.ACTION_CALCULATOR = ACTION_CALCULATOR;
    }

    public abstract void numberConcat();
}
