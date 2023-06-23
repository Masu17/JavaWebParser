package CalcsAndIO;

import PException.NewFileException;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**

 Class that handles input and output of data in the application.
 */
public class InputOutput {

    private final Scanner SC = new Scanner(System.in);
    private String fileName;
    private String urlName;

    /**

     Gets the file name entered by the user.
     @return The file name.
     */
    public String getFileName() {
        return fileName;
    }
    /**

     Gets the URL entered by the user.
     @return The URL.
     */
    public String getUrlName() {
        return urlName;
    }
    /**

     Prompts the user to enter the file name.
     Performs extension checks and handles exceptions.
     */
    public void userInput() {
        do {
            try {
                System.out.print("Enter the file name .txt | .html: ");
                fileName = SC.next();
                if (checkExtension()) {
                    return;
                }
            } catch (NewFileException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
    /**

     Checks the extension of the file entered by the user.
     @return true if the extension is valid, false otherwise.
     @throws NewFileException if the extension is not valid or no extension was provided.
     */
    private boolean checkExtension() throws NewFileException {
        // Check if it has an extension
        if (fileName.contains(".") && !(fileName.indexOf(".") == 0)) {
        // Extract the extension
            int dotFile = fileName.indexOf(".");
            String extension = fileName.substring(dotFile);
        // Check if it's a valid extension
            if (extension.equals(".html") || extension.equals(".txt")) {
                return true;
            } else {
                throw new NewFileException("[ERROR] The entered extension is not valid, enter a file with extension: [.html] [.txt]");
            }
        } else {
            throw new NewFileException("[ERROR] The file does not have an extension.");
        }
    }
    /**

     Prompts the user to enter the URL of the web page.
     Performs URL checks and handles exceptions.
     */
    public void userURL() {
        do {
            try {
                System.out.print("Enter the URL of the web page: ");
                urlName = SC.next();
                if (checkURL()) {
                    return;
                }
            } catch (MalformedURLException e) {
                System.out.println("[ERROR] The entered URL is not valid.");
            }
        } while (true);
    }
    /**

     Checks the validity of the URL entered by the user.
     @return true if the URL is valid, false otherwise.
     @throws MalformedURLException if the URL is not valid.
     */
    private boolean checkURL() throws MalformedURLException {
        URL webRoute = new URL(urlName);
        return true;
    }
    /**

     Displays the output results to the user, including word count and saved file path.
     @param wordCount the number of words in the web page.
     @param route the path of the saved file.
     */
    public void dataOutput(int wordCount, File route) {
        System.out.println("The number of words present in the web page is: " + wordCount);
        System.out.println("File saved successfully at the path: " + new File(route, fileName).getPath());
    }
}