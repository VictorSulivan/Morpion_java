// espace importation de fonctionnalité
import java.awt.event.MouseAdapter;
import java.util.*;
import javax.swing.*;
import java.awt.event.MouseEvent;

public class Morpion_Interface {
    public static void main(String[] args) {
        printBoard();
        }

    static void printBoard()
    {
        JFrame frame = new JFrame("Morpion");
        frame.setLayout(null);



        final boolean[] joueur1 = {true};
        final boolean[] fin = {false};

        //DEBUT QUADRILLAGE VERTICAL 1
        JLabel[] quadrillageVertical1 = new JLabel[3];
        for (int qV1 = 0 ; qV1 < 3; qV1++) {
            quadrillageVertical1[qV1] = new JLabel("|");
            quadrillageVertical1[qV1].setBounds((qV1 % 3) * 100, 0, 100, 100);
            frame.add(quadrillageVertical1[qV1]);
        }
        //FIN QUADRILLAGE VERTICAL 1

        //DEBUT QUADRILLAGE VERTICAL 2
        JLabel[] quadrillageVertical2 = new JLabel[3];
        for (int qV2 = 0 ; qV2 < 3; qV2++) {
            quadrillageVertical2[qV2] = new JLabel("|");
            quadrillageVertical2[qV2].setBounds((qV2 % 3) * 100, 35, 100, 100);
            frame.add(quadrillageVertical2[qV2]);
        }
        //FIN QUADRILLAGE VERTICAL 2

        //DEBUT QUADRILLAGE VERTICAL 3
        JLabel[] quadrillageVertical3 = new JLabel[3];
        for (int qV3 = 0 ; qV3 < 3; qV3++) {
            quadrillageVertical3[qV3] = new JLabel("|");
            quadrillageVertical3[qV3].setBounds((qV3 % 3) * 100, 70, 100, 100);
            frame.add(quadrillageVertical3[qV3]);
        }
        //FIN QUADRILLAGE VERTICAL 3

        //DEBUT QUADRILLAGE VERTICAL 4
        JLabel[] quadrillageVertical4 = new JLabel[4];
        for (int qV4 = 0 ; qV4 < 4; qV4++) {
            quadrillageVertical4[qV4] = new JLabel("|");
            quadrillageVertical4[qV4].setBounds((qV4 % 3) * 100, 100, 100, 100);
            frame.add(quadrillageVertical4[qV4]);
        }
        //FIN QUADRILLAGE VERTICAL 4

        //DEBUT QUADRILLAGE VERTICAL 5
        JLabel[] quadrillageVertical5 = new JLabel[5];
        for (int qV5 = 0 ; qV5 < 5; qV5++) {
            quadrillageVertical5[qV5] = new JLabel("|");
            quadrillageVertical5[qV5].setBounds((qV5 % 3) * 100, 135, 100, 100);
            frame.add(quadrillageVertical5[qV5]);
        }
        //FIN QUADRILLAGE VERTICAL 5

        //DEBUT QUADRILLAGE VERTICAL 6
        JLabel[] quadrillageVertical6 = new JLabel[6];
        for (int qV6 = 0 ; qV6 < 6; qV6++) {
            quadrillageVertical6[qV6] = new JLabel("|");
            quadrillageVertical6[qV6].setBounds((qV6 % 3) * 100, 170, 100, 100);
            frame.add(quadrillageVertical6[qV6]);
        }
        //FIN QUADRILLAGE VERTICAL 6

        //DEBUT QUADRILLAGE VERTICAL 7
        JLabel[] quadrillageVertical7 = new JLabel[7];
        for (int qV7 = 0 ; qV7 < 7; qV7++) {
            quadrillageVertical7[qV7] = new JLabel("|");
            quadrillageVertical7[qV7].setBounds((qV7 % 3) * 100, 200, 100, 100);
            frame.add(quadrillageVertical7[qV7]);
        }
        //FIN QUADRILLAGE VERTICAL 7



        //DEBUT QUADRILLAGE HORIZONTAL 1
        JLabel[] quadrillageHorizontal1 = new JLabel[3];
        for (int qV1 = 0 ; qV1 < 3; qV1++) {
            quadrillageHorizontal1[qV1] = new JLabel("-------------");
            quadrillageHorizontal1[qV1].setBounds((qV1 % 3) * 100, 50, 1000, 100);
            frame.add(quadrillageHorizontal1[qV1]);
        }
        //FIN QUADRILLAGE HORIZONTAL 1

        //DEBUT QUADRILLAGE HORIZONTAL 2
        JLabel[] quadrillageHorizontal2 = new JLabel[3];
        for (int qV2 = 0 ; qV2 < 3; qV2++) {
            quadrillageHorizontal2[qV2] = new JLabel("-------------");
            quadrillageHorizontal2[qV2].setBounds((qV2 % 3) * 100, 150, 1000, 100);
            frame.add(quadrillageHorizontal2[qV2]);
        }
        //FIN QUADRILLAGE HORIZONTAL 2

        //DEBUT QUADRILLAGE HORIZONTAL 3
        JLabel[] quadrillageHorizontal3 = new JLabel[3];
        for (int qV3 = 0 ; qV3 < 3; qV3++) {
            quadrillageHorizontal3[qV3] = new JLabel("-------------");
            quadrillageHorizontal3[qV3].setBounds((qV3 % 3) * 100, 230, 1000, 100);
            frame.add(quadrillageHorizontal3[qV3]);
        }
        //FIN QUADRILLAGE HORIZONTAL 3


        
        
        
        
        JLabel[] cases = new JLabel[10];
        for (int i = 0 ; i < 10; i++) {

            cases[i] = new JLabel(""+i);
            cases[i].setBounds((i % 3) * 100, (i / 3) * 100, 100, 100);
            cases[i].setHorizontalAlignment(JLabel.CENTER);
            cases[i].setVerticalAlignment(JLabel.CENTER);
            frame.add(cases[i]);
            final int index = i;
            if (i==9) {
                cases[9].setText("PARTIE EN COURS");
                cases[9].setBounds(0, 200, 300, 200);
            }
            cases[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (joueur1[0] == true && index != 9 && cases[index].getText() != "X" && cases[index].getText() != "O" && fin[0] == false) {
                        cases[index].setText("X");
                        joueur1[0] = false;
                    } else if (joueur1[0] == false && index != 9 && cases[index].getText() != "X" && cases[index].getText() != "O" && fin[0] == false) {
                        cases[index].setText("O");
                        joueur1[0] = true;
                    }

                    //CONDITION DE VICTOIRE À L'HORIZONTALE
                    if (cases[0].getText().equals(cases[1].getText()) && cases[1].getText().equals(cases[2].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;



                    }
                    if (cases[3].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[5].getText()) && !cases[3].getText().equals("")) {
                        System.out.println("Le joueur " + cases[3].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[3].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    if (cases[6].getText().equals(cases[7].getText()) && cases[7].getText().equals(cases[8].getText()) && !cases[6].getText().equals("")) {
                        System.out.println("Le joueur " + cases[6].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[6].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    //CONDITION DE VICTOIRE À L'HORIZONTALE

                    //CONDITION DE VICTOIRE À LA VERTICALE
                    if (cases[0].getText().equals(cases[3].getText()) && cases[3].getText().equals(cases[6].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    if (cases[1].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[7].getText()) && !cases[1].getText().equals("")) {
                        System.out.println("Le joueur " + cases[1].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[1].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    if (cases[2].getText().equals(cases[5].getText()) && cases[5].getText().equals(cases[8].getText()) && !cases[2].getText().equals("")) {
                        System.out.println("Le joueur " + cases[2].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[2].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    //CONDITION DE VICTOIRE À LA VERTICALE

                    //CONDITION DE VICTOIRE EN DIAGONALE
                    if (cases[0].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[8].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[0].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    if (cases[2].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[6].getText()) && !cases[2].getText().equals("")) {
                        System.out.println("Le joueur " + cases[2].getText() + " a gagné !");
                        cases[9].setText("PARTIE FINIE / Le joueur " + cases[2].getText() + " a gagné !");
                        fin[0] = true;

                    }
                    //CONDITION DE VICTOIRE EN DIAGONALE


                }
            });

        }

        frame.pack();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }

}




