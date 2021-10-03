import java.util.*;
import java.io.*;
class File
{
            public static void main(String args[])throws IOException
            {
                        int lines=1,words=0;           
                        char ch;
                        Scanner sc=new Scanner(System.in);
                        System.out.print("\nEnter File name: ");
                        String str=sc.nextLine();
                        FileInputStream f=new FileInputStream(str);
                        int n=f.available();
                        for(int i=0;i<n;i++)
                        {
                                    ch=(char)f.read();
                                    if(ch=='\n')
                                    lines++;
                                    else if(ch==' ')
                                                words++;
                                                                       
                        }
                        System.out.println("\nNumber of lines : "+lines);
                        System.out.println("\nNumber of words : "+(lines+words));
                        System.out.println("\nNumber of characters : "+n);
                       

            }
}