package view.Frame;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();

        //dat tieu de cho JFrame
        jf.setTitle("VÍ DỤ VỀ JFRAME");

        //gan kich co JFrame
        jf.setSize(600, 400);

        //set vi tri JFrame khi hien thi
        jf.setLocation(100,100);

//        while(true)
//        {
//            System.out.println("Program is running!");
//        } --> chuong trinh van chay khi tat JFrame

        //tắt chương trình khi đóng cửa sổ JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //cho phep hien thi, (nen de duoi cung)
        jf.setVisible(true);
    }
}
