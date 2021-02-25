/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/

public class Simple<E> extends AbsList<E>{
    /**
     * Clase donde se implementan los metodos de List para las listas encadenadas simples
     */
    protected int count; // Tamaño de lista
    protected Node<E> head; // Referencia al primer elemeton 

    //remove --
    //add++

    public Simple()
    /** post: Genera Lista Vacia**/
    {
        head = null;
        count = 0;
    }
   
    public int size()
    // post: Regresa los elementos en lista
    {
        // Numero de elementos vistos en la lista
        int elementCount = 0;
        // Referencia al potencial primer elemento
        Node<E> finger = head;
        while (finger != null) {
            // finger references a new element, count it
            elementCount++;
            // Referencia posible, pasa al siguiente elemento
            finger = finger.next();
        }
        return elementCount;
    }
  
    public void addFirst(E value)
    // post: El valor se agrega el inicio de la lista
    {
        // Notar orden con el que pasan las coasa
        // Heas es un parametro el cual se asgina mas adelante
        head = new Node<E>(value, head);
        count++;
    }
  
    public E removeFirst()
    // pre: La listo no está vacía
    // post: Remueve y muesta el valor indicado
    {
        Node<E> temp = head;
        head = head.next(); // mueve la cabeza para abajo 
        count--;
        return temp.value();
    }
  
    public E getFirst()
    // pre: La lista no está vacía 
    // post: Retorna el primer valor de la lista
    {
        return head.value();
    }

    public E getLast()
    // pre: La lista no está vacía 
    // post: returns first value in list
    {
        Node<E> finger = head;
        Node<E> previous = null;

        while (finger.next() != null)
        {
            previous = finger;
            finger = finger.next();
        }
        if(previous == null){
            return head.value();
        }

        return finger.value();
        
    }
  
    public void addLast(E value)
    // post: agrega el valor al final de la lista
    {
        // el lugar de el nuevo valor
        Node<E> temp = new Node<E>(value,null);
        if (head != null)
        {
            // busca el posible lugar
            Node<E> finger = head;
            while (finger.next() != null)
            {
                    finger = finger.next();
            }
            
            finger.setNext(temp);
        } else head = temp;
        
        count++;
        
    }

    public E removeLast()
    // pre: que la lista no este vacia
    // post: elimina el ultimo valor de la lista
    {
        Node<E> finger = head;
        Node<E> previous = null;
        while (finger.next() != null) // encuentra el final de la lista
        {
            previous = finger;
            finger = finger.next();
        }
        //finger esta vacio o puntos ira al final de la lista
        if (previous == null)
        {
            // tiene un elemento
            head = null;
        }else{
            // marca el ultimo elemento
            previous.setNext(null);
        }
        count--;
        return finger.value();
    }

}