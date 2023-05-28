public class Tea_hot_drink extends Product {

    private int temperature;

    public Tea_hot_drink(String kind, double price, Long id, int temperature) {
        super(kind, price, id);
        this.temperature = temperature;

    }

    public Tea_hot_drink(String kind, double price, Long id) {
        super(kind, price, id);
    }

    public int getTemperature() {

        return temperature;
    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("У напитка: %s, %s, %s, %s", getKind(), getPrice(), getId(), getTemperature());
    }

}

