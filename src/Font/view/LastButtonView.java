package Font.view;

import Font.controller.LastButtonListener;
import Font.model.LastButtonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class LastButtonView extends JFrame {
    private LastButtonModel lastButtonModel;
    private JLabel jLabel;

    public LastButtonView() {
        this.lastButtonModel = new LastButtonModel();

        this.init();
    }

    private void init() {
        this.setTitle("Last Button");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);

        JPanel jPanel_center = new JPanel();
        jPanel_center.setLayout(new GridLayout(2,2));

        //tao listener
        LastButtonListener lastButtonListener=new LastButtonListener(this);



        //tao font chu
        Font font=new Font("Arial", Font.BOLD, 20);

        JButton jButton_1=new JButton("1");
        jButton_1.addActionListener(lastButtonListener);
        JButton jButton_2=new JButton("2");
        jButton_2.addActionListener(lastButtonListener);
        JButton jButton_3=new JButton("3");
        jButton_3.addActionListener(lastButtonListener);
        JButton jButton_4=new JButton("4");
        jButton_4.addActionListener(lastButtonListener);

        //gan font chu
        jButton_1.setFont(font);
        jButton_2.setFont(font);
        jButton_3.setFont(font);
        jButton_4.setFont(font);

        //add button vao panel center
        jPanel_center.add(jButton_1);
        jPanel_center.add(jButton_2);
        jPanel_center.add(jButton_3);
        jPanel_center.add(jButton_4);

        JPanel jPanel_footer=new JPanel();

        jLabel=new JLabel("-------");
        jLabel.setFont(font);
        jPanel_footer.add(jLabel);

        this.setLayout(new BorderLayout());
        this.add(jPanel_center, "Center");
        this.add(jPanel_footer, "South");

        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void changeTo_1(){
        this.lastButtonModel.setValue_1();
        jLabel.setText("Last button: "+ this.lastButtonModel.getValue());
    }

    public void changeTo_2(){
        this.lastButtonModel.setValue_2();
        jLabel.setText("Last button: "+ this.lastButtonModel.getValue());
    }

    public void changeTo_3(){
        this.lastButtonModel.setValue_3();
        jLabel.setText("Last button: "+ this.lastButtonModel.getValue());
    }

    public void changeTo_4(){
        this.lastButtonModel.setValue_4();
        jLabel.setText("Last button: "+ this.lastButtonModel.getValue());
    }
}
