public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println(queue.dequeue().getData() + " has been removed from the queue");
        System.out.println(queue.dequeue().getData() + " has been removed from the queue");
        queue.printList();
    }

}
