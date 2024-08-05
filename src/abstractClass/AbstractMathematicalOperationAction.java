package abstractClass;

public abstract class AbstractMathematicalOperationAction {
    protected double num1;
    protected char operation;
    protected final AbstractActionCalculator ACTION_CALCULATOR;
    protected String[] parts;

    public double getNum1() {
        return num1;
    }

    public char getOperation() {
        return operation;
    }

    public AbstractActionCalculator getACTION_CALCULATOR() {
        return ACTION_CALCULATOR;
    }

    public String[] getParts() {
        return parts;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }

    public AbstractMathematicalOperationAction(AbstractActionCalculator actionCalculator) {
        this.ACTION_CALCULATOR = actionCalculator;
    }

    public abstract void mathematicalOperation(char operation);
}
