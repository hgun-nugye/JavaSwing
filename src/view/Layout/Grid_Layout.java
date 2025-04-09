package view.Layout;

import javax.swing.*;
import java.awt.*;

public class Grid_Layout extends JFrame {
    public Grid_Layout() {
        this.setTitle("Vi du grid layout");
        this.setSize(400, 200);
//        this.setLocation(100, 100);

        //tu dong can giua frame
        this.setLocationRelativeTo(null);

        //set layout cho frame
//        GridLayout GridLayout = new GridLayout();
//        this.setLayout(GridLayout);

        //set layout co so dong va so cot
//        GridLayout GridLayout1 = new GridLayout(2, 2);
//        this.setLayout(GridLayout1);

        //set layout co so dogn, so cot va khoang cach 'gap'
        GridLayout GridLayout2= new GridLayout(5,2, 15, 15);
        this.setLayout(GridLayout2);


        //tao button va them vao grid
        for(int i=1; i<10; i++)
        {
            JButton btn=new JButton("Button " +i);
            this.add(btn);
        }


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }


    public static void main(String[] args) {
        Grid_Layout l1 = new Grid_Layout();
    }

}