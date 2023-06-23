import CalcsAndIO.FileManagment;
import CalcsAndIO.InputOutput;
import ExecModules.WebScrapping;

/**

 Main class that contains the main method to execute the application.
 */
public class AppMain {

    /**

     Main method that starts the program execution.

     @param args The command-line arguments.
     */
    public static void main(String[] args) {

        AppMain app = new AppMain();
        app.program();

    }

    /**

     Method that executes the main program.
     */
    private void program() {

        InputOutput IO = new InputOutput();
        FileManagment FM = new FileManagment();
        WebScrapping WS = new WebScrapping();
        IO.userInput();
        FM.checkFile(IO.getFileName());
        IO.userURL();
        WS.setModule(IO.getUrlName());
        FM.fileSaving(IO.getFileName(), WS.getText());
        IO.dataOutput(WS.getWordCount(), FM.getPath());

    }

}