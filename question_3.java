package semester;
import java.util.*;
public class question_3 {
public static void main(String args[]) {
	String[] s = {"Rahul" , "Ajay" , "Riya" , "Saurabh"};
	for(int i =0; i<s.length; i++) {
		for(int j =i+1 ; j< s.length; j++) {
			if(s[i].compareTo(s[j]) > 0) {
				String temp = s[i];
				s[i] = s[j];
				s[j] = temp;
			}
		}
	}
	System.out.println(Arrays.toString(s));
}
}
