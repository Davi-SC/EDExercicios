package ifma.lista03;

public class Node {
    private int element;
    private Node next;

    public Node(Node next, int element) {
        this.next = next;
        this.element = element;
    }

    public Node(int element) {
        this.element = element;
    }

    @Override
    public String toString() {
        if (next != null) {
            return element + " , " + next;
        }else if(next == null) {
            return element + "";
        }
        return "";
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
