package com.belem;

public class DeliveryService {
    private static final double RATE_PER_KM = 2.5;

    public double calculateFreight(Order order) {
        if (order.getDistanceKm() <= 0) {
            throw new IllegalArgumentException("Distância deve ser maior que zero");
        }
        return order.getDistanceKm() * RATE_PER_KM;
    }

    public void updateStatus(Order order, OrderStatus newStatus) {
        order.setStatus(newStatus);
    }
}