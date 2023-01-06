package com.codingf.morpionInterface.Interface;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Interface {

    private static boolean winCondition1;
    private static boolean winCondition2;
    private static boolean winCondition3;
    private static boolean winCondition4;
    private static boolean winCondition5;
    private static boolean winCondition6;
    private static boolean winCondition7;
    private static boolean winCondition8;

    private static boolean winCondition9;


    private static boolean winX;
    private static boolean winO;


    public static void printBoard()
    {
        JFrame frame = new JFrame("Morpion");
        frame.setLayout(null);



        final boolean[] joueur1 = {true};
        final boolean[] fin = {false};
        final boolean[] egalité = {true};

        winCondition1 =  false;
        winCondition2 =  false ;
        winCondition3 =  false ;
        winCondition4 =  false ;
        winCondition5 =  false ;
        winCondition6 =  false ;
        winCondition7 =  false ;
        winCondition8 =  false ;
        winCondition9 =  false ;

        winX =  false ;
        winO =  false ;


        //DEBUT QUADRILLAGE VERTICAL 1
        JLabel[] quadrillageVertical1 = new JLabel[3];
        for (int qV1 = 0 ; qV1 < 3; qV1++) {
            quadrillageVertical1[qV1] = new JLabel("│");
            quadrillageVertical1[qV1].setBounds((qV1 % 3) * 100, 0, 100, 100);
            frame.add(quadrillageVertical1[qV1]);
        }
        //FIN QUADRILLAGE VERTICAL 1

        //DEBUT QUADRILLAGE VERTICAL 2
        JLabel[] quadrillageVertical2 = new JLabel[3];
        for (int qV2 = 0 ; qV2 < 3; qV2++) {
            quadrillageVertical2[qV2] = new JLabel("│");
            quadrillageVertical2[qV2].setBounds((qV2 % 3) * 100, 35, 100, 100);
            frame.add(quadrillageVertical2[qV2]);
        }
        //FIN QUADRILLAGE VERTICAL 2

        //DEBUT QUADRILLAGE VERTICAL 3
        JLabel[] quadrillageVertical3 = new JLabel[3];
        for (int qV3 = 0 ; qV3 < 3; qV3++) {
            quadrillageVertical3[qV3] = new JLabel("│");
            quadrillageVertical3[qV3].setBounds((qV3 % 3) * 100, 70, 100, 100);
            frame.add(quadrillageVertical3[qV3]);
        }
        //FIN QUADRILLAGE VERTICAL 3

        //DEBUT QUADRILLAGE VERTICAL 4
        JLabel[] quadrillageVertical4 = new JLabel[4];
        for (int qV4 = 0 ; qV4 < 4; qV4++) {
            quadrillageVertical4[qV4] = new JLabel("│");
            quadrillageVertical4[qV4].setBounds((qV4 % 3) * 100, 100, 100, 100);
            frame.add(quadrillageVertical4[qV4]);
        }
        //FIN QUADRILLAGE VERTICAL 4

        //DEBUT QUADRILLAGE VERTICAL 5
        JLabel[] quadrillageVertical5 = new JLabel[5];
        for (int qV5 = 0 ; qV5 < 5; qV5++) {
            quadrillageVertical5[qV5] = new JLabel("│");
            quadrillageVertical5[qV5].setBounds((qV5 % 3) * 100, 135, 100, 100);
            frame.add(quadrillageVertical5[qV5]);
        }
        //FIN QUADRILLAGE VERTICAL 5

        //DEBUT QUADRILLAGE VERTICAL 6
        JLabel[] quadrillageVertical6 = new JLabel[6];
        for (int qV6 = 0 ; qV6 < 6; qV6++) {
            quadrillageVertical6[qV6] = new JLabel("│");
            quadrillageVertical6[qV6].setBounds((qV6 % 3) * 100, 170, 100, 100);
            frame.add(quadrillageVertical6[qV6]);
        }
        //FIN QUADRILLAGE VERTICAL 6

        //DEBUT QUADRILLAGE VERTICAL 7
        JLabel[] quadrillageVertical7 = new JLabel[7];
        for (int qV7 = 0 ; qV7 < 7; qV7++) {
            quadrillageVertical7[qV7] = new JLabel("│");
            quadrillageVertical7[qV7].setBounds((qV7 % 3) * 100, 200, 100, 100);
            frame.add(quadrillageVertical7[qV7]);
        }
        //FIN QUADRILLAGE VERTICAL 7



        //DEBUT QUADRILLAGE HORIZONTAL 1
        JLabel[] quadrillageHorizontal1 = new JLabel[3];
        for (int qV1 = 0 ; qV1 < 3; qV1++) {
            quadrillageHorizontal1[qV1] = new JLabel("────────");
            quadrillageHorizontal1[qV1].setBounds((qV1 % 3) * 100, 50, 1000, 100);
            frame.add(quadrillageHorizontal1[qV1]);
        }
        //FIN QUADRILLAGE HORIZONTAL 1

        //DEBUT QUADRILLAGE HORIZONTAL 2
        JLabel[] quadrillageHorizontal2 = new JLabel[3];
        for (int qV2 = 0 ; qV2 < 3; qV2++) {
            quadrillageHorizontal2[qV2] = new JLabel("────────");
            quadrillageHorizontal2[qV2].setBounds((qV2 % 3) * 100, 150, 1000, 100);
            frame.add(quadrillageHorizontal2[qV2]);
        }
        //FIN QUADRILLAGE HORIZONTAL 2

        //DEBUT QUADRILLAGE HORIZONTAL 3
        JLabel[] quadrillageHorizontal3 = new JLabel[3];
        for (int qV3 = 0 ; qV3 < 3; qV3++) {
            quadrillageHorizontal3[qV3] = new JLabel("────────");
            quadrillageHorizontal3[qV3].setBounds((qV3 % 3) * 100, 230, 1000, 100);
            frame.add(quadrillageHorizontal3[qV3]);
        }
        //FIN QUADRILLAGE HORIZONTAL 3






        JLabel[] cases = new JLabel[11];
        final int[] s = {0};
        for (final int[] i = {0}; i[0] < 11; i[0]++) {

            cases[i[0]] = new JLabel(""+ i[0]);
            cases[i[0]].setBounds((i[0] % 3) * 100, (i[0] / 3) * 100, 100, 100);
            cases[i[0]].setHorizontalAlignment(JLabel.CENTER);
            cases[i[0]].setVerticalAlignment(JLabel.CENTER);
            frame.add(cases[i[0]]);
            final int[] index = {i[0]};
            if (i[0] ==9) {
                cases[9].setText("JOUEUR O DOIT JOUER");
                cases[9].setBounds(35, 270, 300, 50);
            }
            if (i[0] ==10){
                cases[10].setText("Recommencer");
                cases[10].setBounds(0, 235, 300, 200);
            }
            cases[i[0]].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (joueur1[0] == true && index[0] != 9 && cases[index[0]].getText() != "X" && cases[index[0]].getText() != "O" && fin[0] == false) {
                        cases[index[0]].setText("O");
                        System.out.println("//O PLACÉ");
                        joueur1[0] = false;
                        cases[9].setText("JOUEUR X DOIT JOUER");
                        s[0]++;

                    } else if (joueur1[0] == false && index[0] != 9 && cases[index[0]].getText() != "X" && cases[index[0]].getText() != "O" && fin[0] == false) {
                        cases[index[0]].setText("X");
                        System.out.println("\\\\X PLACÉ");
                        joueur1[0] = true;
                        cases[9].setText("JOUEUR O DOIT JOUER");
                        s[0]++;
                    }



                    //CONDITION DE VICTOIRE À L'HORIZONTALE
                    if (cases[0].getText().equals(cases[1].getText()) && cases[1].getText().equals(cases[2].getText()) && !cases[0].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [0] [1] [2]");
                        System.out.println("                                    [ ] [ ] [ ]");
                        System.out.println("                                    [ ] [ ] [ ]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition1 = true;
                        if (cases[0].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }



                    }
                    if (cases[3].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[5].getText()) && !cases[3].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [ ] [ ] [ ]");
                        System.out.println("                                    [3] [4] [5]");
                        System.out.println("                                    [ ] [ ] [ ]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[3].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition2 = true;
                        if (cases[3].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (cases[6].getText().equals(cases[7].getText()) && cases[7].getText().equals(cases[8].getText()) && !cases[6].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [ ] [ ] [ ]");
                        System.out.println("                                    [ ] [ ] [ ]");
                        System.out.println("                                    [6] [7] [8]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[6].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition3 = true;
                        if (cases[6].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    //CONDITION DE VICTOIRE À L'HORIZONTALE

                    //CONDITION DE VICTOIRE À LA VERTICALE
                    if (cases[0].getText().equals(cases[3].getText()) && cases[3].getText().equals(cases[6].getText()) && !cases[0].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [0] [ ] [ ]");
                        System.out.println("                                    [3] [ ] [ ]");
                        System.out.println("                                    [6] [ ] [ ]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition4 = true;
                        if (cases[0].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (cases[1].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[7].getText()) && !cases[1].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [ ] [1] [ ]");
                        System.out.println("                                    [ ] [4] [ ]");
                        System.out.println("                                    [ ] [7] [ ]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[1].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition5 = true;
                        if (cases[1].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (cases[2].getText().equals(cases[5].getText()) && cases[5].getText().equals(cases[8].getText()) && !cases[2].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [ ] [ ] [2]");
                        System.out.println("                                    [ ] [ ] [5]");
                        System.out.println("                                    [ ] [ ] [8]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[2].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition6 = true;
                        if (cases[2].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    //CONDITION DE VICTOIRE À LA VERTICALE

                    //CONDITION DE VICTOIRE EN DIAGONALE
                    if (cases[0].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[8].getText()) && !cases[0].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [0] [ ] [ ]");
                        System.out.println("                                    [ ] [4] [ ]");
                        System.out.println("                                    [ ] [ ] [8]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition7 = true;
                        if (cases[0].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    if (cases[2].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[6].getText()) && !cases[2].getText().equals("") && fin[0] == false) {
                        System.out.println("VICTOIRE JOUEUR "+cases[0].getText()+ " SUR LES CASES -->");
                        System.out.println("                                    [ ] [ ] [2]");
                        System.out.println("                                    [ ] [4] [ ]");
                        System.out.println("                                    [6] [ ] [ ]");

                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[2].getText() + " a gagné !");
                        fin[0] = true;
                        egalité[0] = false;
                        winCondition8 = true;
                        if (cases[2].getText() == "X"){
                            winX = true;
                        } else {
                            winO = true;
                        }
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                    //CONDITION DE VICTOIRE EN DIAGONALE

                    //ÉGALITÉ GRILLE PLEINE
                    if (s[0] == 9 && egalité[0]== true && fin[0] == false){
                        System.out.println("ÉGALITÉ GRILLE PLEINE -->");
                        System.out.println("                         [ ] [ ] [ ]");
                        System.out.println("                         [ ] [ ] [ ]");
                        System.out.println("                         [ ] [ ] [ ]");

                        cases[9].setText("PARTIE FINIE / ÉGALITÉ GRILLE PLEINE");
                        fin[0] = true;
                        winCondition9 = true;
                        try {
                            logs();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }

                    }
                    //ÉGALITÉ GRILLE PLEINE

                    //RECOMMENCER
                    if (index[0] ==10){
                        System.out.println("PARTIE RECOMMENCÉE");
                        printBoard();
                    }
                    //RECOMMENCER


                }
            });

        }





        frame.pack();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
    public static void logs()
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/florianrichet/Desktop/01-Ecole/05-Java/Morpion_Java/src/main/java/com/codingf/morpionInterface/logs.txt", true));

        //WIN CONDITION 1
        if (winCondition1 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [0] [1] [2]");
                String str3 =("                                                                                                       [ ] [ ] [ ]");
                String str4 =("                                                                                                       [ ] [ ] [ ]");
                String str5 =("VICTOIRE JOUEUR X SUR LES CASES -->");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);
                writer.append(str5);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [0] [1] [2]");
                String str3 =("                                                                                                       [ ] [ ] [ ]");
                String str4 =("                                                                                                       [ ] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
        }
        //WIN CONDITION 1

        //WIN CONDITION 2
        if (winCondition2 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [ ]");
                String str3 =("                                                                                                       [3] [4] [5]");
                String str4 =("                                                                                                       [ ] [ ] [ ]"                                                                                                       );

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [ ]");
                String str3 =("                                                                                                       [3] [4] [5]");
                String str4 =("                                                                                                       [ ] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
        }
        //WIN CONDITION 2

        //WIN CONDITION 3
        if (winCondition3 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [ ]");
                String str3 =("                                                                                                       [ ] [ ] [ ]");
                String str4 =("                                                                                                       [6] [7] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [ ]");
                String str3 =("                                                                                                       [ ] [ ] [ ]");
                String str4 =("                                                                                                       [6] [7] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 3

        //WIN CONDITION 4
        if (winCondition4 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [0] [ ] [ ]");
                String str3 =("                                                                                                       [3] [ ] [ ]");
                String str4 =("                                                                                                       [6] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [0] [ ] [ ]");
                String str3 =("                                                                                                       [3] [ ] [ ]");
                String str4 =("                                                                                                       [6] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 4

        //WIN CONDITION 5
        if (winCondition5 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [ ] [1] [ ]");
                String str3 =("                                                                                                       [ ] [4] [ ]");
                String str4 =("                                                                                                       [ ] [7] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [ ] [1] [ ]");
                String str3 =("                                                                                                       [ ] [4] [ ]");
                String str4 =("                                                                                                       [ ] [7] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 5

        //WIN CONDITION 6
        if (winCondition6 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [2]");
                String str3 =("                                                                                                       [ ] [ ] [5]");
                String str4 =("                                                                                                       [ ] [ ] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [ ] [ ] [2]");
                String str3 =("                                                                                                       [ ] [ ] [5]");
                String str4 =("                                                                                                       [ ] [ ] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 6

        //WIN CONDITION 7
        if (winCondition7 == true){
            if (winX == true){
                String str1 =("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 =("                                                                    [0] [ ] [ ]");
                String str3 =("                                                                                                       [ ] [4] [ ]");
                String str4 =("                                                                                                       [ ] [ ] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true){
                String str1 =("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 =("                                                                    [0] [ ] [ ]");
                String str3 =("                                                                                                       [ ] [4] [ ]");
                String str4 =("                                                                                                       [ ] [ ] [8]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 7

        //WIN CONDITION 8
        if (winCondition8 == true) {
            if (winX == true) {
                String str1 = ("VICTOIRE JOUEUR X SUR LES CASES -->");
                String str2 = ("                                                                    [ ] [ ] [2]");
                String str3 = ("                                                                                                       [ ] [4] [ ]");
                String str4 = ("                                                                                                       [6] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);

            }
            if (winO == true) {
                String str1 = ("VICTOIRE JOUEUR O SUR LES CASES -->");
                String str2 = ("                                                                    [ ] [ ] [2]");
                String str3 = ("                                                                                                       [ ] [4] [ ]");
                String str4 = ("                                                                                                       [6] [ ] [ ]                                                                                                       ");

                writer.append(str1);
                writer.append(str2);
                writer.append(str3);
                writer.append(str4);


            }
        }
        //WIN CONDITION 8

        //ÉGALITÉ
        if (winCondition9 == true){
            String str1 =("ÉGALITÉ GRILLE PLEINE -->                ");
            String str2 =("                                                                    [ ] [ ] [ ]");
            String str3 =("                                                                                                       [ ] [ ] [ ]");
            String str4 =("                                                                                                       [ ] [ ] [ ]                                                                                                       ");

            writer.append(str1);
            writer.append(str2);
            writer.append(str3);
            writer.append(str4);

            }
        //ÉGALITÉ
        writer.append(' ');
        writer.close();
    }


}




