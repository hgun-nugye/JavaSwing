package Font.controller;

import Font.view.LastButtonView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LastButtonListener implements ActionListener {

    private LastButtonView lastButtonView;

    public LastButtonListener(LastButtonView lastButtonView) {
        super();
        this.lastButtonView = lastButtonView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();

        switch (src) {
            case "1" -> this.lastButtonView.changeTo_1();
            case "2" -> this.lastButtonView.changeTo_2();
            case "3" -> this.lastButtonView.changeTo_3();
            case "4" -> this.lastButtonView.changeTo_4();
        }
    }
}
