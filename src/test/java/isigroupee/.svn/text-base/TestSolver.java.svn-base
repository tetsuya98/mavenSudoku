package isigroupee;

import java.io.FileInputStream;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Class TestSolver.
 */
public class TestSolver {

    /**
    * Test Solver grille 9x9.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testSolver9() throws Exception {
        Grille grid = new Grille(9);
        Parser.toParse(new FileInputStream("ressources/sudokuVide.txt"), grid);
        if (!Solver.solve(grid)) {
            fail("solveur fail");
        }
        if (!grid.complete()) {
            fail("solveur fail 2");
        }
    }

    /**
    * Test Solver grille 16x16.
    *
    * @throws Exception Exception
    */
    @Test
    public final void testSolver16() throws Exception {
        Grille grid16 = new Grille(16);
        Parser.toParse(new FileInputStream("ressources/sudoku16.txt"), grid16);
        if (!Solver.solve(grid16)) {
            fail("solveur fail");
        }
        if (!grid16.complete()) {
            fail("solveur fail 2");
        }
    }
}
