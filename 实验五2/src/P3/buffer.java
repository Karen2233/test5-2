package P3;
import java.io.*;

import javax.swing.Timer;
public class buffer {
	 public static void write() throws FileNotFoundException, IOException { 
		 long startTime = System.currentTimeMillis();
	        File file = new File(".\\jjboom.txt");
	        BufferedReader bufferedReader = new BufferedReader(new FileReader(file)); 
	        File file1 = new File(".\\jjfly.txt");  
	        if (!file1.exists()) {
	            file1.createNewFile();  
	        }  
	        String line = "";
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1));  
	        while (( line=bufferedReader.readLine()) != null) {  
		        bufferedWriter.write(line);  
		        bufferedWriter.newLine();
	        }    
	        bufferedReader.close();
	        bufferedWriter.flush();
	        bufferedWriter.close();
	        long endTime   = System.currentTimeMillis(); 
	        long TotalTime = endTime - startTime;
	        System.out.print(TotalTime+"∫¡√Î");
	    }  
	  
}
