/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
abstract class AbsList<E> implements List<E>{
    /**
     * Clase abstracta que se encarga de ver si la lista esta vacia y dar su tamaño.
     */
    
    protected int count;
    
    public boolean isEmpty()
   // post: Regresa true si no hay elementos en la lista
    {
        return size() == 0;
    }
  
    public int size()
    // pre: valor no es null
    // post: Retorna true si encuenta un valor 
    {
        return count;
    }
}