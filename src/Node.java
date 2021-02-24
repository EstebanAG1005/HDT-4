/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/

public class Node<E>{
    /**
     * Clase encargada de almacenar los datos ingresados por la clase Simple (listas encadenadas)
     */

    protected E data; // Valor guardado en este elemento
    protected Node<E> nextElement; // referencia al siguiente elemento 
 
    public Node(E v, Node<E> next)
    // pre: v es un valor, despues va la referencia de la lista
    // post: un elemento es construido como la nueva cabeza
    {
        data = v;
        nextElement = next;
    }
    public Node(E v)
    // post: contruye la cola de la lista con valor v
    {
        this(v,null);
    }
    
    public Node<E> next()
    // post: Retorna referencia del siguiente valor de la lista 
    {
        return nextElement;
    }
    
    public void setNext(Node<E> next)
    // post: Hace referencia al siguiente valor
    {
        nextElement = next;
    }
    
    public E value()
    // post: Retorna el valor asociado al sistema
    {
        return data;
    }

    public void setValue(E value)
    // post: hace set al valor asociado al sistema 
    {
        data = value;
    }
    
}
