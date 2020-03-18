package swing;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class SwingComponents extends JFrame {

    public SwingComponents() {


        JPanel mainPanel = new JPanel();

        // JToggleButton
        JToggleButton jToggleButton = new JToggleButton("On", false);
        jToggleButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if (jToggleButton.isSelected()) jToggleButton.setText("Off");
                else jToggleButton.setText("On");
            }
        });
        JPanel jTogglePanel = new JPanel();
        jTogglePanel.add(jToggleButton);

        // JCheckBox
        JCheckBox checkbox = new JCheckBox("Check Me");
        checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                System.out.println("checkbox state changed: " + checkbox.isSelected());
            }
        });
        JPanel jCheckBoxPanel = new JPanel();
        jCheckBoxPanel.add(checkbox);


        // JRadioButton
        JRadioButton r1 = new JRadioButton("A) Male", true);
        JRadioButton r2 = new JRadioButton("B) Female");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        JPanel jRadioButtonPanel = new JPanel();
        jRadioButtonPanel.add(r1);
        jRadioButtonPanel.add(r2);

        // Tabbed Pane
        JTabbedPane jTabbedPane = new JTabbedPane();
        jTabbedPane.setBounds(0, 0, 400, 400);
        jTabbedPane.add("tb", jTogglePanel);
        jTabbedPane.add("cb", jCheckBoxPanel);
        jTabbedPane.add("rb", jRadioButtonPanel);

        String imagePath = "hand.png";
        java.net.URL imgURL = getClass().getResource(imagePath);
        ImageIcon imageIcon = new ImageIcon(imgURL, "description");
        JLabel imageLabel = new JLabel("", imageIcon, JLabel.CENTER);
        mainPanel.add(imageLabel);

        mainPanel.add(jTabbedPane);

        this.add(mainPanel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingComponents();
    }
}
