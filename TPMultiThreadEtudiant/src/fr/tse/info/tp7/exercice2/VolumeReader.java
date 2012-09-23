package fr.tse.info.tp7.exercice2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class VolumeReader {
	static final int NUMBERS = 4;

	public static String[] readVolumes() {
		String[] volumes = new String[NUMBERS];
		for (int i = 0; i < volumes.length; i++) {
			try {
				volumes[i] = FileUtils.readFileToString(new File(
						"volumes/quote" + i + ".txt"));
			} catch (IOException e) {
				System.err.println("Erreur de lecture du volume " + i);
				System.exit(-1);
			}
		}
		try {
			FileUtils.writeStringToFile(new File("gros.txt"), volumes[0]);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return volumes;
	}
}
