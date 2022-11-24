package OurArrayList;

import java.sql.Array;
import java.util.Arrays;
import java.util.Comparator;

public class OurArrayList <T> implements OurList{

    private final Integer defaultCapacity = 16;
    private Object[] ourList = new Object[defaultCapacity];
    private int size;

    @Override
    public void add(Object elt) {
        for (int i = 0; i < ourList.length; i++) {
            if (ourList[i] == null) {
                ourList[i] = elt;
                size++;
                break;
            }
        }
        if (size > ourList.length - 1) {
            increasingTheArray();
        }

    }

    private void increasingTheArray() {
        Object[] newArray = new Object[ourList.length * 2];
        System.arraycopy(ourList, 0, newArray, 0, size);
        ourList = newArray;
    }

    @Override
    public void setElt(int index, Object elt) {
        if (size > ourList.length - 1) {
            increasingTheArray();
        }
        ourList[index] =elt;
        size++;
    }

    @Override
    public Object getElt(int index) {
        return ourList[index];
    }

    @Override
    public boolean contains(Object elt) {
        for (int i = 0; i < size; i++) {
            if(elt.equals(ourList[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return ourList.length;
    }

    @Override
    public Object remove(int index) {
        Object elt = ourList[index];
        int movedIndex = size - index - 1;
        if (movedIndex > 0) {
            System.arraycopy(ourList, index + 1, ourList, index, movedIndex);
        }
        size--;
        return elt;
    }

    @Override
    public boolean remove(Object elt) {
        for (int i = 0; i < ourList.length; i++) {
            if(elt.equals(ourList[i])){
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        Arrays.sort(ourList);
    }

    @Override
    public void sort(Comparator comparator) {
        comparator = Comparator.reverseOrder();
    }
}
