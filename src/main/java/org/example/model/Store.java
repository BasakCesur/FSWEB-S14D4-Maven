package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();

        ProductForSale[] products = new ProductForSale[5];
        products[0] = new Chocolate("sweet", 15, "chc dec", "white", true);
        products[1] = new Bread("Bakery", 7,"bread dec", "health", "white");
        products[2] = new Coke("Drinks", 10, "coke dec", true, 2.5);

        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
            for(ProductForSale product : products){
                if(product != null){
                    product.showDetails();
                }
            }
    }
}