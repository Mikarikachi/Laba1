import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerTest {

    @Test
    void fillingOneElement() {
        Container num = new Container();
        num.filling(3);
        assertEquals(3, num.getHead().value);
        assertNull(num.getHead().next, "Последний элемент не ссылается на null");
        assertEquals(1, num.getSize());
    }

    @Test
    void fillingSeveralElements() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        assertEquals(0, num.getHead().value);
        assertEquals(1, num.getHead().next.value);
        assertEquals(2, num.getHead().next.next.value);
        assertEquals(3, num.getSize());
    }


    @Test
    void getByZeroIndex() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        assertEquals(0, num.getByIndex(0));
    }

    @Test
    void getByMiddleIndex() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        assertEquals(1, num.getByIndex(1));
    }

    @Test
    void getByLastIndex() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        assertEquals(2, num.getByIndex(num.getSize() - 1));
    }

    @Test
    void deleteByIndexSizeChecker() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        int capacity = num.getSize();
        num.deleteByIndex(1);
        assertEquals(capacity - 1, num.getSize());

    }

    @Test
    void deleteByIndex() {
        Container num = new Container();
        for (int i = 0; i < 3; i++) {
            num.filling(i);
        }
        assertEquals(1, num.deleteByIndex(1));
        assertEquals(2, num.deleteByIndex(1));

    }
}