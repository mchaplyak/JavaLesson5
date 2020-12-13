import java.util.ArrayList;
import java.util.List;

public class Store {

   public List<Product> products = new ArrayList<>();

    public boolean addProduct(String name, int price, Type type, double quantity) {
        if (price > 0) {
            for (int i = 0; i < 9; i++) {
                String number = Integer.toString(i);
                if (name.contains(number)) {
                return false;
                }
            }
            return products.add(new Product(name, price, type, quantity));
            }
        return false;
    }

    public void removeProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
              products.remove(products.indexOf(name));
            }
        }
    }

    public void averageSum() {
        double sum = 0;
        for (Product product : products) {
            sum += product.getPrice()*product.getQuantity();
        }
        System.out.println("Середня сума товару становить: " + sum);
    }

    public void getListOfProducts() {
        List<Product> premiumProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() > 1000) {
                premiumProducts.add(product);
            }
        }
        System.out.println("Усі наші товари: " + this.products);
        System.out.println("В тому числі наші Преміум товари: " + premiumProducts);
    }

    public void doublePrice(Type type) {
        for (Product product : products) {
            if (product.getType() == type) {
                int newPrice;
                newPrice = product.getPrice()*2;
                product.setPrice(newPrice);
            }
        }
    }

    public void getPriceByType(Type type) {
        double sum = 0;
        for (Product product : products) {
            if (product.getType() == type) {
                sum += product.getPrice() * product.getQuantity();
            }
        }
        System.out.println("Ціна усіх продуктів типу: " + type + " становить " + sum);
    }






}

