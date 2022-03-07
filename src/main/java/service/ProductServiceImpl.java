package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    private static final List<Product> products;

    static {
        products = new ArrayList<>();
        products.add(new Product(1, "13 ProMax", 33000000, "All new", "Apple"));
        products.add(new Product(2, "13 Pro", 31000000, "All new", "Apple"));
        products.add(new Product(3, "13 ", 29000000, "All new", "Apple"));
        products.add(new Product(4, "12 ProMax", 25000000, "All new", "Apple"));
        products.add(new Product(5, "12 Pro", 23000000, "All new", "Apple"));
    }

    @Override
    public List<Product> displayAllProduct() {
        return products;
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }

    @Override
    public void updateById(int id, Product product) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.set(i, product);
                break;
            }
        }
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                break;
            }
        }
    }

    @Override
    public Product findById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }
        return null;
    }
}
