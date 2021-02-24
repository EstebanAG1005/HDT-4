/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/
public class Calculadora {
    /**
     * Clase que recibe una operacion que la va trabajando por medio de stacks o lists para regresar el resultado.
     */

    
    public String calculoStack(Stack<Integer> stack, String datos) {
        //Se crea Stack
        int x = 0, y = 0;
        char ch[] = datos.toCharArray();
        //for para realizar las operaciones 
        for(char c: ch) {
          if(c >= '0' && c <= '9') {
            stack.push((int)(c - '0'));
          } else {
            y = stack.pop();
            x = stack.pop();
            switch(c) {
              case '+':
                stack.push(x+y);
                break;
              case '-':
                stack.push(x-y);
                break;
              case '*':
                stack.push(x*y);
                break;
              case '/':
                stack.push(x/y);
                break;
            }
          }
        }
        return String.valueOf(stack.pop());
    }

    public String calculoList(List<Integer> list, String datos) {
       
        int x = 0, y = 0;
        char ch[] = datos.toCharArray();
        //for para realizar las operaciones 
        for(char c: ch) {
          if(c >= '0' && c <= '9') {
            list.addLast((int)(c - '0'));
          } else {
            y = list.getLast();
            list.removeLast();
            x = list.getLast();
            list.removeLast();
            switch(c) {
              case '+':
                list.addLast(x+y);
                break;
              case '-':
                list.addLast(x-y);
                break;
              case '*':
                list.addLast(x*y);
                break;
              case '/':
                list.addLast(x/y);
                break;
            }
          }
        }
        String respuesta = list.getLast()+"";
        list.removeLast();
        return respuesta;


        
    }

}

