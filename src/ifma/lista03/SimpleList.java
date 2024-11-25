package ifma.lista03;

public class SimpleList {
    private Node head;
    private Node tail;
    private int size;

    public SimpleList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addStart(int element) {
        Node newNode = new Node(element);
        if (this.head == null) {
            this.head = newNode ;
            this.tail = this.head;
        } else {
            newNode.setNext(this.head);
            this.head = newNode;
        }
        this.size++;
    }

    public void addEnd(int element) {
        Node newNode = new Node(element);
        if (this.head == null) {
            addStart(element);
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
    }

    public int removeStart() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int element = this.head.getElement();
        this.head = this.head.getNext();
        this.size--;
        return element;
    }

    public int removeEnd() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int element = this.tail.getElement();
        Node current = this.head;
        while (current.getNext() != this.tail) {
            current = current.getNext();
        }
        current.setNext(null);
        this.tail = current;
        this.size--;
        return element;
    }

    public int bigger() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int bigger = this.head.getElement();
        Node current = this.head.getNext();
        while (current != null) {
            if (current.getElement() > bigger) {
                bigger = current.getElement();
            }
            current = current.getNext();
        }
        return bigger;
    }

    public int smaller() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int smaller = this.head.getElement();
        Node current = this.head.getNext();
        while (current != null) {
            if (current.getElement() < smaller) {
                smaller = current.getElement();
            }
            current = current.getNext();
        }
        return smaller;
    }

    public double average() {
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        int sum = 0;
        Node current = this.head;
        while (current != null) {
            sum += current.getElement();
            current = current.getNext();
        }
        return (double) sum / this.size;
    }

    public void ordenate() {
        int temp ;
        if (this.head == null) {
            throw new RuntimeException("Lista vazia");
        }
        Node current = this.head;
        while (current != null) {
            Node next = current.getNext();
            while (next != null) {
                if (current.getElement() > next.getElement()) {
                    temp = current.getElement();
                    current.setElement(next.getElement());
                    next.setElement(temp);
                }
                next = next.getNext();
            }
            current = current.getNext();
        }
    }

    @Override
    public String toString() {
        return "[" + head + "]";
    }
}

