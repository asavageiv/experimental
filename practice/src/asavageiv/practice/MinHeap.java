package asavageiv.practice;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
	List<Integer> heap = new ArrayList<Integer>();
	
	public MinHeap() {}
	
	public void add(int val) {
		heap.add(val);
		bubbleUp(heap.size() - 1);
	}
	
	private void bubbleUp(int i) {
		if (i <= 0) {
			return;
		}
		
		int parentInd = i / 2;
		if (heap.get(i) < heap.get(parentInd)) {
			swap(i, parentInd);
			bubbleUp(parentInd);
		}
	}

	private void swap(int i, int parentInd) {
		int tmp = heap.get(i);
		heap.set(i, heap.get(parentInd));
		heap.set(parentInd, tmp);
	}

	public int remove() {
		int res = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
	    bubbleDown(0);
	    return res;
	}

	private void bubbleDown(int i) {
		if (i >= heap.size() - 1) {
			return;
		}
		int lightestChild = i;
		
		for (int j = 2*i; j < 2*i + 2; j++) {
			if (j < heap.size() && heap.get(j) < heap.get(lightestChild)) {
				lightestChild = j;
			}
		}
		
		if (lightestChild != i) {
			swap(i, lightestChild);
			bubbleDown(lightestChild);
		}
	}
}
