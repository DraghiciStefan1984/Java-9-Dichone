package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferReaderApp
{
	public static void main(String[] args)
	{
		File file=new File("src/io/test.txt");
		
		try(FileReader fileReader=new FileReader(file))
		{
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			String line=null;
			while((line=bufferedReader.readLine())!=null)
			{
				System.out.println(line);
			}
		} catch (Exception e)
		{
			// TODO: handle exception
		}
	}
}