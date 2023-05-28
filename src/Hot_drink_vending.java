import java.util.ArrayList;



public  class Hot_drink_vending extends Vending {

    private final ArrayList<Product_other> list;

    public Hot_drink_vending(ArrayList<Product_other> list) {
        this.list = list;


    }


    void addProduct(Product_other product){
        list.add(product);
    }

    Product_other getProduct_name(Integer name){
        for (Product_other product : list) {
            if (name.equals(product.getName())) {
                return product;


            }
        }
        return null;
    }


    Product_other getProduct_volume(Integer volume) {
        for (Product_other product : list) {
            if (volume.equals(product.getVolume())){
                return product;
            }
        }
        return null;

    }

    Product_other getProduct_temperature(Integer temperature) {
        for (Product_other product : list) {
            if (temperature.equals(product.getVolume())){
                return product;
            }
        }
        return null;

    }



}












