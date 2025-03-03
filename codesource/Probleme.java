public class Problematique {
    
    // Variable inutilisée
    private int variableInutile = 42;

    // Méthode avec nom non conventionnel
    public static void faireQuelqueChoseMal() {
        int x = 10;
        int y = 0;

        // Commentaire inutile
        // Ceci est un commentaire très très long qui n'apporte aucune valeur et occupe de l'espace inutilement

        // Complexité cyclomatique élevée
        for (int i = 0; i < x; i++) {
            if (i % 2 == 0) {
                System.out.println("Nombre pair : " + i);
            } else if (i % 3 == 0) {
                System.out.println("Divisible par 3 : " + i);
            } else {
                System.out.println("Autre cas : " + i);
            }
        }

        // Mauvaise gestion des exceptions
        try {
            int resultat = x / y; // Division par zéro
        } catch (Exception e) {
            // Ne pas laisser de bloc catch vide
        }
    }

    public static void main(String[] args) {
        // Instanciation inutile de l'objet
        ExempleProblematique exemple = new ExempleProblematique();
        exemple.faireQuelqueChoseMal();

        // Appel d'une méthode potentiellement dangereuse
        System.out.println("Test terminé.");
    }
}
