package isigroupee;

/**
 * Interface d'une grille de sudoku.
 */
public interface GrilleInterface {

    /**
     * Caractere de case vide.
     */
    char EMPTY = '@';

    /**
    * Caractere possible a mettre dans la grille.
    */
    char[] POSSIBLE = new char[] {'1', '2', '3', '4', '5', '6',
    '7', '8', '9', '0', 'a', 'b', 'c', 'd', 'e', 'f'};

    /**
     * @return Dimension de la grille
     */
    int getDimension();

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
    void setValue(final int x, final int y, final char value)
    throws IllegalArgumentException;

    /**
     * Recupere une valeur de la grille.
     *
     * @param x      position x dans la grille
     * @param y      position y dans la grille
     * @return valeur dans la case x,y
     * @throws IllegalArgumentException si x ou y sont hors bornes
     */
    char getValue(final int x, final int y)
    throws IllegalArgumentException;

    /**
     * Test si une grille est terminee.
     *
     * @return true si la grille est complete
     */
    boolean complete();

    /**
     * On vérifie si la case est vide.
     *
     * @param row ligne
     * @param col colonne
     * @return boolean
     */
    boolean isEmpty(final int row, final int col);

    /**
     * On vérifie si le nombre est dans la ligne/colonne/box.
     *
     * @param row ligne
     * @param col colonne
     * @param number nombre
     * @return boolean
     */
    boolean isOk(
        final int row,
        final int col,
        final char number
    );

    /**
     * Renvoie un char de la grille des possible.
     *
     * @param i indice du nombre
     * @return char
     */
    char getPossible(final int i);

    /**
     * Set EMPTY sur une valeur du sudoku.
     *
     * @param row ligne
     * @param col colonne
     */
    void setEmpty(final int row, final int col);
}
