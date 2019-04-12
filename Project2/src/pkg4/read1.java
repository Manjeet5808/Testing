package pkg4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class read1 
{
public static void main(String[] args) throws IOException 

{
	read1 r=new read1();
	r.read(1,3);
	}

public void read(int initial,int end) throws IOException 
{
File f=new File("..\\Project2\\text4.txt");
	FileReader fr=new FileReader(f);
	BufferedReader b=new BufferedReader(fr);
	String s;
	int count=1;
	while((s=b.readLine())!=null)
	{
		if((count>=initial)&&(count<=end))
		{
			System.out.println(s);
		}
		count=count+1;
	}
}
}
