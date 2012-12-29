package asavageiv.practice;

import java.util.List;

public class BinarySearch {
	public static int binarySearch(List<Integer> list, int val) {
		int low = 0;
		int high = list.size() - 1;
		
		while(low <= high) {
			int middle = (low + high) / 2;
			int midVal = list.get(middle);
			if (midVal == val) {
				return middle;
			} else if (midVal < val) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		
		return -(low + 1);
	}

}