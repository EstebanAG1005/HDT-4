import static org.junit.Assert.*;

class SimpleTest {

    @org.junit.Test
    void getFirst() {
        Simple<Integer> list = new Simple<Integer>();
        list.addFirst(2);
        list.addFirst(3);

        int val = list.getFirst();
        assertEquals(3, val);
    }
}