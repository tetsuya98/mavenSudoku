package isigroupee;

/**
 * Interface d'une grille de sudoku.
 */
public class Grille implements GrilleInterface {

    /**
     * Dimension de la grille Sudoku.
     */
    private int dimension;

    /**
     * Grille de sudoku.
     */
    private final char[][] grille;

    /**
     * Caractere de case vide.
     */
    static final char EMPTY = '@';

    /**
     * Box size 9.
     */
    static final int BOX_SIZE_9 = 3;

    /**
     * Box size 16.
     */
    static final int BOX_SIZE_16 = 4;

    /**
     * 16x16 size sudoku.
     */
    static final int SIZE_16 = 16;

    /**
     * Caractere possible a mettre dans la grille pour une grille 9x9 ou 16x16.
     */
    static final char[] POSSIBLE = new char[] {'1', '2', '3', '4', '5', '6',
    '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * Constructeur Grille.
     *
     * @param size taille de la grille
     */
    public Grille(final int size) {
        this.dimension = size;
        this.grille = new char[dimension][dimension];
    }

    /**
     * @return Dimension de la grille
     */
    public final int getDimension() {
        return this.dimension;
    };

    /**
     * Affecte une valeur dans la grille.
     *
     * @param x       position x dans la grille
     * @param y       position y dans la grille
     * @param value   valeur a mettre dans la case
     * @throws IllegalArgumentException si x ou y sont hors bornes
     * @throws IllegalArgumentException si la valeur est interdite aux vues des
     *        autres valeurs de la grille
     * @throws IllegalArgumentException si value n'est pas un caractere autorise
     */
    public final void setValue(final int x, final int y, final char value)
    throws IllegalArgumentException {
        isInPossible(value);
        grille[x][y] = value;
    };

    /**
     * Recupere une valeur de la grille.
     *
     * @param x      position x dans la grille
     * @param y      position y dans la grille
     * @return valeur dans la case x,y
     * @throws IllegalArgumentException si x ou y sont hors bornes
     */
    public final char getValue(final int x, final int y)
    throws IllegalArgumentException {
        isInBound(x, y);
        return grille[x][y];
    };

    /**
     * Test si une grille est terminee.
     *
     * @return true si la grille est complete
     */
    public final boolean complete() {
        for (char[] grid : this.grille) {
            for (char c : grid) {
                if (c == this.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    };

    /**
     * Test si la case existe.
     *
     * @param row Coordonnée X
     * @param col Coordonnée Y
     * @throws IllegalArgumentException Si la colonne et la ligne n'existe pas
     */
    private void isInBound(final int row, final int col)
    throws IllegalArgumentException {
        if (row < 0 || row > dimension) {
            throw new IllegalArgumentException("La ligne n'existe pas");
        }
        if (col < 0 || col > dimension) {
            throw new IllegalArgumentException("La colonne n'existe pas");
        }
    }

    /**
     * Vérifie si le nombre est dans les possibles.
     *
     * @param number nombre
     * @return boolean
     * @throws IllegalArgumentException Si le nombre n'est pas autorisé
     */
    private boolean isInPossible(final char number)throws
            IllegalArgumentException {
            if (number == EMPTY) {
                return false;
            }
            for (char c : POSSIBLE) {
                if (number == c) {
                    return true;
                }
            }
            throw new IllegalArgumentException(
                "Le nombre n'est pas autorisé.");
    }

    /**
     * On vérifie si le nombre est déjà dans la ligne.
     *
     * @param row ligne
     * @param number nombre
     * @return boolean
     */
    private boolean isInRow(final int row, final char number) {
        for (int i = 0; i < dimension; i++) {
            if (getValue(row, i) == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * On vérifie si le nombre est déjà dans la colonne.
     *
     * @param col colonne
     * @param number nombre
     * @return boolean
     */
    private boolean isInCol(final int col, final char number) {
        for (int i = 0; i < dimension; i++) {
            if (getValue(i, col) == number) {
                return true;
            }
        }
        return false;
    }

    /**
     * On vérifie si le nombre est déjà dans la box.
     *
     * @param row ligne
     * @param col colonne
     * @param number nombre
     * @return boolean
     */
    private boolean isInBox(
        final int row,
        final int col,
        final char number
    ) {
        int boxSize = BOX_SIZE_9;
        if (getDimension() == SIZE_16) {
            boxSize = BOX_SIZE_16;
        }

        int r = row - row % boxSize;
        int c = col - col % boxSize;

        for (int i = r; i < r + boxSize; i++) {
            for (int j = c; j < c + boxSize; j++) {
                if (getValue(i, j) == number) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * On vérifie si la case est vide.
     *
     * @param row ligne
     * @param col colonne
     * @return boolean
     */
    public final boolean isEmpty(final int row, final int col) {
        if (grille[row][col] == this.EMPTY) {
            return true;
        }

        return false;
    }

    /**
     * On vérifie si le nombre est dans la ligne/colonne/box.
     *
     * @param row ligne
     * @param col colonne
     * @param number nombre
     * @return boolean
     */
    public final boolean isOk(
        final int row,
        final int col,
        final char number
    ) {
        return !isInRow(row, number)
            && !isInCol(col, number)
            && !isInBox(row, col, number);
    }

    /**
     * Renvoie un char de la grille des possible.
     *
     * @param i indice du nombre
     * @return char
     */
    public final char getPossible(final int i) {
        return POSSIBLE[i];
    }

    /**
     * Set EMPTY sur une valeur du sudoku.
     *
     * @param row ligne
     * @param col colonne
     */
    public final void setEmpty(final int row, final int col) {
        grille[row][col] = this.EMPTY;
    }
}
