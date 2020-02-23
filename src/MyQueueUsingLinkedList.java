class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

public class MyQueueUsingLinkedList {
    Node start;
    Node end;

    MyQueueUsingLinkedList() {
        start = null;
        end = null;
    }

    public static void main(String[] args) {
        MyQueueUsingLinkedList obj = new MyQueueUsingLinkedList();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
        obj.printqueue();
        //obj.dequeue();
        //obj.printqueue();
        // obj.deletequeue();
        // obj.printqueue();


    }

    public void enqueue(Node newnode) {
        if (start == null) {

            start = newnode;
            end = newnode;
        } else {
            end.next = newnode;
        }
    }

    public void dequeue() {
        if (start == null) {
            System.out.println("underflow");
        } else {
            start = start.next;
        }
    }

    public void printqueue() {
        if (start == null) {
            System.out.println("underflow");
        } else {
            Node i = start;
            while (i != null) {
                System.out.println(i.data);
                i = i.next;
            }
        }
    }

    public void deletequeue() {
        start = null;
        end = null;
    }
}
