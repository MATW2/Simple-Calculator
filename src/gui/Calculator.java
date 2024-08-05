package gui;

import abstractClass.AbstractCalculator;
import action.ActionCalculator;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Calculator extends AbstractCalculator {

    public Calculator(String title) {
        super(title);
        initWindow();
    }

    @Override
    public void initWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        init();
        functionButton();
        numberButton();
        style();
        listener();
        layoutApp();
        addingToTheLayout();
        this.pack();
        this.setVisible(true);
    }

    private void init() {
        plusButton = new JButton("+");
        minusButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        dotButton = new JButton(".");
        equalsButton = new JButton("=");
        clearButton = new JButton("C");
        negateButton = new JButton("+/-");
        resultTextField = new JTextField();
        mainPanel = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        panelNorth = new JPanel();
        functionButtons = new JButton[6];
        numberButtons = new JButton[10];
        actionListener = new ActionCalculator(this);
    }

    private void layoutApp() {
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        mainPanel.setLayout(new BorderLayout());
        panelCenter.setLayout(new GridBagLayout());
        panelSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelNorth.setLayout(new FlowLayout());
    }

    private void functionButton() {
        functionButtons[0] = plusButton;
        functionButtons[1] = minusButton;
        functionButtons[2] = multiplyButton;
        functionButtons[3] = divideButton;
        functionButtons[4] = dotButton;
        functionButtons[5] = clearButton;

        for (int i = 0; i < functionButtons.length; i++) {
            functionButtons[i].addActionListener(actionListener);
            functionButtons[i].setFocusable(false);
            functionButtons[i].setPreferredSize(new Dimension(50, 50));
            functionButtons[i].setFont(new Font("Monaco", Font.PLAIN, 20));
        }
    }

    private void numberButton() {
        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(actionListener);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setPreferredSize(new Dimension(50, 50));
            numberButtons[i].setFont(new Font("Monaco", Font.PLAIN, 20));
        }
    }

    private void style() {
        mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panelCenter.setBorder(new EmptyBorder(25, 5, 5, 5));
        panelSouth.setBorder(new EmptyBorder(5, 5, 5, 5));

        equalsButton.setPreferredSize(new Dimension(120, 45));
        negateButton.setPreferredSize(new Dimension(70, 45));
        resultTextField.setPreferredSize(new Dimension(225, 50));

        negateButton.setFont(new Font("Monaco", Font.PLAIN, 20));
        equalsButton.setFont(new Font("Monaco", Font.PLAIN, 20));
        resultTextField.setFont(new Font("Monaco", Font.PLAIN, 35));

        negateButton.setFocusable(false);
        equalsButton.setFocusable(false);

        resultTextField.setHorizontalAlignment(SwingConstants.RIGHT);
        resultTextField.setEditable(false);
    }

    private void listener() {
        negateButton.addActionListener(actionListener);
        equalsButton.addActionListener(actionListener);
    }

    private void addingToTheLayout() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        panelCenter.add(numberButtons[1], gbc);
        gbc.gridx = 1;
        panelCenter.add(numberButtons[2], gbc);
        gbc.gridx = 2;
        panelCenter.add(numberButtons[3], gbc);
        gbc.gridx = 3;
        panelCenter.add(plusButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        panelCenter.add(numberButtons[4], gbc);
        gbc.gridx = 1;
        panelCenter.add(numberButtons[5], gbc);
        gbc.gridx = 2;
        panelCenter.add(numberButtons[6], gbc);
        gbc.gridx = 3;
        panelCenter.add(minusButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        panelCenter.add(numberButtons[7], gbc);
        gbc.gridx = 1;
        panelCenter.add(numberButtons[8], gbc);
        gbc.gridx = 2;
        panelCenter.add(numberButtons[9], gbc);
        gbc.gridx = 3;
        panelCenter.add(multiplyButton, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        panelCenter.add(numberButtons[0], gbc);
        gbc.gridx = 1;
        panelCenter.add(clearButton, gbc);
        gbc.gridx = 2;
        panelCenter.add(dotButton, gbc);
        gbc.gridx = 3;
        panelCenter.add(divideButton, gbc);

        panelSouth.add(negateButton);
        panelSouth.add(equalsButton);
        panelNorth.add(resultTextField);

        mainPanel.add(panelNorth, BorderLayout.NORTH);
        mainPanel.add(panelCenter, BorderLayout.CENTER);
        mainPanel.add(panelSouth, BorderLayout.SOUTH);
        this.getContentPane().add(mainPanel);
    }
}
