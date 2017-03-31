package alfresco;

import java.io.File;
import java.io.IOException;

public class RenameFilestoISBN {


    public static void main(String[] argv) throws IOException {

        File folder = new File("C:\\tmp\\rename");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File("C:\\tmp\\rename\\"+listOfFiles[i].getName()); 
                String o = f.toString().substring(14, 24);

                f.renameTo(new File("C:\\tmp\\rename\\"+o+".pdf"));
                System.out.println(o);
            }
        }

      
    }
}
