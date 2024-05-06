package QuantumEscape;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;

public class QEGameWindow extends JFrame implements KeyListener {

    public QEGameWindow() throws IOException {
        setTitle("Quantum Escape");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(400,400));
        setIconImage(ImageIO.read(new URL("file:\\C:\\Users\\1212o\\Desktop\\QuantumEscape\\src\\main\\resources\\icon_image.jpg")));
        setVisible(true);
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (QuantumEscapeMain.screen == null) return;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_W: {
                QuantumEscapeMain.screen.dimension.move(0, -QuantumEscapeMain.speed);
                System.out.println('w');
                break;
            }
            case KeyEvent.VK_S: {
                QuantumEscapeMain.screen.dimension.move(0, QuantumEscapeMain.speed);
                System.out.println('s');
                break;
            }
            case KeyEvent.VK_A: {
                QuantumEscapeMain.screen.dimension.move(-QuantumEscapeMain.speed, 0);
                System.out.println('a');
                break;
            }
            case KeyEvent.VK_D: {
                QuantumEscapeMain.screen.dimension.move(QuantumEscapeMain.speed, 0);
                System.out.println('d');
                break;
            }
            default: {
                System.out.println(e.getExtendedKeyCode());
                //In case of errors?
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
