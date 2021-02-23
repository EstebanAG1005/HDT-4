import java.util.ArrayList;
  
public class StackArrayList<E> extends AbsStack<E> {

    public ArrayList<E> array;

    public StackArrayList(){
        this.array = new ArrayList<E>();
    }
    
    //Ingresa Valor al Stack
    @Override
    public void push(E item) {

        array.add(item);
    }
    //Saca elemento del Stack
    @Override
    public E pop() {
        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(array.isEmpty())
        {
            return null;
        }
        else
        {
            //sca el ultimo elemento
            E v = array.get(array.indexOf(array.get(array.size() - 1)));
            array.remove(v);
            return v;
        }
    }
    //Ultimo elemento del Stack
    @Override
    public E peek() {

        //El Stack no debe de estar vacio, por eso se chequea para ver si lo esta 
        if(array.isEmpty())
        {
            return null;
        }
        else{
            return array.get(array.indexOf(array.get(0)));
        }
    }
     //Ver si esta vacio el Stack o no
     
 
     //Tamaño del Stack
     @Override
     public int size() {
 
         return array.size();
     }
 }
