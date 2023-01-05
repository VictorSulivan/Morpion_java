import java.util.Scanner;

public class Methode_creation_tableau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez le nombre de lignes/colonnes de la matrice: ");
        int taille = sc.nextInt();

         // crée une matrice
        int[][] matrix=new int  [taille][taille];
        //initialise chaque élément de la matrice à 0
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                int signeCase=0;
                matrix[i][j] = signeCase + signeCase;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();


            }
        }


