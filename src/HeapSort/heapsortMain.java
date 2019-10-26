package HeapSort;

import Auxiliar.tempo;
import Auxiliar.vetor;
import java.util.Arrays;


public class heapsortMain {

    public static int[] heapSort(int[] a){
        int count = a.length;

        heapify(a, count);

        int end = count - 1;
        while(end > 0){
            int tmp = a[end];
            a[end] = a[0];
            a[0] = tmp;
            siftDown(a, 0, end - 1);

            end--;
        }
        return a;
    }

    public static void heapify(int[] a, int count){

        int start = (count - 2) / 2; //binary heap

        while(start >= 0){

            siftDown(a, start, count - 1);
            start--;
        }
    }

    public static void siftDown(int[] a, int start, int end){

        int root = start;

        while((root * 2 + 1) <= end){
            int child = root * 2 + 1;

            if(child + 1 <= end && a[child] < a[child + 1])
                child = child + 1;
            if(a[root] < a[child]){
                int tmp = a[root];
                a[root] = a[child];
                a[child] = tmp;
                root = child;
            }else
                return;
        }
    }

    public static void main(String[] args) {
        vetor vetor = new vetor();
        tempo tempo = new tempo();


        System.out.println("HEAP SORT");
        // VETOR 100
        System.out.println("\n------------Vetor 100------------\nNumeros Gerados");
        int tamanho1 = vetor.vetor100().length;
        for (int i = 0;i < tamanho1; i++) {
            System.out.print(vetor.vetor100()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(heapSort(vetor.vetor100())));
        System.out.println("Tempo: "+tempo.tempoHeap(vetor.vetor100())+ " ms\n" +
                "------------------------------------");


        // VETOR 1000
        System.out.println("\n-------------Vetor 1000-------------\nNumeros Gerados");
        int tamanho2 = vetor.vetor1000().length;
        for (int i = 0;i < tamanho2; i++) {
            System.out.print(vetor.vetor1000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(heapSort(vetor.vetor1000())));
        System.out.println("Tempo: "+tempo.tempoHeap(vetor.vetor1000())+ " ms\n" +
                "------------------------------------");


        // VETOR 10000
        System.out.println("\n------------Vetor 10000------------\nNumeros Gerados");
        int tamanho3 = vetor.vetor10000().length;
        for (int i = 0;i < tamanho3; i++) {
            System.out.print(vetor.vetor10000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(heapSort(vetor.vetor10000())));
        System.out.println("Tempo: "+tempo.tempoHeap(vetor.vetor10000())+ " ms\n" +
                "------------------------------------");


        // VETOR 100000
        System.out.println("\n------------Vetor 100000------------\nNumeros Gerados");
        int tamanho4 = vetor.vetor100000().length;
        for (int i = 0;i < tamanho4; i++) {
            System.out.print(vetor.vetor100000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(heapSort(vetor.vetor100000())));
        System.out.println("\nTempo: "+tempo.tempoHeap(vetor.vetor100000())+ " ms\n" +
                "------------------------------------ ");


        // VETOR 10000000
        System.out.println("------------Vetor 1000000------------\nNumeros Gerados");
        int tamanho = vetor.vetor1000000().length;
        for (int i = 0;i < tamanho; i++) {
            System.out.print(vetor.vetor1000000()[i]+" ");
        }
        System.out.print("\nNumeros em Ordem \n");
        System.out.println(Arrays.toString(heapSort(vetor.vetor1000000())));
        System.out.println("\nTempo: "+tempo.tempoHeap(vetor.vetor1000000())+ " ms\n" +
                "------------------------------------");


    }
}
