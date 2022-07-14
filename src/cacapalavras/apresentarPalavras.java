package cacapalavras;

import ficheiros.escreverFicheiro;

/**
 *
 * @author Milton Dantas
 * @author Sílvio Gongo
 * @author Jesus Finda
 * @author Imilio Manuel
 */
public class apresentarPalavras {

    public static void imprimirSaidas() {

        escreverFicheiro.gravarTexto(procurarPalavras.coordenadasSaida);

    }
}
