public class Hot_drink extends Product{


    private int temperature;

    public Hot_drink(String kind, double price, Long id, int temperature) {
        super(kind, price, id);
        this.temperature = temperature;

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
