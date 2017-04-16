/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

import java.util.Scanner;

/**
 *
 * @author ICC-ICZ
 */
public class SudokuSemanaSanta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SudokuException {
      {

        ClaseSudoku sudoku = new ClaseSudoku();
       
        Scanner teclado = new Scanner(System.in);
        
        int numero2 = 0;

        do {

            System.out.println("1. Iniciar/Reiniciar sudoku\n" + "2. Mostrar sudoku\n"+ "3. Vaciar casilla \n"+ "4. Realizar movimiento\n"+ "5.Reiniciar\n"+ "6. Salir");

            numero2 = teclado.nextInt();

            if (numero2 == 1) {
                sudoku.CrearyEmpezar();
            }

            if (numero2 == 2) {
                System.out.println(sudoku.toString());
                
            }

            if (numero2 == 3) {
                System.out.println("Dime las coordenadas de la casilla que quieres vaciar:");
                System.out.println("Fila: ");
                int fila = teclado.nextInt();
                System.out.println("Columna:");
                int columna = teclado.nextInt();

                sudoku.eliminar(fila, columna);
            }

            if (numero2 == 4) {
                System.out.println("*********************************************************************");

                System.out.println("Indica la fila: ");
                int fila = teclado.nextInt();
                System.out.println("*********************************************************************");
                System.out.println("Indica la columna:");
                int columna = teclado.nextInt();
                System.out.println("Indica el número:");
                int numero = teclado.nextInt();

                sudoku.cambiar(fila, columna, numero);
                
                System.out.println(sudoku.toString());
            }
            if (numero2 == 5) {
                sudoku.CrearyEmpezar();
                

            }
            if (numero2 == 6) {
                
                System.out.println("Has salido");

            }
        } while (numero2 < 6);

    }
}

}
    

