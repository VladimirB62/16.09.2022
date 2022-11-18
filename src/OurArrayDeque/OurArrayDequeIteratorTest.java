package OurArrayDeque;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OurArrayDequeIteratorTest  {


    @Test
    public void elementsTest() {
        OurArrayDeque<Integer> ourArrayDeque = new OurArrayDeque<Integer>(4);
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(3);
        ourArrayDeque.addLast(1);
        ourArrayDeque.addLast(0);
        OurArrayDequeReverseIterator iterator = new OurArrayDequeReverseIterator<Integer>(ourArrayDeque);
        List<Integer> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(3);
        expected.add(5);
        List<Integer> actual = new ArrayList<>();
        while (iterator.hasNext()){
            actual.add((Integer) iterator.next());
            //System.out.println(iterator.next());
        }
        assertEquals(expected,actual);

    }

    @Test
    public void elementsTest1() {
        OurArrayDeque<Integer> ourArrayDeque = new OurArrayDeque<Integer>(4);
        ourArrayDeque.addFirst(5);
        ourArrayDeque.addFirst(3);
        ourArrayDeque.addFirst(1);
        ourArrayDeque.addFirst(0);
        OurArrayDequeReverseIterator iterator = new OurArrayDequeReverseIterator<Integer>(ourArrayDeque);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        expected.add(0);
        List<Integer> actual = new ArrayList<>();
        while (iterator.hasNext()){
            actual.add((Integer) iterator.next());
            //System.out.println(iterator.next());
        }
        assertEquals(expected,actual);

    }

}