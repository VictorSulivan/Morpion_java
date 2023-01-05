// espace importation de fonctionnalité
import java.awt.event.MouseAdapter;
import java.util.*;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class Morpion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        board = new String[9];
        turn = "X";
        String vainqueur = null;

        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a + 1);
        }

        System.out.println("Bienvenue sur le jeux du morpion");
        printBoard();

        System.out.println("X est désigner pour commencer la partie.");
        System.out.println("Entrez le numéro de la case que vous choisissez pour placer X juste........ici:");

        while (vainqueur == null) {
            int numInput;

            //espace de traitement des exceptions.
            // numInput prendra l'entrée de l'utilisateur comme de 1 à 9.
            // Si elle n'est pas comprise entre 1 et 9.
            //  alors il vous montrera une erreur "Entrée invalide".
            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Entré invalide; entre un nouveau nombre égale ou supérieur a 0 et inférieur ou égale a 9:");
                    continue;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Entré invalide; Saisissez à nouveau le numéro de case choisi: ");
                continue;
            }

            // Ce jeu a deux joueurs X et O.
            // Voici la logique pour décider du tour.
            if (board[numInput - 1].equals(
                    String.valueOf(numInput))) {
                board[numInput - 1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }

                printBoard();
                vainqueur = checkWinner();
            }
            else {
                System.out.println("L'emplacement n'est pas vide. veuillez en choisir un autre(vous pouvez visualiser au dessus les mplacements deja selectionner");
            }
        }

        // Si personne n'a gagné ou perdu que l'on est donc en situation de match nul entre les joueurs X et O.
        // alors voici la logique pour imprimer "nul".
        if (vainqueur.equalsIgnoreCase("match nul")) {
            System.out.println("C'est un match nul dommage mais bien joué");
        }

        // Message de victoire
        else {
            System.out.println("Félicitations! Le joueur " + vainqueur + "est le vainqueur!");
        }
    }
    static String[] board;
    static String turn;
    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            //la condition de victoire de X est une combinaison de trois X comme ceci: XXX
            if (line.equals("XXX")) {
                return "X";
            }

            // la condition de victoire de O est une combinaison de trois O comme ceci: OOO
            else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(
                    String.valueOf(i + 1))) {
                break;
            }
            else if (i == 8) {
                return "match nul";
            }
        }

        // changement de joueur donc on l'annonce.
        System.out.println("c'est le tour du joueur "+turn + " choisissez un numéro de case dans lequel vous placez le pion du joueur "+ turn );
        return null;
    }
    static void printBoard()
    {

        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "
                + board[1] + " | " + board[2]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | "
                + board[4] + " | " + board[5]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | "
                + board[7] + " | " + board[8]
                + " |");
        System.out.println("|---|---|---|");



    }

    }







