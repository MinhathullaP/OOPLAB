import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class File {

	public static void main(String[] args)
	{

		try {

			FileWriter w = new FileWriter("newfile.txt");
			w.write("Java is a programming language.\n");
			w.write("Java is a high level, robust, object-oriented and secure programming language.\n");
			w.write("Java was developed by Sun Microsystems.\n");
			w.write("James Gosling is known as the father of Java.");
			System.out.println("\nFile write done\n");
		        w.close();
			FileReader r = new FileReader("newfile.txt");
			String str = "";
                        int i;
			while ((i = r.read()) != -1)
	    {
                      str += (char)i;
            }
            System.out.println(str);
			System.out.println("\nFile Read");
            r.close();

		}

		catch (IOException e) {

			System.out.println
				("There are some IOException");
		}
	}
}
