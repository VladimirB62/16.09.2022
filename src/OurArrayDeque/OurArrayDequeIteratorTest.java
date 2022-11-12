package OurArrayDeque;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OurArrayDequeIteratorTest {
    OurArrayDeque ourArrayDeque = new OurArrayDeque<>(4);
    OurArrayDequeIterator<Integer> iterator = new OurArrayDequeIterator<Integer>(ourArrayDeque);


    @Test
    public void elementsTest() {
        ourArrayDeque.addLast(5);
        ourArrayDeque.addLast(3);
        ourArrayDeque.addLast(1);
        ourArrayDeque.addLast(0);
        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(3);
        expected.add(1);
        expected.add(0);
        List<Integer> actual = new ArrayList<>();
        while (iterator.hasNext()){
            actual.add(iterator.next());
            System.out.println(iterator.next());
        }
        assertEquals(expected,actual);

    }



}