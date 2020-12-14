import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testPromotion
{
    Etudiant etudiant1, etudiant2, etudiant3;
    Promotion promotion1, promotion2;

    @BeforeEach
    void init()
    {
        etudiant1 = new Etudiant("Bob", "12/05/2000", 13);
        etudiant2 = new Etudiant("Alice", "26/11/1999", 17);
        etudiant3 = new Etudiant("Pierre", "01/02/2000", 13);

        ArrayList<Etudiant> listEtudiant = new ArrayList<>();
        listEtudiant.add(etudiant1);
        listEtudiant.add(etudiant2);

        promotion1 = new Promotion();
        promotion2 = new Promotion(listEtudiant);
    }

    @Test
    void testInstantiation()
    {
        assertEquals(new ArrayList<Etudiant>(), promotion1.getEtudiants(), "Erreur lors de l'instantiation a vide de la promotion 1");
        assertThat("Étudiant manquant après instantiation de la promotion 2", promotion2.getEtudiants(), hasItems(etudiant1, etudiant2));
        assertThat("Étudiant en trop après instantation de la promotion 2", promotion2.getEtudiants(),  not(hasItem(etudiant3)));
    }

    @Test
    void testAddEtudiant()
    {
        promotion1.addEtudiant(etudiant1);
        assertThat("l'étudiant 1 n'a pas été ajouté à la promotion 1", promotion1.getEtudiants(), hasItem(etudiant1));

        promotion2.addEtudiant(etudiant3);
        assertThat("l'étudiant 3 n'a pas été ajouté à la promotion 2", promotion2.getEtudiants(), hasItem(etudiant3));
    }

    @Test
    void testNbEtudiants()
    {
        assertEquals(0, promotion1.getNbEtudiants(), "La promotions 1 ne contient pas le bon nombre d'étudiants");
        assertEquals(2, promotion2.getNbEtudiants(), "La promotions 2 ne contient pas le bon nombre d'étudiants");
    }

    @Test
    void testToString()
    {
        assertEquals("La promotion contient 0 étudiant(s)", promotion1.toString(), "Erreur sur la récupération en text de la promotion 1");
        assertEquals("La promotion contient 2 étudiant(s)\nVoici la liste des étudiants : \nÉtudiant -> Nom : Bob, Date de naissance : 12/05/2000, Moyenne : 13.0\nÉtudiant -> Nom : Alice, Date de naissance : 26/11/1999, Moyenne : 17.0", promotion2.toString(), "Erreur sur la récupération en text de la promotion 2");
    }

    @Test
    void testGetMoyenneGeneral()
    {
        assertEquals(15, promotion2.getMoyenneGeneral(), "La moyenne général de la promotion 2 est incorrect");
    }
}
