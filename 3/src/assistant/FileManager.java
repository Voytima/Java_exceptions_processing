package assistant;

import java.io.IOException;
import java.io.File;
import java.io.FileWriter;

public class FileManager {
    public static void fileWriterFile(String[] arrData, String nameFiles, String format, String symbol) throws IOException {
        if (!fileExist(new File(nameFiles + format))) {
            fileWriterNewFile(arrData, nameFiles + format, symbol);
        } else {
            fileWriterOldFile(arrData, nameFiles + format, symbol);
        }
        System.out.println("Запись успешно записана");
    }

    private static void fileWriterNewFile(String[] arrData, String nameFiles, String symbol) throws IOException {
        int symbolCount = arrData.length - 1;
        try(FileWriter fileWriter = new FileWriter(nameFiles)) {
            for (int i = 0; i < arrData.length; i++) {
                fileWriter.write(arrData[i]);
                if (symbolCount > 0) {
                    fileWriter.write(" " + symbol + " ");
                    symbolCount --;
                }
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    private static void fileWriterOldFile(String[] arrData, String nameFiles, String symbol) throws IOException {
        int symbolCount = arrData.length - 1;
        try(FileWriter fileWriter =  new FileWriter(nameFiles, true)) {
            fileWriter.write("\n");
            for (int i = 0; i < arrData.length; i++) {
                fileWriter.write(arrData[i]);
                if (symbolCount > 0) {
                    fileWriter.write(" " + symbol + " ");
                    symbolCount --;
                }
            }
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    private static boolean fileExist(File file) {
        return file.exists();
    }
}
