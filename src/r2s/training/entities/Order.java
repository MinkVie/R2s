package r2s.training.entities;

public class Order {

    private String number;

    private String date;

    private int quantity;

    private double price;

    private int customerID;

    public Order(String number, String date, int quantity, double price, int customerID) {
        this.number = number;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
        this.customerID = customerID;
    }

    public Order(String number, String date, int quantity, double price) {
    }

    public String getNumber(String s) {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate(String s) {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
}
