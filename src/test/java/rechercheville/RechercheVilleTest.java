package rechercheville;

import org.example.rechercheville.RechercheVille;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.example.rechercheville.NotFoundException;

import java.util.List;

public class RechercheVilleTest {

    private RechercheVille rechercheVille;

    @Test
    @DisplayName("Lever une exception si la recherche contient moins de 2 caractères")
    public void whenSearchContainLessThan2letters() {
        // arrange
        rechercheVille = new RechercheVille();

        // act and assert
        Assert.assertThrows(NotFoundException.class, () -> rechercheVille.rechercher("A"));
    }

    @Test
    @DisplayName("Si le texte est >= à 2 caractères, doit renvoyer tous les noms de ville commençant par le texte de recherche exact")
    public void whenSearchTextIsGreaterThanOrEqualTo2Letters() throws NotFoundException {
        // arrange
        rechercheVille = new RechercheVille();

        // act
        List<String> result = rechercheVille.rechercher("Va");

        // assert
        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.contains("Valence"));
        Assert.assertTrue(result.contains("Vancouver"));
    }
}
