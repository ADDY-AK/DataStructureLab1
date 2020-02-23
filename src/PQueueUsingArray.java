class Element {
    int data;
    int priority;

    Element(int d, int p) {
        data = d;
        priority = p;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class PQueueUsingArray {
    int front;
    int rear;
    Element arr[];

    public PQueueUsingArray(int size) {
        front = -1;
        rear = -1;
        arr = new Element[size];
    }

    public boolean isempty() {
        return front == -1;
    }

    public boolean isfull() {
        return rear == arr.length - 1;
    }

    public void enqueue(Element newelement) {
        int i;
        if (arr == null) {
            System.out.println("not created");
            return;
        }
        if (isfull()) {
            System.out.println("overflow");
        } else if (isempty()) {
            front++;
            rear++;
            arr[rear] = newelement;
        } else {
            for (i = rear; i >= front; i--) {
                if (newelement.priority <= arr[i].priority) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i++] = newelement;
            rear++;
        }
    }

    public void dequeue() {
        if (isempty()) {
            System.out.println("underflow");
        } else {
            System.out.println(arr[front]);
            front++;
            if (front > rear) {
                front = rear = -1;
            }
        }
    }

    public void printQueue() {
        if (isempty()) {
            System.out.println("no elements");
        } else {
            for (int i = front; i < rear; i++) {
                System.out.println(arr[i].data);
            }
        }
    }
}

class MyMain {
    public static void main(String[] args) {
        Element e1 = new Element(10, 3);
        Element e2 = new Element(20, 5);
        Element e3 = new Element(30, 1);
        Element e4 = new Element(40, 2);
        //Element e5=new Element(50,4);
        PQueueUsingArray obj = new PQueueUsingArray(5);
        obj.enqueue(e1);
        obj.enqueue(e2);
        obj.enqueue(e3);
        obj.enqueue(e4);
        //obj.enqueue(e5);
        obj.printQueue();
    }
}
