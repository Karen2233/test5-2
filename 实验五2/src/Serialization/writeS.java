package Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class writeS {
public static void write() throws IOException {
	File file = new File(".\\student.bin");  
    if (!file.exists()) {
        file.createNewFile();  
    } 
    FileOutputStream out;
    out = new FileOutputStream(file);
    ObjectOutputStream objOut=new ObjectOutputStream(out);
    List<student> l=read.read();
    l=sort.Sort(l);
    for(int i=0;i<l.size();i++) {
    	 objOut.writeObject(l.get(i));
    }
    objOut.writeObject(null);
    objOut.flush();
    objOut.close();
    System.out.println("³É¹¦Ð´Èëstudent.bin!");
}
}
