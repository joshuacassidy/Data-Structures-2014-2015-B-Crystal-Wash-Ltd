public interface IQueue {
    public void enqueue(String data);
    public Node dequeue();
    public Node peek();
    public boolean isEmpty();
    public int size();
    public void printList();
}
