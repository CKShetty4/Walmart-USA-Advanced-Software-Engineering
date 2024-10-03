import java.util.ArrayList;
import java.util.List;

public class PowerOfTwoMaxHeap {
    private int power;
    private List<Integer> heap;

    public PowerOfTwoMaxHeap(int power) {
        this.power = power;
        this.heap = new ArrayList<>();
    }
    public void insert(int value) {
        heap.add(value); 
        _siftUp(heap.size() - 1); 
    }
    
    private void _siftUp(int index) {
        int parent = (index - 1) / power; 
    
        
        while (index > 0 && heap.get(index) > heap.get(parent)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(parent));
            heap.set(parent, temp);
            index = parent;
            parent = (index - 1) / power; 
        }
    }

    public int popMax() {
        if (heap.isEmpty()) {
            return Integer.MIN_VALUE; 
        }
    
        int max = heap.get(0); 
        heap.set(0, heap.get(heap.size() - 1)); 
        heap.remove(heap.size() - 1); 
        _siftDown(0); 
    
        return max; 
    }
    
    private void _siftDown(int index) {
        int maxChildIndex = _getMaxChild(index); 
    
        while (maxChildIndex != -1 && heap.get(index) < heap.get(maxChildIndex)) {
            int temp = heap.get(index);
            heap.set(index, heap.get(maxChildIndex));
            heap.set(maxChildIndex, temp);
            index = maxChildIndex;
            maxChildIndex = _getMaxChild(index); 
        }
    }
    
    private int _getMaxChild(int index) {
        int startChild = power * index + 1; 
        int endChild = Math.min(startChild + power, heap.size()); 
    
        int maxChildIndex = -1;
        int maxChildValue = Integer.MIN_VALUE;
    
        for (int i = startChild; i < endChild; i++) {
            if (heap.get(i) > maxChildValue) {
                maxChildIndex = i;
                maxChildValue = heap.get(i);
            }
        }
    
        return maxChildIndex;
    }
}
