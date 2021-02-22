import java.io.*;
import java.util.Scanner;



public class Main {
    public static void main(String[]args){
        
        Scanner s = new Scanner(System.in);

        System.out.println("\t Bienvenido al conversor de Infix a Postfix. ");
        System.out.println("\t Seleccione la implementacion que desea utizar para el stack: ");
        System.out.println("\n\t\t [ 1 ] Array.");
        System.out.println("\t\t [ 2 ] Vector.");
        System.out.println("\t\t [ 3 ] List.");
        
        int res = 0;
        int res2 =0;

        while(true){
            try{
                System.out.print("\n\t\t -> ");
                res = s.nextInt();
                
                if(res>=1 && res<=3){
                    break;
                }else{
                    System.out.println("\n\t Ingrese valores entre 1 y 3 !");
                }
            }catch(Exception e){
                System.out.println("\n\t Ingrese valores numericos ! ! !");
            }

        }
        if(res==3)
        {
            System.out.println("\n\t Seleccione el tipo de lista que desea utilizar: "); 
            System.out.println("\n\t\t [ 1 ] Simplemente encadenada.");
            System.out.println("\t\t [ 2 ] Doblemente encadenada.");

            while(true){
                try{
                    System.out.print("\n\t\t -> ");
                    res2 = s.nextInt();
                    
                    if(res2>=1 && res2<=2){
                        break;
                    }else{
                        System.out.println("\n\t Ingrese valores entre 1 y 2 !");
                    }
                }catch(Exception e){
                    System.out.println("\n\t Ingrese valores numericos ! ! !");
                }
    
            }
        }
        
        
            
        String datos = "";
        String postfix ="";
        try {
            Scanner input = new Scanner(new File("datos.txt"));
            int cont = 0;
            while (input.hasNextLine()) {
                datos = input.nextLine();
                postfix = postFix.convert(datos);

                System.out.println("\n\t\t Expresion InFix: "+datos);
                System.out.println("\t\t Expresion PostFix: "+postfix);
                
                StackFactory<Integer> imp = new StackFactory<Integer>();

                if(res == 1 || res == 2){
                    Stack<Integer> operacion = imp.getStack(res,res2);

                    Singleton c = new Singleton();
                    Calculadora calculadora = c.calculadora();
                    System.out.println("\n\t\t Resultado : "+calculadora.calculoStack(operacion, postfix));

                }else{

                    List<Integer> operacion = imp.getList(res,res2);

                    Singleton c = new Singleton();
                    Calculadora calculadora = c.calculadora();
                    System.out.println("\n\t\t Resultado : "+calculadora.calculoList(operacion, postfix));
                }
                
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        
        

    }

    
}
