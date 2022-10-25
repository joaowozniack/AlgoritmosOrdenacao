import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestaOrdenacao {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int tamanho;
        System.out.print("Digite o tamanho desejado: ");
        tamanho = scan.nextInt();

        //Instanciando a classe
        //ordenado
            //Chamando os métodos
        // quase ordenado
            //troca o primeiro elemento com o último
        long tempoInicial = System.currentTimeMillis();
        int[] vetorp = gerar(tamanho);

        int[] vetorQuicksort = vetorp;
        long tempoCriacaoQuicksort = System.currentTimeMillis();
        Quicksort qs = new Quicksort();
        qs.ordenacao(vetorQuicksort);
        inverter(vetorQuicksort);
        long tempoFinalOrdenadoQuicksort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorQuicksort, 0, vetorQuicksort.length - 1);
        long tempoFinalQuaseOrdenadoQuicksort = System.currentTimeMillis();

        int[] vetorHeapsort = vetorp;
        long tempoCriacaoHeapsort = System.currentTimeMillis();
        Heapsort hs = new Heapsort();
        hs.heapsort(vetorHeapsort);
        inverter(vetorHeapsort);
        long tempoFinalOrdenadoHeapsort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorHeapsort, 0, vetorHeapsort.length - 1);
        long tempoFinalQuaseOrdenadoHeapsort = System.currentTimeMillis();

        int[] vetorInsertionsort = vetorp;
        long tempoCriacaoInsertionsort = System.currentTimeMillis();
        Insertionsort is = new Insertionsort();
        is.insertionsort(vetorInsertionsort);
        inverter(vetorInsertionsort);
        long tempoFinalOrdenadoInsertionsort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorInsertionsort, 0, vetorInsertionsort.length - 1);
        long tempoFinalQuaseOrdenadoInsertionsort = System.currentTimeMillis();

        int[] vetorMergesort = vetorp;
        long tempoCriacaoMergesort = System.currentTimeMillis();
        Mergesort ms = new Mergesort();
        ms.mergeSort(vetorMergesort.length, vetorMergesort);
        inverter(vetorMergesort);
        long tempoFinalOrdenadoMergesort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorMergesort, 0, vetorMergesort.length - 1);
        long tempoFinalQuaseOrdenadoMergesort = System.currentTimeMillis();


        int[] vetorSelectionsort = vetorp;
        long tempoCriacaoSelectionsort = System.currentTimeMillis();
        Selectionsort ss = new Selectionsort();
        ss.selectionsort(vetorSelectionsort);
        inverter(vetorSelectionsort);
        long tempoFinalOrdenadoSelectionsort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorSelectionsort, 0, vetorSelectionsort.length - 1);
        long tempoFinalQuaseOrdenadoSelectionsort = System.currentTimeMillis();

        int[] vetorShellsort = vetorp;
        long tempoCriacaoShellsort = System.currentTimeMillis();
        Shellsort shs = new Shellsort();
        shs.ordenar(vetorShellsort);
        inverter(vetorShellsort);
        long tempoFinalOrdenadoShellsort = System.currentTimeMillis();
        inverter(vetorQuicksort);
        troca(vetorShellsort, 0, vetorShellsort.length - 1);
        long tempoFinalQuaseOrdenadoShellsort = System.currentTimeMillis();

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Tamanho do conjunto: " + tamanho);
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("                       Tempos obtidos pelos algoritmos      ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Algoritmo       Quase Ordenado    Desordenado    Ordem Decrescente");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("QuickSort:      ");
        System.out.print((tempoFinalQuaseOrdenadoQuicksort - tempoFinalOrdenadoQuicksort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("      ");
        System.out.println((tempoFinalOrdenadoQuicksort - tempoCriacaoQuicksort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("HeapSort:       ");
        System.out.print((tempoFinalQuaseOrdenadoHeapsort - tempoFinalOrdenadoHeapsort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("        ");
        System.out.println((tempoFinalOrdenadoHeapsort - tempoCriacaoHeapsort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("InsertionSort:  ");
        System.out.print((tempoFinalQuaseOrdenadoInsertionsort - tempoFinalOrdenadoInsertionsort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("        ");
        System.out.println((tempoFinalOrdenadoInsertionsort - tempoCriacaoInsertionsort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("MergeSort:      ");
        System.out.print((tempoFinalQuaseOrdenadoMergesort - tempoFinalOrdenadoMergesort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("        ");
        System.out.println((tempoFinalOrdenadoMergesort - tempoCriacaoMergesort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("SelectionSort:  ");
        System.out.print((tempoFinalQuaseOrdenadoSelectionsort - tempoFinalOrdenadoSelectionsort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("        ");
        System.out.println((tempoFinalOrdenadoSelectionsort - tempoCriacaoSelectionsort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.print("Shellsort:      ");
        System.out.print((tempoFinalQuaseOrdenadoShellsort - tempoFinalOrdenadoShellsort) /1000d + " seg");
        System.out.print("           ");
        System.out.print((tempoCriacaoQuicksort- tempoInicial) / 1000d + " seg");
        System.out.print("        ");
        System.out.println((tempoFinalOrdenadoShellsort - tempoCriacaoShellsort) / 1000d + " seg");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Tempo Total: "+(tempoFinalQuaseOrdenadoShellsort - tempoInicial) / 1000d + " seg");

        //System.out.print((tempoCriacaoShellsort- tempoFinalQuaseOrdenadoSelectionsort) / 1000d + " seg");
    }

    public static void troca(int[] vetor, int i, int f){
        while(f > (vetor.length * 0.92)) {
            int aux = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = aux;
            f--;
            Random escolhe = new Random();
            i = escolhe.nextInt(0, vetor.length);
        }
    }

    //gerar vetor aleatório
    public static int[] gerar(int n){
        int[] vetor = new int[n];
        Random gerador = new Random();
        for (int i = 0; i < n; i++){
            vetor[i] = gerador.nextInt(n * n);
        }
        return vetor;
    }

    public static void inverter(int[] vetor){
        int i = 0;
        int f = (vetor.length - 1);

        while (i < f){
            int aux = vetor[i];
            vetor[i] = vetor[f];
            vetor[f] = aux;
            i++;
            f--;
        }
    }
}
