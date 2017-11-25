package Serialization;

import java.util.Collections;
import java.util.List;

public class sort {
public  static List<student> Sort(List<student> l) {
	comparatorStudent comparator=new comparatorStudent();
	Collections.sort(l,comparator);
	System.out.println("≈≈–Ú≥…π¶!");
	return l;
}
}
