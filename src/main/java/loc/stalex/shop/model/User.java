package loc.stalex.shop.model;

public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int phone;
    private String address;
    private int systemUserId;
    private int deliveryAddrId;

    public User() {
    }

    public User(int id, String firstName, String lastName, String email, int phone, 
                String address, int systemUserId, int deliveryAddrId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.systemUserId = systemUserId;
        this.deliveryAddrId = deliveryAddrId;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return this.phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSystemUserId() {
        return this.systemUserId;
    }

    public void setSystemUserId(int systemUserId) {
        this.systemUserId = systemUserId;
    }

    public int getDeliveryAddrId() {
        return this.deliveryAddrId;
    }

    public void setDeliveryAddrId(int deliveryAddrId) {
        this.deliveryAddrId = deliveryAddrId;
    }
}
