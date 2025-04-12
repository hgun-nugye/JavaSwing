package JTextField.controller;

import JTextField.view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView;

    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView)
    {
        this.miniCalculatorView=miniCalculatorView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String btn=e.getActionCommand();

        switch(btn){
            case "+"->this.miniCalculatorView.plus();
            case "-"->this.miniCalculatorView.minus();
            case "*"->this.miniCalculatorView.multi();
            case "/"->this.miniCalculatorView.divide();
            case "^"->this.miniCalculatorView.pow();
            case "%"->this.miniCalculatorView.mod();
        }
    }

}

