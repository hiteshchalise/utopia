package applet;

import java.applet.Applet;
import java.awt.*;

public class AppletHelloWorld extends Applet {
    StringBuffer buffer;

    @Override
    public void init() {
        buffer = new StringBuffer();
        addItem("Initializing...");
    }

    @Override
    public void start() {
        addItem("Starting...");
    }

    @Override
    public void stop() {
        addItem("Stopping...");
    }

    @Override
    public void destroy() {
        addItem("Destroying");
    }

    private void addItem(String newString){
        System.out.println(newString);
        buffer.append(newString);
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(0, 0, getWidth()-1, getHeight()-1);
        g.drawString(buffer.toString(), 5, 15);
    }
}
