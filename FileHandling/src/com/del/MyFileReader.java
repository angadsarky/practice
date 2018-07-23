package com.del;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		String input="";
		
		try {
			fr=new FileReader("output.txt");
			br=new BufferedReader(fr);
			 while((input = br.readLine())!=null)
			System.out.println(input);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();}
			catch(IOException e) {e.printStackTrace();}
		finally
		{try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
	}
	}


