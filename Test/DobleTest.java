import org.junit.jupiter.api.Test;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class DobleTest {

    @Test
    void getFirst() {
        Doble<Integer> list = new Doble<Integer>();
        list.addFirst(2);
        list.addFirst(3);

        int val = list.getFirst();
        assertEquals(3, val);
    }
}