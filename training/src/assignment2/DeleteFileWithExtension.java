package assignment2;

import java.io.File;

public class DeleteFileWithExtension {
	public static void main(String[] args) {
		
		// create files
		String path = "C:/Users/ABDAZIZ/OneDrive - Publicis Groupe/Desktop/target/";
		String files[] = {"file1.txt", "file2.tex", "file3.tex", "file4.txt", "file5.tex", "file6.txt"};
		CreateFiles cf = new CreateFiles();
		cf.create(path, files);
		
		DeleteFileWithExtension df = new DeleteFileWithExtension();
		df.delete(path, ".tex");
		
		
	}
	
	public void delete(String path, String fileExtension){
		File folder = new File(path);
		File fileList[] = folder.listFiles();
		// Searchs .lck
		for (int i = 0; i < fileList.length; i++) {
		    String file = fileList[i].getName();
		    if (file.endsWith(fileExtension)) {
		        // and deletes
		        fileList[i].delete();
		        System.out.println(file + " successfully deleted");
		    }
		}
	}
}
