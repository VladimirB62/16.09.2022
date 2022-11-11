package OurArrayDeque;

public class OurArrayDeque <T> implements OurDeque {

    int nextElementIndex;
    int firstElementIndex;
    int size;
    int capacity;
    int currentIndex;


    Object [] source;


    public OurArrayDeque(int capacity) {
        this.capacity = capacity;
        source = new Object[capacity];
    }

    public Object getSource() {
        return source;
    }

    @Override
    public void addLast(Object elt) {
        if (size == capacity) {
        }

        nextElementIndex = (firstElementIndex + size) % capacity;
        source[nextElementIndex] = elt;
        size++;
    }

    @Override
    public void addFirst(Object elt) {
        if (size == capacity) {
        }
        if (firstElementIndex > 0) {
            firstElementIndex--;
        }else firstElementIndex = capacity - 1;
        source[firstElementIndex] = elt;
        size++;
    }

    @Override
    public Object removeLast() {
        if (size ==0) {
        }
        Object res =  source[(firstElementIndex + size-1) % capacity];
        size--;

        return res;
    }

    @Override
    public Object removeFirst() {
        if (size ==0) {
        }
        Object res = source[firstElementIndex];
        firstElementIndex = (firstElementIndex + 1) % capacity;
        size--;
        return res;
    }

    @Override
    public Object getLast() {
        if (size ==0) {
        }
        Object res = source[(firstElementIndex + size-1) % capacity];
        return res;
    }

    @Override
    public Object getFirst() {
        if (size == 0) {
        }
        Object res = source[firstElementIndex];
        return res;
    }

    @Override
    public int getSize() {
        return size;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < size;
    }

    @Override
    public Object next() {
        Object currentObject = source[currentIndex];
        currentIndex++;
        return currentObject;
    }


}
