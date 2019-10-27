package Auxiliar;

import java.util.Random;

public class vetor {
    Random random = new Random();


    int vetor[] = new int[100];

    public int[] vetor100(){
        for (int i = 0; i < vetor.length; i++) {
           vetor[i] = random.nextInt(50);
        }
        return vetor;
    }

    public int[] vetor1000(){
        int vetor[] = new int[1000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }
        return vetor;
    }

    public int[] vetor10000(){
        int vetor[] = new int[10000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }
        return vetor;
    }

    public int[] vetor100000(){
        int vetor[] = new int[100000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }
        return vetor;
    }


    public int[] vetor1000000(){
        int vetor[] = new int[1000000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(50);
        }

        return vetor;
    }






}
