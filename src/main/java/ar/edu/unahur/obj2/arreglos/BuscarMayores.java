package ar.edu.unahur.obj2.arreglos;

import java.util.ArrayList;
import java.util.List;

public class BuscarMayores {

    public List<Integer> buscarMayores(int numeroEntero, List<Integer> lista20Enteros) {
        List<Integer> mayores = new ArrayList();

        for(int i=0; i < lista20Enteros.size(); i++){
            if(lista20Enteros.get(i) > numeroEntero){
                mayores.add(lista20Enteros.get(i));
            }
        }
        return mayores;
    }
}
