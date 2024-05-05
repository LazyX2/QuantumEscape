package QuantumEscape;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;

public class QEGameWindow extends JFrame {

    public QEGameWindow() throws IOException {
        setTitle("Quantum Escape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400,400));
        setIconImage(ImageIO.read(new URL("file:\\C:\\Users\\1212o\\Desktop\\QuantumEscape\\src\\main\\resources\\icon_image.jpg")));
        setVisible(true);
    }

}
