public class Etudiant
{
    private String nom, dateNaissance;
    private double moyenne;

    public Etudiant(String nom, String dateNaissance, double moyenne) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.moyenne = moyenne;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNom(String nom) {
        this.nom = nom;
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
        return "Nom : " + this.nom +
                ", Date de naissance : " + this.dateNaissance +
                ", Moyenne : " + this.moyenne;
    }
}
