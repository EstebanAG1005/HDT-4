/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
abstract class AbsStack<E> implements Stack<E>{
    /**
     * Clase Abstracta encargada de ver si el stack está vacío
     */
    
    public boolean empty() {
 
        return size() == 0 ;
    }
}
