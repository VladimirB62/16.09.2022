package OurArrayDeque;

import java.util.Iterator;

public interface OurDeque <T> extends Iterator {

    void addLast(T elt);

    void addFirst(T elt);

    T removeLast();

    T removeFirst();

    T getLast();

    T getFirst();

    int getSize();



}
