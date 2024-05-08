package QuantumEscape;

import QuantumEscape.QEChunks.QEGameChunk;

import javax.swing.*;
import java.awt.*;

public class QEGameRenderer extends JPanel {

    public String dimension_name;
    public QEGameDimension dimension;

    public QEGameRenderer() {
        setBackground(Color.black);
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dimension_name = "test1";
        dimension = QuantumEscapeMain.dimensions.get(dimension_name);
    }

    public boolean render(Graphics2D g) {
        dimension.game_map.forEach((loc, chunk) -> {
            g.setColor(chunk.vis());
            g.fillRect(
                    loc.x * QEGameChunk.width, loc.y * QEGameChunk.height,
                    QEGameChunk.width, QEGameChunk.height
            );
        });
        g.setColor(Color.lightGray);
        g.fillOval(dimension.player.x, dimension.player.y, 5, 5);
        return true;
    }

    @Override
    public void paint(Graphics g) {
        dimension = QuantumEscapeMain.dimensions.get(dimension_name);
        super.paint(g);
        render((Graphics2D) g);
        g.setColor(Color.white);
        if (QuantumEscapeMain.gameLoop != null) g.drawString("FPS: " + QuantumEscapeMain.gameLoop.fps, 10,10);
        g.drawString("X: " + dimension.player.x +", Y: " + dimension.player.y, 10,25);
        g.drawString("Dimension: " + dimension_name, 10, 40);
    }
}
