package org.example.exo_5.shop;
import org.example.exo_5.product.Product;
import java.util.List;

// ### Etape 1 ***Structure des classes***

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) {

        // décrémente chaque jour
        product.setSellIn(product.getSellIn()-1);

        //Une fois la date de péremption atteinte, la qualité se dégrade 2 fois plus vite
        if (product.getSellIn() > 0){
            product.setQuality(product.getQuality() - 2);
        }

        //La qualité d'un article n'est jamais négative
        if (product.getQuality() < 0){
            product.setQuality(0);
        }

        // La qualité d'un article n'est jamais supérieure à 50.
        if (product.getQuality() < 50){
            product.setQuality(50);
        }

        // La qualité du « brie vieilli » augmente à mesure qu'il vieillit.

        // Les produits laitiers se dégradent en qualité deux fois plus vite que les produits normaux

    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}