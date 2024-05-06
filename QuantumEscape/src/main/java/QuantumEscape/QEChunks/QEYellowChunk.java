package QuantumEscape.QEChunks;

import java.awt.*;

public class QEYellowChunk implements QEGameChunk {

	@Override
	public QEGameChunk[] nearChunks() {
		return new QEGameChunk[]{new QEGreenChunk(), new QEBlueChunk()};
	}

	@Override
	public Color vis() {
		return Color.yellow;
	}
}
