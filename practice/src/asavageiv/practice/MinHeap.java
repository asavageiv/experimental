package asavageiv.practice;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

	private List<Integer> heap = new ArrayList<Integer>();
	
	public MinHeap() {}
	
	public void add(int val) {
		heap.add(val);
		bubbleUp(heap.size() - 1);
	}
	
	public int remove() {
		int val = heap.get(0);
		swap(0, heap.size() - 1);
		heap.remove(heap.size() - 1);
		bubbleDown(0);
		return val;
	}
	
	private void bubbleDown(int index) {
		if (index >= heap.size()) {
			return;
		}
		int left = left(index);
		int right = right(index);
		int lightestChild = index;
		
		if (left < heap.size()) {
			if (heap.get(left) < heap.get(index)) {
				lightestChild = left;
			}
		}
		if (right < heap.size()) {
			if (heap.get(right) < heap.get(lightestChild)) {
				lightestChild = right;
			}
		}
		
		if (lightestChild != index) {
			swap(index, lightestChild);
			bubbleDown(lightestChild);
		}
	}
	
	private void bubbleUp(int index) {
		if (index <= 0) {
			return;
		}
		int parentInd = parent(index);
		if (heap.get(index) < heap.get(parentInd)) {
			swap(index, parentInd);
			bubbleUp(parentInd);
		}
	}
	
	private void swap(int ind1, int ind2) {
		int tmp = heap.get(ind1);
		heap.set(ind1, heap.get(ind2));
		heap.set(ind2, tmp);
	}
	
	private int parent(int index) {
		if (index == 0) {
			return -1;
		}
		return index / 2;
	}
	
	private int left(int index) {
		return index * 2;
	}
	
	private int right(int index) {
		return index * 2 + 1;
	}
}
