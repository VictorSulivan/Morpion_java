import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class select_case_joueur {

    static int matrix[][];
    static boolean suivie=true;
    static int turn = 1;
    static int vainqueur = 0;
    public static void main(String[] args) {




        System.out.println("Bienvenue sur le jeux du morpion");
        createBoard();
        printBoard();


        while(vainqueur==0){



            if (turn==1){
                Scanner lineur = new Scanner(System.in);
                System.out.println("Entrer la ligne ou vous souhaitez jouer: "+turn);
                int ligne = lineur.nextInt();

                Scanner column = new Scanner(System.in);
                System.out.println("Entrer la column ou vous souhaitez jouer: "+turn);
                int colonne = column.nextInt();

                matrix[ligne][colonne] = turn;
                printBoard();
                /*checkWinnerline();*/
                turn=2;


            } else if (turn==2) {
                Scanner lineur = new Scanner(System.in);
                System.out.println("Entrer la ligne ou vous souhaitez jouer: "+turn);
                int ligne = lineur.nextInt();

                Scanner column = new Scanner(System.in);
                System.out.println("Entrer la column ou vous souhaitez jouer: "+turn);
                int colonne = column.nextInt();

                matrix[ligne][colonne] = turn;
                printBoard();
                /*checkWinnerline();*/
                turn = 1;

            }
        }

    }
    static void checkWinnerline(int j){

        /*for (int i=0;i < matrix.length; i++) {
            for (j ; j< matrix.length; j++) {
                if (matrix[i][j]==turn){
                    checkWinnerline(j+1);
                    if(matrix[i][matrix.length-1]==turn)
                        System.out.println("le joueur "+turn+" a gagné bien joué");
                        vainqueur=turn;

                    }else{

                        break;
                    }
                }
            }*/

        }


    static void createBoard() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes/colonnes de la matrice ou vous voulez placer : ");

        int taille = sc.nextInt();
        // crée une matrice
        matrix= new int[taille][taille];
        //initialise chaque élément de la matrice à 0

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                int signeCase = 0;
                matrix[i][j] = signeCase + signeCase;

            }

        }

    }
    static void printBoard() {

        //initialise chaque élément de la matrice à 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}






