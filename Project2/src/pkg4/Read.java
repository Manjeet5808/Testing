package pkg4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read 
{
  public static void main(String[] args) throws IOException 
  {
	File f=new File("..\\Project2\\text2.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String s;
	while((s=b.readLine())!=null)
	{
		System.out.println(s);
	}
  
	File f2=new File("..\\Project2\\text3.txt")
	FileWriter fw=new FileWriter(f2);
	BufferedWriter bw=new BufferedWriter(fw);
	fw.write(s);
	fw.close();
}
}
