package isigroupee;

import org.junit.jupiter.api.Test;
import java.io.FileInputStream;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Class TestGrille.
 */
public class TestGrille {

    /**
    * Test complete.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testComplete() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku3.txt"), grid);
        assertTrue(grid.complete());
    }

    /**
    * Test Incomplete.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIncomplete() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku2.txt"), grid);
        assertFalse(grid.complete());
    }

    /**
    * Test isOk.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsOk() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);
        assertTrue(grid.isOk(0, 2, '2'));
    }

    /**
    * Test test is not ok.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsNotOk() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);
        assertFalse(grid.isOk(1, 2, '9'));
    }

    /**
    * Test test is empty.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsEmpty() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);
        assertTrue(grid.isEmpty(1, 1));
    }

    /**
    * Test test is not empty.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsNotEmpty() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);
        assertFalse(grid.isEmpty(0, 0));
    }

    /**
    * Test test is in bound.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsInBound() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);

        try {
            char c = grid.getValue(9, 9);
            fail("sould have failed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
    * Test test is not in bound row.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsNotInBoundRow() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);

        try {
            char c = grid.getValue(10, 1);
            fail("sould have failed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
    * Test test is not in bound col.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testIsNotInBoundCol() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);

        try {
            char c = grid.getValue(4, 10);
            fail("sould have failed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
    * Test test get value.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testgetValue() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudoku1.txt"), grid);

        char c = grid.getValue(0, 0);
        char test = '9';
        if (c != test) {
            fail("sould have failed");
        }
    }
}
