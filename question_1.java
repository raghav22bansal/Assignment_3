package semester;

public class question_1 {
public static int stringCompare(String str1 , String str2) {
	for(int i =0 ; i<str1.length() && i<str2.length(); i++) {
		if((int)str1.charAt(i) == (int)str2.charAt(i)) {
			continue;
		}
		else {
			return (int)str1.charAt(i)  - (int)str2.charAt(i);
		}
	}
	
	if(str1.length() != str2.length()) {
		return str1.length() - str2.length();
	}
	else 
	return 0;
}
	
public static void main(String args[]) {
	String s1 = "Raghav";
	String s2 = "RaghavBansal";
	System.out.println(stringCompare(s1 , s2));
}
}
