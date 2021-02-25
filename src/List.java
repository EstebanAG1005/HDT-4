/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/


public interface List<E> {
    /**
     * Clase que se encarga de otorgar los metodos que una lista puede usar para el almacenamiento de datos.
     */

    /**
     * @return retorna el valor de elementos en la lita
     */
    public int size();


    /** pre: que la lista no este vacia
     * @return  un elemento es construido como la nueva cabeza
     */
    public void addLast(E value);


    /** pre: lista no vacia
     * @return elimina el primer valor de la lista
     */
    public E removeFirst();


    /** pre: lista no vacia
     * @return regresa el primer elemento de la lista
     */
    public E getFirst();

    /**
     * @return valor agregado a la cola de la lista
     */
    public void addFirst(E value);
    //

    public E removeLast();

    public E getLast();


 }