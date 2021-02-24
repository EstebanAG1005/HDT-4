import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackArraylistTest {

    @Test
    void push() {
        StackArrayList<Integer> calc = new StackArrayList<Integer>();
        calc.push(3);
        calc.push(5);

        int val = calc.pop();
        assertEquals(5,val);
    }
}