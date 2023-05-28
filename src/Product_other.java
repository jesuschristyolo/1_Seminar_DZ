public abstract class Product_other {

    private Integer name;
    private Integer volume;
    private Integer temperature;




    public Product_other(int name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;


    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {

        this.temperature = temperature;
    }
}






