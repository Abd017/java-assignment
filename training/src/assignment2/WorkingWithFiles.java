package assignment2;

import java.io.*;
import java.nio.file.*;

public class WorkingWithFiles {

	public static void main(String[] args) {
		String source = "C:/Users/ABDAZIZ/OneDrive - Publicis Groupe/Desktop/training/";
		String destination = "C:/Users/ABDAZIZ/OneDrive - Publicis Groupe/Desktop/target";
		readFile("output.txt");
	}
	
	public static void writeFile(String filename, String content){
		
		try{
			FileOutputStream fs = new FileOutputStream(filename);
			byte b[] = content.getBytes();
			fs.write(b);
			fs.close();
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void readFile(String filename){
		
		try {
			FileInputStream fileinput = new FileInputStream("output.txt");
			int c = fileinput.read();
			while(c!=-1){
				System.out.print((char)c);
				c = fileinput.read();
			}
			fileinput.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void createReadOnlyFile(String filename){
		File file = new File(filename);
		try {
			file.createNewFile();
			file.setReadOnly();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void deleteDirectory(String path){
		Path sourcePath = Paths.get(path);
		try {
			Files.delete(sourcePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
