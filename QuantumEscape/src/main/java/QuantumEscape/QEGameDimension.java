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
		generateDimension(player);
	}

	public void generateDimension(Point loc) {
		QEGameChunk base = game_map.getOrDefault(new Point((int)(Math.floor(loc.x/QEGameChunk.width)), (int)(Math.floor(loc.y/QEGameChunk.height))), null);
		if (base == null) return;
		for (int x = -1; x < 2; x++) {
			for (int y = -1; y < 2; y++) {
				Point p = new Point((int)(Math.floor(loc.x/QEGameChunk.width))+x, (int)(Math.floor(loc.y/QEGameChunk.height))+y);
				QEGameChunk qegc = game_map.getOrDefault(p, null);
				try {
					if (qegc == null) game_map.put(p, base.nearChunks()[(int)Math.floor(Math.random()*2)].getClass().newInstance());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

	private void init(QEGameChunk[] chunkTypes) {
		this.chunkTypes = chunkTypes;
	}

	public void loadFromFile() {

	}

}
