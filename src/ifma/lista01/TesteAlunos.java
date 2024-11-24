package ifma.lista01;

public class TesteAlunos {
    public static void main(String[] args) {
        CadastrarAlunos alunos = new CadastrarAlunos(4);

        System.out.println("Adicionando Aluno 1 :");
        Aluno aluno1 = new Aluno(1, "ADS001", "Cleitin");
        alunos.adicionarNoFinal(aluno1);
        System.out.println(alunos);

        System.out.println("Adicionando Aluno 2 no Final :");
        Aluno aluno2 = new Aluno(2, "ADS002", "Grilo");
        alunos.adicionarNoFinal(aluno2);
        System.out.println(alunos);

        System.out.println("Adicionando Aluno 3 no Inicio :");
        Aluno aluno3 = new Aluno(3, "ADS003", "Wesleysson");
        alunos.adicionarNoInicio(aluno3);
        System.out.println(alunos);

        System.out.println("Adicionando Aluno 4 no Final :");
        Aluno aluno4 = new Aluno(4, "ADS004", "Boleta");
        alunos.adicionarNoFinal(aluno4);
        System.out.println(alunos);

        System.out.println("Ordenando Alunos :");
        alunos.ordenarVetor();
        System.out.println(alunos);

        System.out.println("Removendo Aluno do Final :");
        alunos.removerNoFinal();
        System.out.println(alunos);

        System.out.println("Removendo Aluno do Inicio :");
        alunos.removerNoInicio();
        System.out.println(alunos);

        System.out.println("Adicionando Aluno 5 no Final :");
        Aluno aluno5 = new Aluno(5, "ADS005", "Armilsson JR");
        alunos.adicionarNoFinal(aluno5);
        System.out.println(alunos);

        System.out.println("Removendo Aluno do indice 1 :");
        alunos.removerComIndice(1);
        System.out.println(alunos);


    }
}
