package com.goldfish.goldfish.service;

import com.goldfish.goldfish.dao.OrderDao;
import com.goldfish.goldfish.entity.OrderInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("orderservice")
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;
    public int insertOrder(OrderInfo orderInfo){
        return orderDao.insertOrder(orderInfo);
    }
    public List<OrderInfo> selectOrder(int ordersId){
        return orderDao.selectOrder(ordersId);
    }
    public List<OrderInfo> selectOrder1(int orderbId){
        return orderDao.selectOrder1(orderbId);
    }
}
