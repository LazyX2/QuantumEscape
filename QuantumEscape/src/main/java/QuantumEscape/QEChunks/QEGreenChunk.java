package QuantumEscape.QEChunks;

import java.awt.*;

public class QEGreenChunk implements QEGameChunk {
	@Override
	public QEGameChunk[] nearChunks() {
		return new QEGameChunk[]{new QERedChunk(), new QEBlueChunk()};
	}

	@Override
	public Color vis() {
		return Color.green;
	}
}
