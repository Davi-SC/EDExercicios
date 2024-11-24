package ifma.lista03;

import java.util.Scanner;

public class TestSimpleList {
    public static void main(String[] args) {
        SimpleList simpleList = new SimpleList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Teste de SimpleList");
            System.out.println("1 - Imprimir lista");
            System.out.println("2 - Adicionar elemento no início");
            System.out.println("3 - Adicionar elemento no final");
            System.out.println("4 - Remover elemento do início");
            System.out.println("5 - Remover elemento do final");
            System.out.println("6 - Maior elemento");
            System.out.println("7 - Menor elemento");
            System.out.println("8 - Média dos elementos");
            System.out.println("9 - Sair");
            System.out.print("Escolha uma opção: ");
            int option = scanner.nextInt();

            if (option == 1) {
                System.out.println(simpleList);

            } else if (option == 2) {
                System.out.print("Digite o elemento a ser adicionado: ");
                int element = scanner.nextInt();
                simpleList.addStart(element);
            } else if (option == 3) {
                System.out.print("Digite o elemento a ser adicionado: ");
                int element = scanner.nextInt();
                simpleList.addEnd(element);
            } else if (option == 4) {
                int element = simpleList.removeStart();
                System.out.println("Elemento removido: " + element);
            } else if (option == 5) {
                int element = simpleList.removeEnd();
                System.out.println("Elemento removido: " + element);
            } else if (option == 6) {
                int bigger = simpleList.bigger();
                System.out.println("Maior elemento: " + bigger);
            } else if (option == 7) {
                int smaller = simpleList.smaller();
                System.out.println("Menor elemento: " + smaller);
            } else if (option == 8) {
                double average = simpleList.average();
                System.out.println("Média dos elementos: " + average);
            } else if (option == 9) {
                break;
            } else {
                System.out.println("Opção inválida");
            }

        }//Fim do while
    }//Fim do main

}
