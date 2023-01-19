public class Phone {
    private String model;
    private String madeln;
    private double price;

    public Phone(String model, String madeln, double price) {
        this.model = model;
        this.madeln = madeln;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMadeln() {
        return madeln;
    }

    public void setMadeln(String madeln) {
        this.madeln = madeln;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
