import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){

        String datos = "";
        try {
            Scanner input = new Scanner(new File("datos.txt"));
            int cont = 0;
            while (input.hasNextLine()) {
                datos += input.nextLine();
            }
            input.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(datos);

    }

    private String postFix(String infix){

        return "";
        //holaaaaaaaaa
    }
}
