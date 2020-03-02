package layoutmanager;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridBagLayoutExample {

    GridBagLayoutExample(){
        Frame frame = new Frame("GridBagLayout");

        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        Button buttonOne = new Button("ButtonOne");
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridheight = 5;
        gbc.fill = GridBagConstraints.VERTICAL;
        frame.add(buttonOne, gbc);

        Button buttonTwo = new Button("ButtonTwo");
        gbc.gridheight = 1;
        gbc.gridx = 2;
        gbc.gridy = 2;
        frame.add(buttonTwo, gbc);

        Button buttonThree = new Button("ButtonThree");
        gbc.gridx = 3;
        gbc.gridy = 3;
        frame.add(buttonThree, gbc);

        Button buttonFour = new Button("ButtonFour");
        gbc.gridx = 4;
        gbc.gridy = 4;
        frame.add(buttonFour, gbc);

        Button buttonFive = new Button("ButtonFive");
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(buttonFive, gbc);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(500, 500);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}
