package ar.edu.unahur.obj2.arreglos;

import java.util.ArrayList;
import java.util.List;

public class ContadorLetras {
    String texto;
    List<Integer> total;

    public ContadorLetras(String texto) {
        this.texto = texto;
        this.total = new ArrayList<>();
    }


    public void contarLetras() {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            for(int j=0; j < texto.length(); j++) {
                if (texto.charAt(i) == texto.charAt(j)) {
                    contador++;
                }
            }
            total.add(contador);
            contador = 0;
        }
    }

    public List<Integer> visualizarRecuento(){
        return total;
    }

}
