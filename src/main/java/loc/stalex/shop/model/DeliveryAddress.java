package loc.stalex.shop.model;

public class DeliveryAddress {

    private int id;
    private String address;

    public DeliveryAddress() {
    }

    public DeliveryAddress(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
