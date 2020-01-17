package com.goldfish.goldfish.controller;

import com.goldfish.goldfish.entity.CartInfo;
import com.goldfish.goldfish.entity.SortInfo;
import com.goldfish.goldfish.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.UUID;

@Controller
public class CartController {
    @Autowired
    CartService cartservice;
    @RequestMapping("/insertCart")
    public String insertCart( @RequestParam("cartName")String cartName,@RequestParam("cartImage")String cartImage,@RequestParam("cartPrice")String cartPrice,HttpServletRequest request){

        CartInfo ci=new CartInfo();
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String CartuId=obj.toString();
        double b=Double.parseDouble(cartPrice);
        int price= new Double(b).intValue();
        ci.setCartName(cartName);
        ci.setCartImage(cartImage);
        ci.setCartPrice(price);
        ci.setCartUid(CartuId);
        cartservice.insertCart(ci);
        return "redirect:/selectgoods";

    }

    @RequestMapping("/deleteCart")
    public String deleteCart(@RequestParam(value = "cartImage")String  cartImage,HttpServletRequest request){
        cartservice.deleteCart(cartImage);
        return  "redirect:/selectCart";
    }

    @RequestMapping("/selectCart")
    public String selectCart(HttpServletRequest request, Model model){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String CartuId=obj.toString();
        List<CartInfo> ci=cartservice.selectCart(CartuId);
        model.addAttribute("ci",ci);
        return "cart";
    }

    @RequestMapping("/deleteCart1")
    public String deleteCart1(HttpServletRequest request){
        HttpSession session=request.getSession();
        Object obj=session.getAttribute("key");
        String CartuId=obj.toString();
        cartservice.deleteCart1(CartuId);
        return  "redirect:/selectgoods";
    }

}
