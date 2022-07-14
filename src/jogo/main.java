package jogo;

import ficheiros.lerFicheiro;
import javax.swing.JOptionPane;
import sopadeletras.*;

/**
 *
 * @author Milton-A
 */
public class main {

    public static int numeroCacaPalavras;

    public static void main(String[] args) {

        String strOpcao;
        int menuOpcao, menuOpcaoFicheiro, controlador = 0;

        JOptionPane.showMessageDialog(null, "Bem-Vindo ao Caça-Palavras");

        strOpcao = JOptionPane.showInputDialog(""
                + "=======  Caça Palavras =======\n"
                + "1 - Inserir Palavras via tecladp\n"
                + "2 - Carregar palavras do ficheiro\n"
                + "0 - Parar");
        menuOpcao = Integer.parseInt(strOpcao);

        switch (menuOpcao) {
            case 0:
                System.out.println("Saindo...");
                break;
            case 1:
                strOpcao = JOptionPane.showInputDialog("Insira o numero de Caça Palavras");
                numeroCacaPalavras = Integer.parseInt(strOpcao);
                for (int i = 1; i <= numeroCacaPalavras; i++) {
                    inserirPalavras.inserirCacaPalavras(menuOpcao);
                    formarSopaDeLetras.imprimirCacaPalavras();
                }
                controlador = 1;
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "**Primeiro! \nCriar um (palavras.txt) no directorio do projecto \n"
                        + "Escrever as palavras no ficheiro\n"
                        + "E depois salvar");
                lerFicheiro.lerFicheiroPalavras();
                controlador = 1;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção Errada!", "Atenção", JOptionPane.ERROR_MESSAGE);
        }

        if (controlador == 1) {
            cacapalavras.apresentarPalavras.imprimirSaidas();
        }
    }
}
