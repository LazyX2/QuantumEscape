package QuantumEscape;

import QuantumEscape.QEChunks.*;

import java.awt.Point;
import java.util.HashMap;


public class QEGameDimension {

	public Point player;
	public QEGameChunk[] chunkTypes;
	public HashMap<Point, QEGameChunk> game_map = new HashMap<>();

	public QEGameDimension() {
		player = new Point(0,0);
		init(new QEGameChunk[] {new QEGreenChunk(), new QEYellowChunk(), new QERedChunk(), new QEBlueChunk()});
		game_map.put(new Point(0,0), chunkTypes[0]);
	}

	public void move(int x, int y) {
		player.x += x;
		player.y += y;
		generateDimension();
	}

	public void generateDimension() {
		QEGameChunk base = game_map.getOrDefault(new Point((int)(Math.floor(player.x/QEGameChunk.width)), (int)(Math.floor(player.y/QEGameChunk.height))), null);
		if (base == null) return;
		for (int x = -1; x < 2; x++) {
			Point px = new Point((int)(Math.floor(player.x/QEGameChunk.width))+x, (int)(Math.floor(player.y/QEGameChunk.height)));
			Point py = new Point((int)(Math.floor(player.x/QEGameChunk.width)), (int)(Math.floor(player.y/QEGameChunk.height))+x);
			QEGameChunk qegc_x = game_map.getOrDefault(px, null);
			QEGameChunk qegc_y = game_map.getOrDefault(py, null);
			try {
				if (qegc_x == null) game_map.put(px, base.nearChunks()[(int)Math.floor(Math.random()*2)].getClass().newInstance());
				if (qegc_y == null) game_map.put(py, base.nearChunks()[(int)Math.floor(Math.random()*2)].getClass().newInstance());
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	private void init(QEGameChunk[] chunkTypes) {
		this.chunkTypes = chunkTypes;
	}

	public void loadFromFile() {

	}

}
