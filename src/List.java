/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/


public interface List<E> {
    /**
     * Clase que se encarga de otorgar los metodos que una lista puede usar para el almacenamiento de datos.
     */
    
    public int size();
    // post: retorna el valor de elementos en la lita
 
    public void addLast(E value);
    // pre: que la lista no este vacia
    // post: agrega un valor al final de la lista

    public E removeFirst();
    // pre: lista no vacia
    // post: elimina el primer valor de la lista

    public E getFirst();
    // pre: lista no vacia
    // post: regresa el primer elemento de la lista
 
    public void addFirst(E value);
    // post: valor agregado a la cola de la lista

    public E removeLast();

    public E getLast();


 }