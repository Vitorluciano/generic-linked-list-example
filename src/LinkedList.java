public class LinkedList<T> {
    Node<T> head;

    public LinkedList(Node<T> head) {
        this.head = head;
    }

    public void prepend(Node<T> newNode) {
        newNode.next = this.head;
        this.head = newNode;
    }

    public void display() {
        Node<T> current = this.head;

        while (current != null) {
            System.out.println("- " + current.value.toString());
            current = current.next;
        }
    }
}
