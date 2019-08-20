package ar.edu.unahur.obj2.ejercicio1;

public class Ejercicio1 {

    public int[] ordenar(int[] numeros) {

        for (int j=0; j < numeros.length -1 ; j++) {
            for (int i = 0; i < numeros.length - j -1; i++) {
                if (numeros[i] > numeros[i + 1]) {
                    intercambiar(numeros, i, i + 1);
                }
            }
        }

        return numeros;
    }

    private void intercambiar(int[] numeros, int posicionA, int posicionB) {
        int temporal =  numeros[posicionA];
        numeros[posicionA] = numeros[posicionB];
        numeros[posicionB] = temporal;
    }
}
