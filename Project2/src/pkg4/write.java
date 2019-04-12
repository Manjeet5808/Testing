package pkg4;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class write 
{
      public static void main(String[] args) throws IOException
      {
		 File f=new File("..\\Project2\\Manjeet.txt");
	     FileWriter fw=new FileWriter(f);
		 BufferedWriter b=new BufferedWriter(fw);
		 
		     Scanner s=new Scanner(System.in);
		     
			 for(int i=1;i<=5;i++)
			 {
			
				String data=s.next();
				b.write(data);
				s.nextLine();
				s.close();
			 }
		 }

	}

