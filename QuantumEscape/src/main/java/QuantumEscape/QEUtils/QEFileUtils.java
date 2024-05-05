package QuantumEscape.QEUtils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QEFileUtils {

	public static int countLines(String path) throws Exception {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		int lines = 0;
		while (reader.readLine() != null) lines++;
		reader.close();
		return lines;
	}

	public static String[] readFile(String path) throws Exception {
		String[] lines = new String[countLines(path)];
		File to_read = new File(path);
		if (!to_read.canRead()) throw new IOException("The file: " + path + " cannot be read.");
		Scanner s = new Scanner(to_read);
		int index = 0;
		while (s.hasNextLine()) {
			lines[index] = s.nextLine();
			index++;
		}
		s.close();
		return lines;
	}

}
