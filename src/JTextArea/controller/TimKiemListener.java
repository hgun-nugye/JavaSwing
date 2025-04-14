package JTextArea.controller;

import JTextArea.view.TimKiemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimKiemListener implements ActionListener {
    private TimKiemView timKiemView;

    public TimKiemListener(TimKiemView timKiemView) {
        this.timKiemView=timKiemView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        this.timKiemView.TimKiem();
    }
}
