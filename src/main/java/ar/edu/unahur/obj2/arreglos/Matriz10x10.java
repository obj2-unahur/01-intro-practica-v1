package ar.edu.unahur.obj2.arreglos;

import java.util.Random;

public class Matriz10x10 {
    public static void main(String[] args) {
        int matriz[][] = new int[10][10];

        Random numero = new Random();

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                matriz[i][j] = numero.nextInt(100);
            }
        }

        System.out.println("La matriz es: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
