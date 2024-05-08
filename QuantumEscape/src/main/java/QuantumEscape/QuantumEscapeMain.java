package QuantumEscape;


import java.io.IOException;
import java.util.HashMap;

public class QuantumEscapeMain {

    public static QEGameWindow window = null;
    public static QEGameRenderer screen;
    public static QEGameState gameState;
    public static QEGameLoop gameLoop;
    public static int speed = 3;
    public static HashMap<String, QEGameDimension> dimensions = new HashMap<>();

    public static void main(String[] args) {
        try {
            window = new QEGameWindow();
        } catch (IOException e) {
            System.out.println("The Icon Image does not exist, fix this, retard.");
            e.printStackTrace();
        }
        if (window == null) return;
        dimensions.put("test1", new QEGameDimension());
        dimensions.put("test2", new QEGameDimension());
        screen = new QEGameRenderer();
        window.add(screen);
        gameState = QEGameState.INTRO;
        gameLoop = new QEGameLoop();
        gameLoop.start();

    }

}
