package QuantumEscape.QEChunks;

import java.awt.Color;

public class QERedChunk implements QEGameChunk {
	@Override
	public QEGameChunk[] nearChunks() {
		return new QEGameChunk[]{new QEGreenChunk(), new QEBlueChunk()};
	}

	@Override
	public Color vis() {
		return Color.red;
	}
}
