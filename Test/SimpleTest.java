import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleTest {

    @Test
    void getFirst() {
        Simple<Integer> list = new Simple<Integer>();
        list.addFirst(2);
        list.addFirst(3);

        int val = list.getFirst();
        assertEquals(3, val);
    }
}