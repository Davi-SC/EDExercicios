package ifma.lista04;

public class TestDequeList {
    public static void main(String[] args) {

        DequeList dequeList = new DequeList();

        Student student1 = new Student("Shaolin", 3.0, 9.0);
        Student student2 = new Student("Bola", 7.0, 2.5);
        Student student3 = new Student("Bastiao", 6.9, 7.43);
        Student student4 = new Student("Gilbertina", 7.6, 4.5);
        Student student5 = new Student("Lindoval", 10.0, 10.0);

        System.out.println("Adicionando os alunos na lista");

        dequeList.addFirst(student3);
        dequeList.addFirst(student2);
        dequeList.addFirst(student1);
        dequeList.addLast(student4);
        dequeList.addLast(student5);

        System.out.println(dequeList);

        System.out.println("Removendo o primeiro aluno");
        System.out.println("Aluno removido: "+dequeList.removeFirst());
        System.out.println(dequeList);

        System.out.println("Removendo o ultimo aluno");
        System.out.println("Aluno removido: "+dequeList.removeLast());
        System.out.println(dequeList);

        System.out.println("Buscando a aluna Gilbertina");
        System.out.println(dequeList.search("Gilbertina"));


    }
}
