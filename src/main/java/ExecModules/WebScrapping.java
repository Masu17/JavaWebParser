package ExecModules;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Safelist;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Class that performs web scraping and word count on an HTML document.
 */
public class WebScrapping {

    private Scanner URL_SCANNER;
    private int wordCount;
    private String extractedHTML;

    private Document dirtyDocument;

    private String[] finalText;

    /**
     * Gets the number of words extracted from the HTML document.
     *
     * @return The word count.
     */
    public int getWordCount() {
        return wordCount;
    }

    /**
     * Gets the final text extracted from the HTML document.
     *
     * @return An array of Strings with the text divided by words.
     */
    public String[] getText() {
        return finalText;
    }

    /**
     * Gets the extracted HTML from the document.
     *
     * @return The extracted HTML.
     */
    public String getExtractedHTML() {
        return extractedHTML;
    }

     /**
     * Gets the dirty HTML document.
     *
     * @return The dirty HTML document.
     */
    public Document getDirtyDocument() {
        return dirtyDocument;
    }

    /**
     * Sets up the web scraping and word count module.
     *
     * @param userWebInput The URL of the web page.
     */
    public void setModule(String userWebInput) {
        try {
            URL webRoute = new URL(userWebInput);
            URL_SCANNER = new Scanner(webRoute.openStream());
            startCount();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Starts the process of extracting the HTML document and word count.
     */
    private void startCount() {
        long time = System.currentTimeMillis();
        System.out.println("[i] Extracting the HTML document.");
        while (URL_SCANNER.hasNext()) {
            extractedHTML += URL_SCANNER.next() + " ";
        }

        System.out.println("[OK] Extraction completed in: " + String.format("%.2f sec", (System.currentTimeMillis() - time) * 0.001));

        cleanDocumenthtmlExtraction();

    }

    /**
     * Cleans the extracted HTML document and performs the word count.
     */
    private void cleanDocumenthtmlExtraction() {

        Cleaner cl = new Cleaner(new Safelist(Safelist.relaxed()));

        System.out.println("[i] Starting word count and web transfer");
        long time = System.currentTimeMillis();

        dirtyDocument = Jsoup.parse(extractedHTML);
        dirtyDocument = cl.clean(dirtyDocument);

        finalText = (dirtyDocument.body().text().split(" "));

        wordCount = finalText.length;

        System.out.println("[OK] Count and transfer completed in: " + String.format("%.2f sec", (System.currentTimeMillis() - time) * 0.001));

    }

}