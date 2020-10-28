import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {

      // create a file
      
      try {
         File myObj = new File("filename2.txt");
         if (myObj.createNewFile()) {
            System.out.println("File name: " + myObj.getName());
         } else {
            System.out.println("file exists");
         }
      } catch (IOException e) {
         System.out.println("Error");
         e.printStackTrace();
      }

      // write to a file
      try {
         FileWriter myWriter = new FileWriter("filename.txt");
         myWriter.write("tough");      // will replace everything in the file
         myWriter.close();
         System.out.println("wrote");
      } catch (IOException e) {
         System.out.println("error");
         e.printStackTrace();
      }


      // read to a file
      try {
         File myObj = new File("filename.txt");
         Scanner myReader = new Scanner(myObj);
         while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
         }
         myReader.close();
      } catch (FileNotFoundException e) {
         System.out.println("error");
         e.printStackTrace();
      }


      // deletes a file
      File myObj = new File("filename.txt");
      if (myObj.delete()) {
         System.out.println("Deleted" + myObj.getName());
      } else {
         System.out.println("failed to delete");
      }
   }

}
