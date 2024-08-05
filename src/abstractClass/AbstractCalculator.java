package abstractClass;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class AbstractCalculator extends JFrame {
    protected JTextField resultTextField;
    protected JButton[] numberButtons;
    protected JButton[] functionButtons;
    protected JButton plusButton;
    protected JButton minusButton;
    protected JButton multiplyButton;
    protected JButton divideButton;
    protected JButton dotButton;
    protected JButton equalsButton;
    protected JButton clearButton;
    protected JButton negateButton;
    protected JPanel mainPanel;
    protected JPanel panelCenter;
    protected JPanel panelSouth;
    protected JPanel panelNorth;
    protected ActionListener actionListener;

    public JTextField getResultTextField() {
        return resultTextField;
    }

    public JButton[] getNumberButtons() {
        return numberButtons;
    }

    public JButton[] getFunctionButtons() {
        return functionButtons;
    }

    public JButton getPlusButton() {
        return plusButton;
    }

    public JButton getMinusButton() {
        return minusButton;
    }

    public JButton getMultiplyButton() {
        return multiplyButton;
    }

    public JButton getDivideButton() {
        return divideButton;
    }

    public JButton getDotButton() {
        return dotButton;
    }

    public JButton getEqualsButton() {
        return equalsButton;
    }

    public JButton getClearButton() {
        return clearButton;
    }

    public JButton getNegateButton() {
        return negateButton;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public JPanel getPanelCenter() {
        return panelCenter;
    }

    public JPanel getPanelSouth() {
        return panelSouth;
    }

    public JPanel getPanelNorth() {
        return panelNorth;
    }

    public ActionListener getActionListener() {
        return actionListener;
    }

    public void setResultTextField(JTextField resultTextField) {
        this.resultTextField = resultTextField;
    }

    public void setNumberButtons(JButton[] numberButtons) {
        this.numberButtons = numberButtons;
    }

    public void setFunctionButtons(JButton[] functionButtons) {
        this.functionButtons = functionButtons;
    }

    public void setPlusButton(JButton plusButton) {
        this.plusButton = plusButton;
    }

    public void setMinusButton(JButton minusButton) {
        this.minusButton = minusButton;
    }

    public void setMultiplyButton(JButton multiplyButton) {
        this.multiplyButton = multiplyButton;
    }

    public void setDivideButton(JButton divideButton) {
        this.divideButton = divideButton;
    }

    public void setDotButton(JButton dotButton) {
        this.dotButton = dotButton;
    }

    public void setEqualsButton(JButton equalsButton) {
        this.equalsButton = equalsButton;
    }

    public void setClearButton(JButton clearButton) {
        this.clearButton = clearButton;
    }

    public void setNegateButton(JButton negateButton) {
        this.negateButton = negateButton;
    }

    public void setMainPanel(JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    public void setPanelCenter(JPanel panelCenter) {
        this.panelCenter = panelCenter;
    }

    public void setPanelSouth(JPanel panelSouth) {
        this.panelSouth = panelSouth;
    }

    public void setPanelNorth(JPanel panelNorth) {
        this.panelNorth = panelNorth;
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public AbstractCalculator(String title) {
        super(title);
    }

    public abstract void initWindow();
}
