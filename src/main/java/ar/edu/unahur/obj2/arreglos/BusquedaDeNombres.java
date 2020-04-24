package ar.edu.unahur.obj2.arreglos;

import java.util.Scanner;

public class BusquedaDeNombres {
    public static void main(String[] args) {
        int nElementos = 0;
        String letra = "x";

        //Creo los Scaneers
        Scanner entradaCantidad = new Scanner(System.in);
        Scanner entradaNombre = new Scanner(System.in);
        Scanner entradaLetra = new Scanner(System.in);

        System.out.println("Cuantos nombres quiere ingresar? ");
        nElementos = entradaCantidad.nextInt();

        String[] companieros = new String[nElementos];

        //Pido los nombres al usuario
        for(int i=0; i < nElementos; i++){
            System.out.println("Ingrese nombre y apellido: ");
            companieros[i] = entradaNombre.nextLine();
        }

        //Mientras el usuario no ingrese "FIN" continuo consultado
        while(!letra.equals("FIN")){
            System.out.println("Ingrese una letra: ");
            letra = entradaLetra.nextLine();

            if(!letra.equals("FIN")){
                //Busco los nombre con la inicial ingresada
                for(String nombre: companieros){
                    if(nombre.charAt(0) == letra.charAt(0)){
                        System.out.println(nombre);
                    }
                }
            }
        }
    }
}
