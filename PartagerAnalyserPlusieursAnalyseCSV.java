package csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class PartagerAnalyserPlusieursAnalyseCSV {

	private static CSVReader csvReader;

	public PartagerAnalyserPlusieursAnalyseCSV() {
		// TODO Auto-generated constructor stub
	}

	protected static List<String[] > readCsvFile(String fileName, char separator) {
        final List<String[] > data = new ArrayList<String[] >();

        try {
            final File file = new File(fileName);
            final FileReader fr = new FileReader(file);

            csvReader = new CSVReader(fr, separator);

            String[] nextLine = null;
            while ((nextLine = csvReader.readNext()) != null) {
                final int size = nextLine.length;

                // ligne vide
                if (size == 0) {
                    continue;
                }
                final String debut = nextLine[0].trim();
                if (debut.length() == 0 && size == 1) {
                    continue;
                }

                // ligne de commentaire
                if (debut.startsWith("#")) {
                    continue;
                }
                data.add(nextLine);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
