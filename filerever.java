import java.io.*;
import java.util.*;

    public class filerever

     {
     public static void main(String[] args) throws IOException
      {
  try{
  File sourceFile=new File(args[0]);
  Scanner content=new Scanner("filer.txt");
  PrintWriter pwriter =new PrintWriter(args[1]);

  while(content.hasNextLine())
  {
     String s=content.nextLine();
     StringBuffer buffer = new StringBuffer(s);
     buffer=buffer.reverse();
     String rs=buffer.toString();
     pwriter.println(rs);
  }
  content.close();    
  pwriter.close();
  System.out.println("File is copied successful!");
  }

  catch(Exception e){
      System.out.println("Something went wrong");
  }
}
  }