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
}
