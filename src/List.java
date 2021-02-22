import java.util.Iterator;

public interface List<E>{
    public int size();
    // post: returns number of elements in list
 
    public boolean isEmpty();
    // post: returns true iff list has no elements
 
    public E getLast();
    // pre: list is not empty
    // post: returns last value in list
 
    public E removeLast();
    // pre: list is not empty
    // post: removes last value from list
 
    public void add(E value);
    // post: value is added to tail of list

 }