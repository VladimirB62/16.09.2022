package OurArrayDeque;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OurArrayDequeTest {
    OurArrayDeque<Integer> ourArrayDeque = new OurArrayDeque(4);

    @Test
    public void testSizeLastElement() {
        ourArrayDeque.addLast(3);
        ourArrayDeque.addLast(7);
        ourArrayDeque.addLast(1);
        assertEquals(3, ourArrayDeque.getSize());
    }

    @Test
    public void testLastElement() {
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(7);
        ourArrayDeque.addFirst(9);
        ourArrayDeque.removeLast();
        assertEquals(7, ourArrayDeque.getLast());
    }

    @Test
    public void testFirstElement() {
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(7);
        ourArrayDeque.addLast(9);
        ourArrayDeque.addLast(11);
        ourArrayDeque.removeFirst();
        assertEquals(7,ourArrayDeque.getFirst());
    }

    @Test
    public void nextElementTest() {
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(7);
        ourArrayDeque.addLast(9);
        ourArrayDeque.addLast(11);
        while (ourArrayDeque.hasNext()){
            System.out.println(ourArrayDeque.next());
        }
    }

}