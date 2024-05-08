package QuantumEscape;


import java.awt.*;
import java.io.IOException;

public class QuantumEscapeMain {

    public static QEGameWindow window = null;
    public static QEGameRenderer screen;
    public static QEGameState gameState;
    public static QEGameLoop gameLoop;
    public static int speed = 3;


    public static void main(String[] args) {
        try {
            window = new QEGameWindow();
        } catch (IOException e) {
            System.out.println("The Icon Image does not exist, fix this, retard.");
            e.printStackTrace();
        }
        if (window == null) return;
        screen = new QEGameRenderer();
        window.add(screen);
        gameState = QEGameState.INTRO;
        gameLoop = new QEGameLoop();
        gameLoop.start();

    }

}
