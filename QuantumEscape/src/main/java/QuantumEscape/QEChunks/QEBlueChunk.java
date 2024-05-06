package QuantumEscape.QEChunks;

import java.awt.*;

public class QEBlueChunk implements QEGameChunk {

	@Override
	public QEGameChunk[] nearChunks() {
		return new QEGameChunk[]{new QERedChunk(), new QEYellowChunk()};
	}

	@Override
	public Color vis() {
		return Color.blue;
	}
}
