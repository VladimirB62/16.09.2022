package OurArrayDeque;

import java.util.Iterator;

public class OurArrayDequeIterator<T> implements Iterator <T>{
    int currentIndex;
    OurArrayDeque<T> ourArrayDeque;

    public OurArrayDequeIterator(OurArrayDeque<T> ourArrayDeque) {
        this.ourArrayDeque = ourArrayDeque;
    }

    @Override
    public boolean hasNext() {
        return currentIndex > 0;
    }

    @Override
    public T next() {

        return (T)ourArrayDeque.source[currentIndex++];
    }
}
