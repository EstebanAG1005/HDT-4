/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/

import java.util.Vector;

public class StackVector<E> extends AbsStack<E> {
    /**
     * Clase que implementa los Metodos de Stack para hacer uso con Vector
     */

    public Vector<E> vector;

    public StackVector(){
        this.vector = new Vector<E>();
    }

    /**Ingresa Valor al Stack**/
    @Override
    public void push(E data) {

        vector.add(data);
    }

    /**Saca elemento del Stack**/
    @Override
    public E pop() {
        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.isEmpty())
        {
            return null;
        }
        else
        {
            //sca el ultimo elemento
            E v = vector.get(vector.indexOf(vector.lastElement()));
            vector.remove(v);
            return v;
        }
    }

    /**Ultimo elemento del Stack**/
    @Override
    public E peek() {

        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(vector.isEmpty())
        {
            return null;
        }
        else{
            return vector.get(vector.indexOf(vector.firstElement()));
        }
    }

    

    /**Regresa el Tamaño del Stack**/
    @Override
    public int size() {

        return vector.size();
    }
}