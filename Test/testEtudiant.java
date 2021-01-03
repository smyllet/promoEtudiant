import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testEtudiant
{
    Etudiant etudiant1, etudiant2;

    @BeforeEach
    void init()
    {
        etudiant1 = new Etudiant("Bob", "12/05/2000", 13);
        etudiant2 = new Etudiant("Alice", "26/11/1999", 17);
    }

    @Test
    void testGetNom()
    {
        assertEquals("Bob", etudiant1.getNom(), "Erreur sur la récupération du nom de l'étudiant 1");
        assertEquals("Alice", etudiant2.getNom(), "Erreur sur la récupération du nom de l'étudiant 2");
    }

    @Test
    void testSetMoyenne()
    {
        assertEquals(13, etudiant1.getMoyenne(), "Erreur sur la moyenne initiale de l'étudiant 1");

        etudiant1.setMoyenne(15);

        assertEquals(15, etudiant1.getMoyenne(), "Erreur sur le changement de moyenne de l'étudiant 1");
    }

    @Test
    void testToString()
    {
        assertEquals("Nom : Alice, Date de naissance : 26/11/1999, Moyenne : 17.0", etudiant2.toString(), "Erreur sur la récupération en text de l'étudiant 2");
    }
}
