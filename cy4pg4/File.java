import java.io.*;
import java.util.*;


class File 
{
  String fname;

  void read()
  {
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter filename");
      fname=sc.next(); 
  }
  
  void check() throws Exception
  {
    
    FileInputStream file = new FileInputStream(fname);
    FileOutputStream even = new FileOutputStream("even.txt");
    FileOutputStream odd = new FileOutputStream("odd.txt");

    int i=0;
    while((i=file.read())!=-1) 
     {
      if(i%2==0)
      {
      even.write(i);
     }
      else
      odd.write(i);
     }
      file.close();
     even.close();
     odd.close();
  }

}
 class Main 
{
  public static void main(String[] args) throws Exception
  { 
      File f=new File();
      f.read();
      f.check();
      }

    } 
