package Auxiliar;

import BubbleSort.bubblesortMain;

import CountSort.countsortMain;
import HeapSort.heapsortMain;
import InsertionSort.insertionsortMain;
import MergeSort.mergesortMain;
import QuickSort.quicksortMain;
import SelectionSort.selectionsortMain;


public class tempo {


    public int tempoBubble(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        bubblesortMain.bubbleSort(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }


    //TEMPO BUCKET


    public int tempoCount(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        countsortMain.countSort(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }


    public int tempoHeap(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        heapsortMain.heapSort(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }


    public int tempoInsert(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        insertionsortMain.insertSort(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }


    public int tempoMerge(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        mergesortMain.ordenar(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }



    public int tempoQuick(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        quicksortMain.quickSort(vet,0,vet.length - 1);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }


    //  TEMPO RADIX


    public int tempoSelection(int vet[]){
        int[] copia = vet.clone();

        long tempoInicial = System.currentTimeMillis();
        vet = copia.clone();
        selectionsortMain.ordenar(vet);

        long tempoFinal = System.currentTimeMillis();
        int tempo = (int) (tempoFinal - tempoInicial);

        return tempo;
    }





}
