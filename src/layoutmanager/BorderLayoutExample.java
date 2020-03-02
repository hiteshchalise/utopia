package layoutmanager;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutExample {

    BorderLayoutExample(){
        Frame frame = new Frame("BorderLayout");

        frame.setLayout(new BorderLayout());

        Button buttonOne = new Button("ButtonOne");
        Button buttonTwo = new Button("ButtonTwo");
        Button buttonThree = new Button("ButtonThree");
        Button buttonFour = new Button("ButtonFour");
        Button buttonFive = new Button("ButtonFive");

        frame.add(buttonOne, BorderLayout.NORTH);
        frame.add(buttonTwo, BorderLayout.SOUTH);
        frame.add(buttonThree, BorderLayout.EAST);
        frame.add(buttonFour, BorderLayout.WEST);
        frame.add(buttonFive, BorderLayout.CENTER);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
