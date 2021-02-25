import static org.junit.Assert.*;

class StackVectorTest {

    @org.junit.Test
    void push() {
        StackVector<Integer> calc = new StackVector<Integer>();
        calc.push(3);
        calc.push(5);

        int val = calc.pop();
        assertEquals(5,val);
    }
}