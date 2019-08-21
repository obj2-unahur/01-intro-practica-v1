package ar.edu.unahur.obj2.ejercicio2;

public class Ejercicio2 {

    public int[] buscarMayores(int pivote, int[] numeros ) {
        int[] temporal = new int[numeros.length];
        int j = 0;

        for (int i=0; i < numeros.length; i++ ) {
            if (pivote < numeros[i]) {
                temporal[j++] = numeros[i];
            }
        }

        int[] resultado = new int[j];
        for (int i=0; i < j; i++) {
            resultado[i]=temporal[i];
        }

        return resultado;
    }
}
