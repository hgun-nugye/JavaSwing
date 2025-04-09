
import javax.swing.*;

public class FirstSwingExample {
    public static void main(String[] args) {
        JFrame f = new JFrame();//Tao instance cua JFrame

        JButton b = new JButton("click");//Tao instance cua JButton
        b.setBounds(130, 100, 100, 40);//truc x, truc y, do rong, chieu cao

        f.add(b);//Them button vao trong JFrame

        f.setSize(400, 500);//Do rong la 400 va chieu cao la 500
        f.setLayout(null);//Khong su dung Layout Manager
        f.setVisible(true);//Tao Frame la co the nhin thay (visible)
    }
}

