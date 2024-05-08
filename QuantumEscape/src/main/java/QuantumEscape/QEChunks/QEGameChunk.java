package QuantumEscape.QEChunks;

import java.awt.Color;

public interface QEGameChunk {

	int width = 32;
	int height = 32;

	QEGameChunk[] nearChunks();
	Color vis();

}
