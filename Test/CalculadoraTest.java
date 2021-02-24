import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void calculoStack() {
        Calculadora prueba = new Calculadora();
        Factory<Integer> imp = new Factory<Integer>();

        Stack<Integer> operacion = imp.getStack(1,1);
        Singleton c = new Singleton();
        Calculadora calculadora = c.calculadora();

        String postfix = "12+9*";
        assertEquals(27,Integer.parseInt(calculadora.calculoStack(operacion, postfix)));
    }

    @org.junit.Test
    public void calculoList() {
        Calculadora prueba = new Calculadora();
        Factory<Integer> imp = new Factory<Integer>();

        List<Integer> operacion = imp.getList(3,1);
        Singleton c = new Singleton();
        Calculadora calculadora = c.calculadora();

        String postfix = "12+9*"; 
        assertEquals(27,Integer.parseInt(calculadora.calculoList(operacion, postfix)));

    }
}