package view.MVC;

import controller.CounterListener;
import model.CounterModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CounterView extends JFrame {
    private CounterModel counterModel;
    private JButton jButton_up;
    private JButton jButton_down;
    private JLabel jLabel_value;

    public CounterView() {
        this.counterModel = new CounterModel();
        this.init();
        this.setVisible(true);
    }

    public void init() {
        this.setTitle("Counter");
        this.setSize(200, 200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ActionListener ac=new CounterListener(this);

        jButton_up = new JButton("UP");
        jButton_up.addActionListener(ac);

        jButton_down = new JButton("DOWN");
        jButton_down.addActionListener(ac);

        jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new BorderLayout());

        jPanel_center.add(jButton_up, "West");
        jPanel_center.add(jLabel_value, "Center");
        jPanel_center.add(jButton_down, "East");

        this.setLayout(new BorderLayout());
        this.add(jPanel_center, "Center");
    }

    public void increment()
    {
        this.counterModel.increment();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }

    public void decrement()
    {
        this.counterModel.decrement();
        this.jLabel_value.setText(this.counterModel.getValue()+"");
    }
}
