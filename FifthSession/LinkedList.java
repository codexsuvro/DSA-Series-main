package FifthSession;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        this.size = 0;
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void display() {
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.insertFirst(1);
        LL.insertFirst(10);
        LL.insertFirst(100);
        LL.insertFirst(1000);
        LL.insertFirst(10000);
        LL.insertLast(100000);
        LL.insert(5, 3);
        LL.deleteFirst();
        LL.deleteLast();
        LL.display();
    }
}
