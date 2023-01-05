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

        JLabel[] labels = new JLabel[9];
        for (int i = 0 ; i < 9; i++) {

            labels[i] = new JLabel(""+i);
            labels[i].setBounds((i % 3) * 100, (i / 3) * 100, 100, 100);
            labels[i].setHorizontalAlignment(JLabel.CENTER);
            labels[i].setVerticalAlignment(JLabel.CENTER);
            frame.add(labels[i]);
            final int index = i;
            labels[i].addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (joueur1[0] == true) {
                        labels[index].setText("X");
                        joueur1[0] = false;
                    } else {
                        labels[index].setText("O");
                        joueur1[0] = true;
                    }

                    //CONDITION DE VICTOIRE À L'HORIZONTALE
                    if (labels[0].getText().equals(labels[1].getText()) && labels[1].getText().equals(labels[2].getText()) && !labels[0].getText().equals("")) {
                        System.out.println("Le joueur " + labels[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (labels[3].getText().equals(labels[4].getText()) && labels[4].getText().equals(labels[5].getText()) && !labels[3].getText().equals("")) {
                        System.out.println("Le joueur " + labels[3].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (labels[6].getText().equals(labels[7].getText()) && labels[7].getText().equals(labels[8].getText()) && !labels[6].getText().equals("")) {
                        System.out.println("Le joueur " + labels[6].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    //CONDITION DE VICTOIRE À L'HORIZONTALE

                    //CONDITION DE VICTOIRE À LA VERTICALE
                    if (labels[0].getText().equals(labels[3].getText()) && labels[3].getText().equals(labels[6].getText()) && !labels[0].getText().equals("")) {
                        System.out.println("Le joueur " + labels[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (labels[1].getText().equals(labels[4].getText()) && labels[4].getText().equals(labels[7].getText()) && !labels[1].getText().equals("")) {
                        System.out.println("Le joueur " + labels[1].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (labels[2].getText().equals(labels[5].getText()) && labels[5].getText().equals(labels[8].getText()) && !labels[2].getText().equals("")) {
                        System.out.println("Le joueur " + labels[2].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    //CONDITION DE VICTOIRE À LA VERTICALE

                    //CONDITION DE VICTOIRE EN DIAGONALE
                    if (labels[0].getText().equals(labels[4].getText()) && labels[4].getText().equals(labels[8].getText()) && !labels[0].getText().equals("")) {
                        System.out.println("Le joueur " + labels[0].getText() + " a gagné !");
                        frame.setVisible(false);
                    }
                    if (labels[2].getText().equals(labels[4].getText()) && labels[4].getText().equals(labels[6].getText()) && !labels[2].getText().equals("")) {
                        System.out.println("Le joueur " + labels[2].getText() + " a gagné !");
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




