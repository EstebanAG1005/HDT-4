/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
public class Doble<E> extends AbsList<E>{
    /**
     * Implementa los metodos de list para poder almacenar datos de forma encadenada doble.
     */

    protected int count;
    protected DoubleLinkedNode<E> head;
    protected DoubleLinkedNode<E> tail;


    public Doble(){
        head = null;
        tail = null;
        count = 0;
    }

    /** pre: valor no es null
    // post: egrega elementos al principio de la lista**/
    public void addFirst(E value)
    {
    // cronstruye un nuevo elemento haciendolo el principio
        head = new DoubleLinkedNode<E>(value, head, null);
        // arregla el final si es necesario
        if (tail == null) tail = head;
        count++;
    }


    /** pre: La lista no está vacía
     post: regresxa el primer elemento de la lista**/
    public E getFirst()
    {
        return head.value();
    }


    /** pre: La lista no está vacía
    post: regresa el ultimo valor de la lista**/
    public E getLast()
    {
        return isEmpty() ? tail.value() : null;
    }

    /** pre: el valor no es null
     post: agrega el nuevo valor al final**/
    public void addLast(E value)
    {
    // construye un nuevo elemwnto
        tail = new DoubleLinkedNode<E>(value, null, tail);
        // arregla el principio
        if (head == null) head = tail;
        count++;
    }


    /** pre: la lista no es vacia
    post: elimina el ultumo valor de la lista**/
    public E removeLast()
    {
        DoubleLinkedNode<E> temp = tail;
        tail = tail.previous();
        if (tail == null) {
            head = null;
        } else {
            tail.setNext(null);
        }
        count--;
        return temp.value();
    }


    /** pre: La listo no está vacía
     post: Remueve y muesta el valor indicado**/
    public E removeFirst()
    {
        DoubleLinkedNode<E> temp = head;
        head = head.next(); // mueve la cabeza para abajo 
        count--;
        return temp.value();
    }

}