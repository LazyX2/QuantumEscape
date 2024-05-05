package QuantumEscape;

import javax.swing.*;
import java.awt.*;

public class QEGameRenderer extends JPanel {

    public QEGameRenderer() {
        setBackground(Color.black);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }

    public boolean render(Graphics2D g) {

        return true;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        render((Graphics2D) g);
    }
}
