package com.goldfish.goldfish.service;

import com.goldfish.goldfish.entity.OrderInfo;

import java.util.List;

public interface OrderService {
    public int insertOrder(OrderInfo orderInfo);
    public List<OrderInfo> selectOrder(int ordersId);
    public List<OrderInfo> selectOrder1(int orderbId);
}
