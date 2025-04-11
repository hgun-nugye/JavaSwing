package Color.view;

import Color.controller.MyColorListener;
import Color.model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;

    public MyColorView() {
        this.myColorModel = new MyColorModel();
        this.init();
    }

    private void init() {
        this.setTitle("MY COLOR");
        this.setSize(800, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        //Font
        Font font = new Font("Monospaced", Font.BOLD, 20);
        Font font_text=new Font("DialogInput", Font.BOLD, 100);

        jLabel = new JLabel("TH TRUE MILK", SwingConstants.CENTER);
        jLabel.setFont(font_text);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));

        //tao Listener
        MyColorListener myColorListener=new MyColorListener(this);

        //tao nut nhan thay doi mau chu
        JButton jButton_text_red = new JButton("Red text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.RED);
        jButton_text_red.addActionListener(myColorListener);

        JButton jButton_text_yellow = new JButton("Yellow text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setForeground(Color.YELLOW);
        jButton_text_yellow.addActionListener(myColorListener);

        JButton jButton_text_green = new JButton("Green text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.green);
        jButton_text_green.addActionListener(myColorListener);

        //tao nut nhan thay doi mau background
        JButton jButton_bg_red = new JButton("Red background");
        jButton_bg_red.setFont(font);
        jButton_bg_red.setBackground(Color.RED);
        jButton_bg_red.setOpaque(true);
        jButton_bg_red.setBorderPainted(false);
        jButton_bg_red.addActionListener(myColorListener);

        JButton jButton_bg_yellow = new JButton("Yellow background");
        jButton_bg_yellow.setFont(font);
        jButton_bg_yellow.setBackground(Color.YELLOW);
        jButton_bg_yellow.setOpaque(true);
        jButton_bg_yellow.setBorderPainted(false);
        jButton_bg_yellow.addActionListener(myColorListener);

        JButton jButton_bg_green = new JButton("Green background");
        jButton_bg_green.setFont(font);
        jButton_bg_green.setBackground(Color.green);
        jButton_bg_green.setOpaque(true);
        jButton_bg_green.setBorderPainted(false);
        jButton_bg_green.addActionListener(myColorListener);

        //add button vao JPanel
        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_bg_red);
        jPanel.add(jButton_bg_yellow);
        jPanel.add(jButton_bg_green);

        this.setLayout(new BorderLayout(20, 0));
        this.add(jLabel, "North");
        this.add(jPanel, "Center");

        this.setVisible(true);
    }

    public void changeColorText(Color color) {
        this.jLabel.setForeground(color);
    }

    public void changeColorBg(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
