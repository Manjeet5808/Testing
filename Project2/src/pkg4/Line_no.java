package pkg4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Line_no 
{
	
    public String read(int linenumber)throws IOException
	{
		File f=new File("..\\Project2\\text1.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		String s;
		int count=0;
		while((s=b.readLine())!=null)
		{
			count=count+1;
			if(count==linenumber)
			{
				break;
			}
		}
		return s;
	}
}

