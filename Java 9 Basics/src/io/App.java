package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App
{
	public static void main(String[] args) throws IOException
	{
		/*
		byte[] data=new byte[10];
		
		System.out.print("enter chars: ");
		System.in.read(data);
		System.out.print("You entered: ");
		for(int i=0; i<data.length; i++)
		{
			//System.out.print(data[i]+", ");
			System.out.print((char)data[i]+", ");
		}

		
		File file=new File("src/io/test.txt");
		try(FileInputStream fileInputStream=new FileInputStream(file))
		{
			System.out.println("Total file size: "+fileInputStream.available());
			
			int content;
			while((content=fileInputStream.read())!=-1)
			{
				System.out.print((char)content);
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		*/
		
		File file=new File("src/io/write file.txt");
		
		try(FileWriter fileWriter=new FileWriter(file))
		{
			fileWriter.write("Write file test.");
			fileWriter.close();
			
			FileReader fileReader=new FileReader(file);
			int content;
			while((content=fileReader.read())!=-1)
			{
				System.out.print((char)content);
			}

		}
		catch(Exception e)
		{
			
		}
	}
}