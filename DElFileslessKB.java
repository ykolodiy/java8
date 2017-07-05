package playground;

import java.io.File;

public class DElFileslessKB {

	public static void main(String[] args) {
		File folder = new File("C:\\Users\\vkoloyu\\test");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		       if ( listOfFiles[i].length() < 100000 ) {listOfFiles[i].delete();};
		        
		        
		        
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
	}

}
