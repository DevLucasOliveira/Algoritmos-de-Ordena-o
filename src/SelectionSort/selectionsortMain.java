package SelectionSort;

import Auxiliar.tempo;
import Auxiliar.vetor;

import java.util.Arrays;

public class selectionsortMain {


        public static int[] ordenar(int[] elementos) {

            for (int i = 0; i < elementos.length; i++) {
                int elementoAtual = elementos[i];
                int menorElemento = elementoAtual;
                int indiceDoMenorElemento = i;

                for (int k = i; k < elementos.length; k++) {
                    if (elementos[k] < menorElemento) {
                        menorElemento = elementos[k];
                        indiceDoMenorElemento = k;
                    }
                }
                elementos[i] = menorElemento;
                elementos[indiceDoMenorElemento] = elementoAtual;
            }
            return elementos;
        }


    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();

        System.out.println("SELECTION SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoSelection(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoSelection(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoSelection(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoSelection(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


        // VETOR 10000000
        System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
        int tamanho = vetor.vetor1000000().length;
        for (int i = 0;i < tamanho; i++) {
            System.out.print(vetor.vetor1000000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(ordenar(vetor.vetor1000000())));
        System.out.println("\nTempo: "+tempo.tempoSelection(vetor.vetor1000000())+ " ms\n" +
                "------------------------------------");




    }

}
