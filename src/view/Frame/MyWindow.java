package view.Frame;

import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow() {

    }

    public void Show() {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Show(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void Show(String title, int width, int height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void Show(String title, int width, int height, int loca_width, int loca_height) {
        this.setTitle(title);
        this.setSize(width, height);
        this.setLocation(loca_width, loca_height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow newWD1 = new MyWindow();
        MyWindow newWD2 = new MyWindow();
        MyWindow newWD3 = new MyWindow();
        MyWindow newWD4 = new MyWindow();

        newWD1.Show();
        newWD2.Show("New Window second from JFrame");
        newWD3.Show("New Window third from JFrame", 400, 200);
        newWD4.Show("New Window fourth from JFrame", 300, 500, 200, 200);


    }


}
