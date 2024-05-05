package QuantumEscape;

import QuantumEscape.QEUtils.QEFileUtils;

import java.io.IOException;
import java.util.Arrays;

public class QuantumEscapeMain {

    public static QEGameWindow window = null;
    public static QEGameRenderer screen;
    public static QEGameState gameState;
    public static QEGameLoop gameLoop;

    public static void main(String[] args) {
        try {
            Arrays.stream(QEFileUtils.readFile("C:\\Users\\1212o\\Desktop\\QuantumEscape\\src\\main\\resources\\testmap.txt")).toList().forEach(line -> System.out.println(line));
        } catch (Exception e) {
            e.printStackTrace();
        } try {
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
