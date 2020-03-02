package layoutmanager;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutExample {

    GridLayoutExample(){
        Frame frame = new Frame("GridLayoutExample");

        frame.setLayout(new GridLayout(3, 2));

        Button buttonOne = new Button("ButtonOne");
        Button buttonTwo = new Button("ButtonTwo");
        Button buttonThree = new Button("ButtonThree");
        Button buttonFour = new Button("ButtonFour");
        Button buttonFive = new Button("ButtonFive");

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(buttonFour);
        frame.add(buttonFive);


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
        new GridLayoutExample();
    }
}
