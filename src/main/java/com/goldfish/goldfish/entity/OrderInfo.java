package com.goldfish.goldfish.entity;

public class OrderInfo {
    private int orderId;
    private String orderName;
    private int orderPrice;
    private String orderImage;
    private int ordersId;
    private int orderbId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderImage() {
        return orderImage;
    }

    public void setOrderImage(String orderImage) {
        this.orderImage = orderImage;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
    }

    public int getOrderbId() {
        return orderbId;
    }

    public void setOrderbId(int orderbId) {
        this.orderbId = orderbId;
    }
}
