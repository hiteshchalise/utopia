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
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(buttonOne, gbc);

        Button buttonTwo = new Button("ButtonTwo");
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(buttonTwo, gbc);

        Button buttonThree = new Button("ButtonThree");
        gbc.gridx = 2;
        gbc.gridy = 0;
        frame.add(buttonThree, gbc);

        Button buttonFour = new Button("ButtonFour");
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.ipady = 40;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        frame.add(buttonFour, gbc);

        Button buttonFive = new Button("ButtonFive");
        gbc.ipady = 0;
        gbc.gridheight = 0;
        gbc.anchor = GridBagConstraints.PAGE_END;
        gbc.insets = new Insets(10,0,0,0);
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
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
