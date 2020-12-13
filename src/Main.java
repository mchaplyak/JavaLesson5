public class Main {
    public static void main(String[] args) {
        Product products = new Product();

        products.addProduct("Банан", 32,Type.FRUIT,1.2);
        products.addProduct("Гранат", 42,Type.FRUIT,1.2);
        products.addProduct("Hennessy", 1200, Type.DRINKS, 1);

        products.averageSum();
        products.doublePrice(Type.FRUIT);
        products.getPriceByType(Type.FRUIT);
        products.getListOfProducts();
        products.removeProduct("Гранат");
        products.getListOfProducts();
    }
}
