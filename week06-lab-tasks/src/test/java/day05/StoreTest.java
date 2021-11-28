package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {
    Store store = new Store();

    @BeforeEach
    void init() {
        store.addProduct(new Product("Ice Cream", Type.FROZEN, 230.45));
        store.addProduct(new Product("Pork", Type.MEAT, 1645.55));
        store.addProduct(new Product("Tomato", Type.VEGETABLE, 660.19));
        store.addProduct(new Product("Apple", Type.FRUIT, 283.7));
    }

    @Test
    void testAddProduct() {
        store.addProduct(new Product("Wall calendar", Type.DIARY, 1130.99));
        assertEquals(5, store.getProducts().size());
        assertEquals("Wall calendar", store.getProducts().get(4).getName());
    }

    @Test
    void testNumberOfProductsByType() {
        store.addProduct(new Product("Onion", Type.VEGETABLE, 260.19));
        store.addProduct(new Product("Peach", Type.FRUIT, 783.7));
        List<ProductWithPiece> result = store.numberOfProductsByType();

        assertEquals(4, result.size());

    }
}