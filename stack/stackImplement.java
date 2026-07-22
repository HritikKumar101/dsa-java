public class stackImplement {

    private int[] data;
    private int top;

    public stackImplement() {
        data = new int[10];
        top = -1;
    }

    public stackImplement(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[top];
    }

    public void push(int element) {
        if (size() == data.length) {
            System.out.println("Stack is Full");
            return;
        }

        top++;
        data[top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }

        int temp = data[top];
        top--;
        return temp;
    }
}