package ifma.lista04;

public class DequeList {
    private Node header;
    private Node trailer;
    private int size;

    public DequeList() {
        size = 0;
        header = new Node(null);
        trailer = new Node(null);
        header.setNext(trailer);
        trailer.setPrevious(header);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(Student student) {
        Node first = header.getNext();
        Node newNode = new Node(student);

        newNode.setNext(first);
        newNode.setPrevious(header);

        first.setPrevious(newNode);
        header.setNext(newNode);

        size++;
    }

    public void addLast(Student student){
        Node last = trailer.getPrevious();
        Node newNode = new Node(student);

        newNode.setNext(trailer) ;
        newNode.setPrevious(last);

        last.setNext(newNode);
        trailer.setPrevious(newNode);

        size++;
    }

    public Student removeFirst() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }

        Node first = getFirst();
        Node second = first.getNext();

        header.setNext(second);
        second.setPrevious(header);

        size--;
        return first.getStudent();
    }

    public Student removeLast() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }

        Node last = getLast();
        Node before = last.getPrevious();

        before.setNext(trailer);
        trailer.setPrevious(before);

        size--;
        return last.getStudent();
    }

    public Node getFirst() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return header.getNext();
    }

    public Node getLast() {
        if(isEmpty()){
            throw new RuntimeException("Lista vazia");
        }
        return trailer.getPrevious();
    }

    public Node search(String searched){
        Node node = header.getNext();
        while(node!= null){
            if(node.getStudent().getName().equals(searched)){
                return node;
            }
            node = node.getNext();
        }
        throw new RuntimeException("Aluno não encontrado");
    }

    @Override
    public String toString() {
        if(isEmpty()){
            return "[]";
        }
        Node node = header.getNext();
        String result = "[" + node.getStudent();
        node = node.getNext();
        while(node != trailer){
            result += ", "+node.getStudent();
            node = node.getNext();
        }
        return result + " ]" ;
    }

}
