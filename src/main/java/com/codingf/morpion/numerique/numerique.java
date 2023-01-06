package com.codingf.morpion.numerique;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class numerique {

        static int matrix[][];
        static boolean suivie=true;

        static boolean Égalité = false;
        static boolean nonÉgalité = false;

        static int turn = 1;
        static int vainqueur = 0;

        static int tkt = 0;

        public static void grille() {
            System.out.println("Bienvenue sur le jeu du morpion");
            createBoard();
            printBoard();
            while(vainqueur==0){
                if (turn==1) {
                    Scanner lineur = new Scanner(System.in);
                    System.out.println("Entrez la ligne ou vous souhaitez jouer: " + turn);
                    int ligne = lineur.nextInt();
                    Scanner column = new Scanner(System.in);
                    System.out.println("Entrez la colonne ou vous souhaitez jouer: " + turn);
                    int colonne = column.nextInt();

                    if (matrix[ligne][colonne] == 0) {
                        matrix[ligne][colonne] = turn;
                        printBoard();
                        checkWinnerline();
                        turn = 2;
                    } else {
                        System.out.println("il existe deja un joueur a cet endroit, veuillez vous placer autre part dans le tableau joueur2");
                        printBoard();
                    }
                } else if (turn==2) {
                    Scanner lineur = new Scanner(System.in);
                    System.out.println("Entrez la ligne ou vous souhaitez jouer: "+turn);
                    int ligne = lineur.nextInt();
                    Scanner column = new Scanner(System.in);
                    System.out.println("Entrez la colonne ou vous souhaitez jouer: "+turn);
                    int colonne = column.nextInt();
                    if (matrix[ligne][colonne] == 0) {
                        matrix[ligne][colonne] = turn;
                        printBoard();
                        checkWinnerline();
                        turn = 1;
                    } else {
                        System.out.println("il existe deja un joueur veuillez vous placer autre part dans le tableau joueur2");
                        printBoard();
                    }

                }

            }
        }


        /*if (matrix[i][j] == turn) {
        }*/
        static void checkWinnerline() {
            int longueur = matrix.length;
            int longueur2= matrix.length-1;

            //check horizontal
            for (int i = 0; i < longueur; i++) {
                List<Integer> list = new ArrayList<Integer>();
                for (int j = 0; j < longueur; j++) {

                    list.add(matrix[i][j]);
                    //System.out.println(list);

                }
                long veri = list.stream().distinct().count();
                if (veri == 1 && (list.get(0) == 1 || list.get(0) == 2)) {
                    System.out.println("joueur " + list.get(0) + " gagner !!!!!!!!");
                    vainqueur = list.get(turn);
                }
            }

            // check vertical
            for (int i = 0; i < longueur; i++) {
                List<Integer> list = new ArrayList<Integer>();
                for (int j = 0; j < longueur; j++) {

                    list.add(matrix[j][i]);
                    //System.out.println(list);

                }
                long veri = list.stream().distinct().count();
                if (veri == 1 && (list.get(0) == 1 || list.get(0) == 2)) {
                    System.out.println("joueur " + list.get(0) + " gagner !!!!!!!!");
                    vainqueur = list.get(turn);
                }
            }

            //check diagonal en haut a gauche jusqu'a en bas a droite
            for (int i = 0; i < longueur; i++) {
                List<Integer> list = new ArrayList<Integer>();
                for (int j = 0; j < longueur; j++) {

                    list.add(matrix[j][j]);
                    //System.out.println(list);

                }
                long veri = list.stream().distinct().count();
                if (veri == 1 && (list.get(0) == 1 || list.get(0) == 2)) {
                    System.out.println("joueur " + list.get(0) + " gagner !!!!!!!!");
                    vainqueur = list.get(turn);
                }
            }

            //check diagonal en haut a droite jusqu'a en bas a gauche
            for (int i = 0; i < 1; i++) {
                List<Integer> list = new ArrayList<Integer>();
                for (int j = 0; j < longueur; j++) {

                    list.add(matrix[j][longueur2-j]);
                    //System.out.println(list);

                }
                long veri = list.stream().distinct().count();
                if (veri == 1 && (list.get(0) == 1 || list.get(0) == 2)) {
                    System.out.println("joueur " + list.get(0) + " gagner !!!!!!!!");
                    vainqueur = list.get(turn);
                }
            }

            //check egalité
            List<Integer> finale = new ArrayList<Integer>();
            for (int i = 0; i < longueur; i++) {
                for (int j = 0; j < longueur; j++) {

                    finale.add(matrix[i][j]);
                    //System.out.println(list);
                    if (matrix[i][j] != 0){
                        tkt = tkt + 1;
                        Égalité = true;
                    } else {
                        nonÉgalité = true;
                    }
                    if (tkt == 45){
                        System.out.println("Égalité");
                        vainqueur=3;
                    } else {
                    }



                }
                long veri = finale.stream().distinct().count();
                if (veri == 1 && (finale.get(0) == 1 || finale.get(0) == 2)) {
                    System.out.println("joueur " + finale.get(0) + " gagner !!!!!!!!");
                    vainqueur = finale.get(turn);
                }
            }

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



