
package myfileapp;

import java.io.File;
import java.io.IOException;


public class MyFileApp {


    public static void main(String[] args) throws IOException {
        
        //Declare file
        File f ,f2;
        //instantiate the file: file name is data.txt and it is located in the current working directory
        f = new File ("data.txt");
        f2 = new File("images");
        
        //check if this is a file or directory
        if(f.exists())
        {
            //confirm that it exists
            System.out.println("The file exists. The file name is: "+f.getName());
            
            //check if this is a file or directory
            System.out.println("Is this a file? "+f.isFile());
            System.out.println("Is this a directory "+f2.isDirectory());
            
            //check if the file is readable ,writeable , executable
            System.out.println("Is file executable: "+ f.canExecute());
            System.out.println("Is file readable: "+ f.canRead());
            System.out.println("Is file writeable: "+ f.canWrite());
            System.out.println("Is file writeable: "+ f.canWrite());
            
            //check for the size of the file
            System.out.println("The file "+ f.length()+ " bytes long");
            
            //create a directory
            System.out.println("Directory created? "+f2.mkdir());
            
        }
        else
        {
            //confirm that the file doesn't exist
            System.out.println("The file doesn't exist");
            
            //create a new file
            f.createNewFile();
            
            System.out.println("A new file is called "+f.getName()+" has been created ");
        }
    }
    
}
