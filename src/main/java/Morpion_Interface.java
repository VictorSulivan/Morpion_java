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

        JLabel[] cases = new JLabel[9];
        for (int i = 0 ; i < 9; i++) {

            cases[i] = new JLabel(""+i);
            cases[i].setBounds((i % 3) * 100, (i / 3) * 100, 100, 100);
            cases[i].setHorizontalAlignment(JLabel.CENTER);
            cases[i].setVerticalAlignment(JLabel.CENTER);
            frame.add(cases[i]);
            final int index = i;
            cases[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (joueur1[0] == true) {
                        cases[index].setText("X");
                        joueur1[0] = false;
                    } else {
                        cases[index].setText("O");
                        joueur1[0] = true;
                    }

                    //CONDITION DE VICTOIRE À L'HORIZONTALE
                    if (cases[0].getText().equals(cases[1].getText()) && cases[1].getText().equals(cases[2].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (cases[3].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[5].getText()) && !cases[3].getText().equals("")) {
                        System.out.println("Le joueur " + cases[3].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (cases[6].getText().equals(cases[7].getText()) && cases[7].getText().equals(cases[8].getText()) && !cases[6].getText().equals("")) {
                        System.out.println("Le joueur " + cases[6].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    //CONDITION DE VICTOIRE À L'HORIZONTALE

                    //CONDITION DE VICTOIRE À LA VERTICALE
                    if (cases[0].getText().equals(cases[3].getText()) && cases[3].getText().equals(cases[6].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (cases[1].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[7].getText()) && !cases[1].getText().equals("")) {
                        System.out.println("Le joueur " + cases[1].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (cases[2].getText().equals(cases[5].getText()) && cases[5].getText().equals(cases[8].getText()) && !cases[2].getText().equals("")) {
                        System.out.println("Le joueur " + cases[2].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    //CONDITION DE VICTOIRE À LA VERTICALE

                    //CONDITION DE VICTOIRE EN DIAGONALE
                    if (cases[0].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[8].getText()) && !cases[0].getText().equals("")) {
                        System.out.println("Le joueur " + cases[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (cases[2].getText().equals(cases[4].getText()) && cases[4].getText().equals(cases[6].getText()) && !cases[2].getText().equals("")) {
                        System.out.println("Le joueur " + cases[2].getText() + " a gagné !");
                        frame.setVisible(false);
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




