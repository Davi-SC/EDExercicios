package ifma.lista01;

import java.util.Arrays;

public class CadastrarAlunos {
    private int size,sizeMax;
    private Aluno[] alunos ;

    public CadastrarAlunos(int tamanho) {
        alunos = new Aluno[tamanho] ;
        size = 0 ;
        sizeMax = tamanho ;
    }

    public void adicionarNoFinal(Aluno aluno){
        if(size == sizeMax){
            throw new RuntimeException("Vetor Cheio");
        }
        alunos[size] = aluno ;
        size++ ;
    }

    public void adicionarNoInicio(Aluno aluno){
        if(size == sizeMax){
            throw new RuntimeException("Vetor Cheio");
        }
        for(int i = size; i>0;i--){
            alunos[i]= alunos[i-1];
        }
        alunos[0] = aluno;
        size++;
    }

    public void removerNoFinal(){
        if(size == 0){
            throw new RuntimeException("Vetor Vazio");
        }
        alunos[size-1] = null;
        size--;
    }

    public void removerNoInicio(){
        if(size == 0){
            throw new RuntimeException("Vetor Vazio");
        }
        for(int i = 0; i < size;i++){
            alunos[i]= alunos[i+1];
        }
        alunos[size-1] = null;
        size--;
    }

    public boolean verificarIndice(int indice){
        if(alunos[indice] == null || indice < 0 || indice >= size){
            return false ;
        }
        return true ;
    }

    public void removerComIndice(int indice){
        if(verificarIndice(indice)){
            if(indice == 0){
                removerNoInicio();
            }else if(indice == size-1){
                removerNoFinal();
            }else {
                for(int i = indice; i < size;i++){
                    alunos[i] = alunos[i+1];
                }
                alunos[size-1] = null;
                size--;
            }
        }else {
            throw new RuntimeException("Indice Invalido");
        }
    }

    public void ordenarVetor(){
        for(int i = 0; i < size;i++){
            for(int j = 0; j < size;j++){
                if(alunos[j].getCodigo() > alunos[i].getCodigo()){
                    Aluno aux = alunos[j];
                    alunos[j] = alunos[i];
                    alunos[i] = aux;
                }
            }
        }
    }


    @Override
    public String toString() {
        return "Alunos: " +Arrays.toString(alunos);
    }
}
