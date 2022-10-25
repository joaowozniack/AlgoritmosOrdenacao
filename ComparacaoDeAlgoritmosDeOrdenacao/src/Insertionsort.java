import java.util.Arrays;
import java.util.Random;

public class Insertionsort {

    public static void insertionsort(int[] vetor){
        int x, j;
        //executa o mesmo processo até a completa ordenação do vetor
        //i começa na posição 1, pois o primeiro elemento não é preciso fazer a ordenação
        for (int i = 1; i < vetor.length; i++){
            //elemento que está na posição i (inicialmente na posição 1)
            x = vetor[i];
            //elemento que está na posição anterior de i
            j = i - 1;
            //enquanto elemento j for maior ou igual a 0 e elemento na posicao
            // j for maior que o x
            while (j >= 0 && vetor[j] > x){
                //empurra elemento j para a direita
                vetor[j + 1] = vetor[j];
                //decrementa j
                j--;
            }
            vetor[j + 1] = x;
        }
    }
}