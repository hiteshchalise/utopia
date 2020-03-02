package layoutmanager;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowLayoutExample {

    FlowLayoutExample(){
        Frame frame = new Frame("FlowLayout");

        frame.setLayout(new FlowLayout());

        Button buttonOne = new Button("ButtonOne");
        Button buttonTwo = new Button("ButtonTwo");
        Button buttonThree = new Button("ButtonThree");
        Button buttonFour = new Button("ButtonFour");

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);

        frame.setVisible(true);
        frame.setSize(300, 300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
