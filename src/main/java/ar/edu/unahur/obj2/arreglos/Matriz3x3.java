package ar.edu.unahur.obj2.arreglos;

import java.util.Scanner;

public class Matriz3x3 {
    public static void main(String[] args) {
        int matriz[][] = new int [3][3];
        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese la matriz: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Matriz [" +i+ "][" +j+ "]");
                matriz[i][j] = numero.nextInt();
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
