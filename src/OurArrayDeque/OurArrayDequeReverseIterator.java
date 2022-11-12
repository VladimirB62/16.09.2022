package OurArrayDeque;

import java.util.Iterator;

public class OurArrayDequeReverseIterator<T> implements Iterator <T>{
    int currentIndex;
    OurArrayDeque buffer = new OurArrayDeque<>(4);



    public OurArrayDequeReverseIterator(OurArrayDeque<T> ourArrayDeque) {
        initIterator(ourArrayDeque);
    }

    public void initIterator(OurArrayDeque ourArrayDeque) {

        for (int i = 0; i < ourArrayDeque.size; i++) {
            buffer.addFirst(ourArrayDeque.next());

        }
    }

    @Override
    public boolean hasNext() {
        return currentIndex < buffer.size;
    }

    @Override
    public T next() {
        Object currentObject = buffer.next();
        currentIndex++;
        return (T) currentObject;

    }
}
