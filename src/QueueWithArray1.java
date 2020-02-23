import java.util.Scanner;

public class QueueWithArray1 {
    int arr[];
    int top;
    int beginning;

    public QueueWithArray1(int size) {
        arr = new int[size];
        top = -1;
        beginning = -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        QueueWithArray1 obj = new QueueWithArray1(sc.nextInt());
        while (true) {
            System.out.println("1.print queue");
            System.out.println("2.peek queue");
            System.out.println("3.enqueue");
            System.out.println("4.dequeue");
            System.out.println("5.delete queue");
            System.out.println("6.exit");

            System.out.println("Enter your choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.printqueue();
                    break;
                case 2:
                    obj.peekQueue();
                    break;
                case 3:
                    obj.enqueue(sc.nextInt());
                    break;
                case 4:
                    obj.dequeue();
                    break;
                case 5:
                    obj.deleteQueue();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");

            }

        }
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