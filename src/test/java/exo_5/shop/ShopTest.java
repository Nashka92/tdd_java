package exo_5.shop;

import org.example.exo_5.product.Product;
import org.example.exo_5.shop.Shop;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

public class ShopTest {

    // liste de produit (objets)
    List<Product> products = List.of(
            new Product("normal", "Pain", 5, 20),
            new Product("brie", "Brie vieilli", 10, 30),
            new Product("latiere", "Yaourt", 3, 20),
            new Product("normal", "Banane", 7, 10)
    );

    @Test
    @DisplayName("Une fois la date de péremption atteinte, la qualité se dégrade 2 fois plus vite")
    public void whenTheExpirationDateIsZero() {
        // arrange
        Shop shop = new Shop(products);
        Product product = new Product("normal", "Pain", 0, 10);

        // act
        shop.update(product);

        // assert
        Assert.assertEquals("La qualité devrait se dégrader deux fois plus vite", 8, product.getQuality());
    }

    @Test
    @DisplayName("La qualité d'un article n'est jamais négative")
    public void whenQualityOfArticleIsNeverNegative() {
        // arrange
        Shop shop = new Shop(products);
        Product product = new Product("normal", "Pain", 5, 1);

        // act
        shop.update(product);

        // assert
        Assert.assertTrue("La qualité ne devrait jamais être négative", product.getQuality() >= 0);
    }

    @Test
    @DisplayName("La qualité d'un article n'est jamais supérieure à 50")
    public void whenQualityOfArticleIsNeverHigherThan50() {
        // arrange
        Shop shop = new Shop(products);
        Product product = new Product("brie", "Brie vieilli", 10, 50);

        // act
        shop.update(product);

        // assert
        Assert.assertTrue("La qualité ne devrait jamais être supérieure à 50", product.getQuality() <= 50);
    }

    @Test
    @DisplayName("La qualité du « brie vieilli » augmente à mesure qu'il vieillit")
    public void whenQualityOfAgedBrieIncreasesAsAges() {
        // arrange
        Shop shop = new Shop(products);
        Product brie = new Product("brie", "Brie vieilli", 10, 30);

        // act
        shop.update(brie);

        // assert
        Assert.assertTrue("La qualité du brie vieilli devrait augmenter", brie.getQuality() > 30);
    }

    @Test
    @DisplayName("Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux")
    public void whenQualityOfDairyProductsDeterioratesTwiceAsFast() {
        // arrange
        Shop shop = new Shop(products);
        Product laitier = new Product("laitier", "Yaourt", 3, 20);

        // act
        shop.update(laitier);

        // assert
        Assert.assertEquals("La qualité des produits laitiers devrait se dégrader deux fois plus vite", 18, laitier.getQuality());
    }
}


