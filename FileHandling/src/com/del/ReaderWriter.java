package com.del;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriter {

	public static void main(String[] args) {
		File f=new File("file1.txt");
		FileWriter fw=null;
		BufferedWriter bw=null;
//		try {
//			fw=new FileWriter(f);
//			bw=new BufferedWriter(fw);
//			bw.write("JAVA sux");
//			bw.write(" a lot");
//			System.out.println("written to file");
//		}
//		catch(IOException e)
//		{e.printStackTrace();}
//		finally {
//			try {
//				bw.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		FileReader fr=null;
		BufferedReader br=null;
		String input="";
		File f1=new File("file2.txt");
		FileWriter fw1=null;
		BufferedWriter bw1=null;
		
		try {
			fr=new FileReader("file1.txt");
			br=new BufferedReader(fr);
			fw1=new FileWriter(f1);
			bw1=new BufferedWriter(fw1);
			 while((input = br.readLine())!=null)
			{bw1.write(input);
			 bw1.newLine();}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();}
			catch(IOException e) {e.printStackTrace();}
		finally
		{try {
			br.close();
			bw1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
