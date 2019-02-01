package pizzashop;

import java.util.List;

public class Customer {

    private Long id;
    private String name;
    private List<Address> deliveryAddresses;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getDeliveryAddresses() {
        return deliveryAddresses;
    }

    public void setDeliveryAddresses(List<Address> deliveryAddresses) {
        this.deliveryAddresses = deliveryAddresses;
    }

    public void payOrder(Order order) {
        order.setPaid(true);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deliveryAddresses=" + deliveryAddresses +
                '}';
    }
}
