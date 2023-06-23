package CalcsAndIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Class that handles file management in the application.
 */
public class FileManagment {

    // Store the file path in a private attribute.
    private final File path = new File("src/main/resources");

    /**
     * Gets the file path.
     *
     * @return The file path.
     */
    public File getPath() {
        return path;
    }

    /**
     * Checks if the file entered by the user exists in the directory.
     *
     * @param fileName The name of the file.
     */
    public void checkFile(String fileName) {
        try {
            File userFile = new File(path, fileName);
            if (userFile.exists()) {
                System.out.println("[i] The entered file already exists in the directory.");
            } else {
                System.out.println("[i] Creating the file in the directory.");
                newFile(userFile);
            }
        } catch (IOException e) {
            System.out.println("[ERROR] An error occurred while creating the file.");
        }
    }

    /**
     * Creates a new file if it doesn't exist.
     *
     * @param userFile The file to create.
     * @throws IOException If an error occurs while creating the file.
     */
    private void newFile(File userFile) throws IOException {
        if (userFile.createNewFile()) {
            System.out.println("[OK] The file has been created successfully.");
        } else {
            System.out.println("[ERROR] There was a problem creating the file.");
        }
    }

    /**
     * Saves the data to a file.
     *
     * @param saveFile The name of the destination file.
     * @param text     The array of text to save.
     */
    public void fileSaving(String saveFile, String[] text) {

        try (PrintWriter fileOutput = new PrintWriter(new File(path, saveFile))) {

            for (int i = 0; i < text.length; i++) {
                fileOutput.print(text[i] + " ");
                fileOutput.flush();
                if (i % 20 == 0) {
                    fileOutput.print(text[i] + " ");
                    fileOutput.println();
                    fileOutput.flush();
                }
            }
            System.out.println("[OK] The file has been saved successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] The file was not found. Exiting the program.");
            System.exit(0);
        }
    }

}