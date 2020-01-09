package loc.stalex.shop.model;

public class Order {

    private int id;
    private int userId;
    private int orderProductId;
    private String status;
    private String description;

    public Order() {
    }

    public Order(int id, int userId, int orderProductId, String status, String description) {
        this.id = id;
        this.userId = userId;
        this.orderProductId = orderProductId;
        this.status = status;
        this.description = description;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOrderProductId() {
        return this.orderProductId;
    }

    public void setOrderProductId(int orderProductId) {
        this.orderProductId = orderProductId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
