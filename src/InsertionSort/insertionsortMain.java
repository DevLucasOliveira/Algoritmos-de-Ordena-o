package InsertionSort;

import Auxiliar.vetor;
import Auxiliar.tempo;

import java.util.Arrays;

public class insertionsortMain {

    public static int[] insertSort(int vetor[]) {
        int j = 0, aux = 0;
        for (int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            j = i - 1;

            while ((j >= 0) && (vetor[j] > aux)) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = aux;
        }
        return vetor;
    }


    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();

        System.out.println("INSERTION SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(insertSort(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoInsert(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(insertSort(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoInsert(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(insertSort(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoInsert(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(insertSort(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoInsert(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


        // VETOR 10000000
        System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
        int tamanho = vetor.vetor1000000().length;
        for (int i = 0;i < tamanho; i++) {
            System.out.print(vetor.vetor1000000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(insertSort(vetor.vetor1000000())));
        System.out.println("\nTempo: "+tempo.tempoInsert(vetor.vetor1000000())+ " ms\n" +
                "------------------------------------");






        }
    }
