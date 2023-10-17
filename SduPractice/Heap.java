package SduPractice;

import java.util.Arrays;

public class Heap<T extends Comparable<T>> {
    private T[] heap;
    private int size;

    public Heap() {
        heap = (T[]) new Comparable[10];
        size = 0;
    }

    public void insert(T value) {
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, 2 * heap.length);
        }
        heap[size++] = value;
        int current = size - 1;
        while (current > 0 && heap[current].compareTo(heap[parent(current)]) < 0) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public T getMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        return heap[0];
    }

    public T extractMin() {
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }
        T min = heap[0];
        heap[0] = heap[--size];
        heap[size] = null;
        int current = 0;
        while (hasLeftChild(current)) {
            int smallerChildIndex = leftChild(current);
            if (hasRightChild(current) && heap[rightChild(current)].compareTo(heap[smallerChildIndex]) < 0) {
                smallerChildIndex = rightChild(current);
            }
            if (heap[current].compareTo(heap[smallerChildIndex]) < 0) {
                break;
            } else {
                swap(current, smallerChildIndex);
                current = smallerChildIndex;
            }
        }
        return min;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public T[] toArray() {
        return Arrays.copyOf(heap, size);
    }

    public void decreaseKey(int index, T newValue) {
        if (newValue.compareTo(heap[index]) > 0) {
            throw new IllegalArgumentException("New value is greater than current value");
        }
        heap[index] = newValue;
        while (index > 0 && heap[index].compareTo(heap[parent(index)]) < 0) {
            swap(index, parent(index));
            index = parent(index);
        }
    }

    private int parent(int index) {
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private boolean hasLeftChild(int index) {
        return leftChild(index) < size;
    }

    private boolean hasRightChild(int index) {
        return rightChild(index) < size;
    }

    private void swap(int i, int j) {
        T temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
