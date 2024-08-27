class Heap {
    private int[] heap; // Array to store heap elements
    private int size; // Number of elements in the heap
    private int capacity; // Maximum capacity of the heap

    Heap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity]; // Initialize the heap array
    }

    // Get the index of the parent node
    private int parent(int i) { return (i - 1) / 2; }

    // Get the index of the left child
    private int left(int i) { return 2 * i + 1; }

    // Get the index of the right child
    private int right(int i) { return 2 * i + 2; }

    // Insert a new key into the heap
    public void insert(int key) {
        if (size == capacity) return; // Heap is full, cannot insert
        heap[size] = key; // Add the key to the heap
        int i = size;
        size++;
        // Move up the heap to maintain heap property
        while (i != 0 && heap[parent(i)] > heap[i]) {
            int temp = heap[i];
            heap[i] = heap[parent(i)];
            heap[parent(i)] = temp;
            i = parent(i);
        }
    }

    // Print all elements in the heap
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}
