public class stackDoubleCapacity{

    private int[] data;
    private int top;

    public stackDoubleCapacity() {
        data = new int[10];
        top = -1;
    }

    public stackDoubleCapacity(int capacity) {
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
            doubleCapacity();  
            
        }

        top++;
        data[top] = element;
    }

    private void doubleCapacity(){
        int temp[] = data;
        data = new int[2*temp.length];
        for(int i =0;i<= top;i++){
            data[i] = temp[i];
        }
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