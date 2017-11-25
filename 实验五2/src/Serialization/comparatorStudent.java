package Serialization;

import java.util.Comparator;

public class comparatorStudent implements Comparator{
	public int compare(Object obj0, Object obj1) {
		 student t1=(student)obj0;
		 student t2=(student)obj1;
		 if(t1.getNumber().compareTo(t2.getNumber())>0)
			 return 1;
		 else if(t1.getNumber().compareTo(t2.getNumber())==0)
			 return 0;
		 return -1;
	}
}
