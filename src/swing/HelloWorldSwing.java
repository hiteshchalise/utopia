package swing;

import javax.swing.*;

public class HelloWorldSwing {

    private static void createAndShowGUI(){

        JFrame frame = new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Hello World");
        frame.getContentPane().add(jLabel);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
