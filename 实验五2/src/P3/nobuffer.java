package P3;
import java.io.*;

import javax.swing.*;
public class nobuffer {
public static void write() throws IOException {
	long startTime=System.currentTimeMillis();
	FileReader fr = new FileReader(".\\jjboom.txt");
	File file1=new File(".\\jjfly.txt");
	FileWriter fw = new FileWriter(file1);
    if (!file1.exists()) {
        file1.createNewFile();  
    }  
	char []buf = new char[1];
	int len = 0;
	while((len = fr.read(buf)) != -1) {
		fw.write(buf,0,len);
	}
	fr.close();
	fw.close();
	long endTime=System.currentTimeMillis();
	long time=endTime-startTime;
	System.out.print(time+"∫¡√Î");
	
}
}
