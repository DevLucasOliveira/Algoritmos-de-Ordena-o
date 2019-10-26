package CountSort;

import Auxiliar.tempo;
import Auxiliar.vetor;
import java.util.Arrays;


public class countsortMain {

    public static int[] countSort(int a[]) {

        int max = a[0];
        for (int i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
        }
        //System.out.println(max);
        int[] temp = new int[max + 1];

        for (int i = 0; i < a.length; i++) {
            temp[a[i]] = temp[a[i]] + 1;
        }
        int indice = 0;

        for (int i = 0; i < temp.length; i++) {
            while (temp[i] > 0) {
                a[indice] = i;
                indice++;
                temp[i]--;
            }
        }
        return a;
    }



    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();

        System.out.println("COUNT SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(countSort(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoCount(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(countSort(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoCount(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(countSort(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoCount(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(countSort(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoCount(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


         // VETOR 10000000
         System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
         int tamanho = vetor.vetor1000000().length;
         for (int i = 0;i < tamanho; i++) {
         System.out.print(vetor.vetor1000000()[i]+" ");
         }
         System.out.print("\nNumeros em Ordem \n");
         System.out.println(Arrays.toString(countSort(vetor.vetor1000000())));
         System.out.println("\nTempo: "+tempo.tempoCount(vetor.vetor1000000())+ " ms\n" +
         "------------------------------------");



    }
}
