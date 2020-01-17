package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.OrderInfo;
import com.goldfish.goldfish.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class OrderController {
    @Autowired
    OrderService orderservice;

    @RequestMapping("/selectOrder")
    public String selectOrder(int ordersId,Model model){
        List<OrderInfo> oi=orderservice.selectOrder(ordersId);
        model.addAttribute("oi",oi);
        return "selectOrder";

    }

    @RequestMapping("/selectOrder1")
    public String selectOrder1(int orderbId,Model model){
        List<OrderInfo> oi=orderservice.selectOrder(orderbId);
        model.addAttribute("oi",oi);
        return "selectOrder1";

    }

    @RequestMapping("/insertOder")
    public String insertOder(OrderInfo orderInfo, HttpServletRequest request){
        orderservice.insertOrder(orderInfo);
        HttpSession session=request.getSession();
        session.setAttribute("key0",orderInfo.getOrdersId());
        return "insertOder";
    }
}
