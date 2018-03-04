package main.java.hu.mir.books.ejbservice.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class OrderStub extends HasID {
    private CustomerStub customer;
    private Date received;
    private Date delivered;
    private List<DetailStub> details;

    public OrderStub(int id, CustomerStub customer, Date received, Date delivered, List<DetailStub> details) {
        super(id);
        this.customer = customer;
        this.received = received;
        this.delivered = delivered;
        this.details = details;
    }

    public CustomerStub getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerStub customer) {
        this.customer = customer;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public Date getDelivered() {
        return delivered;
    }

    public void setDelivered(Date delivered) {
        this.delivered = delivered;
    }

    public List<DetailStub> getDetails() {
        return details;
    }

    public void setDetails(List<DetailStub> details) {
        this.details = details;
    }
}
