import static org.junit.Assert.*;

public class DobleTest {

    @org.junit.Test
    void getFirst() {
        Doble<Integer> list = new Doble<Integer>();
        list.addFirst(2);
        list.addFirst(3);

        int val = list.getFirst();
        assertEquals(3, val);
    }
}