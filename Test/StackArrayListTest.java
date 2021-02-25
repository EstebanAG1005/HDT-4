import static org.junit.Assert.*;

class StackArraylistTest {

    @org.junit.Test
    void push() {
        StackArrayList<Integer> calc = new StackArrayList<Integer>();
        calc.push(3);
        calc.push(5);

        int val = calc.pop();
        assertEquals(5,val);
    }
}