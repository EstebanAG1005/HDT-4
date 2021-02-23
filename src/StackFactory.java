public class StackFactory <E>{
    //selecciona la implementacion a utilizar para un stack
//se utiliza el patron Factory
   public Stack<E> getStack(int resp1, int resp2) {
    // seleccion de la implementacion a utilizar:
        if (resp1 == 1){
            return new StackArrayList<E>(); //regresa ArrayList
        }else if (resp1 == 2){
            return new StackVector<E>(); //regresa Vector
        }
        return null;
   }

   public List<E> getList(int resp1, int resp2){
        if(resp1 == 3){
            if(resp2==1){
                return new Simple<E>(); //regresa simple encadenada
            }else if(resp2 ==2){
                return new Doble<E>(); //regresa doble encadenada
            }
        }
        return null;
    }
   

   
}
      



