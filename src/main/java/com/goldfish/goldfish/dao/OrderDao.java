package com.goldfish.goldfish.dao;

import com.goldfish.goldfish.entity.OrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface OrderDao {

    public int insertOrder(OrderInfo orderInfo);
    public List<OrderInfo> selectOrder(int ordersId);
    public List<OrderInfo> selectOrder1(int orderbId);
}
