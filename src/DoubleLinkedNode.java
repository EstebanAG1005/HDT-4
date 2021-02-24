/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/

public class DoubleLinkedNode<E>{
    /**
     * Clase encargada de almacenar los datos ingresados por la clase Double (listas doblemente encadenadas)
     */

    
    protected E data;
    protected DoubleLinkedNode<E> nextElement;
    protected DoubleLinkedNode<E> previousElement;

    public DoubleLinkedNode(E v,DoubleLinkedNode<E> next,DoubleLinkedNode<E> previous)
    {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
            previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }
    public DoubleLinkedNode(E v)
    // post: Construye un unico elemento 
    {
        this(v,null,null);
    }

    public void setNext(DoubleLinkedNode<E> next)
    // post: Hace referencia al siguiente valor
    {
        nextElement = next;
    }

    public void setPrevious(DoubleLinkedNode<E> previous)
    // post: Hace referencia al siguiente valor
    {
        previousElement = previous;
    }
    
    public E value()
    // post: Retorna el valor asociado 
    {
        return data;
    }

    public void setValue(E value)
    // post: Value se asocia con este elemento
    {
        data = value;
    }
    

    public DoubleLinkedNode<E> next(){
        //Regrea el siguiente elemento del bodo
        return nextElement;
    }

    public DoubleLinkedNode<E> previous(){
        //Regresa el elemento previo 
        return previousElement;
    }
    
}
