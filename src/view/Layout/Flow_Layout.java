package view.Layout;

import javax.swing.*;
import java.awt.*;

public class Flow_Layout extends JFrame {
    public Flow_Layout() {
        this.setTitle("Vi du flow layout");
        this.setSize(400, 200);
//        this.setLocation(100, 100);

        //tu dong can giua frame
        this.setLocationRelativeTo(null);

        //set layout cho frame
//        FlowLayout flowLayout = new FlowLayout();
//        this.setLayout(flowLayout);

        //set layout co vi tri theo chieu ngang
//        FlowLayout flowLayout1= new FlowLayout(FlowLayout.LEADING);
//        this.setLayout(flowLayout1);

        //set layout co vi tri va khoang cach 'gap'
        FlowLayout flowLayout2 = new FlowLayout(1, 40, 20);
        this.setLayout(flowLayout2);


        //Button
        JButton jbtn1 = new JButton("Button 1");
        JButton jbtn2 = new JButton("Button 2");
        JButton jbtn3 = new JButton("Button 3");

        //add thanh phan vao frame
        this.add(jbtn1);
        this.add(jbtn2);
        this.add(jbtn3);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        Flow_Layout l1 = new Flow_Layout();
    }

}
