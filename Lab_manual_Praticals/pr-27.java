import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) {
        String filename = "my_file.txt";
        String contentToWrite = "This is some sample text to write to the file.";

        // Write operation
        writeFile(filename, contentToWrite);

        // Read operation
        String contentFromRead = readFile(filename);

        if (contentFromRead != null && !contentFromRead.isEmpty()) {
            System.out.println("Read from file: " + contentFromRead);
        } else {
            System.out.println("File is empty or could not be read.");
        }
    }

    public static void writeFile(String filename, String content) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String readFile(String filename) {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content += line + "\n";
            }
            System.out.println("Successfully read from the file: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return content.trim();
    }
}
