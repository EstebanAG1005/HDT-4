/**
*@author Juan Diego Avila 20090
*@author Esteban Aldana 20591
*@author Diego José Franco 20240
*/

import java.util.Stack;

public class postFix {
    /**
     * Clase encargada de convertir entrada infix a postfix
     */

    static int Prec(char ch) 
    { 
        switch (ch) 
        { 
        case '+': 
        case '-': 
            return 1; 
       
        case '*': 
        case '/': 
            return 2; 
       
        case '^': 
            return 3; 
        } 
        return -1; 
    } 

    public static String convert(String infix){
        // Inicializar String Vacio por Resultado
        String postfix = new String(""); 
          
        // Inicializar Stack Vacio
        Stack<Character> stack = new Stack<>(); 
          
        for (int i = 0; i<infix.length(); ++i) 
        { 
            char c = infix.charAt(i); 
              
            // Si el valor escaneado es un  
            // operando, añadir al output 
            if (Character.isLetterOrDigit(c)) 
                postfix += c; 
               
            // Si el valor escaneado es un '(',  
            // lo agrega al stack.
            else if (c == '(') 
                stack.push(c); 
              
            //  Si el valor escaneado es un ')',  
            // realiza un pop del mismo antes 
            // de encontrar un '(' en el stack. 
            else if (c == ')') 
            { 
                while (!stack.isEmpty() &&  
                        stack.peek() != '(') 
                        postfix += stack.pop(); 
                  
                    stack.pop(); 
            } 
            else // Un operador es encontrado
            { 
                while (!stack.isEmpty() && Prec(c)  
                         <= Prec(stack.peek())){ 
                    
                    postfix += stack.pop(); 
             } 
                stack.push(c); 
            } 
       
        } 
       
        // hace pop a los operandos del stack
        while (!stack.isEmpty()){ 
            if(stack.peek() == '(') 
                return "Invalid Expression"; 
            postfix += stack.pop(); 
         } 
        return postfix;
        
    }
}
