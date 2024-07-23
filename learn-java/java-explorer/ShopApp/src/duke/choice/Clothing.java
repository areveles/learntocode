package duke.choice;

public class Clothing {
    private final double MIN_PRICE = 10.0;
    private final double MIN_TAX = 0.2;
    String description = "", size = "M";
    double price = 0.0;

    public Clothing() {
    }

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
    public double getPrice() {
        return price + (price * MIN_TAX);
    }
    
    public String getDescription() {
        return description;
    }

    public String getSize() {
        return size;
    }

    public void setPrice(double price) {
        this.price = (price > MIN_PRICE) ? price : MIN_PRICE;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSize(String size) {
        this.size = size;
    }

}
