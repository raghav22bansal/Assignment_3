package semester;

import java.util.Arrays;

public class question_2 {
	public static void sort(int arr[])
	    {
	        int n = arr.length;
	        int output[] = new int[n];
	        int count[] = new int[21];
	        
	        for (int i = 0; i <= 20; ++i)
	            count[i] = 0;

	        for (int i = 0; i < n; ++i)
	            count[arr[i]]++;

	        for (int i = 1; i <= 20; ++i)
	            count[i] += count[i - 1];

	        for (int i = n - 1; i >= 0; i--) {
	            output[count[arr[i]] - 1] = arr[i];
	            count[arr[i]]--;
	        }
	        for (int i = 0; i < n; ++i)
	            arr[i] = output[i];
	    }
	
	
public static void main(String args[]) {
	int[] arr = {4, 6 ,4 ,2, 4, 3,1 ,5, 2, 2 , 9 , 4 ,4 ,20};
	
	sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
