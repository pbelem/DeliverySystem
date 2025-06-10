package com.belem;

public class Order {
    private String id;
    private double distanceKm;
    private OrderStatus status;

    public Order(String id, double distanceKm) {
        this.id = id;
        this.distanceKm = distanceKm;
        this.status = OrderStatus.PENDING_PAYMENT;
    }

    public String getId() {
        return id;
    }

    public double getDistanceKm() {
        return distanceKm;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
}