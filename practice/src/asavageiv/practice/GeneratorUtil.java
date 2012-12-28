package asavageiv.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GeneratorUtil {
	
	public static <T> List<T> newArrayList() {
		return new ArrayList<T>();
	}

	public static List<Integer> shuffledList(int size) {
		List<Integer> list = newArrayList();
		for (int i = 0; i < size; i++) {
			list.add(i);
		}
		Collections.shuffle(list);
		return list;
	}
}
