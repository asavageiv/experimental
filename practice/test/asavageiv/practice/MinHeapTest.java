package asavageiv.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinHeapTest {

	MinHeap minHeap;

	@Before
	public void setUp() {
		minHeap = new MinHeap();
	}
	
	@Test
	public void test() {
		for (int i = 10; i > 0; i--) {
			minHeap.add(i);
		}
		for (int i = 1; i <= 10; i++) {
			assertEquals(i, minHeap.remove());
		}
	}

}
