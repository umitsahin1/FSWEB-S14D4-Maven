package org.example.model;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Milk Chocolate", 5.99, "Sweet milk chocolate", "50%");
        products[1] = new Coke("Coca-Cola", 1.99, "Refreshing soda", false);
        products[2] = new Bread("Whole Wheat Bread", 2.49, "Healthy whole wheat bread", "Whole Wheat");

        Store store = new Store();
        store.listProducts(products);
    }
    public void listProducts(ProductForSale[] products) {

        for (int i = 0; i < products.length; i++) {
            products[i].showDetails();
            System.out.println();
        }
    }
}