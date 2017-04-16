/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokusemanasanta;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ICC-ICZ
 */
public class ClaseSudokuTest {

    public ClaseSudokuTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of cambiar method, of class ClaseSudoku.
     */
    @Test
    public void testCambiar() throws Exception {
        try {
            System.out.println("cambiar");
            int fila = 0;
            int columna = 0;
            int numero = 0;
            ClaseSudoku instance = new ClaseSudoku();
            instance.cambiar(fila, columna, numero);
        } catch (Exception e) {
            fail("Error");
        }

    }

    /**
     * Test of fila method, of class ClaseSudoku.
     */
    @Test
    public void testFila() throws Exception {
        try {
            System.out.println("fila");
            int fila = 0;
            int numero = 0;
            ClaseSudoku instance = new ClaseSudoku();
            boolean expResult = false;
            boolean result = instance.fila(fila, numero);
            assertEquals(expResult, result);
        } catch (Exception e) {
            fail("Error");
        }
    }

    /**
     * Test of columna method, of class ClaseSudoku.
     */
    @Test
    public void testColumna() throws Exception {
        try{
        System.out.println("columna");
        int columna = 0;
        int numero = 0;
        ClaseSudoku instance = new ClaseSudoku();
        boolean expResult = false;
        boolean result = instance.columna(columna, numero);
        assertEquals(expResult, result);
        }
        catch (Exception e)
        {
        fail("Error");
        }
    }

    /**
     * Test of eliminar method, of class ClaseSudoku.
     */
    @Test
    public void testEliminar() throws Exception {
        try{
        System.out.println("eliminar");
        int fila = 0;
        int columna = 0;
        ClaseSudoku instance = new ClaseSudoku();
        instance.eliminar(fila, columna);
        }
        catch (Exception e){
        fail("Error");
        }
    }

    /**
     * Test of toString method, of class ClaseSudoku.
     */
    @Test
    public void testToString() {
        try
        {
        System.out.println("toString");
        ClaseSudoku instance = new ClaseSudoku();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        }
        catch (Exception e)
        {
        fail("Error");
        }
    }

    /**
     * Test of CrearyEmpezar method, of class ClaseSudoku.
     */
    @Test
    public void testCrearyEmpezar() throws Exception {
        try{
        System.out.println("CrearyEmpezar");
        ClaseSudoku instance = new ClaseSudoku();
        String expResult = "";
        String result = instance.CrearyEmpezar();
        assertEquals(expResult, result);
        }
        catch (Exception e)
        {
        fail("Error");
        }
    }

}
