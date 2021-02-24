/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
public interface Stack<E> {
    /**
     * Clase que se encarga de otorgar los metodos que un stack puede usar para el almacenamiento de datos.
     */
    /** Agrega el elementeo a la lista*/
    public void push(E item);

    /** Retorna el ultimo elemento antes de eliminarlo*/
    public E pop();

    /** Retorna el valor del ultimo elemento*/
    public E peek();

    /** Verifica si esta vacio o no*/
    public boolean empty();

    /** Retorna el tamaño*/
    public int size();

}
