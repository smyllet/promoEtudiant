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

    public boolean addEtudiant(Etudiant etudiant) {
        if(this.getNbEtudiants() < 40) {
            this.tab.add(etudiant);
            return true;
        }
        else return false;
    }

    public int getNbEtudiants() {
        return this.tab.size();
    }

    public ArrayList<Etudiant> getEtudiants()
    {
        return this.tab;
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

    public double getMoyenneGeneral()
    {
        double totalNote = 0;
        int nbNote;

        for(nbNote = 0; nbNote < this.getNbEtudiants(); nbNote++)
            totalNote = totalNote + this.tab.get(nbNote).getMoyenne();

        return (double)Math.round((totalNote/nbNote) * 100) / 100;
    }

    public String getNameList() {
        String result = "";

        for(int i = 0; i < this.getNbEtudiants(); i++)
        {
            result += i+1 + " - " + this.tab.get(i).getNom() + "\n";
        }

        return result;
    }
}
