package OurArrayList;

import java.util.Comparator;

public interface OurList <T>{

    public  void  add(T elt);
    public  void  setElt( int index,T elt);
    public  T  getElt( int index);
    public  boolean contains (T element);
    public  int size ();
    public  T remove (int index);
    public  boolean remove (T element);
    public  void sort ();
    public  void sort (Comparator comparator);
}
