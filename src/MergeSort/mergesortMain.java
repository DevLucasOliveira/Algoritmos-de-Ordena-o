package MergeSort;

import Auxiliar.tempo;
import Auxiliar.vetor;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class mergesortMain {


        public static int[] ordenar(int[] elementos){
            int[] vetorAuxiliar = new int[elementos.length];
            return ordenar(elementos, vetorAuxiliar, 0, elementos.length-1);
        }

        private static  int[] ordenar(int[] elementos, int[] vetorAuxiliar, int inicio, int fim) {
            if (inicio < fim) {
                int meio = (inicio + fim) / 2;
                ordenar(elementos, vetorAuxiliar, inicio, meio);
                ordenar(elementos, vetorAuxiliar,meio+1, fim);
                intercalarElementos(elementos, vetorAuxiliar,inicio, meio, fim);
            }
            return elementos;
        }

        private static void intercalarElementos(int[] elementos, int[] vetorAuxiliar, int inicio, int meio, int fim) {
            for(int i = inicio; i <= fim; i++) {
                vetorAuxiliar[i] = elementos[i];
            }
            int ini = inicio;
            int metade = meio + 1;

            for (int k = inicio; k <= fim; k++) {
                if (ini > meio) {
                    elementos[k] = vetorAuxiliar[metade++];
                } else if(metade > fim) {
                    elementos[k] = vetorAuxiliar[ini++];
                } else if (vetorAuxiliar[ini] < vetorAuxiliar[metade]) {
                    elementos[k] = vetorAuxiliar[ini++];
                } else {
                    elementos[k] = vetorAuxiliar[metade++];
                }
            }
        }



    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();

        System.out.println("MERGE SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoMerge(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoMerge(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoMerge(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoMerge(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


        // VETOR 10000000
        System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
        int tamanho = vetor.vetor1000000().length;
        for (int i = 0;i < tamanho; i++) {
            System.out.print(vetor.vetor1000000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor1000000())));
        System.out.println("\nTempo: "+tempo.tempoMerge(vetor.vetor1000000())+ " ms\n" +
                "------------------------------------");



    }

}

