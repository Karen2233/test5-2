package Serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class readS {
public static void read() throws IOException, ClassNotFoundException {
	Object temp=null;
    File file =new File(".\\student.bin");
    writeS.write();
    if(!file.exists()) {
    	System.out.println("无此文件");
    }
    else {
    	student s=new student();
        FileInputStream in;
        in = new FileInputStream(file);
		ObjectInputStream objIn=new ObjectInputStream(in);
		System.out.println("排序完成后序列为:");
        while((s=(student)objIn.readObject())!=null) {
        	System.out.println(s.getNumber()+" "+s.getName()+" "+s.getSex());
        }
        System.out.println("显示完成!");
    }
}
}
