package ifma.lista02;

public class Index {
    public static void main(String[] args) {
        System.out.println("\nQuestão 01");
        q01();
        System.out.println("\nQuestão 02");
        q02();
        System.out.println("\nQuestão 03");
        q03();
        System.out.println("\nQuestão 04");
        q04();
        System.out.println("\nQuestão 05");
        q05();
        System.out.println("\nQuestão 06");
        q06();
        System.out.println("\nQuestão 07");
        q07();
        System.out.println("\nQuestão 08");
        q08();
        System.out.println("\nQuestão 09");
        q09();
        System.out.println("\nQuestão 10");
        q10();
        System.out.println("\nQuestão 11");
        q11();
        System.out.println("\nQuestão 12");
        q12();
        System.out.println("\nQuestão 13");
        q13();
        System.out.println("\nQuestão 14");
        q14();
        System.out.println("\nQuestão 15");
        q15();
        System.out.println("\nQuestão 16");
        q16();
        System.out.println("\nQuestão 17");
        q17();
        System.out.println("\nQuestão 18");
        q18();
    }

    static int[][] matriz(){
        int [][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        return matriz;
    }

    static void imprimirMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void q01(){
        int [][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    static void q02(){
        int [][] matriz = matriz();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    matriz[i][j] = 0;
                }
            }
        }
        imprimirMatriz(matriz);
    }

    static void q03(){
        int [][] matriz = matriz();
        System.out.println("Diagonal secundária:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q04(){
        int [][] matriz = matriz();
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == (matriz.length - 1) - j){
                    soma += matriz[i][j];
                }
            }
        }
        System.out.println("Soma da diagonal secundária = "+soma);
    }

    static void q05(){
        int [][] matriz = matriz();
        System.out.println("Diagonal secundaria e abaixo: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q06(){
        int [][] matriz = matriz();
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= (matriz.length - 1) - j){
                    soma += matriz[i][j];
                    cont++;
                }
            }
        }
        double media = (double) soma/cont;
        System.out.println("Media da diagonal secundária e abaixo = "+media);
    }

    static void q07(){
        int [][] matriz = matriz();
        System.out.println("Abaixo da diagonal secundária: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q08() {
        int[][] matriz = matriz();
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > (matriz.length - 1) - j) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }
        System.out.println("Maior valor abaixo da diagonal secundária = "+maior);
    }

    static void q09(){
        int [][] matriz = matriz();
        System.out.println("Diagonal secundaria e acima: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q10(){
        int [][] matriz = matriz();
        int maior = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i > (matriz.length - 1) - j) {
                    if (matriz[i][j] > maior) {
                        maior = matriz[i][j];
                    }
                }
            }
        }
        int menor = maior;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= (matriz.length - 1) - j){
                    if(matriz[i][j] < menor){
                        menor = matriz[i][j] ;
                    }
                }
            }
        }
        System.out.println("Menor valor da diagonal secundaria e acima = "+menor);
    }

    static void q11(){
        int [][] matriz = matriz();
        System.out.println("Acima da diagonal secundaria : ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < (matriz.length - 1) - j){
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }

    static void q12(){
        int [][] matriz = matriz();
        int produto = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i < (matriz.length - 1) - j){
                    produto *= matriz[i][j];
                }
            }
        }
        System.out.println("Produto dos acima da diagonal secundaria : "+produto);
    }

    static void q13(){
        int [][] matrizA = matriz() ;
        int [][] matrizB = matriz();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] % 2 == 0){
                    matrizB[i][j] = (int) Math.pow(matrizA[i][j],2);
                }else {
                    matrizB[i][j] = (int) Math.pow(matrizA[i][j],3);
                }
            }
        }
        System.out.println("Matriz A: ");
        imprimirMatriz(matrizA);
        System.out.println("\nMatriz B");
        imprimirMatriz(matrizB);
    }

    static void q14(){
        int [][] matriz = matriz() ;
        System.out.println("Matriz apos girar 90º: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[matriz.length-1-j][i]+" ");
            }
            System.out.println();
        }
    }

    static void q15(){
        int [][] matriz = matriz() ;
        System.out.println("Matriz apos girar 180º: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[matriz.length-1-i][matriz.length-1-j]+" ");
            }
            System.out.println();
        }
    }

    static void q16(){
        int [][] matriz = matriz() ;
        System.out.println("Matriz apos girar 270º: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[j][matriz.length-1-i]+" ");
            }
            System.out.println();
        }
    }

    static void q17(){
        int [][] matrizSemMeio = new int[3][2] ;
        int [][] matriz = matriz() ;
        int aux = 0 ;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j!=1) {
                    aux = j ;
                    if(j==2){
                        aux = j-1 ;
                    }
                    matrizSemMeio[i][aux] = matriz[i][j];
                }
            }
        }
        imprimirMatriz(matrizSemMeio);
    }

    static void q18(){

        int [][] matriz = {{1,2},{3,4},{5,6}};
        int [][] transposta = new int[2][3] ;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz original: ");
        imprimirMatriz(matriz);
        System.out.println("Matriz transposta: ");
        imprimirMatriz(transposta);
    }


}
