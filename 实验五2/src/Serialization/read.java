package Serialization;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class read {
	public static List<student> read() throws FileNotFoundException, IOException {
		List<student> l=new ArrayList();
	    File file = new File(".\\list.txt");
	    InputStreamReader isr = new InputStreamReader(new FileInputStream(file), "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(isr);
        String line="";
        String name="";
        String sex="";
        String number="";
        student s=new student();
        while (( line=bufferedReader.readLine()) != null) {  
        	 Scanner sc = new Scanner(line);
        	 if(sc.hasNext()) {        		 
        	     number=sc.next();
        	 }
        	 if(sc.hasNext()) {
        		 name=sc.next();
        	 }
        	 if(sc.hasNext()) {
        		 sex=sc.next();
        	 }
        	 s=new student(number,sex,name);
        	 l.add(s);
      }
        bufferedReader.close();
        System.out.println("序列化完成!");
        return l;
      }
	}
