package ifma.lista04;

public class Node {
    private Student student;
    private Node next;
    private Node previous;

    public Node(){}

    public Node(Student student) {
        this.student = student;
        this.next = null;
        this.previous = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return ""+student;
    }
}
