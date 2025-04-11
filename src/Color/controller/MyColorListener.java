package Color.controller;

import Color.view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    public MyColorView myColorView;

    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        switch (src) {
            case "Red text" -> this.myColorView.changeColorText(Color.RED);
            case "Yellow text" -> this.myColorView.changeColorText(Color.YELLOW);
            case "Green text" -> this.myColorView.changeColorText(Color.GREEN);
            case "Red background" -> this.myColorView.changeColorBg(Color.red);
            case "Yellow background" -> this.myColorView.changeColorBg(Color.YELLOW);
            case "Green background" -> this.myColorView.changeColorBg(Color.GREEN);
        }


    }
}
