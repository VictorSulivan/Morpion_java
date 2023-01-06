Le morpion est un jeu dans lequel deux joueurs (X et O) place à tours de role leurs symboles dans les 9 cases que compte le tableau.
Le premier qui aligne 3 de ses symboles gagnent la partie.

//Version interface graphique\\

Pour lancer l'application, ouvrez un terminal puis déplacer vous dans le fichier scripts, enfin ecrivez la ligne "./morpion_interface.sh", puis la fenetre Morpion apparait.

Un tableau de 3x3, désigné de 0 à 8.
Les instructions sont donnés par la phrase sous le tableau, "JOUEUR O DOIT JOUER".
Le premier joueur clique sur la case qui souhaite remplir, avec son curseur de souris, puis ainsi de suite avec l'autre joueur.
À la fin d'une partie vous pouvez cliquer sur "Recommencer" pour en relancer une autre.

Un fichier logs.txt est inclus dans le dossier ce dernier contient l'historique des parties avec la disposition graphique de la condition de victoire.
Ex : VICTOIRE JOUEUR O SUR LES CASES -->
     [0] [1] [2]                                                                                                       
     [ ] [ ] [ ]                                                                                                       
     [ ] [ ] [ ]   

Un historique des parties est aussi présent, en temps réel, dans le terminal avec lequel vous avez lancé l'application.

\\Version interface graphique//



//Version Numérique avec terminal\\

Pour lancer l'application, ouvrez un terminal puis déplacer vous dans le fichier scripts, enfin ecrivez la ligne "./morpion_numerique.sh", puis la fenetre Morpion apparait dans le terminal .

Pour faire fonctionner le morpion insérez un chiffre représentant le nombre de lignes et collones que le tableau contiendra.
Ensuite le joueur devra sélectionner avec un chiffre ,dans l'ordre la ligne puis de la collone, ou il posera sont jetons sur le tableau (attention la grille de jeu n'es pas de 1 à "numéro de ligne et de collone choisi par le joueur" mais de 0 à "nombre de ligne et de collone choisi par le joueur"-1(Le joueur 2 fera de meme une fois son tour arriver).
L'objectif est ensuite qu'un des deux joueur parvienne avec son jeton (joueur1:1 et joueur2:2) à faire une ligne une collone ou une diagonale dans la grille de jeu.
Une fois fait ou une fois la partie fini le jeu s'arrete.


\\Version Numérique avec terminal//