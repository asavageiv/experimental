package asavageiv.practice;

import java.util.List;

public class BinarySearch {

	public static int binarySearch(List<Integer> sortedList, int obj) {
		int start = 0;
		int end = sortedList.size();
		int index = (start + end) / 2;
		
		while (start < end) {
			int curVal = sortedList.get(index);
			if (curVal == obj) {
				return index;
			} else if (obj < curVal) {
				end = index - 1;
			} else {
				start = index + 1;
			}
			index = (start + end) / 2;
		}
		
		return -1*index - 1;
	}
}
