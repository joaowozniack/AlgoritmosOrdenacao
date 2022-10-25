import java.util.Arrays;
import java.util.Random;

public class Quicksort {

    public void ordenacao(int[] vetor){
        quicksort(vetor, 0,  vetor.length - 1);
    }

    public void quicksort(int[] vetor, int inferior, int superior){
        int pivo;
        if (inferior < superior) {
            // encontra a posição correta para o pivo
            // o pivo pode ser considerado, por exemplo, o primeiro elemento do array
            pivo = particiona(vetor, inferior, superior);
            // executa o mesmo proced. sobre as subarrays à esquerda e à direita do pivo
            quicksort(vetor, inferior, pivo - 1);
            quicksort(vetor, pivo + 1, superior);
        }
    }

    public int particiona(int[] vetor, int inferior, int superior) {
        int i = inferior + 1;
        int j = superior;
        //define pivo como primeiro elemento
        int pivo = vetor[inferior];
        //faz as separações
        while (i <= j){
            //se i for menor ou igual que o elemento pivo
            if (vetor[i] <= pivo){
                //incrementa o i até achar um elemento maior que o pivo
                i++;
            }
            // se j for maior que o elemento pivo
            else if (vetor[j] > pivo){
                //decrementa o j até achar um elemento menor ou igual que o pivo
                j--;
            }
            // se i for menor ou igual que j
            else if (i <= j) {
                //realiza a troca de posição de i com j
                troca(vetor, i, j);
                i++;
                j--;
            }
        }
        //realiza a troca do primeiro elemento com j
        troca(vetor, inferior, j);
        return j;
    }

    //troca os elementos de posição
    public void troca(int[] vetor, int i, int j){
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}