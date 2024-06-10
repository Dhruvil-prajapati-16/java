import java.io.*;

public class Filesdemo {
    public static void main(String[] args) {

        try
        {
             FileInputStream fin = new FileInputStream("input.txt");
             FileOutputStream fop = new FileOutputStream("output.txt");

            int data;
            while ((data = fin.read()) != -1) {
                fop.write(data);
            }

            System.out.println("File copied successfully!");
              fin.close();
              fop.close();
        } 
        catch (Exception e)
        {
           System.out.println(e);
        }
    }
}
