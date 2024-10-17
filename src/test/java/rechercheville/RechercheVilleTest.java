package rechercheville;

import org.example.rechercheville.RechercheVille;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class RechercheVilleTest {

    private RechercheVille rechercheVille;

    @Test
    @DisplayName("Lever une exception si la recherche contient moins de 2 caractères")
    public void whenSearchContainLessThan2letters(){
        // arrange
        rechercheVille = new RechercheVille();

        // act and assert
        Assert.assertThrows(NotFoundException.class, ()-> rechercheVille.rechercher("A"));
    }

}
