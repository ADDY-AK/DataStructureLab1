public class QueueWithArray {
    int arr[];
    int top;
    int beginning;

    public QueueWithArray(int size) {
        arr = new int[size];
        top = -1;
        beginning = -1;
    }

    public static void main(String[] args) {
        QueueWithArray obj = new QueueWithArray(5);
        System.out.println(obj.isEmpty());
        System.out.println(obj.isFull());
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(10);
        obj.enqueue(60);
        obj.enqueue(70);
        obj.printqueue();
        obj.peekQueue();
        obj.deleteQueue();
    }

    public boolean isFull() {
        if (top == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (beginning == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(int val) {
        if (isFull()) {
            System.out.println("overflow");
        } else if (isEmpty()) {
            beginning++;
            top++;
            arr[top] = val;
        } else {
            top++;
            arr[top] = val;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            System.out.println(arr[beginning]);
            arr[beginning] = 0;
            beginning++;
            if (beginning > top) {
                top = beginning = -1;
            }
        }
    }

    public void printqueue() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            for (int i = beginning; i <= top; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public void peekQueue() {
        if (isEmpty()) {
            System.out.println("underflow");
        } else {
            System.out.println(arr[beginning]);
        }
    }

    public void deleteQueue() {
        arr = null;
        System.out.println("queue deleted");
    }
}
