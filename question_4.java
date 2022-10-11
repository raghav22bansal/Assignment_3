package semester;
import java.util.*;
public class question_4 {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	while(n!= 1) {
	if(n%2 ==0) {
		n /=2;
	}
	else {
		n = 3*n +1;
	}
	System.out.println(n);
	}	
}
}
