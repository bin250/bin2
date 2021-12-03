public class Car {
    private String cname;
    private double price;

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "cname='" + cname + '\'' +
                ", price=" + price +
                '}';
    }
}





