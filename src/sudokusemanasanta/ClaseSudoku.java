/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author ICC-ICZ
 */
public class ClaseSudoku {

    /**
     * variables privadas de la clase
     */
    private ArrayList<ArrayList<Integer>> lista;
    private Random aleatorio;

    /**
     * Este metodo crea el sudoku y lo muestra
     *
     * @return el juego
     */
    public String CrearyEmpezar() {
        lista = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < 9; j++) {
                a.add(0);
            }

            lista.add(a);
        }

        aleatorio = new Random();

        int contador = 0;

        for (; contador < 24;) {
            int n_ramdon = aleatorio.nextInt(9 - 1) + 1;

            int horizontal = aleatorio.nextInt(9 - 1) + 1;

            int vertical = aleatorio.nextInt(9 - 1) + 1;

            if (Insertar(horizontal, vertical, n_ramdon) == true) {
                cambiar(horizontal, vertical, n_ramdon);
            }
            contador++;
        }
        String cuerpo = "";
        for (int i = 0; i < lista.size(); i++) {

            for (int j = 0; j < 9; j++) {

                int numero_anadir = lista.get(i).get(j);
                cuerpo += numero_anadir + " ";
            }
            cuerpo += "\n";

        }

        System.out.println(cuerpo);
        return cuerpo;
    }

    /**
     * Indica si podemos insertar un numero al comprobar los metos fila, columna
     * y numero
     *
     * @param fila para saber que fila
     * @param columna para saber que columna
     * @param numero el numero elegido
     * @return
     */
    public void cambiar(int fila, int columna, int elemento) {
        if (Insertar(fila, columna, elemento) == true) {
            lista.get(fila - 1).set(columna - 1, elemento);
        }
    }

    /**
     * Recorre el arraylist para ver si esta el numero o no
     *
     * @param fila la ila
     * @param numero el numero que queremos poner
     * @return si o no segun este o no
     */
    public boolean fila(int fila, int numero) {
        boolean error = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(fila - 1).get(i) == numero) {
                error = false;
            }

        }
        return error;
    }

    /**
     * Recorre el arraylist para ver si esta el numero o no
     *
     * @param columna la columna
     * @param numero el numero que queremos poner
     * @return si o no segun este o no
     */
    public boolean columna(int columna, int numero) {
        boolean error = true;
        for (int i = 0; i < lista.size(); i++) {
            for (ArrayList<Integer> lista1 : lista) {
                if (lista.get(i).get(columna - 1) == numero) {
                    error = false;
                }
            }

        }

        return error;
    }

    /**
     * comprueba el grupo en busca de numeros iguales
     *
     * @param fila la fila
     * @param columna la columna
     * @param numero
     * @return
     */
    private boolean grupo(int fila, int columna, int numero) {

        int fila_h = 0;
        int columna_h = 0;

        int fila_v = 0;
        int columna_v = 0;

        if (columna >= 0 && columna <= 2) {
            fila_v = 0;
            columna_v = 2;
        }
        if (columna >= 3 && columna <= 5) {
            fila_v = 3;
            columna_v = 5;
        }
        if (columna >= 6 && columna <= 8) {
            fila_v = 6;
            columna_v = 8;
        }
        if (fila >= 0 && fila <= 2) {
            fila_h = 0;
            columna_h = 2;
        }
        if (fila >= 3 && fila <= 5) {
            fila_h = 3;
            columna_h = 5;
        }
        if (fila >= 6 && fila <= 8) {
            fila_h = 6;
            columna_h = 8;
        }

        boolean error = true;
        for (int i = fila_h; i <= columna_h; i++) {
            for (int j = fila_v; j <= columna_v; j++) {
                if (lista.get(i).get(j) == numero) {
                    error = false;
                }

            }
        }

        return error;
    }

    /**
     * comprueba si se puede poner el numero en las coordenadas indicadas
     *
     * @param fila la fila
     * @param columnala columna
     * @param numero
     * @return
     */
    private boolean Insertar(int fila, int columna, int numero) {

        boolean resultado = false;
        if (fila(fila, numero) == true && columna(columna, numero) == true && grupo(fila, columna, numero) == true) {
            resultado = true;
        }
        return resultado;

    }

    public void eliminar(int fila, int columna) {
        lista.get(fila - 1).set(columna - 1, 0);
    }
}
