
public class Main {
    public static void main(String[] args) {


        Vending vending = new Fruit_vending();
        Vending hot_vending = new Hot_drinks_vending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 15, 2L);
        Product product3 = new Banana("Banana", 19, 3L);
        Product product4 = new Hot_drink("Hot_drink", 220, 4L, 40);
        Product product5 = new Tea_hot_drink("Tea_hot_drink", 150, 7L, 50);


        hot_vending.addProduct(product5);
        hot_vending.addProduct(product4);
        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);



        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));
        System.out.println(hot_vending.getProduct("Hot_drink"));
        System.out.println(hot_vending.getProduct("Tea_hot_drink"));
        System.out.println("=".repeat(20));

        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(5L));
        System.out.println(hot_vending.getProduct(4L));
        System.out.println(hot_vending.getProduct(7L));




    }
}