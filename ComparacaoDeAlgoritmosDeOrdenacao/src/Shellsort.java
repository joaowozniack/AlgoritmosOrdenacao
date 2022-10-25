import java.util.Arrays;
import java.util.Random;

public class Shellsort {


    public void ordenar(int[] vet){
        int i , j , temp, size = vet.length;

        int incremento = 1;
        //encontrar a quantidade de pulos que será realizado
        while(incremento < size) {
            incremento = (3 * incremento) + 1;
        }

        while (incremento > 1) {
            incremento = incremento / 3;

            for(i = incremento; i < size; i++) {
                temp = vet[i];
                j = i - incremento;
                while (j >= 0 && temp < vet[j]) {
                    vet[j + incremento] = vet[j];
                    j = j - incremento;
                }
                vet [j + incremento] = temp;
            }
        }
    }
}