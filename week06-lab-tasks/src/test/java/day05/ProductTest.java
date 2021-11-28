package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testCreate() {
        Product product = new Product("Ice Cream", Type.FROZEN, 230.45);
        assertEquals("Ice Cream", product.getName());
        assertEquals(Type.FROZEN, product.getType());
        assertEquals(230.45, product.getPrice(), 0.0005);
    }
}