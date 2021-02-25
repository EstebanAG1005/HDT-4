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

    /** post: Construye un unico elemento **/
    public DoubleLinkedNode(E v)

    {
        this(v,null,null);
    }


    /** post: Hace referencia al siguiente valor**/
    public void setNext(DoubleLinkedNode<E> next)
    {
        nextElement = next;
    }


    /** post: Hace referencia al siguiente valor**/
    public void setPrevious(DoubleLinkedNode<E> previous)

    {
        previousElement = previous;
    }

    /** post: Retorna el valor asociado **/
    public E value()

    {
        return data;
    }

    /** post: Value se asocia con este elemento**/
    public void setValue(E value)

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
