package duke.choice;

public class Customer {
    private String name, size;
    private Clothing[] items;

    public Customer() {

    }

    public Customer (String name, int measurement) {
        this.name = name;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    }
    public Clothing[] getItems() {
        return items;
    }
    public double getTotalClothingCost() {
        double total = 0.0;
        for (Clothing clothing : items) {
            total += clothing.getPrice();
        }
        return total;
    }

    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void setSize(int measurement) {

        switch (measurement) {
            case 1: 
            case 2: 
            case 3:
                setSize("S");
                break;
            case 4: 
            case 5: 
            case 6:
                setSize("M");
                break;
            case 7: 
            case 8: 
            case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
