package FourthSession;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }
    int ptr = -1;
    public boolean push(int item) {
        if(isFull()) {
            System.out.println("Stack is full.");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop() throws StackException {
        if(isEmpty()) {
            throw new StackException("Stack is empty.");
        }
        return data[ptr--];
    }
    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek in an expty stack.");
        }
        return data[ptr];
    }
    private boolean isFull() {
        return ptr == data.length - 1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}
