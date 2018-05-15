public class Queue implements IQueue {

    private Node first, last;
    private int size;

    @Override
    public void enqueue(String data) {
        Node temp = last;
        last = new Node(data);
        size++;
        if(isEmpty()) {
            first = last;
        } else {
            temp.setNext(last);
        }
    }

    @Override
    public Node dequeue() {
        if(isEmpty()) {
            throw new QueueIsEmptyExeception("Error Queue is empty");
        } else {
            Node temp = first;
            first = first.getNext();
            size--;
            System.out.println(first.getData() + " is next in the queue");
            return temp;
        }
    }

    @Override
    public Node peek() {
        if(isEmpty()) {
            throw new QueueIsEmptyExeception("Error Queue is empty");
        } else {
            return first;
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printList() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.getData() + " ");
            temp = temp.getNext();
        }
    }
}
