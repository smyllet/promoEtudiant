public class Etudiant
{
    private String nom, dateNaissance;
    private double moyenne;

    public Etudiant(String nom, String dateNaissance, double moyenne) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.moyenne = moyenne;
    }

    public String getNom() {
        return nom;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public double getMoyenne() {
        return moyenne;
    }

    @Override
    public String toString() {
        return "Étudiant -> " +
                "Nom : " + this.nom +
                ", Date de naissance : " + this.dateNaissance +
                ", Moyenne : " + this.moyenne;
    }
}
