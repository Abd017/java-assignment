package assignment2;

import java.io.File;
import java.io.IOException;

public class CreateFiles {
	public static void main(String[] args) {
		
	}
	
	public void create(String path, String files[]){
		
		for(String filename: files){
			File file = new File(path+filename);
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
