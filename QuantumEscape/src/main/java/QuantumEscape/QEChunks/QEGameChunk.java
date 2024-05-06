package QuantumEscape.QEChunks;

import java.awt.Color;

public interface QEGameChunk {

	int width = 16;
	int height = 16;

	QEGameChunk[] nearChunks();
	Color vis();

}
