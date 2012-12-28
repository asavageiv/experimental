package asavageiv.practice;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void testBinarySearch() {
		List<Integer> l = new ArrayList<Integer>();
		assertEquals(new Long(-1), new Long(BinarySearch.binarySearch(l, -1)));
		
		l.add(5);
		assertEquals(new Long(-1), new Long(BinarySearch.binarySearch(l, 1)));
		assertEquals(new Long(-2), new Long(BinarySearch.binarySearch(l, 6)));
	}

}
