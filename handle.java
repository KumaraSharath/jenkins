package FILES;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

  // Import the IOException class to handle errors


public class handle {

	public static void main(String[] args) 
	{
		
		
		    try {
		    	//Create_file
		      File myObj = new File("F:\\filename.txt");
		      if (myObj.createNewFile()) 
		      {
		        System.out.println("File created: " + myObj.getName());
		      } else 
		      {
		        System.out.println("File already exists.");
		      }
		      
		      //Write_into_File
		      FileWriter myWriter = new FileWriter("F:\\filename.txt");
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      
		      //Read_file_content
		      File myObj1 = new File("F:\\filename.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) 
		      {
		        String data = myReader.nextLine();
		        System.out.println(data);
		    } 
		  
		    //get_file_details
		    File myObj2 = new File("F:\\filename.txt");
		    if (myObj.exists()) 
		    {
		      System.out.println("File name: " + myObj.getName());
		      System.out.println("Absolute path: " + myObj.getAbsolutePath());
		      System.out.println("Writeable: " + myObj.canWrite());
		      System.out.println("Readable " + myObj.canRead());
		      System.out.println("File size in bytes " + myObj.length());
		    } 
		    else {
		      System.out.println("The file does not exist.");
		    }
		    
		    //delete_file
		  /*  File myObj3 = new File("filename.txt"); 
		    if (myObj.delete()) { 
		      System.out.println("Deleted the file: " + myObj.getName());
		    } else 
		    {
		      System.out.println("Failed to delete the file.");
		    } */
		    }
		    
		      catch (IOException e) 
		    {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		  }
		}
	


