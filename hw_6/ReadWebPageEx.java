//
package hw_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadWebPageEx {

    public static void main(String[] args) throws IOException {
        String output = getUrlContents("https://www.Google.com");
        System.out.println(output);

        //writes a website (HTML) into a text file
        String filePath = "GoogleHTML.txt";
        WriteHTMLtoFile(output, filePath);
        // System.out.println(content);
    }

    private static void WriteHTMLtoFile(String output, String filePath) throws IOException {
        Files.writeString(Paths.get(filePath), output);
        String content = new String(Files.readAllBytes(Paths.get(filePath)));
    }


    //read from URL
        private static String getUrlContents(String theUrl)  {
            StringBuilder content = new StringBuilder();
            // Use try and catch to avoid the exceptions
            try {
                URL url = new URL(theUrl); // creating a url object
                URLConnection urlConnection = url.openConnection(); // creating a urlconnection object

                // wrapping the urlconnection in a bufferedreader
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
                String line;
                // reading from the urlconnection using the bufferedreader
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line + "\n");
                }
                bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return content.toString();
        }


}


