package isigroupee;

/**
 * Solveur.
 */
public final class Solver {

    /**
     * Constructeur.
     */
    private Solver() { }

    /**
     * On resoud le sudoku.
     *
     * @param grid grille
     * @return boolean
     * @throws IllegalArgumentException Exception
     */
    public static boolean solve(final Grille grid)
        throws IllegalArgumentException {
        for (int row = 0; row < grid.getDimension(); row++) {
            for (int col = 0; col < grid.getDimension(); col++) {
                if (grid.isEmpty(row, col)) {
                    for (int i = 0; i <= grid.getDimension() - 1; i++) {
                        char number = grid.getPossible(i);
                        if (grid.isOk(row, col, number)) {
                            grid.setValue(row, col, number);
                            if (solve(grid)) {
                                return true;
                            } else {
                                grid.setEmpty(row, col);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
