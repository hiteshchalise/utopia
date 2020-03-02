package awt;

import java.awt.*;
import java.awt.event.*;

public class DialogExample extends Frame {
    private static Dialog d;

    DialogExample() {
        Button b = new Button("OK");
        d = new Dialog(this, "new Dialog");
        d.setSize(100, 100);
        d.add(new Label("hey hey"));
        d.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                DialogExample.d.setVisible(false);
            }
        });
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                DialogExample.d.setVisible(true);
            }
        });
        add(new Label("Click button to continue."));
        add(b);
        setLayout(new FlowLayout());
        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String args[]) {
        new DialogExample();
    }
}