package QuantumEscape;

public class QEGameLoop extends Thread {

    public int fps = 0;

    public QEGameLoop() {
    }

    @Override
    public void start() {
        super.start();
        long start = System.currentTimeMillis();
        while (QuantumEscapeMain.window.isVisible()) {
            QuantumEscapeMain.screen.repaint();
            fps += 1;
            if (System.currentTimeMillis()-start >= 2000 || fps >= 60) {
                fps = 0;
                start = System.currentTimeMillis();
            }
        }
    }
}