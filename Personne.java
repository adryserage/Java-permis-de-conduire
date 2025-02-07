import java.time.LocalDate;

public class Personne {
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private PermisConduire permis;

    public Personne(String nom, String prenom, LocalDate dateNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public void setPermis(PermisConduire permis) {
        this.permis = permis;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public PermisConduire getPermis() {
        return permis;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prénom='" + prenom + '\'' +
                ", date de naissance=" + dateNaissance +
                "\n" + (permis != null ? permis.toString() : "Pas de permis") +
                '}';
    }
}
