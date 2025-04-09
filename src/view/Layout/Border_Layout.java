package view.Layout;

import javax.swing.*;
import java.awt.*;

public class Border_Layout extends JFrame {
    public Border_Layout() {
        this.setTitle("Vi du border layout");
        this.setSize(400, 200);
//        this.setLocation(100, 100);

        //tu dong can giua frame
        this.setLocationRelativeTo(null);

        //set layout cho frame
//        BorderLayout borderLayout = new BorderLayout();
//        this.setLayout(borderLayout);

        //set layout co vi tri va khoang cach 'gap'
        BorderLayout borderLayout2 = new BorderLayout(20, 20);
        this.setLayout(borderLayout2);


        //Button
        JButton jbtn1 = new JButton("Button 1");
        JButton jbtn2 = new JButton("Button 2");
        JButton jbtn3 = new JButton("Button 3");
        JButton jbtn4 = new JButton("Button 4");

        //add thanh phan vao frame
        this.add(jbtn1, BorderLayout.EAST);
        this.add(jbtn2, "West");
        this.add(jbtn3, BorderLayout.NORTH);
        this.add(jbtn4, BorderLayout.SOUTH);
        this.add(new JButton("Button 5"), "Center");


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {

        Border_Layout l1 = new Border_Layout();
    }

}
