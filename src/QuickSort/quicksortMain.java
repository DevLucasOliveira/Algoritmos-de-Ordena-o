package QuickSort;

import Auxiliar.tempo;
import Auxiliar.vetor;
import java.util.Arrays;

public class quicksortMain {

    public static int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
    }

    public static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo)
                i++;
            else if (pivo < vetor[f])
                f--;
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }


    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();

        System.out.println("QUICK SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(quickSort(vetor.vetor100(),0,tamanho1-1)));
        System.out.println("Tempo: "+tempo.tempoQuick(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(quickSort(vetor.vetor1000(),0,tamanho2-1)));
        System.out.println("Tempo: "+tempo.tempoQuick(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(quickSort(vetor.vetor10000(),0,tamanho3-1)));
        System.out.println("Tempo: "+tempo.tempoQuick(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(quickSort(vetor.vetor100000(),0,tamanho4-1)));
        System.out.println("\nTempo: "+tempo.tempoQuick(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


        // VETOR 10000000
        System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
        int tamanho = vetor.vetor1000000().length;
        for (int i = 0;i < tamanho; i++) {
            System.out.print(vetor.vetor1000000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(quickSort(vetor.vetor1000000(),0,tamanho-1)));
        System.out.println("\nTempo: "+tempo.tempoQuick(vetor.vetor1000000())+ " ms\n" +
                "------------------------------------");


    }
}