import java.util.ArrayList;
import java.util.Collections;

public class ListSort {

	public static void main(String[] args) {
		
		ArrayList<Integer> sort = new ArrayList<Integer>();
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		
		int[] a = {0,3,2,4,1,-2,-3};
				
		for(int i=0; i<a.length; i++) {
			sort.add(a[i]);
		}
		for(int i=0; i<a.length; i++) {
			int min = Collections.min(sort);
			sort.remove(sort.indexOf(min));
			sorted.add(min);
		}
		
		
		System.out.println(sorted);

	}

}
