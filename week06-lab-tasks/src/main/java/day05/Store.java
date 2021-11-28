package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) {
        products.add(p);
    }

    public List<ProductWithPiece> numberOfProductsByType() {
        List<ProductWithPiece> result = new ArrayList<>();
        for (Product actual : products) {
            ProductWithPiece pwp = containsProduct(actual, result);
            if (pwp != null) {
                pwp.incrementCount();
            }
            else {
                result.add(new ProductWithPiece(actual.getType()));
            }
        }
        return result;
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    private ProductWithPiece containsProduct(Product actual, List<ProductWithPiece>productsPieceList) {
        for (ProductWithPiece pwp : productsPieceList) {
            if (actual.getType() == pwp.getType()) {
                return pwp;
            }
        }
        return null;
    }
}
