import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Création d'une personne
        Personne personne = new Personne("Dupont", "Jean", LocalDate.of(1990, 5, 15));
        
        // Création et attribution d'un permis de conduire
        PermisConduire permis = new PermisConduire("B123456789", TypePermis.B);
        personne.setPermis(permis);
        
        // Affichage des détails
        System.out.println("Détails de la personne et son permis :");
        System.out.println(personne);
    }
}
