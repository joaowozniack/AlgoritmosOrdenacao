import java.util.Arrays;
import java.util.Random;

public class Selectionsort {

    //Percorre o vetor, encontra o menor elemento e troca com a primeira posição
    //O processo é executado novamente até que o vetor esteja ordenado.


    public void selectionsort(int[] vetor){
        //executa o mesmo processo até a completa ordenação do vetor
        for (int i = 0; i < vetor.length; i++){
            //define o menorElemento na posição i (que inicialmente é 0)
            int menorElemento = i;
            //realiza a busca do menor elemento a partir da posição i + 1
            for (int j = i + 1; j < vetor.length; j++){
                //se elemento da posicao j for menor que o menorElemento
                if(vetor[j] < vetor[menorElemento]){
                    //menorElemento passa a valer j
                    menorElemento = j;
                }
            }
            //realiza a troca de i com o menor elemento
            troca(vetor, i, menorElemento);
        }
    }

    //troca os elementos de posição
    public void troca(int[] vetor, int i, int menorElemento){
        //aux vai receber o elemento da primeira posição
        int aux = vetor[i];
        //elemento da primeira posição vai receber o elemento da posição onde está o menor elemento
        vetor[i] = vetor[menorElemento];
        //o elemento da posição onde está o menor elemento vai recever o aux que é o elemnto da primeira posição
        vetor[menorElemento] = aux;
    }
}