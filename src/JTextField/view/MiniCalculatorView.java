package JTextField.view;

import JTextField.controller.MiniCalculatorListener;
import JTextField.model.MiniCalculatorModel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField jTextField_1st_value;
    private JTextField jTextField_2nd_value;
    private JTextField jTextField_answer;

    public MiniCalculatorView() throws HeadlessException {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();

    }

    private void init() {
        this.setTitle("Mini Calculator");
        this.setSize(400, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 15);

        JLabel jLabel_1st_value = new JLabel("1st value");
        jLabel_1st_value.setFont(font);
        JLabel jLabel_2nd_value = new JLabel("2nd value");
        jLabel_2nd_value.setFont(font);
        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);

        jTextField_1st_value = new JTextField(50);
        jTextField_1st_value.setFont(font);
        jTextField_2nd_value = new JTextField(50);
        jTextField_2nd_value.setFont(font);
        jTextField_answer = new JTextField(50);
        jTextField_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2, 20, 20));
        jPanelIO.add(jLabel_1st_value);
        jPanelIO.add(jTextField_1st_value);
        jPanelIO.add(jLabel_2nd_value);
        jPanelIO.add(jTextField_2nd_value);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(jTextField_answer);

        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);

        JButton plus = new JButton("+");
        plus.setFont(font);
        plus.addActionListener(miniCalculatorListener);

        JButton minus = new JButton("-");
        minus.setFont(font);
        minus.addActionListener(miniCalculatorListener);

        JButton multy = new JButton("*");
        multy.setFont(font);
        multy.addActionListener(miniCalculatorListener);

        JButton divide = new JButton("/");
        divide.setFont(font);
        divide.addActionListener(miniCalculatorListener);

        JButton pow = new JButton("^");
        pow.setFont(font);
        pow.addActionListener(miniCalculatorListener);

        JButton mod = new JButton("%");
        mod.setFont(font);
        mod.addActionListener(miniCalculatorListener);

        JPanel jPanel_btn = new JPanel();
        jPanel_btn.setLayout(new GridLayout(2, 3, 10, 10));
        jPanel_btn.add(plus);
        jPanel_btn.add(minus);
        jPanel_btn.add(multy);
        jPanel_btn.add(divide);
        jPanel_btn.add(pow);
        jPanel_btn.add(mod);

        this.setLayout(new BorderLayout(10, 10));
        this.add(jPanelIO, "Center");
        this.add(jPanel_btn, "South");

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void plus() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value = Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.plus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void minus() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value = Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.minus();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void multi() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value = Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.multi();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void divide() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value = Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.divide();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
    }

    public void pow() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value= Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.pow();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }

    public void mod() {
        double first_value = Double.parseDouble(jTextField_1st_value.getText());
        double second_value= Double.parseDouble(jTextField_2nd_value.getText());
        this.miniCalculatorModel.setFirstValue(first_value);
        this.miniCalculatorModel.setSecondValue(second_value);
        this.miniCalculatorModel.mod();
        this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
}
