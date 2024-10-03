public class PowerOfTwoMaxHeap {
    private int power;
    private int[] heap;

    public PowerOfTwoMaxHeap(int power) {
        this.power = power;
        this.heap = new int[0];
    }

    /**
     * Inserts a value into the power of two max heap.
     * @param int value - The value to be inserted.
     */
    public void insert(int value) {
        int[] newHeap = new int[heap.length + 1];
        System.arraycopy(heap, 0, newHeap, 0, heap.length);
        newHeap[heap.length] = value;
        heap = newHeap;
        _siftUp(heap.length - 1); // Sift up the newly added value to its correct position.
    }

    /**
     * Removes and returns the maximum value from the power of two max heap.
     * @returns int The maximum value in the heap, or Integer.MIN_VALUE if the heap is empty.
     */
    public int popMax() {
        if (heap.length == 0) {
            return Integer.MIN_VALUE; // Return a default value if the heap is empty.
        }

        int max = heap[0]; // Store the maximum value.
        heap[0] = heap[heap.length - 1]; // Replace the root with the last element in the array.
        int[] newHeap = new int[heap.length - 1];
        System.arraycopy(heap, 0, newHeap, 0, heap.length - 1);
        heap = newHeap;
        _siftDown(0); // Sift down the root element to its correct position.

        return max; // Return the maximum value.
    }

    /**
     * Sifts up the element at the given index to its correct position in the heap.
     * @param int index - The index of the element to be sifted up.
     */
    private void _siftUp(int index) {
        int parent = (index - 1) / power; // Calculate the parent index using the power of two property.

        // Compare the element with its parent and swap if necessary.
        while (index > 0 && heap[index] > heap[parent]) {
            int temp = heap[index];
            heap[index] = heap[parent];
            heap[parent] = temp;
            index = parent;
            parent = (index - 1) / power; // Update the parent index.
        }
    }

    /**
     * Sifts down the element at the given index to its correct position in the heap.
     * @param int index - The index of the element to be sifted down.
     */
    private void _siftDown(int index) {
        int maxChildIndex = _getMaxChild(index); // Get the index of the maximum child.

        // Compare the element with its maximum child and swap if necessary.
        while (maxChildIndex != -1 && heap[index] < heap[maxChildIndex]) {
            int temp = heap[index];
            heap[index] = heap[maxChildIndex];
            heap[maxChildIndex] = temp;
            index = maxChildIndex;
            maxChildIndex = _getMaxChild(index); // Update the maximum child index.
        }
    }

    /**
     * Gets the index of the maximum child for the element at the given index.
     * @param int index - The index of the parent element.
     * @returns int The index of the maximum child, or -1 if there are no children.
     */
    private int _getMaxChild(int index) {
        int startChild = power * index + 1; // Calculate the start index of the children.
        int endChild = Math.min(startChild + power, heap.length); // Calculate the end index of the children.

        int maxChildIndex = -1;
        int maxChildValue = Integer.MIN_VALUE;

        // Find the maximum child index and value among the children.
        for (int i = startChild; i < endChild; i++) {
            if (heap[i] > maxChildValue) {
                maxChildIndex = i;
                maxChildValue = heap[i];
            }
        }

        return maxChildIndex;
    }
}