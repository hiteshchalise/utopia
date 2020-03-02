package layoutmanager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CardLayoutExample implements ActionListener{

    private final CardLayout cardLayout;
    private final Frame frame;

    CardLayoutExample(){
        frame = new Frame("CardLayout");

        cardLayout = new CardLayout();
        frame.setLayout(cardLayout);

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

        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        cardLayout.next(frame);
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }

}
