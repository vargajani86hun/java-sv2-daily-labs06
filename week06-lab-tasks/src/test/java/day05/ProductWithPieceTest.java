package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductWithPieceTest {

    ProductWithPiece productWithPiece = new ProductWithPiece(Type.MEAT);

    @Test
    void testCreate() {
        ProductWithPiece pwp = new ProductWithPiece(Type.BAKERY);
        assertEquals(Type.BAKERY, pwp.getType());
        assertEquals(1, pwp.getCount());
    }

    @Test
    void testIncrementCount() {
        productWithPiece.incrementCount();
        assertEquals(2, productWithPiece.getCount());
    }

}