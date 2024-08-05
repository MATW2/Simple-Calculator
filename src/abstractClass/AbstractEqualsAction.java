package abstractClass;

public abstract class AbstractEqualsAction {
    protected final AbstractActionCalculator ACTION_CALCULATOR;
    protected String[] parts;
    protected double result;

    public AbstractActionCalculator getACTION_CALCULATOR() {
        return ACTION_CALCULATOR;
    }

    public String[] getParts() {
        return parts;
    }

    public double getResult() {
        return result;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public AbstractEqualsAction(AbstractActionCalculator ACTION_CALCULATOR) {
        this.ACTION_CALCULATOR = ACTION_CALCULATOR;
    }

    public abstract void resault();
}
