package FourthSession;

public class DynamicQueue extends CustomQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }
    @Override
    public boolean insert(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.insert(item);
    }
}
