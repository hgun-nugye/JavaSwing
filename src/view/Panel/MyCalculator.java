package view.Panel;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("My Calculator");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTextField jTextField = new JTextField(50);

        //tao JPanel head chua textfield
        JPanel jPanel_head = new JPanel();
        jPanel_head.setLayout(new BorderLayout());
        jPanel_head.add(jTextField, BorderLayout.CENTER);


//        this.add(jTextField);

//        JButton btn0=new JButton("0");
//        JButton btn1=new JButton("1");
//        JButton btn2=new JButton("2");
//        JButton btn3=new JButton("3");
//        JButton btn4=new JButton("4");
//        JButton btn5=new JButton("5");
//        JButton btn6=new JButton("6");
//        JButton btn7=new JButton("7");
//        JButton btn8=new JButton("8");
//        JButton btn9=new JButton("9");

        //tao JPanel chua cac button
        JPanel jPanel_button = new JPanel();
        jPanel_button.setLayout(new GridLayout(5, 3));

        //add buttons vao JPanel
        for (int i = 0; i < 10; i++) {
            JButton btn = new JButton("" + i);
            jPanel_button.add(btn);
        }
        JButton btn_cong = new JButton("+");
        jPanel_button.add(btn_cong);

        JButton btn_tru = new JButton("-");
        jPanel_button.add(btn_tru);

        JButton btn_nhan = new JButton("*");
        jPanel_button.add(btn_nhan);

        JButton btn_chia = new JButton("/");
        jPanel_button.add(btn_chia);

        JButton btn_bang = new JButton("=");
        jPanel_button.add(btn_bang);


        //set Layout cho Frame
        this.setLayout(new BorderLayout());

        this.add(jPanel_head, BorderLayout.NORTH);
        this.add(jPanel_button, BorderLayout.CENTER);


        this.setVisible(true);

    }

    public static void main(String[] args) {
//        MyCalculator newCal = new MyCalculator();

        //look and feel
        try {
//			com.sun.java.swing.plaf.gtk.GTKLookAndFeel (khong con ho tro)
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

            //khong con ho tro
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            new MyCalculator();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
