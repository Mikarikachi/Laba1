public class Container {

    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    /**
     * Appends the specified element to the end of this container.
     *
     * @param ob  the element to add
     */
    public void filling(Object ob) {
        size++;
        Node temp = new Node(ob);
        if (head == null) {
            head = temp;
            return;
        }
        Node counter = head;
        while (counter.next != null) {
            counter = counter.next;
        }
        counter.next = temp;
    }

    /**
     * Returns the element at the specified position in this container.
     *      @param index  index of the element to return
     * @return the element at the specified position in this container
     */
    public Object getByIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.out.println("Индекс лежит за пределами допустимых границ");
            return -1;
        }
        Node result = head;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.value;
    }

    /**
     * Removes the element at the specified position in this container.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the container.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     */
    public Object deleteByIndex(int index) {
        if ((index >= size) || (index < 0)) {
            System.out.println("Индекс лежит за пределами допустимых границ");
            return null;
        }
        size--;
        Node result1 = head;
        if (index == 0) {
            head = head.next;
            return result1.value;
        }
        for (int i = 0; i < index - 1; i++) {
            result1 = result1.next;
        }
        Object value = result1.next.value;
        if (result1.next.next == null) {
            result1.next = null;
        } else {
            result1.next = result1.next.next;
        }
        return value;
    }
}