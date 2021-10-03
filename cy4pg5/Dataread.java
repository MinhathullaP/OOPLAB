import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Dataread {

  public static void main(String[] args)
  {

    try {

      FileReader r = new FileReader("Dataread.txt");
      FileWriter w = new FileWriter("Output.txt");
      String str = "";

      int i;
      while ((i = r.read()) != -1) {

        str += (char)i;
      }
      w.write(str);
      r.close();
      w.close();

      System.out.println("File reading and writing are done");
    }
    catch (IOException e) 
    {
      System.out.println(" IOException");
    }
  }
}
