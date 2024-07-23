package duke.choice;

public class Clothing {
    String description;
    String size = "M";
    double price = 0.0;

    public static final double MIN_PRICE = 10.0;
    public static double TAX_RATE = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
    public double getPrice() {
        return price + (price * TAX_RATE);
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
