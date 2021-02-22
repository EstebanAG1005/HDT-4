public class Doble<E> implements List<E>{
    public int size(){

        return 0;
    }
    // post: returns number of elements in list
 
    public boolean isEmpty(){
        return true;
    }
    // post: returns true iff list has no elements
 
    public E getLast(){
        return null;
    }
    // pre: list is not empty
    // post: returns last value in list
 
    public E removeLast(){
        return null;
    }
    // pre: list is not empty
    // post: removes last value from list
 
    public void add(E value){
    }
    // post: value is added to tail of list
}