package ar.edu.unahur.obj2.arreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraficoDeTemperaturas {
    public static void main(String[] args) {
        List<Double> temperaturas = new ArrayList<>();
        double suma = 0, media = 0, max = -99, min = 99;

        //Creo un scanner para pedir datos por consola
        Scanner entrada = new Scanner(System.in);

        //Evaluo cual es la mayor y la menor temperatura y las guardo en las variables
        for (int i = 0; i < 5; i++) {
            //Pido la temperatura al usuario
            System.out.println("Ingrese la temperatura: ");
            //Guardo el ingreso en la variable
            double tem = entrada.nextDouble();
            suma += tem;
            temperaturas.add(tem);

            if (tem > max) { max = tem; }

            if (tem < min) { min = tem; }
        }

        //Armo el grafico
        for(int i = 0; i < temperaturas.size(); i++){
            //Guardo temperatura a imprimir
            double actual = temperaturas.get(i);

            //Imprimo la hora
            System.out.print(i);

            //Grafico las barras
            for(int j=0; j<(int)actual; j++){
                System.out.print("*");
            }

            //Imprimo la temperatura actual e indico si es la maxima o la minima (en caso de serlo)
            if(actual == min){
                System.out.println(actual + " --> MIN");
            }
            else if(actual == max){
                System.out.println(actual + " --> MAX");
            }
            else{
                System.out.println(actual);
            }

        }
        //Imprimo la media
        media = suma/24;
        System.out.println("La media es: " + media);
    }
}
