package awt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends Frame{

    Button btn;

    public Calc(){
        btn = new Button("Click Me!!");
        ActionImpl listener = new ActionImpl();
        add(btn);
        btn.addActionListener(listener);
    }

    static class ActionImpl implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println("Button Clicked");
        }
    }


    public static void main(String[] args) {
        Calc c = new Calc();
        c.setVisible(true);
        c.setSize(100, 100);

    }
}
