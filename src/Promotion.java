import java.util.ArrayList;

public class Promotion
{
    private ArrayList<Etudiant> tab;

    public Promotion() {
        this.tab = new ArrayList<>();
    }

    public Promotion(ArrayList<Etudiant> tab) {
        this.tab = tab;
    }

    public void addEtudiant(Etudiant etudiant) {
        this.tab.add(etudiant);
    }

    public int getNbEtudiants() {
        return this.tab.size();
    }

    @Override
    public String toString() {
        String result = "La promotion contient " + this.getNbEtudiants() + " étudiant(s)";

        if(this.getNbEtudiants() > 0)
        {
            result += "\nVoici la liste des étudiants : ";
            for(Etudiant etudiant : this.tab)
            {
                result += "\n" + etudiant;
            }
        }

        return result;
    }
}
