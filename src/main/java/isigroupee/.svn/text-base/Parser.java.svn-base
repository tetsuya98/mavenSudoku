package isigroupee;

import java.io.InputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Convertit un .txt en grille.
 */
public final class Parser {

    /**
     * Constructeur.
     */
    private Parser() { }

    /**
     * Convertit un .txt en grille.
     *
     * @param file .txt
     * @param grid Grille
     * @throws IOException exception
     */
    public static void toParse(final InputStream file, final Grille grid)
    throws IOException {
        Reader reader = null;
        try {
            reader = new InputStreamReader(file, StandardCharsets.UTF_8);
            char[] buffer = new char[grid.getDimension()];
            for (int i = 0; i < grid.getDimension(); i++) {
                int read = reader.read(buffer);
                if (read != grid.getDimension()) {
                    throw new IOException("Mauvaise dimension");
                }
                for (int j = 0; j < grid.getDimension(); j++) {
                    grid.setValue(i, j, buffer[j]);
                }
                read = reader.read(new char[1]);
                if (read != 1) {
                    throw new IOException("Fin");
                }
            }
        } catch (IOException e) {
            if (reader != null) {
                reader.close();
            }
            e.printStackTrace();
        }
    }
}
