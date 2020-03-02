package awt;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AddSubFrame extends Frame{

    private TextField textField1, textField2, textField3;
    private Button addButton, subButton;

    public AddSubFrame() {
        textField1 = new TextField("0", 4);
        textField2 = new TextField("0", 4);
        textField3 = new TextField("0",4);

        addButton = new Button("Add");
        subButton = new Button("Sub");

        setLayout(new FlowLayout());
        add(textField1);
        add(textField2);

        add(addButton);
        add(subButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("add clicked");
            }
        });
        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("sub clicked");
            }
        });

        add(textField3);
    }
//
//    @Override
//    public void actionPerformed(ActionEvent actionEvent) {
//        String action = actionEvent.getActionCommand();
//
//        int x = Integer.parseInt(textField1.getText());
//        int y = Integer.parseInt(textField2.getText());
//
//        int z = 0;
//        System.out.println(x + " " + y);
//        if (action.equals("Add")) {
//            z = x + y;
//        }else {
//            z = x - y;
//        }
//        System.out.println(z);
//        textField3.setText(String.valueOf(z));
//    }

    public static void main(String[] args) {
        AddSubFrame addSubFrame = new AddSubFrame();

        addSubFrame.setSize(400, 400);
        addSubFrame.setVisible(true);

        addSubFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

        });
    }

    class SomeAdapeter extends WindowAdapter{

        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
