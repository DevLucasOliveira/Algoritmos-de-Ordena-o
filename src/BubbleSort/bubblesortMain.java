package BubbleSort;

import Auxiliar.tempo;
import Auxiliar.vetor;
import java.util.Arrays;


public class bubblesortMain {

    int auxiliar;

    public static int[] bubbleSort(int vetor[]){
        for(int i = 0 ; i < vetor.length; i++){

            for(int j = 0; j < (vetor.length - 1); j++){
                if(vetor[j] > vetor[j+1]){
                    trocarElementos(vetor, j, i);

                }
            }
        }
        return vetor;
    }


    private static void trocarElementos(int[] vetor, int j, int i) {
        int auxiliar = vetor[j];
        vetor[j] = vetor[j+1];
        vetor[j+1] = auxiliar;
    }


    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();


        System.out.println("BUBBLE SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(bubbleSort(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoBubble(bubbleSort(vetor.vetor100()))+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(bubbleSort(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoBubble(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(bubbleSort(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoBubble(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");

/**
        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(bubbleSort(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoBubble(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


         // VETOR 10000000
         System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
         int tamanho = vetor.vetor1000000().length;
         for (int i = 0;i < tamanho; i++) {
         System.out.print(vetor.vetor1000000()[i]+" ");
         }
         System.out.print("\nNumeros em Ordem \n");
         System.out.println(Arrays.toString(bubbleSort(vetor.vetor1000000())));
         System.out.println("\nTempo: "+tempo.tempoBubble(vetor.vetor1000000())+ " ms\n" +
         "------------------------------------");
*/


    }

}
